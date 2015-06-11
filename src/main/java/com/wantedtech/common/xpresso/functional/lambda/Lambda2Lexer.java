// Generated from Lambda2.g by ANTLR 4.5

package com.wantedtech.common.xpresso.functional.lambda;

import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.wantedtech.common.xpresso.functional.Function;
import com.wantedtech.common.xpresso.helpers.Helpers;
import com.wantedtech.common.xpresso.types.tuples.tuple2;
import com.wantedtech.common.xpresso.types.*;
import com.wantedtech.common.xpresso.x;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lambda2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, FTOK=15, And=16, Or=17, 
		Identifier=18, Number=19, JavaString=20, PythonString=21, Space=22, OPENBRACKET=23, 
		CLOSEDBRACKET=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "FTOK", "And", "Or", "Identifier", 
		"Number", "JavaString", "PythonString", "Space", "OPENBRACKET", "CLOSEDBRACKET", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'+'", "'-'", "'='", "'<='", "'<'", "'>='", "'>'", "'!'", 
		"'('", "')'", "'*'", "'/'", "','", null, null, null, null, null, null, 
		null, "' '", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "FTOK", "And", "Or", "Identifier", "Number", "JavaString", 
		"PythonString", "Space", "OPENBRACKET", "CLOSEDBRACKET", "WS"
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



	    Value inputValue;
	    HashMap<String,Value> inputValues;
	    Function<Object,?>[] inputFunction;
	    ArrayList<String> inputVarNames;



	public Lambda2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lambda2.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\6\20V\n\20\r\20\16\20W\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\6\23a\n\23\r\23\16\23b\3\23\7\23f\n\23\f\23\16\23i\13\23\3\24\6\24l\n"+
		"\24\r\24\16\24m\3\24\3\24\6\24r\n\24\r\24\16\24s\5\24v\n\24\3\25\3\25"+
		"\7\25z\n\25\f\25\16\25}\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0085"+
		"\n\26\f\26\16\26\u0088\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\6\32\u0095\n\32\r\32\16\32\u0096\3\32\3\32\4{\u0086\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\3\2\62;\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2\13\f\17\17\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3"+
		"\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r@\3\2\2\2"+
		"\17B\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2"+
		"\2\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2!Y\3\2\2\2#\\\3\2\2\2%`\3\2\2\2"+
		"\'k\3\2\2\2)w\3\2\2\2+\u0080\3\2\2\2-\u008d\3\2\2\2/\u008f\3\2\2\2\61"+
		"\u0091\3\2\2\2\63\u0094\3\2\2\2\65\66\7<\2\2\66\4\3\2\2\2\678\7-\2\28"+
		"\6\3\2\2\29:\7/\2\2:\b\3\2\2\2;<\7?\2\2<\n\3\2\2\2=>\7>\2\2>?\7?\2\2?"+
		"\f\3\2\2\2@A\7>\2\2A\16\3\2\2\2BC\7@\2\2CD\7?\2\2D\20\3\2\2\2EF\7@\2\2"+
		"F\22\3\2\2\2GH\7#\2\2H\24\3\2\2\2IJ\7*\2\2J\26\3\2\2\2KL\7+\2\2L\30\3"+
		"\2\2\2MN\7,\2\2N\32\3\2\2\2OP\7\61\2\2P\34\3\2\2\2QR\7.\2\2R\36\3\2\2"+
		"\2SU\7h\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2"+
		"\2YZ\7(\2\2Z[\7(\2\2[\"\3\2\2\2\\]\7~\2\2]^\7~\2\2^$\3\2\2\2_a\t\3\2\2"+
		"`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cg\3\2\2\2df\t\4\2\2ed\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h&\3\2\2\2ig\3\2\2\2jl\4\62;\2kj\3\2\2\2"+
		"lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2nu\3\2\2\2oq\7\60\2\2pr\4\62;\2qp\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2\2uv\3\2\2\2v(\3\2\2"+
		"\2w{\7$\2\2xz\4\2\0\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7$\2\2\177*\3\2\2\2\u0080\u0081\7)\2\2\u0081\u0082\7"+
		")\2\2\u0082\u0086\7)\2\2\u0083\u0085\4\2\0\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7)\2\2\u008a\u008b\7)\2\2\u008b\u008c"+
		"\7)\2\2\u008c,\3\2\2\2\u008d\u008e\7\"\2\2\u008e.\3\2\2\2\u008f\u0090"+
		"\7]\2\2\u0090\60\3\2\2\2\u0091\u0092\7_\2\2\u0092\62\3\2\2\2\u0093\u0095"+
		"\t\5\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\32\2\2\u0099\64\3\2\2"+
		"\2\f\2Wbgmsu{\u0086\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}