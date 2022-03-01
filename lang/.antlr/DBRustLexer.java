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
		LET=1, MUT=2, PRINTLN=3, I64=4, F64=5, BOOL=6, CHARTYPE=7, STR=8, STRCLASS=9, 
		NUMBER=10, FLOAT=11, STRING=12, CHAR=13, ID=14, BFALSE=15, BTRUE=16, OPENPAR=17, 
		CLOSEPAR=18, COLOM=19, SEMI=20, COMMA=21, EQUALS=22, MUL=23, DIV=24, MOD=25, 
		ADD=26, SUB=27, WHITESPACE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "MUT", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", 
			"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR", 
			"CLOSEPAR", "COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", "MOD", 
			"ADD", "SUB", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'i64'", "'f64'", "'bool'", "'char'", 
			"'&str'", "'String'", null, null, null, null, null, "'false'", "'true'", 
			"'('", "')'", "':'", "';'", "','", "'='", "'*'", "'/'", "'%'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", 
			"STRCLASS", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", 
			"OPENPAR", "CLOSEPAR", "COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", 
			"MOD", "ADD", "SUB", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13n\n\13\r\13\16\13o\3\f\6\f"+
		"s\n\f\r\f\16\ft\3\f\3\f\6\fy\n\f\r\f\16\fz\3\r\3\r\7\r\177\n\r\f\r\16"+
		"\r\u0082\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u008c\n\17\f"+
		"\17\16\17\u008f\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00b3\n\35\r\35"+
		"\16\35\u00b4\3\35\3\35\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2\3\2\t\3\2\62;\3\2$$\3\2))"+
		"\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u00bf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3=\3"+
		"\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2\rV\3\2\2\2\17[\3\2"+
		"\2\2\21`\3\2\2\2\23e\3\2\2\2\25m\3\2\2\2\27r\3\2\2\2\31|\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u0090\3\2\2\2!\u0096\3\2\2\2#\u009b\3\2\2"+
		"\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5"+
		"\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00af\3\2\2\29\u00b2\3\2\2\2;\u00b8\3\2\2\2=>\7n\2\2>?\7g\2\2"+
		"?@\7v\2\2@\4\3\2\2\2AB\7o\2\2BC\7w\2\2CD\7v\2\2D\6\3\2\2\2EF\7r\2\2FG"+
		"\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2JK\7n\2\2KL\7p\2\2LM\7#\2\2M\b\3\2\2"+
		"\2NO\7k\2\2OP\78\2\2PQ\7\66\2\2Q\n\3\2\2\2RS\7h\2\2ST\78\2\2TU\7\66\2"+
		"\2U\f\3\2\2\2VW\7d\2\2WX\7q\2\2XY\7q\2\2YZ\7n\2\2Z\16\3\2\2\2[\\\7e\2"+
		"\2\\]\7j\2\2]^\7c\2\2^_\7t\2\2_\20\3\2\2\2`a\7(\2\2ab\7u\2\2bc\7v\2\2"+
		"cd\7t\2\2d\22\3\2\2\2ef\7U\2\2fg\7v\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7"+
		"i\2\2k\24\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\26"+
		"\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2v"+
		"x\7\60\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\30\3\2\2"+
		"\2|\u0080\7$\2\2}\177\n\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\7$\2\2\u0084\32\3\2\2\2\u0085\u0086\7)\2\2\u0086\u0087\n\4\2\2\u0087"+
		"\u0088\7)\2\2\u0088\34\3\2\2\2\u0089\u008d\t\5\2\2\u008a\u008c\t\6\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\36\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2"+
		"\u0095 \3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w\2"+
		"\2\u0099\u009a\7g\2\2\u009a\"\3\2\2\2\u009b\u009c\7*\2\2\u009c$\3\2\2"+
		"\2\u009d\u009e\7+\2\2\u009e&\3\2\2\2\u009f\u00a0\7<\2\2\u00a0(\3\2\2\2"+
		"\u00a1\u00a2\7=\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4,\3\2\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\60\3\2\2\2\u00a9"+
		"\u00aa\7\61\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\64\3\2\2\2"+
		"\u00ad\u00ae\7-\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7/\2\2\u00b08\3\2\2\2"+
		"\u00b1\u00b3\t\7\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\35\2\2"+
		"\u00b7:\3\2\2\2\u00b8\u00b9\7^\2\2\u00b9\u00ba\t\b\2\2\u00ba<\3\2\2\2"+
		"\t\2otz\u0080\u008d\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}