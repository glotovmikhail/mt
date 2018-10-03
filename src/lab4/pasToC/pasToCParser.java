package lab4.pasToC;

import lab4.Tree;

import java.io.InputStream;
import java.text.ParseException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import lab4.Tree;

public class pasToCParser {
	private pasToCLexer lex;
		public String parse(InputStream is) throws ParseException, IOException {
		lex = new pasToCLexer(is);
		lex.nextToken();
		return start();
	}
	private String assignstate() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> variable = new ArrayList<>();
				List<String> COLON = new ArrayList<>();
				List<String> RAVNO = new ArrayList<>();
				List<Integer> number = new ArrayList<>();
				variable.add(variable());

				if (lex.curToken().toString().equals("COLON")) {
					COLON.add(lex.curString());
				} else {
					throw new AssertionError("COLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				if (lex.curToken().toString().equals("RAVNO")) {
					RAVNO.add(lex.curString());
				} else {
					throw new AssertionError("RAVNO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				number.add(number(0));

				return variable.get(0) + " = " + number.get(0);
			}
			case COLON: {
			
			}
			default:
				throw new AssertionError();
		}
	}

	private Integer number_prime(Integer i) throws ParseException, IOException {
		switch (lex.curToken()) {
			case NUMBER: {
				List<Integer> number = new ArrayList<>();
				number.add(number(i));

				return number.get(0);
			}
			case SEMI: {
				return i;
			}
			default:
				throw new AssertionError();
		}
	}

	private String code() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> statements = new ArrayList<>();
				statements.add(statements(""));

				return statements.get(0);
			}
			case COLON: {
				List<String> statements = new ArrayList<>();
				statements.add(statements(""));

				return statements.get(0);
			}
			case END: {
			
			}
			case WRITE: {
				List<String> statements = new ArrayList<>();
				statements.add(statements(""));

				return statements.get(0);
			}
			default:
				throw new AssertionError();
		}
	}

	private String line() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> declvariable = new ArrayList<>();
				List<String> type = new ArrayList<>();
				List<String> SEMI = new ArrayList<>();
				declvariable.add(declvariable());

				type.add(type());

				if (lex.curToken().toString().equals("SEMI")) {
					SEMI.add(lex.curString());
				} else {
					throw new AssertionError("SEMI expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return type.get(0) + " " + declvariable.get(0) + ";\n";
			}
			case COLON: {
				List<String> declvariable = new ArrayList<>();
				List<String> type = new ArrayList<>();
				List<String> SEMI = new ArrayList<>();
				declvariable.add(declvariable());

				type.add(type());

				if (lex.curToken().toString().equals("SEMI")) {
					SEMI.add(lex.curString());
				} else {
					throw new AssertionError("SEMI expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return type.get(0) + " " + declvariable.get(0) + ";\n";
			}
			default:
				throw new AssertionError();
		}
	}

	private String start() throws ParseException, IOException {
		switch (lex.curToken()) {
			case VAR: {
				List<String> VAR = new ArrayList<>();
				List<String> vars = new ArrayList<>();
				List<String> BEGIN = new ArrayList<>();
				List<String> code = new ArrayList<>();
				List<String> END = new ArrayList<>();
				List<String> DOT = new ArrayList<>();
				if (lex.curToken().toString().equals("VAR")) {
					VAR.add(lex.curString());
				} else {
					throw new AssertionError("VAR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				vars.add(vars(""));

				if (lex.curToken().toString().equals("BEGIN")) {
					BEGIN.add(lex.curString());
				} else {
					throw new AssertionError("BEGIN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				code.add(code());

				if (lex.curToken().toString().equals("END")) {
					END.add(lex.curString());
				} else {
					throw new AssertionError("END expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return vars.get(0) + "\nint main() {\n" + code.get(0) + "\n}";
			}
			default:
				throw new AssertionError();
		}
	}

	private String statements(String cur) throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> statement = new ArrayList<>();
				List<String> statements = new ArrayList<>();
				statement.add(statement());

				statements.add(statements(cur + statement.get(0)));

				return statements.get(0);
			}
			case COLON: {
				List<String> statement = new ArrayList<>();
				List<String> statements = new ArrayList<>();
				statement.add(statement());

				statements.add(statements(cur + statement.get(0)));

				return statements.get(0);
			}
			case END: {
				return cur;
			}
			case WRITE: {
				List<String> statement = new ArrayList<>();
				List<String> statements = new ArrayList<>();
				statement.add(statement());

				statements.add(statements(cur + statement.get(0)));

				return statements.get(0);
			}
			default:
				throw new AssertionError();
		}
	}

	private String type() throws ParseException, IOException {
		switch (lex.curToken()) {
			case STRING: {
				List<String> STRING = new ArrayList<>();
				if (lex.curToken().toString().equals("STRING")) {
					STRING.add(lex.curString());
				} else {
					throw new AssertionError("STRING expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "char*";
			}
			case INTEGER: {
				List<String> INTEGER = new ArrayList<>();
				if (lex.curToken().toString().equals("INTEGER")) {
					INTEGER.add(lex.curString());
				} else {
					throw new AssertionError("INTEGER expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "int";
			}
			default:
				throw new AssertionError();
		}
	}

	private String declvariable() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> word = new ArrayList<>();
				List<String> COLON = new ArrayList<>();
				word.add(word(""));

				if (lex.curToken().toString().equals("COLON")) {
					COLON.add(lex.curString());
				} else {
					throw new AssertionError("COLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return word.get(0);
			}
			case COLON: {
			
			}
			default:
				throw new AssertionError();
		}
	}

	private Integer number(Integer i) throws ParseException, IOException {
		switch (lex.curToken()) {
			case NUMBER: {
				List<String> NUMBER = new ArrayList<>();
				List<Integer> number_prime = new ArrayList<>();
				if (lex.curToken().toString().equals("NUMBER")) {
					NUMBER.add(lex.curString());
				} else {
					throw new AssertionError("NUMBER expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				number_prime.add(number_prime(10*i + Integer.parseInt(NUMBER.get(0))));

				return number_prime.get(0);
			}
			default:
				throw new AssertionError();
		}
	}

	private String statement() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> assignstate = new ArrayList<>();
				List<String> SEMI = new ArrayList<>();
				assignstate.add(assignstate());

				if (lex.curToken().toString().equals("SEMI")) {
					SEMI.add(lex.curString());
				} else {
					throw new AssertionError("SEMI expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return assignstate.get(0) + ";\n";
			}
			case COLON: {
				List<String> assignstate = new ArrayList<>();
				List<String> SEMI = new ArrayList<>();
				assignstate.add(assignstate());

				if (lex.curToken().toString().equals("SEMI")) {
					SEMI.add(lex.curString());
				} else {
					throw new AssertionError("SEMI expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return assignstate.get(0) + ";\n";
			}
			case WRITE: {
				List<String> writestate = new ArrayList<>();
				List<String> SEMI = new ArrayList<>();
				writestate.add(writestate());

				if (lex.curToken().toString().equals("SEMI")) {
					SEMI.add(lex.curString());
				} else {
					throw new AssertionError("SEMI expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return writestate.get(0) + ";\n";
			}
			default:
				throw new AssertionError();
		}
	}

	private String variable() throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> word = new ArrayList<>();
				word.add(word(""));

				return word.get(0);
			}
			case COLON: {
			
			}
			case RPAREN: {
			
			}
			default:
				throw new AssertionError();
		}
	}

	private String vars(String cur) throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> line = new ArrayList<>();
				List<String> vars = new ArrayList<>();
				line.add(line());

				vars.add(vars(cur + line.get(0)));

				return vars.get(0);
			}
			case COLON: {
				List<String> line = new ArrayList<>();
				List<String> vars = new ArrayList<>();
				line.add(line());

				vars.add(vars(cur + line.get(0)));

				return vars.get(0);
			}
			case BEGIN: {
				return cur;
			}
			default:
				throw new AssertionError();
		}
	}

	private String writestate() throws ParseException, IOException {
		switch (lex.curToken()) {
			case WRITE: {
				List<String> WRITE = new ArrayList<>();
				List<String> LPAREN = new ArrayList<>();
				List<String> variable = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				if (lex.curToken().toString().equals("WRITE")) {
					WRITE.add(lex.curString());
				} else {
					throw new AssertionError("WRITE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				variable.add(variable());

				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "printf(\"%d\", " + variable.get(0) + ")";
			}
			default:
				throw new AssertionError();
		}
	}

	private String word(String input) throws ParseException, IOException {
		switch (lex.curToken()) {
			case IDENT: {
				List<String> IDENT = new ArrayList<>();
				List<String> word = new ArrayList<>();
				if (lex.curToken().toString().equals("IDENT")) {
					IDENT.add(lex.curString());
				} else {
					throw new AssertionError("IDENT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				word.add(word(input + IDENT.get(0)));

				return word.get(0);
			}
			case COLON: {
				return input;
			}
			case RPAREN: {
				return input;
			}
			default:
				throw new AssertionError();
		}
	}

}
