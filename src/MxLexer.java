// Generated from D:/compiler/untitled16/src\Mx.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Comment=20, WS=21, True__=22, False__=23, Op1=24, 
		Op2=25, Shlr=26, RelatOp1=27, RelatOp2=28, LogicOp=29, Bool__=30, Int__=31, 
		String__=32, Null__=33, Void__=34, For__=35, If__=36, While__=37, Break__=38, 
		Continue__=39, Return__=40, New__=41, Class__=42, This__=43, Else__=44, 
		Int_=45, Var=46, Digits=47, NL=48, String_=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "Comment", "WS", "True__", "False__", "Op1", "Op2", 
			"Shlr", "RelatOp1", "RelatOp2", "LogicOp", "Bool__", "Int__", "String__", 
			"Null__", "Void__", "For__", "If__", "While__", "Break__", "Continue__", 
			"Return__", "New__", "Class__", "This__", "Else__", "Int_", "Var", "Digits", 
			"NL", "String_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "'['", "']'", "'.'", 
			"'++'", "'--'", "'!'", "'~'", "'&'", "'^'", "'|'", "'&&'", "'||'", "'='", 
			null, null, null, null, null, null, null, null, null, null, "'bool'", 
			"'int'", "'string'", "'null'", "'void'", "'for'", "'if'", "'while'", 
			"'break'", "'continue'", "'return'", "'new'", "'class'", "'this'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Comment", "WS", "True__", 
			"False__", "Op1", "Op2", "Shlr", "RelatOp1", "RelatOp2", "LogicOp", "Bool__", 
			"Int__", "String__", "Null__", "Void__", "For__", "If__", "While__", 
			"Break__", "Continue__", "Return__", "New__", "Class__", "This__", "Else__", 
			"Int_", "Var", "Digits", "NL", "String_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u016b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0094\n\25"+
		"\f\25\16\25\u0097\13\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u009f\n\25"+
		"\f\25\16\25\u00a2\13\25\3\25\5\25\u00a5\n\25\3\25\5\25\u00a8\n\25\3\25"+
		"\3\25\3\26\6\26\u00ad\n\26\r\26\16\26\u00ae\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00bf\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00d0\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00da\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u00e1\n\34\3\35\3\35\3\35\3\35\5\35\u00e7"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u00ee\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3/\3/\7/\u0145\n/\f/\16/\u0148\13"+
		"/\3\60\3\60\7\60\u014c\n\60\f\60\16\60\u014f\13\60\3\60\5\60\u0152\n\60"+
		"\3\61\5\61\u0155\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\7\62\u0165\n\62\f\62\16\62\u0168\13\62\3\62\3\62"+
		"\5\u0095\u00a0\u0166\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63\3\2\13\5\2\13\f\17\17\"\"\5\2\'\',,\61\61\4\2--//\4\2>>@@\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\62\62\2\u0183\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2"+
		"\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27z\3\2\2\2\31}\3\2\2"+
		"\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087"+
		"\3\2\2\2%\u008a\3\2\2\2\'\u008d\3\2\2\2)\u00a7\3\2\2\2+\u00ac\3\2\2\2"+
		"-\u00be\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d9"+
		"\3\2\2\2\67\u00e0\3\2\2\29\u00e6\3\2\2\2;\u00ed\3\2\2\2=\u00ef\3\2\2\2"+
		"?\u00f4\3\2\2\2A\u00f8\3\2\2\2C\u00ff\3\2\2\2E\u0104\3\2\2\2G\u0109\3"+
		"\2\2\2I\u010d\3\2\2\2K\u0110\3\2\2\2M\u0116\3\2\2\2O\u011c\3\2\2\2Q\u0125"+
		"\3\2\2\2S\u012c\3\2\2\2U\u0130\3\2\2\2W\u0136\3\2\2\2Y\u013b\3\2\2\2["+
		"\u0140\3\2\2\2]\u0142\3\2\2\2_\u0151\3\2\2\2a\u0154\3\2\2\2c\u0158\3\2"+
		"\2\2ef\7=\2\2f\4\3\2\2\2gh\7}\2\2h\6\3\2\2\2ij\7\177\2\2j\b\3\2\2\2kl"+
		"\7*\2\2l\n\3\2\2\2mn\7.\2\2n\f\3\2\2\2op\7+\2\2p\16\3\2\2\2qr\7]\2\2r"+
		"\20\3\2\2\2st\7_\2\2t\22\3\2\2\2uv\7\60\2\2v\24\3\2\2\2wx\7-\2\2xy\7-"+
		"\2\2y\26\3\2\2\2z{\7/\2\2{|\7/\2\2|\30\3\2\2\2}~\7#\2\2~\32\3\2\2\2\177"+
		"\u0080\7\u0080\2\2\u0080\34\3\2\2\2\u0081\u0082\7(\2\2\u0082\36\3\2\2"+
		"\2\u0083\u0084\7`\2\2\u0084 \3\2\2\2\u0085\u0086\7~\2\2\u0086\"\3\2\2"+
		"\2\u0087\u0088\7(\2\2\u0088\u0089\7(\2\2\u0089$\3\2\2\2\u008a\u008b\7"+
		"~\2\2\u008b\u008c\7~\2\2\u008c&\3\2\2\2\u008d\u008e\7?\2\2\u008e(\3\2"+
		"\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0095\3\2\2\2\u0092"+
		"\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7,\2\2\u0099\u00a8\7\61\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7"+
		"\61\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\f\2\2\u00a7\u008f\3\2"+
		"\2\2\u00a7\u009a\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\25\2\2\u00aa"+
		"*\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\b\26\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00bf\7g\2\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00bf\7g\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7T\2\2"+
		"\u00bc\u00bd\7W\2\2\u00bd\u00bf\7G\2\2\u00be\u00b2\3\2\2\2\u00be\u00b6"+
		"\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7H\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00d0\7g\2\2\u00c5"+
		"\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2"+
		"\u00c9\u00d0\7g\2\2\u00ca\u00cb\7H\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd"+
		"\7N\2\2\u00cd\u00ce\7U\2\2\u00ce\u00d0\7G\2\2\u00cf\u00c0\3\2\2\2\u00cf"+
		"\u00c5\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\t\3\2"+
		"\2\u00d2\62\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7"+
		">\2\2\u00d6\u00da\7>\2\2\u00d7\u00d8\7@\2\2\u00d8\u00da\7@\2\2\u00d9\u00d5"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\66\3\2\2\2\u00db\u00e1\t\5\2\2\u00dc"+
		"\u00dd\7>\2\2\u00dd\u00e1\7?\2\2\u00de\u00df\7@\2\2\u00df\u00e1\7?\2\2"+
		"\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e18\3"+
		"\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e7\7?\2\2\u00e4\u00e5\7#\2\2\u00e5"+
		"\u00e7\7?\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7:\3\2\2\2\u00e8"+
		"\u00e9\7(\2\2\u00e9\u00ee\7(\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ee\7~\2\2"+
		"\u00ec\u00ee\7#\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7q\2\2\u00f2\u00f3\7n\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7v\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa"+
		"\7v\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7i\2\2\u00feB\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7w\2\2\u0101"+
		"\u0102\7n\2\2\u0102\u0103\7n\2\2\u0103D\3\2\2\2\u0104\u0105\7x\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7k\2\2\u0107\u0108\7f\2\2\u0108F\3\2\2\2\u0109"+
		"\u010a\7h\2\2\u010a\u010b\7q\2\2\u010b\u010c\7t\2\2\u010cH\3\2\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7h\2\2\u010fJ\3\2\2\2\u0110\u0111\7y\2\2\u0111"+
		"\u0112\7j\2\2\u0112\u0113\7k\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2"+
		"\u0115L\3\2\2\2\u0116\u0117\7d\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2"+
		"\2\u0119\u011a\7c\2\2\u011a\u011b\7m\2\2\u011bN\3\2\2\2\u011c\u011d\7"+
		"e\2\2\u011d\u011e\7q\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120\u0121"+
		"\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7w\2\2\u0123\u0124\7g\2\2\u0124"+
		"P\3\2\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128"+
		"\u0129\7w\2\2\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012bR\3\2\2\2\u012c"+
		"\u012d\7p\2\2\u012d\u012e\7g\2\2\u012e\u012f\7y\2\2\u012fT\3\2\2\2\u0130"+
		"\u0131\7e\2\2\u0131\u0132\7n\2\2\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2"+
		"\u0134\u0135\7u\2\2\u0135V\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7j\2"+
		"\2\u0138\u0139\7k\2\2\u0139\u013a\7u\2\2\u013aX\3\2\2\2\u013b\u013c\7"+
		"g\2\2\u013c\u013d\7n\2\2\u013d\u013e\7u\2\2\u013e\u013f\7g\2\2\u013fZ"+
		"\3\2\2\2\u0140\u0141\5_\60\2\u0141\\\3\2\2\2\u0142\u0146\t\6\2\2\u0143"+
		"\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147^\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014d"+
		"\t\b\2\2\u014a\u014c\t\t\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0152\t\n\2\2\u0151\u0149\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"`\3\2\2\2\u0153\u0155\7\17\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0157\7\f\2\2\u0157b\3\2\2\2\u0158\u0166\7"+
		"$\2\2\u0159\u015a\7^\2\2\u015a\u0165\7$\2\2\u015b\u015c\7^\2\2\u015c\u0165"+
		"\7^\2\2\u015d\u015e\7^\2\2\u015e\u0165\7p\2\2\u015f\u0160\7^\2\2\u0160"+
		"\u0165\7v\2\2\u0161\u0162\7^\2\2\u0162\u0165\7t\2\2\u0163\u0165\13\2\2"+
		"\2\u0164\u0159\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u015d\3\2\2\2\u0164\u015f"+
		"\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\7$\2\2\u016ad\3\2\2\2\24\2\u0095\u00a0\u00a4\u00a7\u00ae"+
		"\u00be\u00cf\u00d9\u00e0\u00e6\u00ed\u0146\u014d\u0151\u0154\u0164\u0166"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}