package lab4.pascal;

import lab4.Tree;

import java.io.*;
import java.util.*;
import java.text.ParseException;

public class pascalLexer {
	private InputStream is;
	private int curChar;
	private int curPos;
	private Token curToken;
	private String curString;
	public pascalLexer(InputStream is) throws ParseException, IOException {
		this.is = is;
		curPos = 0;
		nextChar();
	}

	private boolean isBlank(int c) { return c == ' ' || c == '\r' || c == '\n' || c == '\t'; }

	private void nextChar() throws ParseException, IOException {
		curPos++;
		try {
			curChar = is.read();
			if (isBlank(curChar)) nextChar();		} catch (IOException e) {
			throw new ParseException(e.getMessage(), curPos);
		}
	}

	public Token curToken() {
		return curToken;
	}

	public int curPos() {
		return curPos;
	}

	public String curString() {
		return curString;
	}

	public void nextToken() throws ParseException, IOException {
		curString = "";
		if (curChar == -1) {
			curToken = Token.EOF;
			return;
		}
		if (("not").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NOT;
			while(curString.length() < "not".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("not")) {
				throw new ParseException("Expected " + "not", curPos);
			}
		}
		else if (("or").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.OR;
			while(curString.length() < "or".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("or")) {
				throw new ParseException("Expected " + "or", curPos);
			}
		}
		else if (("and").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.AND;
			while(curString.length() < "and".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("and")) {
				throw new ParseException("Expected " + "and", curPos);
			}
		}
		else if (("(").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.LPAREN;
			while(curString.length() < "(".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("(")) {
				throw new ParseException("Expected " + "(", curPos);
			}
		}
		else if (("xor").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.XOR;
			while(curString.length() < "xor".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("xor")) {
				throw new ParseException("Expected " + "xor", curPos);
			}
		}
		else if ((")").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.RPAREN;
			while(curString.length() < ")".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals(")")) {
				throw new ParseException("Expected " + ")", curPos);
			}
		}
		else if (("b").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.TERM;
			while(curString.length() < "b".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("b")) {
				throw new ParseException("Expected " + "b", curPos);
			}
		}
		else if (("c").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.TERM;
			while(curString.length() < "c".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("c")) {
				throw new ParseException("Expected " + "c", curPos);
			}
		}
		else if (("d").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.TERM;
			while(curString.length() < "d".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("d")) {
				throw new ParseException("Expected " + "d", curPos);
			}
		}
		else if (("e").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.TERM;
			while(curString.length() < "e".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("e")) {
				throw new ParseException("Expected " + "e", curPos);
			}
		}
		else if (("f").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.TERM;
			while(curString.length() < "f".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("f")) {
				throw new ParseException("Expected " + "f", curPos);
			}
		}
		else throw new AssertionError("Illegal character " + curChar);
	}
}
