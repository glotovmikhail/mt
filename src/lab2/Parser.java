package lab2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class Node {
    enum NodeType {
        Ex1, Ex2,
        Eo1, Eo2,
        Ea1, Ea2,
        T, TERM
    }
    Integer id;
    String interp;
    NodeType type;
    ArrayList<Node> children;
    Node (NodeType t, String s) {
        this.id = Parser.idGen.incrementAndGet();
        this.type = t;
        this.interp = s;
        this.children = new ArrayList<>();
    }
}

class Parser {
    static AtomicInteger idGen = new AtomicInteger(0);
    static Node parse(String s) throws LexicalException, ParseException {
        LexicalAnalyzer analyzer = new LexicalAnalyzer(s);
        return Ex1(analyzer);
    }

    private static Node Ex1(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Ex1, "expXOR");
        switch (a.currToken()) {
            case NOT:
            case LPAREN:
            case BOOL:
                answer.children.add(Eo1(a));
                answer.children.add(Ex2(a));
                break;
            default:
                throw new ParseException("Ex", a.currToken());
        }
        return answer;
    }

    private static Node Ex2(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Ex2, "expXOR\'");
        switch (a.currToken()) {
            case XOR:
                answer.children.add(new Node(Node.NodeType.TERM, "xor"));
                a.nextToken();
                answer.children.add(Eo1(a));
                answer.children.add(Ex2(a));
                break;
            case END:
            case RPAREN:
                break;
            default:
                throw new ParseException("Ex\'", a.currToken());
        }
        return answer;
    }

    private static Node Eo1(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Eo1, "expOR");
        switch (a.currToken()) {
            case NOT:
            case LPAREN:
            case BOOL:
                answer.children.add(Ea1(a));
                answer.children.add(Eo2(a));
                break;
            default:
                throw new ParseException("Eo", a.currToken());
        }
        return answer;
    }

    private static Node Eo2(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Eo2, "expOR\'");
        switch (a.currToken()) {
            case OR:
                answer.children.add(new Node(Node.NodeType.TERM, "or"));
                a.nextToken();
                answer.children.add(Ea1(a));
                answer.children.add(Eo2(a));
                break;
            case END:
            case RPAREN:
            case XOR:
                break;
            default:
                throw new ParseException("Eo\'", a.currToken());
        }
        return answer;
    }

    private static Node Ea1(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Ea1, "expAND");
        switch (a.currToken()) {
            case NOT:
            case LPAREN:
            case BOOL:
                answer.children.add(T(a));
                answer.children.add(Ea2(a));
                break;
            default:
                throw new ParseException("Ea", a.currToken());
        }
        return answer;
    }

    private static Node Ea2(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.Ea2, "expAND\'");
        switch (a.currToken()) {
            case AND:
                answer.children.add(new Node(Node.NodeType.TERM, "and"));
                a.nextToken();
                answer.children.add(T(a));
                answer.children.add(Ea2(a));
                break;
            case END:
            case RPAREN:
            case XOR:
            case OR:
                break;
            default:
                throw new ParseException("Ea\'", a.currToken());
        }
        return answer;
    }

    private static Node T(LexicalAnalyzer a) throws ParseException, LexicalException {
        Node answer = new Node(Node.NodeType.T, "TERM");
        switch (a.currToken()) {
            case NOT:
                answer.children.add(new Node(Node.NodeType.TERM, "not"));
                a.nextToken();
                answer.children.add(T(a));
                break;
            case LPAREN:
                answer.children.add(new Node(Node.NodeType.TERM, "("));
                a.nextToken();
                answer.children.add(Ex1(a));
                assert (a.currToken() == Token.RPAREN);
                answer.children.add(new Node(Node.NodeType.TERM, ")"));
                a.nextToken();
                break;
            case BOOL:
                answer.children.add(new Node(Node.NodeType.TERM, "bool(" + a.getCurrBool() + ")"));
                a.nextToken();
                break;
            default:
                throw new ParseException("T", a.currToken());
        }
        return answer;
    }

}

class ParseException extends Exception {
    ParseException(String msg, Token t) {
        super("Can't parse: " + msg + " with token " + tokenToStr(t));
    }

    private static String tokenToStr(Token t) {
        switch (t) {
            case NOT:
                return "NOT";
            case AND:
                return "AND";
            case OR:
                return "OR";
            case XOR:
                return "XOR";
            case LPAREN:
                return "LPAREN";
            case RPAREN:
                return "RPAREN";
            case END:
                return "END";
            case BOOL:
                return "BOOL";
            default:
                return "unknown";
        }
    }
}