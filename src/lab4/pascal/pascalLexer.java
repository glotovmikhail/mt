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
		if (("not").equals(curString)) {
			curToken = Token.NOT;
		}
		else if (("or").equals(curString)) {
			curToken = Token.OR;
		}
		else if (("and").equals(curString)) {
			curToken = Token.AND;
		}
		else if (("(").equals(curString)) {
			curToken = Token.LPAREN;
		}
		else if (("xor").equals(curString)) {
			curToken = Token.XOR;
		}
		else if ((")").equals(curString)) {
			curToken = Token.RPAREN;
		}
		else if (curString.matches("[a-zA-Z][a-zA-Z0-9]*")) {
			curToken = Token.IDENT;
		}

		else if (curString.matches("[0-9]")) {
			curToken = Token.NUMBER;
		}

		else throw new AssertionError("Illegal character " + (char) curChar + "\n ans CURSTRING: " + curString);
	}
}
