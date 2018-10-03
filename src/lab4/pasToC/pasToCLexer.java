package lab4.pasToC;

import lab4.Tree;

import java.io.*;
import java.util.*;
import java.text.ParseException;

public class pasToCLexer {
	private InputStream is;
	private int curChar;
	private int curPos;
	private Token curToken;
	private String curString;
	public pasToCLexer(InputStream is) throws ParseException, IOException {
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
		if ((",").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.COMMA;
			while(curString.length() < ",".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals(",")) {
				throw new ParseException("Expected " + ",", curPos);
			}
		}
		else if (("0").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "0".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("0")) {
				throw new ParseException("Expected " + "0", curPos);
			}
		}
		else if (("1").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "1".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("1")) {
				throw new ParseException("Expected " + "1", curPos);
			}
		}
		else if (("2").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "2".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("2")) {
				throw new ParseException("Expected " + "2", curPos);
			}
		}
		else if (("3").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "3".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("3")) {
				throw new ParseException("Expected " + "3", curPos);
			}
		}
		else if (("4").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "4".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("4")) {
				throw new ParseException("Expected " + "4", curPos);
			}
		}
		else if (("5").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "5".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("5")) {
				throw new ParseException("Expected " + "5", curPos);
			}
		}
		else if (("6").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "6".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("6")) {
				throw new ParseException("Expected " + "6", curPos);
			}
		}
		else if (("7").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "7".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("7")) {
				throw new ParseException("Expected " + "7", curPos);
			}
		}
		else if (("8").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "8".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("8")) {
				throw new ParseException("Expected " + "8", curPos);
			}
		}
		else if (("9").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.NUMBER;
			while(curString.length() < "9".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("9")) {
				throw new ParseException("Expected " + "9", curPos);
			}
		}
		else if (("var").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.VAR;
			while(curString.length() < "var".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("var")) {
				throw new ParseException("Expected " + "var", curPos);
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
		else if ((".").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.DOT;
			while(curString.length() < ".".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals(".")) {
				throw new ParseException("Expected " + ".", curPos);
			}
		}
		else if ((";").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.SEMI;
			while(curString.length() < ";".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals(";")) {
				throw new ParseException("Expected " + ";", curPos);
			}
		}
		else if ((":").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.COLON;
			while(curString.length() < ":".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals(":")) {
				throw new ParseException("Expected " + ":", curPos);
			}
		}
		else if (("=").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.RAVNO;
			while(curString.length() < "=".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("=")) {
				throw new ParseException("Expected " + "=", curPos);
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
		else if (("begin").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.BEGIN;
			while(curString.length() < "begin".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("begin")) {
				throw new ParseException("Expected " + "begin", curPos);
			}
		}
		else if (("write").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.WRITE;
			while(curString.length() < "write".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("write")) {
				throw new ParseException("Expected " + "write", curPos);
			}
		}
		else if (("-").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.MINUS;
			while(curString.length() < "-".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("-")) {
				throw new ParseException("Expected " + "-", curPos);
			}
		}
		else if (("read").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.READ;
			while(curString.length() < "read".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("read")) {
				throw new ParseException("Expected " + "read", curPos);
			}
		}
		else if (("a").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "a".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("a")) {
				throw new ParseException("Expected " + "a", curPos);
			}
		}
		else if (("c").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "c".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("c")) {
				throw new ParseException("Expected " + "c", curPos);
			}
		}
		else if (("d").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "d".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("d")) {
				throw new ParseException("Expected " + "d", curPos);
			}
		}
		else if (("f").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "f".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("f")) {
				throw new ParseException("Expected " + "f", curPos);
			}
		}
		else if (("g").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "g".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("g")) {
				throw new ParseException("Expected " + "g", curPos);
			}
		}
		else if (("h").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "h".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("h")) {
				throw new ParseException("Expected " + "h", curPos);
			}
		}
		else if (("j").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "j".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("j")) {
				throw new ParseException("Expected " + "j", curPos);
			}
		}
		else if (("k").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "k".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("k")) {
				throw new ParseException("Expected " + "k", curPos);
			}
		}
		else if (("l").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "l".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("l")) {
				throw new ParseException("Expected " + "l", curPos);
			}
		}
		else if (("m").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "m".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("m")) {
				throw new ParseException("Expected " + "m", curPos);
			}
		}
		else if (("n").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.IDENT;
			while(curString.length() < "n".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("n")) {
				throw new ParseException("Expected " + "n", curPos);
			}
		}
		else if (("string").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.STRING;
			while(curString.length() < "string".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("string")) {
				throw new ParseException("Expected " + "string", curPos);
			}
		}
		else if (("end").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.END;
			while(curString.length() < "end".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("end")) {
				throw new ParseException("Expected " + "end", curPos);
			}
		}
		else if (("integer").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.INTEGER;
			while(curString.length() < "integer".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("integer")) {
				throw new ParseException("Expected " + "integer", curPos);
			}
		}
		else if (("+").startsWith(String.valueOf((char) curChar))) {
			curToken = Token.PLUS;
			while(curString.length() < "+".length()) {
				curString += (char) curChar;
				nextChar();
			}
			if(!curString.equals("+")) {
				throw new ParseException("Expected " + "+", curPos);
			}
		}
		else throw new AssertionError("Illegal character " + curChar);
	}
}
