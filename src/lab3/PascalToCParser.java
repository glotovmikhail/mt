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
		RULE_emptyStatement = 15, RULE_forStatement = 16, RULE_repeatStatement = 17, 
		RULE_ifStatement = 18, RULE_whileStatement = 19, RULE_compoundStatement = 20, 
		RULE_expression = 21, RULE_cmp = 22, RULE_simpleExpression = 23, RULE_term = 24, 
		RULE_signedFactor = 25, RULE_sign = 26, RULE_factor = 27, RULE_unsignedConst = 28, 
		RULE_stringLiteral = 29, RULE_string = 30;
	public static final String[] ruleNames = {
		"wholeProgram", "programId", "variables", "variable", "varNames", "varName", 
		"varType", "programName", "programBody", "statements", "statement", "singleStatement", 
		"assignStatement", "readStatement", "writeStatement", "emptyStatement", 
		"forStatement", "repeatStatement", "ifStatement", "whileStatement", "compoundStatement", 
		"expression", "cmp", "simpleExpression", "term", "signedFactor", "sign", 
		"factor", "unsignedConst", "stringLiteral", "string"
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
			setState(63);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(62);
				programId();
				}
			}

			setState(66);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(65);
				variables();
				}
			}

			setState(68);
			match(BEGIN);
			setState(69);
			programBody();
			setState(70);
			match(END);
			setState(71);
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
			setState(74);
			match(PROGRAM);
			setState(75);
			programName();
			setState(76);
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
			setState(78);
			match(VAR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(79);
				variable();
				}
				}
				setState(84);
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
			setState(85);
			((VariableContext)_localctx).varNames = varNames();
			curVarNames = (((VariableContext)_localctx).varNames!=null?_input.getText(((VariableContext)_localctx).varNames.start,((VariableContext)_localctx).varNames.stop):null);
			setState(87);
			match(COLON);
			setState(88);
			varType();

			                offset();
			                addVars(curVarNames, curVarType);
			                append(curVarType + " " + curVarNames + ";\n");
			           
			setState(90);
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
			setState(92);
			varName();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				varName();
				}
				}
				setState(99);
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
			setState(100);
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
			setState(108);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(BOOLEAN);
				curVarType = "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(INTEGER);
				curVarType = "int";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
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
			setState(110);
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
			setState(112);
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
			setState(114);
			statement();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(115);
				match(SEMI);
				setState(116);
				statement();
				}
				}
				setState(121);
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
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				offset();
				setState(123);
				singleStatement();
				append(";\n");
				}
				break;
			case 2:
				{
				setState(126);
				emptyStatement();
				}
				break;
			case 3:
				{
				offset();
				setState(128);
				ifStatement();
				}
				break;
			case 4:
				{
				offset();
				setState(130);
				repeatStatement();
				}
				break;
			case 5:
				{
				setState(131);
				forStatement();
				}
				break;
			case 6:
				{
				offset();
				setState(133);
				whileStatement();
				}
				break;
			case 7:
				{
				offset();
				setState(135);
				compoundStatement();
				}
				break;
			case 8:
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
			setState(142);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				assignStatement();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				readStatement();
				}
				break;
			case WRITELN:
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
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
			setState(144);
			((AssignStatementContext)_localctx).IDENT = match(IDENT);
			setState(145);
			match(ASSIGN);
			append((((AssignStatementContext)_localctx).IDENT!=null?((AssignStatementContext)_localctx).IDENT.getText():null) + " = ");
			setState(147);
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
			setState(153);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(149);
				match(READ);
				ln = false;
				}
				break;
			case READLN:
				{
				setState(151);
				match(READLN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			match(LPAREN);
			 append("scanf(\""); 
			setState(157);
			((ReadStatementContext)_localctx).IDENT = match(IDENT);
			 append(types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
			                        writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				((ReadStatementContext)_localctx).IDENT = match(IDENT);
				append(" " + types.get((((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null)));
				                              writeIds.add("&" + (((ReadStatementContext)_localctx).IDENT!=null?((ReadStatementContext)_localctx).IDENT.getText():null));
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
			setState(174);
			switch (_input.LA(1)) {
			case WRITE:
				{
				setState(170);
				match(WRITE);
				ln = false;
				}
				break;
			case WRITELN:
				{
				setState(172);
				match(WRITELN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(LPAREN);
			 inWrite = true;
			                          append("printf("); 
			setState(181);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (NOT - 31)) | (1L << (PLUS - 31)) | (1L << (MINUS - 31)) | (1L << (LPAREN - 31)) | (1L << (IDENT - 31)) | (1L << (QUOTE - 31)) | (1L << (NUM_INT - 31)))) != 0)) {
				{
				setState(178);
				expression();
				if (ln) append(" + ");
				}
			}

			setState(183);
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

	public static class ForStatementContext extends ParserRuleContext {
		public String iterator =  "";
		public String value =  "";
		public FactorContext factor;
		public Token NUM_INT;
		public TerminalNode FOR() { return getToken(PascalToCParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PascalToCParser.LPAREN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalToCParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(PascalToCParser.NUM_INT, 0); }
		public TerminalNode TO() { return getToken(PascalToCParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascalToCParser.DOWNTO, 0); }
		public TerminalNode DO() { return getToken(PascalToCParser.DO, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalToCParser.SEMI, 0); }
		public TerminalNode END() { return getToken(PascalToCParser.END, 0); }
		public TerminalNode DOT() { return getToken(PascalToCParser.DOT, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FOR);
			setState(189);
			match(LPAREN);
			offset(); append("for (");
			setState(191);
			((ForStatementContext)_localctx).factor = factor();
			((ForStatementContext)_localctx).iterator =  (((ForStatementContext)_localctx).factor!=null?_input.getText(((ForStatementContext)_localctx).factor.start,((ForStatementContext)_localctx).factor.stop):null);
			setState(193);
			match(ASSIGN);
			append(" = ");
			setState(195);
			expression();
			append("; ");
			setState(201);
			switch (_input.LA(1)) {
			case TO:
				{
				setState(197);
				match(TO);
				down = false;
				}
				break;
			case DOWNTO:
				{
				setState(199);
				match(DOWNTO);
				down = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			((ForStatementContext)_localctx).NUM_INT = match(NUM_INT);
			((ForStatementContext)_localctx).value =  (((ForStatementContext)_localctx).NUM_INT!=null?((ForStatementContext)_localctx).NUM_INT.getText():null);
			                                                 if (down) {
			                                                    append(_localctx.iterator + " >= " + _localctx.value + "; ");
			                                                    append(_localctx.iterator + "--)");
			                                                 } else {
			                                                    append(_localctx.iterator + " <= " + _localctx.value + "; ");
			                                                    append(_localctx.iterator + "++)");
			                                                 }
			                                             
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(205);
				match(DO);
				append("\n"); offset();
				setState(207);
				compoundStatement();
				}
				}
				break;
			case 2:
				{
				{
				setState(208);
				match(DO);
				append(" {\n"); curOffset++; offset();
				setState(210);
				singleStatement();
				setState(211);
				match(SEMI);
				curOffset--; offset(); append(";\n");
				setState(213);
				match(END);
				setState(214);
				match(DOT);
				append("}\n");
				}
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascalToCParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PascalToCParser.UNTIL, 0); }
		public TerminalNode LPAREN() { return getToken(PascalToCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalToCParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PascalToCParser.SEMI, 0); }
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalToCListener ) ((PascalToCListener)listener).exitRepeatStatement(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(REPEAT);
			append("do {"); curOffset++; append("\n");
			setState(221);
			statements();
			curOffset--;
			setState(223);
			match(UNTIL);
			setState(224);
			match(LPAREN);
			offset(); append("} while (!(");
			setState(226);
			expression();
			append("));\n");
			setState(228);
			match(RPAREN);
			setState(229);
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
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			append("if ("); curOffset++;
			setState(233);
			expression();
			setState(234);
			match(THEN);
			append(") {\n");
			setState(236);
			statement();
			curOffset--;
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(238);
				match(ELSE);
				offset();
				                                                                                     append ("} else {\n"); curOffset++;
				setState(240);
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
		enterRule(_localctx, 38, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(WHILE);
			append("while (");
			setState(247);
			expression();
			append(") \n"); 
			setState(249);
			match(DO);
			setState(250);
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
		enterRule(_localctx, 40, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(BEGIN);
			append("{\n"); curOffset++;
			setState(254);
			statements();
			setState(255);
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			simpleExpression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (EQUAL - 61)) | (1L << (NOT_EQUAL - 61)) | (1L << (LT - 61)) | (1L << (LE - 61)) | (1L << (GE - 61)) | (1L << (GT - 61)))) != 0)) {
				{
				{
				setState(266);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(259);
					match(EQUAL);
					append(" == ");
					}
					break;
				case NOT_EQUAL:
					{
					setState(261);
					match(NOT_EQUAL);
					append(" != ");
					}
					break;
				case LT:
				case LE:
				case GE:
				case GT:
					{
					setState(263);
					((ExpressionContext)_localctx).cmp = cmp();
					append(" " + (((ExpressionContext)_localctx).cmp!=null?_input.getText(((ExpressionContext)_localctx).cmp.start,((ExpressionContext)_localctx).cmp.stop):null) + " ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268);
				simpleExpression();
				}
				}
				setState(273);
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
		enterRule(_localctx, 44, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 46, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			term();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(282);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
					{
					setState(277);
					((SimpleExpressionContext)_localctx).sign = sign();
					append(" " + (((SimpleExpressionContext)_localctx).sign!=null?_input.getText(((SimpleExpressionContext)_localctx).sign.start,((SimpleExpressionContext)_localctx).sign.stop):null) + " ");
					}
					break;
				case OR:
					{
					setState(280);
					match(OR);
					append(" || ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284);
				term();
				}
				}
				setState(289);
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
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			signedFactor();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << ASTERISK) | (1L << SLASH))) != 0)) {
				{
				{
				setState(301);
				switch (_input.LA(1)) {
				case ASTERISK:
					{
					setState(291);
					match(ASTERISK);
					append(" * ");
					}
					break;
				case SLASH:
					{
					setState(293);
					match(SLASH);
					append(" / ");
					}
					break;
				case DIV:
					{
					setState(295);
					match(DIV);
					append(" / ");
					}
					break;
				case MOD:
					{
					setState(297);
					match(MOD);
					append(" % ");
					}
					break;
				case AND:
					{
					setState(299);
					match(AND);
					append(" && ");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303);
				signedFactor();
				}
				}
				setState(308);
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
		enterRule(_localctx, 50, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(309);
				((SignedFactorContext)_localctx).sign = sign();
				append((((SignedFactorContext)_localctx).sign!=null?_input.getText(((SignedFactorContext)_localctx).sign.start,((SignedFactorContext)_localctx).sign.stop):null));
				}
			}

			setState(314);
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
		enterRule(_localctx, 52, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
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
				setState(320);
				match(LPAREN);
				append("(");
				setState(322);
				expression();
				setState(323);
				match(RPAREN);
				append(")");
				}
				break;
			case QUOTE:
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				unsignedConst();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(NOT);
				append("!");
				setState(329);
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
		enterRule(_localctx, 56, RULE_unsignedConst);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
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
				setState(334);
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
		enterRule(_localctx, 58, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(QUOTE);
			setState(338);
			((StringLiteralContext)_localctx).string = string();
			setState(339);
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
		enterRule(_localctx, 60, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << READ) | (1L << READLN) | (1L << WRITELN) | (1L << WRITE) | (1L << AND) | (1L << ARRAY) | (1L << BEGIN) | (1L << BOOLEAN) | (1L << CASE) | (1L << CHAR) | (1L << CHR) | (1L << EXIT) | (1L << CONST) | (1L << DIV) | (1L << DO) | (1L << DOWNTO) | (1L << ELSE) | (1L << END) | (1L << FILE) | (1L << FOR) | (1L << FORWARD) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << LABEL) | (1L << MOD) | (1L << NIL) | (1L << NOT) | (1L << OF) | (1L << OR) | (1L << PACKED) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << REAL) | (1L << RECORD) | (1L << REPEAT) | (1L << SET) | (1L << THEN) | (1L << TO) | (1L << TYPE) | (1L << UNTIL) | (1L << VAR) | (1L << WHILE) | (1L << WITH) | (1L << UNIT) | (1L << INTERFACE) | (1L << USES) | (1L << STRING) | (1L << IMPLEMENTATION) | (1L << PLUS) | (1L << MINUS) | (1L << ASTERISK) | (1L << SLASH) | (1L << ASSIGN) | (1L << COMMA) | (1L << SEMI) | (1L << COLON) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (LBRACK2 - 64)) | (1L << (RBRACK - 64)) | (1L << (RBRACK2 - 64)) | (1L << (POINTER - 64)) | (1L << (AT - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (IDENT - 64)) | (1L << (NUM_INT - 64)) | (1L << (WS - 64)))) != 0)) {
				{
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(342);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(343);
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
				setState(348);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\2\5\2E\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6b"+
		"\n\6\f\6\16\6e\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\5\r"+
		"\u0091\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u009c\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a5\n\17\f\17\16\17\u00a8\13"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00b8\n\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00dc"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\27\7\27\u0110\n"+
		"\27\f\27\16\27\u0113\13\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u011d\n\31\3\31\7\31\u0120\n\31\f\31\16\31\u0123\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0130\n\32\3\32\7\32\u0133"+
		"\n\32\f\32\16\32\u0136\13\32\3\33\3\33\3\33\5\33\u013b\n\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u014d\n\35\3\36\3\36\3\36\5\36\u0152\n\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \7 \u015b\n \f \16 \u015e\13 \3 \2\2!\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\3\2AD\3\2\678\3\2RR\u0168"+
		"\2A\3\2\2\2\4L\3\2\2\2\6P\3\2\2\2\bW\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16"+
		"n\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2\26\u008b\3\2\2\2\30\u0090"+
		"\3\2\2\2\32\u0092\3\2\2\2\34\u009b\3\2\2\2\36\u00b0\3\2\2\2 \u00bc\3\2"+
		"\2\2\"\u00be\3\2\2\2$\u00dd\3\2\2\2&\u00e9\3\2\2\2(\u00f7\3\2\2\2*\u00fe"+
		"\3\2\2\2,\u0104\3\2\2\2.\u0114\3\2\2\2\60\u0116\3\2\2\2\62\u0124\3\2\2"+
		"\2\64\u013a\3\2\2\2\66\u013e\3\2\2\28\u014c\3\2\2\2:\u0151\3\2\2\2<\u0153"+
		"\3\2\2\2>\u015c\3\2\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\6"+
		"\4\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\n\2\2GH\5\22\n\2HI\7\25\2\2IJ\7"+
		"M\2\2JK\b\2\1\2K\3\3\2\2\2LM\7&\2\2MN\5\20\t\2NO\7=\2\2O\5\3\2\2\2PT\7"+
		"/\2\2QS\5\b\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3"+
		"\2\2\2WX\5\n\6\2XY\b\5\1\2YZ\7>\2\2Z[\5\16\b\2[\\\b\5\1\2\\]\7=\2\2]\t"+
		"\3\2\2\2^c\5\f\7\2_`\7<\2\2`b\5\f\7\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fg\7Q\2\2g\r\3\2\2\2hi\7\13\2\2io\b\b\1"+
		"\2jk\7\35\2\2ko\b\b\1\2lm\7\65\2\2mo\b\b\1\2nh\3\2\2\2nj\3\2\2\2nl\3\2"+
		"\2\2o\17\3\2\2\2pq\7Q\2\2q\21\3\2\2\2rs\5\24\13\2s\23\3\2\2\2ty\5\26\f"+
		"\2uv\7=\2\2vx\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\25\3\2"+
		"\2\2{y\3\2\2\2|}\b\f\1\2}~\5\30\r\2~\177\b\f\1\2\177\u008c\3\2\2\2\u0080"+
		"\u008c\5 \21\2\u0081\u0082\b\f\1\2\u0082\u008c\5&\24\2\u0083\u0084\b\f"+
		"\1\2\u0084\u008c\5$\23\2\u0085\u008c\5\"\22\2\u0086\u0087\b\f\1\2\u0087"+
		"\u008c\5(\25\2\u0088\u0089\b\f\1\2\u0089\u008c\5*\26\2\u008a\u008c\3\2"+
		"\2\2\u008b|\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0083"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u0091\5\32\16\2\u008e\u0091\5\34"+
		"\17\2\u008f\u0091\5\36\20\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7;\2\2"+
		"\u0094\u0095\b\16\1\2\u0095\u0096\5,\27\2\u0096\33\3\2\2\2\u0097\u0098"+
		"\7\4\2\2\u0098\u009c\b\17\1\2\u0099\u009a\7\5\2\2\u009a\u009c\b\17\1\2"+
		"\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\7E\2\2\u009e\u009f\b\17\1\2\u009f\u00a0\7Q\2\2\u00a0\u00a6\b\17\1\2\u00a1"+
		"\u00a2\7<\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a5\b\17\1\2\u00a4\u00a1\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab\b\17"+
		"\1\2\u00ab\35\3\2\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00b1\b\20\1\2\u00ae\u00af"+
		"\7\6\2\2\u00af\u00b1\b\20\1\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7E\2\2\u00b3\u00b7\b\20\1\2\u00b4\u00b5"+
		"\5,\27\2\u00b5\u00b6\b\20\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7F\2\2\u00ba\u00bb"+
		"\b\20\1\2\u00bb\37\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd!\3\2\2\2\u00be\u00bf"+
		"\7\27\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\b\22\1\2\u00c1\u00c2\58\35\2"+
		"\u00c2\u00c3\b\22\1\2\u00c3\u00c4\7;\2\2\u00c4\u00c5\b\22\1\2\u00c5\u00c6"+
		"\5,\27\2\u00c6\u00cb\b\22\1\2\u00c7\u00c8\7,\2\2\u00c8\u00cc\b\22\1\2"+
		"\u00c9\u00ca\7\23\2\2\u00ca\u00cc\b\22\1\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7S\2\2\u00ce\u00db\b\22\1\2\u00cf"+
		"\u00d0\7\22\2\2\u00d0\u00d1\b\22\1\2\u00d1\u00dc\5*\26\2\u00d2\u00d3\7"+
		"\22\2\2\u00d3\u00d4\b\22\1\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7=\2\2\u00d6"+
		"\u00d7\b\22\1\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\7M\2\2\u00d9\u00da\b"+
		"\22\1\2\u00da\u00dc\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\b\23\1\2\u00df\u00e0\5\24\13"+
		"\2\u00e0\u00e1\b\23\1\2\u00e1\u00e2\7.\2\2\u00e2\u00e3\7E\2\2\u00e3\u00e4"+
		"\b\23\1\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\b\23\1\2\u00e6\u00e7\7F\2\2"+
		"\u00e7\u00e8\7=\2\2\u00e8%\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb\b"+
		"\24\1\2\u00eb\u00ec\5,\27\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\b\24\1\2\u00ee"+
		"\u00ef\5\26\f\2\u00ef\u00f5\b\24\1\2\u00f0\u00f1\7\24\2\2\u00f1\u00f2"+
		"\b\24\1\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\b\24\1\2\u00f4\u00f6\3\2\2"+
		"\2\u00f5\u00f0\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f8"+
		"\7\60\2\2\u00f8\u00f9\b\25\1\2\u00f9\u00fa\5,\27\2\u00fa\u00fb\b\25\1"+
		"\2\u00fb\u00fc\7\22\2\2\u00fc\u00fd\5\26\f\2\u00fd)\3\2\2\2\u00fe\u00ff"+
		"\7\n\2\2\u00ff\u0100\b\26\1\2\u0100\u0101\5\24\13\2\u0101\u0102\7\25\2"+
		"\2\u0102\u0103\b\26\1\2\u0103+\3\2\2\2\u0104\u0111\5\60\31\2\u0105\u0106"+
		"\7?\2\2\u0106\u010d\b\27\1\2\u0107\u0108\7@\2\2\u0108\u010d\b\27\1\2\u0109"+
		"\u010a\5.\30\2\u010a\u010b\b\27\1\2\u010b\u010d\3\2\2\2\u010c\u0105\3"+
		"\2\2\2\u010c\u0107\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\5\60\31\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112-\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\t\2\2\2\u0115/\3\2\2\2\u0116\u0121\5\62\32\2\u0117\u0118\5\66\34\2\u0118"+
		"\u0119\b\31\1\2\u0119\u011d\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011d\b\31"+
		"\1\2\u011c\u0117\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\5\62\32\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\61\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0134\5\64\33\2\u0125\u0126\79\2\2\u0126\u0130\b\32\1\2\u0127\u0128\7"+
		":\2\2\u0128\u0130\b\32\1\2\u0129\u012a\7\21\2\2\u012a\u0130\b\32\1\2\u012b"+
		"\u012c\7\37\2\2\u012c\u0130\b\32\1\2\u012d\u012e\7\b\2\2\u012e\u0130\b"+
		"\32\1\2\u012f\u0125\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u0129\3\2\2\2\u012f"+
		"\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\5\64"+
		"\33\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\63\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5\66\34"+
		"\2\u0138\u0139\b\33\1\2\u0139\u013b\3\2\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\58\35\2\u013d\65\3\2\2"+
		"\2\u013e\u013f\t\3\2\2\u013f\67\3\2\2\2\u0140\u0141\7Q\2\2\u0141\u014d"+
		"\b\35\1\2\u0142\u0143\7E\2\2\u0143\u0144\b\35\1\2\u0144\u0145\5,\27\2"+
		"\u0145\u0146\7F\2\2\u0146\u0147\b\35\1\2\u0147\u014d\3\2\2\2\u0148\u014d"+
		"\5:\36\2\u0149\u014a\7!\2\2\u014a\u014b\b\35\1\2\u014b\u014d\58\35\2\u014c"+
		"\u0140\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2"+
		"\2\2\u014d9\3\2\2\2\u014e\u014f\7S\2\2\u014f\u0152\b\36\1\2\u0150\u0152"+
		"\5<\37\2\u0151\u014e\3\2\2\2\u0151\u0150\3\2\2\2\u0152;\3\2\2\2\u0153"+
		"\u0154\7R\2\2\u0154\u0155\5> \2\u0155\u0156\7R\2\2\u0156\u0157\b\37\1"+
		"\2\u0157=\3\2\2\2\u0158\u015b\7\3\2\2\u0159\u015b\n\4\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d?\3\2\2\2\u015e\u015c\3\2\2\2\34ADTcny\u008b\u0090"+
		"\u009b\u00a6\u00b0\u00b7\u00cb\u00db\u00f5\u010c\u0111\u011c\u0121\u012f"+
		"\u0134\u013a\u014c\u0151\u015a\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}