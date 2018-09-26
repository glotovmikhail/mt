package lab2;

enum Token {
    NOT, AND, OR, XOR,
    LPAREN, RPAREN, END, BOOL, SHL
}

class LexicalAnalyzer {
    private String data;
    private int pointer;
    private long dataSize;
    private String currBool;
    private Token currentToken = Token.END;

    LexicalAnalyzer(String s) throws LexicalException {
        this.data = s;
        this.pointer = 0;
        this.dataSize = s.length();
        nextToken();
    }

    private void trim() {
        char c;
        while (pointer < dataSize && ((c = data.charAt(pointer)) == ' ' || c == '\r' || c == '\n' || c == '\t')) {
            pointer++;
        }
    }

    void nextToken() throws LexicalException {
        trim();
        Token answer;
        if (pointer == dataSize) {
            currentToken = Token.END;
            return;
        }
        switch (data.charAt(pointer)) {
            case '(':
                if (eat("(")) {
                    currentToken = Token.LPAREN;
                    return;
                }
            case ')':
                if (eat(")")) {
                    currentToken = Token.RPAREN;
                    return;
                }
            case 'o':
                if (eat("or")) {
                    currentToken = Token.OR;
                    return;
                }
            case 'a':
                if (eat("and")) {
                    currentToken = Token.AND;
                    return;
                }
            case 'n':
                if (eat("not")) {
                    currentToken = Token.NOT;
                    return;
                }
            case 'x':
                if (eat("xor")) {
                    currentToken = Token.XOR;
                    return;
                }
            case 's':
                if (eat("shl")) {
                    currentToken = Token.SHL;
                    return;
                }
            default:
                if (eatVal()) {
                    currentToken = Token.BOOL;
                    return;
                }
        }
        throw new LexicalException("");
    }

    private Boolean eat(String s) {
        long sSize = s.length();
        if (dataSize < pointer + sSize) return false;
        for (int i = 0; i < sSize; i++) {
            if (s.charAt(i) != data.charAt(pointer + i)) return false;
        }
        pointer += sSize;
        return true;
    }

    private Boolean eatVal() {
        char c;
        Boolean flag = false;
        currBool = "";
        while ((dataSize > pointer) && ((c = data.charAt(pointer)) >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
            currBool += data.charAt(pointer);//
            pointer++;
            flag = true;
        }
        return flag;
    }

    Token currToken() {
        return currentToken;
    }

    String getCurrBool() {
        return currBool;
    }
}

class LexicalException extends Exception {
    LexicalException(String msg) {
        super(msg);
    }
}