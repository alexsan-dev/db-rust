// Generated from /Users/alex/Desktop/FIUSAC/Compi2/db-rust/lang/DBRustLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBRustLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, MUT=2, PRINTLN=3, FN=4, RETURN=5, I64=6, F64=7, BOOL=8, CHARTYPE=9, 
		STR=10, STRCLASS=11, BFALSE=12, BTRUE=13, NUMBER=14, FLOAT=15, STRING=16, 
		CHAR=17, ID=18, OPENPAR=19, CLOSEPAR=20, OPENBRACKET=21, CLOSEBRACKET=22, 
		ARROW=23, DOT=24, COLOM=25, SEMI=26, COMMA=27, AND=28, OR=29, NOTEQUALS=30, 
		EQUALSEQUALS=31, MOREOREQUALS=32, LESSOREQUALS=33, NOT=34, EQUALS=35, 
		MAJOR=36, MINOR=37, MUL=38, DIV=39, MOD=40, ADD=41, SUB=42, WHITESPACE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "MUT", "PRINTLN", "FN", "RETURN", "I64", "F64", "BOOL", "CHARTYPE", 
			"STR", "STRCLASS", "BFALSE", "BTRUE", "NUMBER", "FLOAT", "STRING", "CHAR", 
			"ID", "OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", "ARROW", 
			"DOT", "COLOM", "SEMI", "COMMA", "AND", "OR", "NOTEQUALS", "EQUALSEQUALS", 
			"MOREOREQUALS", "LESSOREQUALS", "NOT", "EQUALS", "MAJOR", "MINOR", "MUL", 
			"DIV", "MOD", "ADD", "SUB", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'fn'", "'return'", "'i64'", "'f64'", 
			"'bool'", "'char'", "'&str'", "'String'", "'false'", "'true'", null, 
			null, null, null, null, "'('", "')'", "'{'", "'}'", "'->'", "'.'", "':'", 
			"';'", "','", "'&&'", "'||'", "'!='", "'=='", "'>='", "'<='", "'!'", 
			"'='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "FN", "RETURN", "I64", "F64", "BOOL", 
			"CHARTYPE", "STR", "STRCLASS", "BFALSE", "BTRUE", "NUMBER", "FLOAT", 
			"STRING", "CHAR", "ID", "OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", 
			"ARROW", "DOT", "COLOM", "SEMI", "COMMA", "AND", "OR", "NOTEQUALS", "EQUALSEQUALS", 
			"MOREOREQUALS", "LESSOREQUALS", "NOT", "EQUALS", "MAJOR", "MINOR", "MUL", 
			"DIV", "MOD", "ADD", "SUB", "WHITESPACE"
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


	public DBRustLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DBRustLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\6\17\u00a1\n\17\r\17\16\17\u00a2\3\20\6\20\u00a6\n"+
		"\20\r\20\16\20\u00a7\3\20\3\20\6\20\u00ac\n\20\r\20\16\20\u00ad\3\21\3"+
		"\21\7\21\u00b2\n\21\f\21\16\21\u00b5\13\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\7\23\u00bf\n\23\f\23\16\23\u00c2\13\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\6,\u00fc\n,\r,\16,\u00fd\3,\3,\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y\2\3\2\t\3\2\62;\3\2$$\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3[\3\2"+
		"\2\2\5_\3\2\2\2\7c\3\2\2\2\tl\3\2\2\2\13o\3\2\2\2\rv\3\2\2\2\17z\3\2\2"+
		"\2\21~\3\2\2\2\23\u0083\3\2\2\2\25\u0088\3\2\2\2\27\u008d\3\2\2\2\31\u0094"+
		"\3\2\2\2\33\u009a\3\2\2\2\35\u00a0\3\2\2\2\37\u00a5\3\2\2\2!\u00af\3\2"+
		"\2\2#\u00b8\3\2\2\2%\u00bc\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7"+
		"\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2"+
		"\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d9\3\2\2\2=\u00dc"+
		"\3\2\2\2?\u00df\3\2\2\2A\u00e2\3\2\2\2C\u00e5\3\2\2\2E\u00e8\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00ec\3\2\2\2K\u00ee\3\2\2\2M\u00f0\3\2\2\2O\u00f2\3\2"+
		"\2\2Q\u00f4\3\2\2\2S\u00f6\3\2\2\2U\u00f8\3\2\2\2W\u00fb\3\2\2\2Y\u0101"+
		"\3\2\2\2[\\\7n\2\2\\]\7g\2\2]^\7v\2\2^\4\3\2\2\2_`\7o\2\2`a\7w\2\2ab\7"+
		"v\2\2b\6\3\2\2\2cd\7r\2\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2hi\7n\2\2"+
		"ij\7p\2\2jk\7#\2\2k\b\3\2\2\2lm\7h\2\2mn\7p\2\2n\n\3\2\2\2op\7t\2\2pq"+
		"\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2u\f\3\2\2\2vw\7k\2\2wx\78\2"+
		"\2xy\7\66\2\2y\16\3\2\2\2z{\7h\2\2{|\78\2\2|}\7\66\2\2}\20\3\2\2\2~\177"+
		"\7d\2\2\177\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082\7n\2\2\u0082\22"+
		"\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7t\2\2\u0087\24\3\2\2\2\u0088\u0089\7(\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\26\3\2\2\2\u008d\u008e\7U\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2"+
		"\u0092\u0093\7i\2\2\u0093\30\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7"+
		"c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\32"+
		"\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7g\2\2\u009e\34\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\36"+
		"\3\2\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\60"+
		"\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae \3\2\2\2\u00af\u00b3\7$\2\2\u00b0"+
		"\u00b2\n\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7$\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9\u00ba\n\4\2\2\u00ba"+
		"\u00bb\7)\2\2\u00bb$\3\2\2\2\u00bc\u00c0\t\5\2\2\u00bd\u00bf\t\6\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1&\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4(\3\2"+
		"\2\2\u00c5\u00c6\7+\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7}\2\2\u00c8,\3\2\2"+
		"\2\u00c9\u00ca\7\177\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd"+
		"\7@\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7<\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7=\2\2\u00d3\66\3\2\2\2\u00d4\u00d5"+
		"\7.\2\2\u00d58\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7(\2\2\u00d8:\3"+
		"\2\2\2\u00d9\u00da\7~\2\2\u00da\u00db\7~\2\2\u00db<\3\2\2\2\u00dc\u00dd"+
		"\7#\2\2\u00dd\u00de\7?\2\2\u00de>\3\2\2\2\u00df\u00e0\7?\2\2\u00e0\u00e1"+
		"\7?\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\7?\2\2\u00e4B\3"+
		"\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7?\2\2\u00e7D\3\2\2\2\u00e8\u00e9"+
		"\7#\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7?\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7"+
		"@\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7>\2\2\u00efL\3\2\2\2\u00f0\u00f1\7,"+
		"\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7"+
		"\'\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7T\3\2\2\2\u00f8\u00f9\7"+
		"/\2\2\u00f9V\3\2\2\2\u00fa\u00fc\t\7\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b,\2\2\u0100X\3\2\2\2\u0101\u0102\7^\2\2\u0102\u0103\t\b\2\2\u0103"+
		"Z\3\2\2\2\t\2\u00a2\u00a7\u00ad\u00b3\u00c0\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}