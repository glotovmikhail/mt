// Generated from Grammar.g4 by ANTLR 4.5.3

    package lab4.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NON_TERM_NAME=11, TERM_NAME=12, MIXED_CASE=13, CODE=14, STRING=15, 
		WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NON_TERM_NAME", "TERM_NAME", "MIXED_CASE", "CODE", "STRING", 
		"WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\r\3\r\7\rS\n\r\f\r\16\rV\13"+
		"\r\3\16\3\16\7\16Z\n\16\f\16\16\16]\13\16\3\17\3\17\6\17a\n\17\r\17\16"+
		"\17b\3\17\5\17f\n\17\7\17h\n\17\f\17\16\17k\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20s\n\20\f\20\16\20v\13\20\3\20\3\20\3\21\6\21{\n\21\r\21"+
		"\16\21|\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22\3\2\n\3\2c|\6\2\62;C\\aac|\3\2C\\\5"+
		"\2\62;C\\aa\4\2C\\c|\4\2}}\177\177\3\2))\5\2\13\f\17\17\"\"\u0088\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5+\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2"+
		"\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31P\3\2\2\2\33W\3\2\2"+
		"\2\35^\3\2\2\2\37n\3\2\2\2!z\3\2\2\2#$\7B\2\2$%\7j\2\2%&\7g\2\2&\'\7c"+
		"\2\2\'(\7f\2\2()\7g\2\2)*\7t\2\2*\4\3\2\2\2+,\7B\2\2,-\7o\2\2-.\7g\2\2"+
		"./\7o\2\2/\60\7d\2\2\60\61\7g\2\2\61\62\7t\2\2\62\63\7u\2\2\63\6\3\2\2"+
		"\2\64\65\7B\2\2\65\66\7o\2\2\66\67\7c\2\2\678\7k\2\289\7p\2\29\b\3\2\2"+
		"\2:;\7/\2\2;<\7@\2\2<\n\3\2\2\2=>\7<\2\2>\f\3\2\2\2?@\7~\2\2@\16\3\2\2"+
		"\2AB\7=\2\2B\20\3\2\2\2CD\7]\2\2D\22\3\2\2\2EF\7.\2\2F\24\3\2\2\2GH\7"+
		"_\2\2H\26\3\2\2\2IM\t\2\2\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN"+
		"\3\2\2\2N\30\3\2\2\2OM\3\2\2\2PT\t\4\2\2QS\t\5\2\2RQ\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VT\3\2\2\2W[\t\6\2\2XZ\t\3\2\2YX\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\34\3\2\2\2][\3\2\2\2^i\7}\2\2_a\n"+
		"\7\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\35\17\2e"+
		"d\3\2\2\2ef\3\2\2\2fh\3\2\2\2g`\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\7\177\2\2m\36\3\2\2\2nt\7)\2\2os\n\b\2\2pq\7^\2"+
		"\2qs\7)\2\2ro\3\2\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wx\7)\2\2x \3\2\2\2y{\t\t\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}~\3\2\2\2~\177\b\21\2\2\177\"\3\2\2\2\f\2MT[beirt|\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}