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
		} catch (IOException e) {
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

	public String eat() throws IOException, ParseException {
	    String ans = "";
        if (curChar == -1) return "@eof";
        if (curChar == '(' || curChar == ')' || curChar == ';' || curChar == '.') {
			ans = "" + (char) curChar;
			nextChar();
            return ans;
        }
	    while (!isBlank(curChar)) {
	        if (curChar == '(' || curChar == ')' || curChar == ';' || curChar == '.' || curChar == -1) break;
	        ans += (char) curChar;
	        nextChar();
        }
        while (isBlank(curChar)) {
	        nextChar();
        }
		if (ans.equals("")) return eat();
	    return ans;
    }

	public void nextToken() throws ParseException, IOException {
		curString = eat();
		if (curString.equals("@eof")) {
			curToken = Token.EOF;
			return;
		}
		if ((",").equals(curString)) {
			curToken = Token.COMMA;
		}
		else if (("var").equals(curString)) {
			curToken = Token.VAR;
		}
		else if (("(").equals(curString)) {
			curToken = Token.LPAREN;
		}
		else if ((".").equals(curString)) {
			curToken = Token.DOT;
		}
		else if ((";").equals(curString)) {
			curToken = Token.SEMI;
		}
		else if ((":").equals(curString)) {
			curToken = Token.COLON;
		}
		else if (("=").equals(curString)) {
			curToken = Token.RAVNO;
		}
		else if ((")").equals(curString)) {
			curToken = Token.RPAREN;
		}
		else if (("begin").equals(curString)) {
			curToken = Token.BEGIN;
		}
		else if ((":=").equals(curString)) {
			curToken = Token.ASSIGN;
		}
		else if (("write").equals(curString)) {
			curToken = Token.WRITE;
		}
		else if (("-").equals(curString)) {
			curToken = Token.MINUS;
		}
		else if (("read").equals(curString)) {
			curToken = Token.READ;
		}
		else if (("string").equals(curString)) {
			curToken = Token.STRING;
		}
		else if (("end").equals(curString)) {
			curToken = Token.END;
		}
		else if (("integer").equals(curString)) {
			curToken = Token.INTEGER;
		}
		else if (("+").equals(curString)) {
			curToken = Token.PLUS;
		}
		else if (curString.matches("[a-zA-Z]+")) {
			curToken = Token.IDENT;
		}

		else if (curString.matches("[1-9][0-9]*")) {
			curToken = Token.NUMBER;
		}

		else throw new AssertionError("Illegal character " + (char) curChar + "\n ans CURSTRING: " + curString);
	}
}
