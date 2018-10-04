package lab4.pascal;

import lab4.Tree;

import java.io.InputStream;
import java.text.ParseException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import lab4.Tree;

public class pascalParser {
	private pascalLexer lex;
		public Tree parse(InputStream is) throws ParseException, IOException {
		lex = new pascalLexer(is);
		lex.nextToken();
		return start();
	}
	private Tree ea1() throws ParseException, IOException {
		switch (lex.curToken()) {
			case NOT: {
				List<Tree> t = new ArrayList<>();
				List<Tree> ea2 = new ArrayList<>();
				t.add(t());

				ea2.add(ea2());

				return new Tree("Ea", t.get(0), ea2.get(0));
			}
			case IDENT: {
				List<Tree> t = new ArrayList<>();
				List<Tree> ea2 = new ArrayList<>();
				t.add(t());

				ea2.add(ea2());

				return new Tree("Ea", t.get(0), ea2.get(0));
			}
			case LPAREN: {
				List<Tree> t = new ArrayList<>();
				List<Tree> ea2 = new ArrayList<>();
				t.add(t());

				ea2.add(ea2());

				return new Tree("Ea", t.get(0), ea2.get(0));
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree t() throws ParseException, IOException {
		switch (lex.curToken()) {
			case NOT: {
				List<String> NOT = new ArrayList<>();
				List<Tree> t = new ArrayList<>();
				if (lex.curToken().toString().equals("NOT")) {
					NOT.add(lex.curString());
				} else {
					throw new AssertionError("NOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				t.add(t());

				return new Tree("NOT", new Tree("not"), t.get(0));
			}
			case IDENT: {
				List<String> IDENT = new ArrayList<>();
				if (lex.curToken().toString().equals("IDENT")) {
					IDENT.add(lex.curString());
				} else {
					throw new AssertionError("IDENT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return new Tree("TERM", new Tree(IDENT.get(0)));
			}
			case LPAREN: {
				List<String> LPAREN = new ArrayList<>();
				List<Tree> start = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				start.add(start());

				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return new Tree("F", new Tree("("), start.get(0), new Tree(")"));
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree eo1() throws ParseException, IOException {
		switch (lex.curToken()) {
			case NOT: {
				List<Tree> ea1 = new ArrayList<>();
				List<Tree> eo2 = new ArrayList<>();
				ea1.add(ea1());

				eo2.add(eo2());

				return new Tree("Eo", ea1.get(0), eo2.get(0));
			}
			case IDENT: {
				List<Tree> ea1 = new ArrayList<>();
				List<Tree> eo2 = new ArrayList<>();
				ea1.add(ea1());

				eo2.add(eo2());

				return new Tree("Eo", ea1.get(0), eo2.get(0));
			}
			case LPAREN: {
				List<Tree> ea1 = new ArrayList<>();
				List<Tree> eo2 = new ArrayList<>();
				ea1.add(ea1());

				eo2.add(eo2());

				return new Tree("Eo", ea1.get(0), eo2.get(0));
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree ea2() throws ParseException, IOException {
		switch (lex.curToken()) {
			case OR: {
				return new Tree("Ea\'");
			}
			case AND: {
				List<String> AND = new ArrayList<>();
				List<Tree> t = new ArrayList<>();
				List<Tree> ea2 = new ArrayList<>();
				if (lex.curToken().toString().equals("AND")) {
					AND.add(lex.curString());
				} else {
					throw new AssertionError("AND expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				t.add(t());

				ea2.add(ea2());

				return new Tree("AND", new Tree("and"), t.get(0), ea2.get(0));
			}
			case XOR: {
				return new Tree("Ea\'");
			}
			case RPAREN: {
				return new Tree("Ea\'");
			}
			case EOF: {
				return new Tree("Ea\'");
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree start() throws ParseException, IOException {
		switch (lex.curToken()) {
			case NOT: {
				List<Tree> eo1 = new ArrayList<>();
				List<Tree> ex2 = new ArrayList<>();
				eo1.add(eo1());

				ex2.add(ex2());

				return new Tree("Ex", eo1.get(0), ex2.get(0));
			}
			case IDENT: {
				List<Tree> eo1 = new ArrayList<>();
				List<Tree> ex2 = new ArrayList<>();
				eo1.add(eo1());

				ex2.add(ex2());

				return new Tree("Ex", eo1.get(0), ex2.get(0));
			}
			case LPAREN: {
				List<Tree> eo1 = new ArrayList<>();
				List<Tree> ex2 = new ArrayList<>();
				eo1.add(eo1());

				ex2.add(ex2());

				return new Tree("Ex", eo1.get(0), ex2.get(0));
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree eo2() throws ParseException, IOException {
		switch (lex.curToken()) {
			case OR: {
				List<String> OR = new ArrayList<>();
				List<Tree> ea1 = new ArrayList<>();
				List<Tree> eo2 = new ArrayList<>();
				if (lex.curToken().toString().equals("OR")) {
					OR.add(lex.curString());
				} else {
					throw new AssertionError("OR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				ea1.add(ea1());

				eo2.add(eo2());

				return new Tree("OR", new Tree("or"), ea1.get(0), eo2.get(0));
			}
			case XOR: {
				return new Tree("Eo\'");
			}
			case RPAREN: {
				return new Tree("Eo\'");
			}
			case EOF: {
				return new Tree("Eo\'");
			}
			default:
				throw new AssertionError();
		}
	}

	private Tree ex2() throws ParseException, IOException {
		switch (lex.curToken()) {
			case XOR: {
				List<String> XOR = new ArrayList<>();
				List<Tree> eo1 = new ArrayList<>();
				List<Tree> ex2 = new ArrayList<>();
				if (lex.curToken().toString().equals("XOR")) {
					XOR.add(lex.curString());
				} else {
					throw new AssertionError("XOR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				eo1.add(eo1());

				ex2.add(ex2());

				return new Tree("XOR", new Tree("xor"), eo1.get(0), ex2.get(0));
			}
			case RPAREN: {
				return new Tree("Ex\'");
			}
			case EOF: {
				return new Tree("Ex\'");
			}
			default:
				throw new AssertionError();
		}
	}

}
