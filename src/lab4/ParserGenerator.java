package lab4;

import org.antlr.v4.runtime.*;
import lab4.grammar.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class ParserGenerator {
    private String grammarName;
    private static final String EOF = "EOF";
    private static final String EPS = "EPS";

    private Node start;
    private File outputDir;

    private final HashMap<String, Node> nonTerminals = new HashMap<>();
    private final HashMap<String, Node> terminals = new HashMap<>();
    private final HashMap<String, HashSet<String>> first = new HashMap<>();
    private final HashMap<String, HashSet<String>> follow = new HashMap<>();

    private String members = "";
    private String header = "";
    private String main = "";

    public ParserGenerator(File outputDir) {
        this.outputDir = outputDir;
    }

    public void prepare(File grammarFile) throws IOException {
        grammarName = grammarFile.getName().split("[.]")[0];
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromStream(new FileInputStream(grammarFile)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        GrammarBaseListener visitor = new GrammarBaseListener() {
            @Override
            public void enterNonTerminalLabel(GrammarParser.NonTerminalLabelContext ctx) {
                Node currentNode = getNonTerm(ctx.NON_TERM_NAME().getText());
                System.out.println("Current nonterminal: " + currentNode.getName());
                if (ctx.synthesized() != null) {
                    if (ctx.synthesized().NON_TERM_NAME() != null) {
                        currentNode.setReturnType(ctx.synthesized().NON_TERM_NAME().getText());
                    } else if (ctx.synthesized().TERM_NAME() != null) {
                        currentNode.setReturnType(ctx.synthesized().TERM_NAME().getText());
                    } else if (ctx.synthesized().MIXED_CASE() != null) {
                        currentNode.setReturnType(ctx.synthesized().MIXED_CASE().getText());
                    }
                }

                if (ctx.inherited() != null) {
                    for (GrammarParser.ArgContext arg : ctx.inherited().declAttrs().arg()) {
                        currentNode.putDeclAttrs(arg.argName().getText(), arg.argType().getText());
                    }
                }

                for (GrammarParser.NonterminalProductionContext nonterminalContext : ctx.nonterminalProduction()) {
                    Produce production = new Produce();

                    if (nonterminalContext.nonterminalVariant().isEmpty()) {
                        production.add(getTerm(EPS));
                    }

                    for (GrammarParser.NonterminalVariantContext variantContext : nonterminalContext.nonterminalVariant()) {
                        Node temp;
                        if (variantContext.NON_TERM_NAME() != null) {
                            temp = new Node(variantContext.NON_TERM_NAME().getText());
                            if (variantContext.callAttrs() != null) {
                                temp.setCallAttrs(refactorCallAttrs(variantContext.callAttrs()));
                            }
                        } else {
                            temp = new Node(variantContext.TERM_NAME().getText());
                        }
                        production.add(temp);
                    }

                    if (nonterminalContext.CODE() != null) {
                        production.setCode(refactorCode(nonterminalContext.CODE()));
                    }

                    currentNode.add(production);
                }
            }

            @Override
            public void enterTerminalLabel(GrammarParser.TerminalLabelContext ctx) {
                String name = ctx.TERM_NAME().getText();
                Node curNode = getTerm(name);

                for (GrammarParser.TerminalProductionContext terminalContext : ctx.terminalProduction()) {
                    Produce production = new Produce();
                    String s = "";

                    for (TerminalNode term : terminalContext.STRING()) {
                        s += term.getText().substring(1);
                        s = s.substring(0, s.length() - 1);
                    }
                    production.add(new Node(s));
                    curNode.add(production);
                }
            }

            @Override
            public void enterMembersLabel(GrammarParser.MembersLabelContext ctx) {
                if (ctx.CODE() != null) {
                    members = refactorCode(ctx.CODE());
                }
            }

            @Override
            public void enterHeaderLabel(GrammarParser.HeaderLabelContext ctx) {
                if (ctx.CODE() != null) {
                    header = refactorCode(ctx.CODE());
                }
            }

            @Override
            public void enterMainLabel(GrammarParser.MainLabelContext ctx) {
                if (ctx.CODE() != null) {
                    main = refactorCode(ctx.CODE());
                }
            }
        };

        ParseTree tree = parser.gramma();
        walker.walk(visitor, tree);
        getTerm(EOF);

        if (!nonTerminals.containsKey("start")) {
            throw new RuntimeException("No such rule: start");
        }
        start = getNonTerm("start");
    }

    private static void printData(Map mp) {
        for (Object o : mp.entrySet()) {
            Map.Entry pairs = (Map.Entry) o;
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
    }

    private Node getTerm(String name) {
        if (!terminals.containsKey(name)) {
            terminals.put(name, new Node(name));
        }
        return terminals.get(name);
    }

    private Node getNonTerm(String name) {
        if (!nonTerminals.containsKey(name)) {
            nonTerminals.put(name, new Node(name));
        }
        return nonTerminals.get(name);
    }

    private void generateLexer() throws IOException {
        final String LEXER_NAME = grammarName + "Lexer";
        File file = new File(outputDir, LEXER_NAME + ".java");
        PrintWriter out = new PrintWriter(file);

        out.print(header + "\n" +
                  "\nimport java.io.*;" + "\n" +
                "import java.util.*;\n" +
                "import java.text.ParseException;\n" + "\n" +
                "public class " + LEXER_NAME + " {" + "\n" +
                "\tprivate InputStream is;" + "\n" +
                "\tprivate int curChar;" + "\n" +
                "\tprivate int curPos;" + "\n" +
                "\tprivate Token curToken;" + "\n" +
                "\tprivate String curString;\n" +
                "\tpublic " + LEXER_NAME + "(InputStream is) throws ParseException, IOException {" + "\n" +
                "\t\tthis.is = is;" + "\n" +
                "\t\tcurPos = 0;" + "\n" +
                "\t\tnextChar();" + "\n" +
                "\t}\n" + "\n" +
                "\tprivate boolean isBlank(int c) {" +
                        " return c == ' ' ||" +
                        " c == '\\r' ||" +
                        " c == '\\n' ||" +
                        " c == '\\t'; }\n" + "\n" +
                "\tprivate void nextChar() throws ParseException, IOException {" + "\n" +
                "\t\tcurPos++;" + "\n" +
                "\t\ttry {" + "\n" +
                "\t\t\tcurChar = is.read();\n" +
                "\t\t} catch (IOException e) {" + "\n" +
                "\t\t\tthrow new ParseException(e.getMessage(), curPos);" + "\n" +
                "\t\t}\n" +
                "\t}\n" + "\n" +
                "\tpublic Token curToken() {\n\t\treturn curToken;\n\t}\n" + "\n" +
                "\tpublic int curPos() {\n\t\treturn curPos;\n\t}\n" + "\n" +
                "\tpublic String curString() {\n\t\treturn curString;\n\t}\n" + "\n" +
                "\tpublic String eat() throws IOException, ParseException {\n" +
                "\t    String ans = \"\";\n" +
                "        if (curChar == -1) return \"@eof\";\n" +
                "        if (curChar == '(' || curChar == ')' || curChar == ';' || curChar == '.') {\n" +
                "\t\t\tans = \"\" + (char) curChar;\n" +
                "\t\t\tnextChar();\n" +
                "            return ans;\n" +
                "        }\n" +
                "\t    while (!isBlank(curChar)) {\n" +
                "\t        if (curChar == '(' || curChar == ')' || curChar == ';' || curChar == '.' || curChar == -1) break;\n" +
                "\t        ans += (char) curChar;\n" +
                "\t        nextChar();\n" +
                "        }\n" +
                "        while (isBlank(curChar)) {\n" +
                "\t        nextChar();\n" +
                "        }\n" +
                "\t\tif (ans.equals(\"\")) return eat();\n" +
                "\t    return ans;\n" +
                "    }\n\n" +
                "\tpublic void nextToken() throws ParseException, IOException {" + "\n" +
                "\t\tcurString = eat();" + "\n" +
                "\t\tif (curString.equals(\"@eof\")) {" + "\n" +
                "\t\t\tcurToken = Token.EOF;" + "\n" +
                "\t\t\treturn;" + "\n" +
                "\t\t}" + "\n");
        boolean first = true;
        for (String curStringTerminal : terminals.keySet()) {
            if (curStringTerminal.equals("IDENT") || curStringTerminal.equals("NUMBER")) continue;
            for (Produce productionString : terminals.get(curStringTerminal).getProductList()) {
                out.println(String.format(
                        (first ? "\t\tif" : "\t\telse if") +
                                " ((\"%1$s\").equals(curString)) {\n" +
                                "\t\t\tcurToken = Token.%2$s;\n" +
                                "\t\t}",
                        productionString.get(0).getName(), curStringTerminal.toUpperCase()
                ));
                first = false;
            }
        }

        out.println(String.format("\t\telse if (curString.matches(\"%1$s\")) {\n" +
                "\t\t\tcurToken = Token.IDENT;\n" +
                "\t\t}\n", terminals.get("IDENT").getProductList().get(0).get(0).getName()));
        out.println(String.format("\t\telse if (curString.matches(\"%1$s\")) {\n" +
                "\t\t\tcurToken = Token.NUMBER;\n" +
                "\t\t}\n", terminals.get("NUMBER").getProductList().get(0).get(0).getName()));
        out.print("\t\telse throw new AssertionError(\"Illegal character \" + (char) curChar + \"\\n ans CURSTRING: \" + curString);" + "\n" +
                "\t}\n}" + "\n");
        out.close();
    }

    private void generateMainFile() throws IOException {
        File file = new File(outputDir, "Main.java");
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.print(header + "\n" +
                "import java.io.*;" + "\n" +
                "import java.text.ParseException;" + "\n" +
                "public class Main {" + "\n" +
                "\tpublic static void main(String[] args) throws IOException, ParseException {" + "\n" +
                "\t\tInputStream is = new FileInputStream(new File(\""+ outputDir.toString() +"/input.txt\"));" + "\n" +
                "\t\t" + (start.getReturnType().equals("void") ? "" : start.getReturnType() + " result = ") +
                "(new " + grammarName + "Parser" + "()).parse(is" +
                (start.getDeclAttrs(true).isEmpty() ? "" : ", " +
                 start.getDeclAttrs(false)) + ");" + "\n" +
                main + "\n" +
                "\t}" + "\n" +
                "}" + "\n");
        out.close();
    }

    private void createMiscFiles() throws IOException {
        PrintWriter out = new PrintWriter(new File(outputDir, "input.txt"));
        out.close();
    }

    private void generateParser() throws IOException {
        final String PARSER_NAME = grammarName + "Parser";
        final String LEXER_NAME = grammarName + "Lexer";
        File file = new File(outputDir, PARSER_NAME + ".java");
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);

        out.print(header + "\n" +
                "\nimport java.io.InputStream;" + "\n" +
                "import java.text.ParseException;" + "\n" +
                "import java.io.IOException;\n" +
                "import java.util.List;\n" +
                "import java.util.ArrayList;\n\n" +
                "import lab4.Tree;\n\n" +
                "public class " + PARSER_NAME + " {\n" +
                "\tprivate " + LEXER_NAME + " lex;\n" +
                concat("\t", members) +
                "\tpublic " + start.getReturnType() + " parse(InputStream is" +
                (start.getDeclAttrs(true).isEmpty() ? "" : ", " +
                 start.getDeclAttrs(true)) + ") throws ParseException, IOException {\n" +
                "\t\tlex = new " + LEXER_NAME + "(is);\n" +
                "\t\tlex.nextToken();\n" +
                "\t\t" + (start.getReturnType().equals("void") ? "" : "return ") +
                          start.getName() + "(" + start.getDeclAttrs(false) + ");\n" +
                "\t}\n");
        for (String nonTerm : nonTerminals.keySet()) {
            out.print("\tprivate " + getNonTerm(nonTerm).getReturnType() + " " +
                    nonTerm + "(" + getNonTerm(nonTerm).getDeclAttrs(true) +
                    ") throws ParseException, IOException {\n" +
                    "\t\tswitch (lex.curToken()) {\n");
            Set<String> set = new HashSet<>(first.get(nonTerm));
            if (set.contains(EPS)) {
                set.addAll(follow.get(nonTerm));
            }
            set.remove(EPS);

            for (String term : set) {
                out.println("\t\t\tcase " + term + ": {");

                boolean ret = false;
                int suitableProds = 0;
                Set<String> rules = new HashSet<>();

                for (Produce production : nonTerminals.get(nonTerm).getProductList()) {
                    HashSet<String> frst = first.get(production.get(0).getName());
                    if (frst != null && first.get(production.get(0).getName()).contains(term)) {
                        for (Node node : production.getNodes()) {
                            String name = node.getName();
                            if (!rules.contains(node.getName())) {
                                if (nonTerminals.containsKey(name) && !getNonTerm(name).getReturnType().equals("void")) {
                                    out.println("\t\t\t\tList<" + getNonTerm(name).getReturnType() + "> " +
                                              name + " = new ArrayList<>();");
                                    rules.add(node.getName());
                                } else if (terminals.containsKey(name)) {
                                    out.println("\t\t\t\tList<String> " + name + " = new ArrayList<>();");
                                    rules.add(name);
                                }
                            }
                        }
                        suitableProds++;

                        for (Node node : production.getNodes()) {
                            String name = node.getName();
                            if (terminals.containsKey(node.getName())) {
                                out.print("\t\t\t\tif (lex.curToken().toString().equals(\"" + name + "\")) {\n" +
                                        "\t\t\t\t\t" + name + ".add(lex.curString());\n" +
                                        "\t\t\t\t} else {\n" +
                                        "\t\t\t\t\tthrow new AssertionError(\"" + name +
                                        " expected, instead of \" + lex.curToken().toString());\n" +
                                        "\t\t\t\t}\n" +
                                        "\t\t\t\tlex.nextToken();\n");
                            } else if (nonTerminals.containsKey(name) && !getNonTerm(name).getReturnType().equals("void")) {
                                out.println(String.format("\t\t\t\t" + name + ".add(" +
                                        name + "(" + node.getCallAttrs() + "));\n", name));
                            } else {
                                out.print("\t\t\t\t" + name + "(" + node.getCallAttrs() + ");");
                            }
                        }
                        if (!production.getCode().isEmpty()) {
                            out.println(concat("\t\t\t\t", production.getCode()));
                            ret = true;
                        }
                    }
                }

                if (suitableProds == 0){
                    for (Produce production : nonTerminals.get(nonTerm).getProductList()) {
                        if (production.get(0).getName().equals(EPS)) {
                            if (!production.getCode().isEmpty()) {
                                out.println("\t\t\t\t" + production.getCode());
                                ret = true;
                            }
                        }
                    }
                }
                out.print((ret ? "" : "\t\t\t\n") + "\t\t\t}\n");
            }

            out.print("\t\t\tdefault:\n" +
                    "\t\t\t\tthrow new AssertionError();\n" +
                    "\t\t}\n" +
                    "\t}\n\n");
        }

        out.print("}\n");
        out.close();
    }

    private List<String> refactorCallAttrs(GrammarParser.CallAttrsContext context) {
        List<String> codes = new ArrayList<>(context.CODE().size());
        for (TerminalNode code : context.CODE()) {
            codes.add(refactorCode(code));
        }
        return codes;
    }

    private String refactorCode(TerminalNode codeNode) {
        String content = codeNode.getText().trim();
        if (content.length() == 0) {
            return "";
        }
        if (content.charAt(0) == '{' && content.charAt(content.length() - 1) == '}') {
            return content.substring(1, content.length() - 1).trim();
        }
        return content;
    }

    private String concat(String prefix, String content) {
        StringBuilder sb = new StringBuilder();

        for (String s : content.split("\\n")) {
            sb.append(prefix);
            sb.append(s);
        }
        return sb.toString();
    }

    private void generateTokens() throws IOException {
        File file = new File(outputDir, "Token.java");
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);

        out.print(header + "\n" +
                "public enum Token {\n\t");
        List<String> tokenNames = new ArrayList<>(terminals.keySet());
        for (int i = 0; i < tokenNames.size(); i++) {
            out.print(tokenNames.get(i) + (i != tokenNames.size() - 1 ? ", " : ""));
        }
        out.println("\n}");
        out.close();
    }

    private void computeFirst() {
        for (String name : terminals.keySet()) {
            HashSet<String> set = new HashSet<>();
            set.add(name);
            first.put(name, set);
        }
        for (String name : nonTerminals.keySet()) {
            first.put(name, new HashSet<>());
        }

        boolean changed;
        do {
            changed = false;
            for (String name : nonTerminals.keySet()) {
                for (Produce production : nonTerminals.get(name).getProductList()) {
                    String label = production.get(0).getName();
                    if (label.equals(name)) {
                        throw new AssertionError("Found left recursion");
                    }
                    if (first.get(label) == null)
                        continue;
                    Set<String> add = new HashSet<>(first.get(label));
                    if (production.size() > 1 && add.contains(EPS)) {
                        add.remove(EPS);
                        add.addAll(first.get(production.get(1).getName()));
                    }
                    changed |= first.get(name).addAll(add);
                }
            }
        } while (changed);
    }

    private void computeFollow() {
        for (String name : nonTerminals.keySet()) {
            follow.put(name, new HashSet<>());
        }

        follow.get(start.getName()).add(EOF);

        boolean changed;
        do {
            changed = false;
            for (String name : nonTerminals.keySet()) {
                for (Produce production : nonTerminals.get(name).getProductList()) {
                    for (int i = 0; i < production.size(); i++) {
                        String cur = production.get(i).getName();
                        if (nonTerminals.containsKey(cur)) {
                            if (i + 1 < production.size()) {
                                String beta = production.get(i + 1).getName();
                                if (first.get(beta) == null)
                                    continue;
                                Set<String> add = new HashSet<>(first.get(beta));
                                boolean allEps = true;
                                for (int j = i + 1; j < production.size(); j++) {
                                    Set<String> inAdd = new HashSet<>(first.get(production.get(j).getName()));
                                    allEps = (inAdd.contains(EPS));
                                    if (!allEps)
                                        break;
                                }
                                if (allEps) {
                                    add.remove(EPS);
                                    changed |= follow.get(cur).addAll(follow.get(name));
                                }
                                changed |= follow.get(cur).addAll(add);
                            } else {
                                changed |= follow.get(cur).addAll(follow.get(name));
                            }
                        }
                    }
                }
            }
        } while (changed);
    }

    public void generateFiles() throws IOException {
        generateTokens();
        generateLexer();
        computeFirst();
        computeFollow();
        generateParser();
        generateMainFile();
        createMiscFiles();
    }
}
