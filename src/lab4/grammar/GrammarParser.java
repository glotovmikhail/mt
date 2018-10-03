// Generated from Grammar.g4 by ANTLR 4.5.3

    package lab4.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NON_TERM_NAME=11, TERM_NAME=12, MIXED_CASE=13, CODE=14, STRING=15, 
		WS=16;
	public static final int
		RULE_gramma = 0, RULE_header = 1, RULE_members = 2, RULE_main = 3, RULE_rule1 = 4, 
		RULE_inherited = 5, RULE_declAttrs = 6, RULE_callAttrs = 7, RULE_arg = 8, 
		RULE_argType = 9, RULE_argName = 10, RULE_synthesized = 11, RULE_nonterminalVariant = 12, 
		RULE_nonterminalProduction = 13, RULE_terminalProduction = 14;
	public static final String[] ruleNames = {
		"gramma", "header", "members", "main", "rule1", "inherited", "declAttrs", 
		"callAttrs", "arg", "argType", "argName", "synthesized", "nonterminalVariant", 
		"nonterminalProduction", "terminalProduction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@header'", "'@members'", "'@main'", "'->'", "':'", "'|'", "';'", 
		"'['", "','", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NON_TERM_NAME", 
		"TERM_NAME", "MIXED_CASE", "CODE", "STRING", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammaContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<Rule1Context> rule1() {
			return getRuleContexts(Rule1Context.class);
		}
		public Rule1Context rule1(int i) {
			return getRuleContext(Rule1Context.class,i);
		}
		public GrammaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGramma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGramma(this);
		}
	}

	public final GrammaContext gramma() throws RecognitionException {
		GrammaContext _localctx = new GrammaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gramma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				header();
				}
			}

			setState(34);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(33);
				members();
				}
			}

			setState(37);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(36);
				main();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(39);
				rule1();
				}
				}
				setState(44);
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderLabelContext extends HeaderContext {
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public HeaderLabelContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeaderLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeaderLabel(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			_localctx = new HeaderLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(CODE);
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

	public static class MembersContext extends ParserRuleContext {
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
	 
		public MembersContext() { }
		public void copyFrom(MembersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MembersLabelContext extends MembersContext {
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public MembersLabelContext(MembersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMembersLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMembersLabel(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			_localctx = new MembersLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(CODE);
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

	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainLabelContext extends MainContext {
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public MainLabelContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMainLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMainLabel(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			_localctx = new MainLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			match(CODE);
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

	public static class Rule1Context extends ParserRuleContext {
		public Rule1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule1; }
	 
		public Rule1Context() { }
		public void copyFrom(Rule1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TerminalLabelContext extends Rule1Context {
		public TerminalNode TERM_NAME() { return getToken(GrammarParser.TERM_NAME, 0); }
		public List<TerminalProductionContext> terminalProduction() {
			return getRuleContexts(TerminalProductionContext.class);
		}
		public TerminalProductionContext terminalProduction(int i) {
			return getRuleContext(TerminalProductionContext.class,i);
		}
		public TerminalLabelContext(Rule1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminalLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminalLabel(this);
		}
	}
	public static class NonTerminalLabelContext extends Rule1Context {
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarParser.NON_TERM_NAME, 0); }
		public List<NonterminalProductionContext> nonterminalProduction() {
			return getRuleContexts(NonterminalProductionContext.class);
		}
		public NonterminalProductionContext nonterminalProduction(int i) {
			return getRuleContext(NonterminalProductionContext.class,i);
		}
		public InheritedContext inherited() {
			return getRuleContext(InheritedContext.class,0);
		}
		public SynthesizedContext synthesized() {
			return getRuleContext(SynthesizedContext.class,0);
		}
		public NonTerminalLabelContext(Rule1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTerminalLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTerminalLabel(this);
		}
	}

	public final Rule1Context rule1() throws RecognitionException {
		Rule1Context _localctx = new Rule1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule1);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTerminalLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(NON_TERM_NAME);
				setState(56);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(55);
					inherited();
					}
				}

				setState(60);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(58);
					match(T__3);
					setState(59);
					synthesized();
					}
				}

				setState(62);
				match(T__4);
				setState(63);
				nonterminalProduction();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(64);
					match(T__5);
					setState(65);
					nonterminalProduction();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__6);
				}
				break;
			case TERM_NAME:
				_localctx = new TerminalLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(TERM_NAME);
				setState(74);
				match(T__4);
				setState(75);
				terminalProduction();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(76);
					match(T__5);
					setState(77);
					terminalProduction();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__6);
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

	public static class InheritedContext extends ParserRuleContext {
		public DeclAttrsContext declAttrs() {
			return getRuleContext(DeclAttrsContext.class,0);
		}
		public InheritedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInherited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInherited(this);
		}
	}

	public final InheritedContext inherited() throws RecognitionException {
		InheritedContext _localctx = new InheritedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inherited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			declAttrs();
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

	public static class DeclAttrsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public DeclAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclAttrs(this);
		}
	}

	public final DeclAttrsContext declAttrs() throws RecognitionException {
		DeclAttrsContext _localctx = new DeclAttrsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			setState(90);
			arg();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(91);
				match(T__8);
				setState(92);
				arg();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__9);
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

	public static class CallAttrsContext extends ParserRuleContext {
		public List<TerminalNode> CODE() { return getTokens(GrammarParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(GrammarParser.CODE, i);
		}
		public CallAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallAttrs(this);
		}
	}

	public final CallAttrsContext callAttrs() throws RecognitionException {
		CallAttrsContext _localctx = new CallAttrsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__7);
			setState(101);
			match(CODE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(102);
				match(T__8);
				setState(103);
				match(CODE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__9);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class,0);
		}
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			argType();
			setState(112);
			argName();
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

	public static class ArgTypeContext extends ParserRuleContext {
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarParser.NON_TERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(GrammarParser.TERM_NAME, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public ArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgType(this);
		}
	}

	public final ArgTypeContext argType() throws RecognitionException {
		ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << MIXED_CASE))) != 0)) ) {
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

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarParser.NON_TERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(GrammarParser.TERM_NAME, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgName(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << MIXED_CASE))) != 0)) ) {
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

	public static class SynthesizedContext extends ParserRuleContext {
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarParser.NON_TERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(GrammarParser.TERM_NAME, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public SynthesizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthesized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSynthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSynthesized(this);
		}
	}

	public final SynthesizedContext synthesized() throws RecognitionException {
		SynthesizedContext _localctx = new SynthesizedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_synthesized);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << MIXED_CASE))) != 0)) ) {
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

	public static class NonterminalVariantContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(GrammarParser.TERM_NAME, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarParser.NON_TERM_NAME, 0); }
		public CallAttrsContext callAttrs() {
			return getRuleContext(CallAttrsContext.class,0);
		}
		public NonterminalVariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterminalVariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonterminalVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonterminalVariant(this);
		}
	}

	public final NonterminalVariantContext nonterminalVariant() throws RecognitionException {
		NonterminalVariantContext _localctx = new NonterminalVariantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nonterminalVariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				{
				{
				setState(120);
				match(NON_TERM_NAME);
				setState(122);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(121);
					callAttrs();
					}
				}

				}
				}
				break;
			case TERM_NAME:
				{
				setState(124);
				match(TERM_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NonterminalProductionContext extends ParserRuleContext {
		public List<NonterminalVariantContext> nonterminalVariant() {
			return getRuleContexts(NonterminalVariantContext.class);
		}
		public NonterminalVariantContext nonterminalVariant(int i) {
			return getRuleContext(NonterminalVariantContext.class,i);
		}
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public NonterminalProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterminalProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonterminalProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonterminalProduction(this);
		}
	}

	public final NonterminalProductionContext nonterminalProduction() throws RecognitionException {
		NonterminalProductionContext _localctx = new NonterminalProductionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonterminalProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(127);
				nonterminalVariant();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(133);
				match(CODE);
				}
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

	public static class TerminalProductionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarParser.STRING, i);
		}
		public TerminalProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminalProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminalProduction(this);
		}
	}

	public final TerminalProductionContext terminalProduction() throws RecognitionException {
		TerminalProductionContext _localctx = new TerminalProductionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_terminalProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(STRING);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\5\2%\n\2\3\2\5\2(\n\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\5\6;\n\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\3\6\7\6"+
		"E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13"+
		"\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16}\n\16\3\16\5\16\u0080\n\16\3\17\7"+
		"\17\u0083\n\17\f\17\16\17\u0086\13\17\3\17\5\17\u0089\n\17\3\20\6\20\u008c"+
		"\n\20\r\20\16\20\u008d\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\3\3\2\r\17\u0090\2!\3\2\2\2\4/\3\2\2\2\6\62\3\2\2\2\b\65\3\2\2\2"+
		"\nW\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20f\3\2\2\2\22q\3\2\2\2\24t\3\2\2\2"+
		"\26v\3\2\2\2\30x\3\2\2\2\32\177\3\2\2\2\34\u0084\3\2\2\2\36\u008b\3\2"+
		"\2\2 \"\5\4\3\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\5\6\4\2$#\3\2\2\2$%"+
		"\3\2\2\2%\'\3\2\2\2&(\5\b\5\2\'&\3\2\2\2\'(\3\2\2\2(,\3\2\2\2)+\5\n\6"+
		"\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3\2\2\2/\60\7"+
		"\3\2\2\60\61\7\20\2\2\61\5\3\2\2\2\62\63\7\4\2\2\63\64\7\20\2\2\64\7\3"+
		"\2\2\2\65\66\7\5\2\2\66\67\7\20\2\2\67\t\3\2\2\28:\7\r\2\29;\5\f\7\2:"+
		"9\3\2\2\2:;\3\2\2\2;>\3\2\2\2<=\7\6\2\2=?\5\30\r\2><\3\2\2\2>?\3\2\2\2"+
		"?@\3\2\2\2@A\7\7\2\2AF\5\34\17\2BC\7\b\2\2CE\5\34\17\2DB\3\2\2\2EH\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\t\2\2JX\3\2\2\2KL\7\16"+
		"\2\2LM\7\7\2\2MR\5\36\20\2NO\7\b\2\2OQ\5\36\20\2PN\3\2\2\2QT\3\2\2\2R"+
		"P\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\t\2\2VX\3\2\2\2W8\3\2\2\2"+
		"WK\3\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z\r\3\2\2\2[\\\7\n\2\2\\a\5\22\n\2]^"+
		"\7\13\2\2^`\5\22\n\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"ca\3\2\2\2de\7\f\2\2e\17\3\2\2\2fg\7\n\2\2gl\7\20\2\2hi\7\13\2\2ik\7\20"+
		"\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\f"+
		"\2\2p\21\3\2\2\2qr\5\24\13\2rs\5\26\f\2s\23\3\2\2\2tu\t\2\2\2u\25\3\2"+
		"\2\2vw\t\2\2\2w\27\3\2\2\2xy\t\2\2\2y\31\3\2\2\2z|\7\r\2\2{}\5\20\t\2"+
		"|{\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~\u0080\7\16\2\2\177z\3\2\2\2\177~"+
		"\3\2\2\2\u0080\33\3\2\2\2\u0081\u0083\5\32\16\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7\20\2\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\35\3\2\2\2\u008a\u008c\7\21\2\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\37"+
		"\3\2\2\2\22!$\',:>FRWal|\177\u0084\u0088\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}