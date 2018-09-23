// Generated from PascalToC.g4 by ANTLR 4.5.3

package lab3;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalToCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, READ=2, READLN=3, WRITELN=4, WRITE=5, AND=6, ARRAY=7, BEGIN=8, 
		BOOLEAN=9, CASE=10, CHAR=11, CHR=12, EXIT=13, CONST=14, DIV=15, DO=16, 
		DOWNTO=17, ELSE=18, END=19, FILE=20, FOR=21, FORWARD=22, FUNCTION=23, 
		GOTO=24, IF=25, IN=26, INTEGER=27, LABEL=28, MOD=29, NIL=30, NOT=31, OF=32, 
		OR=33, PACKED=34, PROCEDURE=35, PROGRAM=36, REAL=37, RECORD=38, REPEAT=39, 
		SET=40, THEN=41, TO=42, TYPE=43, UNTIL=44, VAR=45, WHILE=46, WITH=47, 
		UNIT=48, INTERFACE=49, USES=50, STRING=51, IMPLEMENTATION=52, PLUS=53, 
		MINUS=54, ASTERISK=55, SLASH=56, ASSIGN=57, COMMA=58, SEMI=59, COLON=60, 
		EQUAL=61, NOT_EQUAL=62, LT=63, LE=64, GE=65, GT=66, LPAREN=67, RPAREN=68, 
		LBRACK=69, LBRACK2=70, RBRACK=71, RBRACK2=72, POINTER=73, AT=74, DOT=75, 
		DOTDOT=76, LCURLY=77, RCURLY=78, IDENT=79, QUOTE=80, NUM_INT=81, WS=82;
	public static final int
		RULE_wholeProgram = 0, RULE_programId = 1, RULE_variables = 2, RULE_variable = 3, 
		RULE_varNames = 4, RULE_varName = 5, RULE_varType = 6, RULE_programName = 7, 
		RULE_programBody = 8, RULE_statements = 9, RULE_statement = 10, RULE_singleStatement = 11, 
		RULE_assignStatement = 12, RULE_readStatement = 13, RULE_writeStatement = 14, 
		RULE_emptyStatement = 15, RULE_ifStatement = 16, RULE_whileStatement = 17, 
		RULE_compoundStatement = 18, RULE_expression = 19, RULE_cmp = 20, RULE_simpleExpression = 21, 
		RULE_term = 22, RULE_signedFactor = 23, RULE_sign = 24, RULE_factor = 25, 
		RULE_unsignedConst = 26, RULE_stringLiteral = 27, RULE_string = 28;
	public static final String[] ruleNames = {
		"wholeProgram", "programId", "variables", "variable", "varNames", "varName", 
		"varType", "programName", "programBody", "statements", "statement", "singleStatement", 
		"assignStatement", "readStatement", "writeStatement", "emptyStatement", 
		"ifStatement", "whileStatement", "compoundStatement", "expression", "cmp", 
		"simpleExpression", "term", "signedFactor", "sign", "factor", "unsignedConst", 
		"stringLiteral", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "''''", "'read'", "'readln'", "'writeln'", "'write'", "'and'", "'array'", 
		"'begin'", "'boolean'", "'case'", "'char'", "'chr'", "'exit'", "'const'", 
		"'div'", "'do'", "'downto'", "'else'", "'end'", "'file'", "'for'", "'forward'", 
		"'function'", "'goto'", "'if'", "'in'", "'integer'", "'label'", "'mod'", 
		"'nil'", "'not'", "'of'", "'or'", "'packed'", "'procedure'", "'program'", 
		"'real'", "'record'", "'repeat'", "'set'", "'then'", "'to'", "'type'", 
		"'until'", "'var'", "'while'", "'with'", "'unit'", "'interface'", "'uses'", 
		"'string'", "'implementation'", "'+'", "'-'", "'*'", "'/'", "':='", "','", 
		"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", 
		null, "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "READ", "READLN", "WRITELN", "WRITE", "AND", "ARRAY", "BEGIN", 
		"BOOLEAN", "CASE", "CHAR", "CHR", "EXIT", "CONST", "DIV", "DO", "DOWNTO", 
		"ELSE", "END", "FILE", "FOR", "FORWARD", "FUNCTION", "GOTO", "IF", "IN", 
		"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
		"PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
		"VAR", "WHILE", "WITH", "UNIT", "INTERFACE", "USES", "STRING", "IMPLEMENTATION", 
		"PLUS", "MINUS", "ASTERISK", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
		"RCURLY", "IDENT", "QUOTE", "NUM_INT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PascalToC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int curOffset = 1;
	    public StringBuilder code = new StringBuilder("#include <stdio.h>\nint main() {\n");
	    private String curVarNames, curVarType;
	    private Map<String, String> types = new HashMap<String, String>();
	    boolean ln = false;
	    boolean inWrite = false;
	    boolean down = false;
	    List<String> writeIds = new ArrayList<String>();
	    private void append(String s) {
	        code.append(s);
	    }
	    private void offset() {
	        for (int i = 0; i < curOffset; i++) {
	            code.append("\t");
	        }
	    }
	    private void addVars(String curVarNames, String curVarType) {
	        curVarNames = curVarNames.replaceAll(" ", "");
	        for (String s : curVarNames.split(",")) {
	            if (curVarType.equals("int")) types.put(s, "%d");
	            if (curVarType.equals("char*")) types.put(s, "%s");
	        }
	    }

	    public String join(List<String> list, String conjuction) {
	        StringBuilder sb = new StringBuilder();
	        boolean first = true;
	        for (String item : list) {
	            if (first) first = false;
	            else sb.append(conjuction);
	            sb.append(item);
	        }
	        return sb.toString();
	    }

	public PascalToCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WholeProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalToCParser.BEGIN, 0); }
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalToCParser.END, 0); }
		public TerminalNode DOT() { return getToken(PascalToCParser.DOT, 0); }
		public ProgramIdContext programId() {
			return getRuleContext(ProgramIdContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public WholeProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wholeProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterWholeProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitWholeProgram(this);
		}
	}

	public final WholeProgramContext wholeProgram() throws RecognitionException {
		WholeProgramContext _localctx = new WholeProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wholeProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(58);
				programId();
				}
			}

			setState(62);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(61);
				variables();
				}
			}

			setState(64);
			match(BEGIN);
			setState(65);
			programBody();
			setState(66);
			match(END);
			setState(67);
			match(DOT);
			offset(); append("return 0;\n}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramIdContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalToCParser.PROGRAM, 0); }
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalToCParser.SEMI, 0); }
		public ProgramIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterProgramId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitProgramId(this);
		}
	}

	public final ProgramIdContext programId() throws RecognitionException {
		ProgramIdContext _localctx = new ProgramIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PROGRAM);
			setState(71);
			programName();
			setState(72);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalToCParser.VAR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(VAR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(75);
				variable();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VarNamesContext varNames;
		public VarNamesContext varNames() {
			return getRuleContext(VarNamesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalToCParser.COLON, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalToCParser.SEMI, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((VariableContext)_localctx).varNames = varNames();
			curVarNames = (((VariableContext)_localctx).varNames!=null?_input.getText(((VariableContext)_localctx).varNames.start,((VariableContext)_localctx).varNames.stop):null);
			setState(83);
			match(COLON);
			setState(84);
			varType();

			                offset();
			                addVars(curVarNames, curVarType);
			                append(curVarType + " " + curVarNames + ";\n");
			           
			setState(86);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNamesContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalToCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalToCParser.COMMA, i);
		}
		public VarNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterVarNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitVarNames(this);
		}
	}

	public final VarNamesContext varNames() throws RecognitionException {
		VarNamesContext _localctx = new VarNamesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			varName();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				varName();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalToCParser.IDENT, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PascalToCParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalToCParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(PascalToCParser.STRING, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(BOOLEAN);
				curVarType = "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(INTEGER);
				curVarType = "int";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(STRING);
				curVarType = "char*";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalToCParser.IDENT, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterProgramBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitProgramBody(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_programBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalToCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalToCParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			statement();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(111);
				match(SEMI);
				setState(112);
				statement();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				offset();
				setState(119);
				singleStatement();
				append(";\n");
				}
				break;
			case 2:
				{
				setState(122);
				emptyStatement();
				}
				break;
			case 3:
				{
				offset();
				setState(124);
				ifStatement();
				}
				break;
			case 4:
				{
				offset();
				setState(126);
				whileStatement();
				}
				break;
			case 5:
				{
				offset();
				setState(128);
				compoundStatement();
				}
				break;
			case 6:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleStatement);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				assignStatement();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				readStatement();
				}
				break;
			case WRITELN:
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				writeStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(PascalToCParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(PascalToCParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((AssignStatementContext)_localctx).IDENT = match(IDENT);
			setState(138);
			match(ASSIGN);
			append((((AssignStatementContext)_localctx).IDENT!=null?((AssignStatementContext)_localctx).IDENT.getText():null) + " = ");
			setState(140);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatementContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode LPAREN() { return getToken(PascalToCParser.LPAREN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(PascalToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PascalToCParser.IDENT, i);
		}
		public TerminalNode RPAREN() { return getToken(PascalToCParser.RPAREN, 0); }
		public TerminalNode READ() { return getToken(PascalToCParser.READ, 0); }
		public TerminalNode READLN() { return getToken(PascalToCParser.READLN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalToCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalToCParser.COMMA, i);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitReadStatement(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(142);
				match(READ);
				ln = false;
				}
				break;
			case READLN:
				{
				setState(144);
				match(READLN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			match(LPAREN);
			 append("scanf(\""); 
			setState(150);
			((ReadStatementContext)_localctx).IDENT = match(IDENT);
			 append(types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
			                        writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				((ReadStatementContext)_localctx).IDENT = match(IDENT);
				append(" " + types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
				                              writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RPAREN);
			if (ln) append("\"\\n\"");
			                        if (!writeIds.isEmpty()) append("\", ");
			                        append(join(writeIds, ", "));
			                        writeIds.clear();
			                        append(")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalToCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascalToCParser.RPAREN, 0); }
		public TerminalNode WRITE() { return getToken(PascalToCParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(PascalToCParser.WRITELN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch (_input.LA(1)) {
			case WRITE:
				{
				setState(163);
				match(WRITE);
				ln = false;
				}
				break;
			case WRITELN:
				{
				setState(165);
				match(WRITELN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			match(LPAREN);
			 inWrite = true;
			                          append("printf("); 
			setState(174);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NOT - 31)) | (1L << (PLUS - 31)) | (1L << (MINUS - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENT - 31)) | (1L << (QUOTE - 31)) | (1L << (NUM_INT - 31)))) != 0)) {
				{
				setState(171);
				expression();
				if (ln) append(" + ");
				}
			}

			setState(176);
			match(RPAREN);
			if (ln) append("\"\\n\"");
			                         if (!writeIds.isEmpty()) append(", ");
			                         append(join(writeIds, ", "));
			                         writeIds.clear();
			                         inWrite = false; append(")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalToCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalToCParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalToCParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IF);
			append("if ("); curOffset++;
			setState(183);
			expression();
			setState(184);
			match(THEN);
			append(") {\n");
			setState(186);
			statement();
			curOffset--;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(188);
				match(ELSE);
				offset();
				                                                                                     append ("} else {\n"); curOffset++;
				setState(190);
				statement();
				curOffset--; offset(); append("}\n");
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalToCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalToCParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			append("while (");
			setState(197);
			expression();
			append(") \n"); 
			setState(199);
			match(DO);
			setState(200);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalToCParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalToCParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(BEGIN);
			append("{\n"); curOffset++;
			setState(204);
			statements();
			setState(205);
			match(END);
			curOffset--;
			                         offset();
			                         append("}\n");
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public CmpContext cmp;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PascalToCParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PascalToCParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(PascalToCParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(PascalToCParser.NOT_EQUAL, i);
		}
		public List<CmpContext> cmp() {
			return getRuleContexts(CmpContext.class);
		}
		public CmpContext cmp(int i) {
			return getRuleContext(CmpContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			simpleExpression();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (EQUAL - 61)) | (1L << (NOT_EQUAL - 61)) | (1L << (LT - 61)) | (1L << (LE - 61)) | (1L << (GE - 61)) | (1L << (GT - 61)))) != 0)) {
				{
				{
				setState(216);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(209);
					match(EQUAL);
					append(" == ");
					}
					break;
				case NOT_EQUAL:
					{
					setState(211);
					match(NOT_EQUAL);
					append(" != ");
					}
					break;
				case LT:
				case LE:
				case GE:
				case GT:
					{
					setState(213);
					((ExpressionContext)_localctx).cmp = cmp();
					append(" " + (((ExpressionContext)_localctx).cmp!=null?_input.getText(((ExpressionContext)_localctx).cmp.start,((ExpressionContext)_localctx).cmp.stop):null) + " ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218);
				simpleExpression();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PascalToCParser.LT, 0); }
		public TerminalNode GT() { return getToken(PascalToCParser.GT, 0); }
		public TerminalNode LE() { return getToken(PascalToCParser.LE, 0); }
		public TerminalNode GE() { return getToken(PascalToCParser.GE, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitCmp(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LT - 63)) | (1L << (LE - 63)) | (1L << (GE - 63)) | (1L << (GT - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SignContext sign;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PascalToCParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PascalToCParser.OR, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			term();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(232);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
					{
					setState(227);
					((SimpleExpressionContext)_localctx).sign = sign();
					append(" " + (((SimpleExpressionContext)_localctx).sign!=null?_input.getText(((SimpleExpressionContext)_localctx).sign.start,((SimpleExpressionContext)_localctx).sign.stop):null) + " ");
					}
					break;
				case OR:
					{
					setState(230);
					match(OR);
					append(" || ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				term();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(PascalToCParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(PascalToCParser.ASTERISK, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PascalToCParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PascalToCParser.SLASH, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PascalToCParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PascalToCParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(PascalToCParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(PascalToCParser.MOD, i);
		}
		public List<TerminalNode> AND() { return getTokens(PascalToCParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PascalToCParser.AND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			signedFactor();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << ASTERISK) | (1L << SLASH))) != 0)) {
				{
				{
				setState(251);
				switch (_input.LA(1)) {
				case ASTERISK:
					{
					setState(241);
					match(ASTERISK);
					append(" * ");
					}
					break;
				case SLASH:
					{
					setState(243);
					match(SLASH);
					append(" / ");
					}
					break;
				case DIV:
					{
					setState(245);
					match(DIV);
					append(" / ");
					}
					break;
				case MOD:
					{
					setState(247);
					match(MOD);
					append(" % ");
					}
					break;
				case AND:
					{
					setState(249);
					match(AND);
					append(" && ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253);
				signedFactor();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public SignContext sign;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitSignedFactor(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(259);
				((SignedFactorContext)_localctx).sign = sign();
				append((((SignedFactorContext)_localctx).sign!=null?_input.getText(((SignedFactorContext)_localctx).sign.start,((SignedFactorContext)_localctx).sign.stop):null));
				}
			}

			setState(264);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalToCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalToCParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(PascalToCParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(PascalToCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalToCParser.RPAREN, 0); }
		public UnsignedConstContext unsignedConst() {
			return getRuleContext(UnsignedConstContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalToCParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((FactorContext)_localctx).IDENT = match(IDENT);
				if (inWrite) {
				                    writeIds.add((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				                    append("\"" + types.get((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null)) + "\"");
				                } else append((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				               
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(LPAREN);
				append("(");
				setState(272);
				expression();
				setState(273);
				match(RPAREN);
				append(")");
				}
				break;
			case QUOTE:
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				unsignedConst();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(NOT);
				append("!");
				setState(279);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstContext extends ParserRuleContext {
		public Token NUM_INT;
		public TerminalNode NUM_INT() { return getToken(PascalToCParser.NUM_INT, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public UnsignedConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterUnsignedConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitUnsignedConst(this);
		}
	}

	public final UnsignedConstContext unsignedConst() throws RecognitionException {
		UnsignedConstContext _localctx = new UnsignedConstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unsignedConst);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((UnsignedConstContext)_localctx).NUM_INT = match(NUM_INT);
				if (inWrite) {
				                            writeIds.add((((UnsignedConstContext)_localctx).NUM_INT!=null?((UnsignedConstContext)_localctx).NUM_INT.getText():null));
				                            append("\"%d\"");
				                         } else append((((UnsignedConstContext)_localctx).NUM_INT!=null?((UnsignedConstContext)_localctx).NUM_INT.getText():null));
				                        
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public StringContext string;
		public List<TerminalNode> QUOTE() { return getTokens(PascalToCParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PascalToCParser.QUOTE, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(QUOTE);
			setState(288);
			((StringLiteralContext)_localctx).string = string();
			setState(289);
			match(QUOTE);
			append("\"" + (((StringLiteralContext)_localctx).string!=null?_input.getText(((StringLiteralContext)_localctx).string.start,((StringLiteralContext)_localctx).string.stop):null) + "\"");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << READ) | (1L << READLN) | (1L << WRITELN) | (1L << WRITE) | (1L << AND) | (1L << ARRAY) | (1L << BEGIN) | (1L << BOOLEAN) | (1L << CASE) | (1L << CHAR) | (1L << CHR) | (1L << EXIT) | (1L << CONST) | (1L << DIV) | (1L << DO) | (1L << DOWNTO) | (1L << ELSE) | (1L << END) | (1L << FILE) | (1L << FOR) | (1L << FORWARD) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << LABEL) | (1L << MOD) | (1L << NIL) | (1L << NOT) | (1L << OF) | (1L << OR) | (1L << PACKED) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << REAL) | (1L << RECORD) | (1L << REPEAT) | (1L << SET) | (1L << THEN) | (1L << TO) | (1L << TYPE) | (1L << UNTIL) | (1L << VAR) | (1L << WHILE) | (1L << WITH) | (1L << UNIT) | (1L << INTERFACE) | (1L << USES) | (1L << STRING) | (1L << IMPLEMENTATION) | (1L << PLUS) | (1L << MINUS) | (1L << ASTERISK) | (1L << SLASH) | (1L << ASSIGN) | (1L << COMMA) | (1L << SEMI) | (1L << COLON) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (LBRACK2 - 64)) | (1L << (RBRACK - 64)) | (1L << (RBRACK2 - 64)) | (1L << (POINTER - 64)) | (1L << (AT - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (IDENT - 64)) | (1L << (NUM_INT - 64)) | (1L << (WS - 64)))) != 0)) {
				{
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(292);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(293);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==QUOTE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\5"+
		"\2A\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\7\13t\n\13\f\13\16\13w\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00aa\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00db\n\25\3\25\7\25\u00de\n\25\f\25\16\25\u00e1\13\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00eb\n\27\3\27\7\27\u00ee\n\27\f"+
		"\27\16\27\u00f1\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00fe\n\30\3\30\7\30\u0101\n\30\f\30\16\30\u0104\13\30\3\31"+
		"\3\31\3\31\5\31\u0109\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011b\n\33\3\34\3\34\3\34\5\34"+
		"\u0120\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0129\n\36\f\36\16"+
		"\36\u012c\13\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\5\3\2AD\3\2\678\3\2RR\u0134\2=\3\2\2\2\4H\3\2\2"+
		"\2\6L\3\2\2\2\bS\3\2\2\2\nZ\3\2\2\2\fb\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2"+
		"\22n\3\2\2\2\24p\3\2\2\2\26\u0084\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3"+
		"\2\2\2\34\u0094\3\2\2\2\36\u00a9\3\2\2\2 \u00b5\3\2\2\2\"\u00b7\3\2\2"+
		"\2$\u00c5\3\2\2\2&\u00cc\3\2\2\2(\u00d2\3\2\2\2*\u00e2\3\2\2\2,\u00e4"+
		"\3\2\2\2.\u00f2\3\2\2\2\60\u0108\3\2\2\2\62\u010c\3\2\2\2\64\u011a\3\2"+
		"\2\2\66\u011f\3\2\2\28\u0121\3\2\2\2:\u012a\3\2\2\2<>\5\4\3\2=<\3\2\2"+
		"\2=>\3\2\2\2>@\3\2\2\2?A\5\6\4\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\n\2"+
		"\2CD\5\22\n\2DE\7\25\2\2EF\7M\2\2FG\b\2\1\2G\3\3\2\2\2HI\7&\2\2IJ\5\20"+
		"\t\2JK\7=\2\2K\5\3\2\2\2LP\7/\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST\5\n\6\2TU\b\5\1\2UV\7>\2\2VW\5\16"+
		"\b\2WX\b\5\1\2XY\7=\2\2Y\t\3\2\2\2Z_\5\f\7\2[\\\7<\2\2\\^\5\f\7\2][\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7Q\2\2c\r"+
		"\3\2\2\2de\7\13\2\2ek\b\b\1\2fg\7\35\2\2gk\b\b\1\2hi\7\65\2\2ik\b\b\1"+
		"\2jd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\17\3\2\2\2lm\7Q\2\2m\21\3\2\2\2no\5"+
		"\24\13\2o\23\3\2\2\2pu\5\26\f\2qr\7=\2\2rt\5\26\f\2sq\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wu\3\2\2\2xy\b\f\1\2yz\5\30\r\2z{\b"+
		"\f\1\2{\u0085\3\2\2\2|\u0085\5 \21\2}~\b\f\1\2~\u0085\5\"\22\2\177\u0080"+
		"\b\f\1\2\u0080\u0085\5$\23\2\u0081\u0082\b\f\1\2\u0082\u0085\5&\24\2\u0083"+
		"\u0085\3\2\2\2\u0084x\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086"+
		"\u008a\5\32\16\2\u0087\u008a\5\34\17\2\u0088\u008a\5\36\20\2\u0089\u0086"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b"+
		"\u008c\7Q\2\2\u008c\u008d\7;\2\2\u008d\u008e\b\16\1\2\u008e\u008f\5(\25"+
		"\2\u008f\33\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0095\b\17\1\2\u0092\u0093"+
		"\7\5\2\2\u0093\u0095\b\17\1\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0097\7E\2\2\u0097\u0098\b\17\1\2\u0098\u0099"+
		"\7Q\2\2\u0099\u009f\b\17\1\2\u009a\u009b\7<\2\2\u009b\u009c\7Q\2\2\u009c"+
		"\u009e\b\17\1\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7F\2\2\u00a3\u00a4\b\17\1\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\7\2"+
		"\2\u00a6\u00aa\b\20\1\2\u00a7\u00a8\7\6\2\2\u00a8\u00aa\b\20\1\2\u00a9"+
		"\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7E"+
		"\2\2\u00ac\u00b0\b\20\1\2\u00ad\u00ae\5(\25\2\u00ae\u00af\b\20\1\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\7F\2\2\u00b3\u00b4\b\20\1\2\u00b4\37\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9\b\22\1\2\u00b9"+
		"\u00ba\5(\25\2\u00ba\u00bb\7+\2\2\u00bb\u00bc\b\22\1\2\u00bc\u00bd\5\26"+
		"\f\2\u00bd\u00c3\b\22\1\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\b\22\1\2\u00c0"+
		"\u00c1\5\26\f\2\u00c1\u00c2\b\22\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00be\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7"+
		"\b\23\1\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\b\23\1\2\u00c9\u00ca\7\22\2"+
		"\2\u00ca\u00cb\5\26\f\2\u00cb%\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce"+
		"\b\24\1\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\25\2\2\u00d0\u00d1\b\24"+
		"\1\2\u00d1\'\3\2\2\2\u00d2\u00df\5,\27\2\u00d3\u00d4\7?\2\2\u00d4\u00db"+
		"\b\25\1\2\u00d5\u00d6\7@\2\2\u00d6\u00db\b\25\1\2\u00d7\u00d8\5*\26\2"+
		"\u00d8\u00d9\b\25\1\2\u00d9\u00db\3\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d5"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5,\27\2\u00dd"+
		"\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0)\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3+\3\2"+
		"\2\2\u00e4\u00ef\5.\30\2\u00e5\u00e6\5\62\32\2\u00e6\u00e7\b\27\1\2\u00e7"+
		"\u00eb\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00eb\b\27\1\2\u00ea\u00e5\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5.\30\2\u00ed"+
		"\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0-\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u0102\5\60\31\2\u00f3\u00f4"+
		"\79\2\2\u00f4\u00fe\b\30\1\2\u00f5\u00f6\7:\2\2\u00f6\u00fe\b\30\1\2\u00f7"+
		"\u00f8\7\21\2\2\u00f8\u00fe\b\30\1\2\u00f9\u00fa\7\37\2\2\u00fa\u00fe"+
		"\b\30\1\2\u00fb\u00fc\7\b\2\2\u00fc\u00fe\b\30\1\2\u00fd\u00f3\3\2\2\2"+
		"\u00fd\u00f5\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\5\60\31\2\u0100\u00fd\3\2\2\2"+
		"\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103/\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\62\32\2\u0106\u0107\b\31\1\2"+
		"\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\5\64\33\2\u010b\61\3\2\2\2\u010c\u010d\t\3\2\2\u010d"+
		"\63\3\2\2\2\u010e\u010f\7Q\2\2\u010f\u011b\b\33\1\2\u0110\u0111\7E\2\2"+
		"\u0111\u0112\b\33\1\2\u0112\u0113\5(\25\2\u0113\u0114\7F\2\2\u0114\u0115"+
		"\b\33\1\2\u0115\u011b\3\2\2\2\u0116\u011b\5\66\34\2\u0117\u0118\7!\2\2"+
		"\u0118\u0119\b\33\1\2\u0119\u011b\5\64\33\2\u011a\u010e\3\2\2\2\u011a"+
		"\u0110\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011b\65\3\2\2"+
		"\2\u011c\u011d\7S\2\2\u011d\u0120\b\34\1\2\u011e\u0120\58\35\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\67\3\2\2\2\u0121\u0122\7R\2\2\u0122"+
		"\u0123\5:\36\2\u0123\u0124\7R\2\2\u0124\u0125\b\35\1\2\u01259\3\2\2\2"+
		"\u0126\u0129\7\3\2\2\u0127\u0129\n\4\2\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		";\3\2\2\2\u012c\u012a\3\2\2\2\32=@P_ju\u0084\u0089\u0094\u009f\u00a9\u00b0"+
		"\u00c3\u00da\u00df\u00ea\u00ef\u00fd\u0102\u0108\u011a\u011f\u0128\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}