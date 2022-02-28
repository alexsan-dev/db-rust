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
		LET=1, PRINTLN=2, I64=3, F64=4, BOOL=5, CHARTYPE=6, STR=7, STRCLASS=8, 
		NUMBER=9, FLOAT=10, STRING=11, CHAR=12, ID=13, BFALSE=14, BTRUE=15, OPENPAR=16, 
		CLOSEPAR=17, COLOM=18, SEMI=19, EQUALS=20, MUL=21, DIV=22, MOD=23, ADD=24, 
		SUB=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", 
			"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR", 
			"CLOSEPAR", "COLOM", "SEMI", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB", 
			"WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'println!'", "'i64'", "'f64'", "'bool'", "'char'", "'&str'", 
			"'String'", null, null, null, null, null, "'false'", "'true'", "'('", 
			"')'", "':'", "';'", "'='", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", 
			"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR", 
			"CLOSEPAR", "COLOM", "SEMI", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB", 
			"WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\6\nf\n\n\r\n\16\ng\3\13\6\13k\n\13\r\13\16\13l\3\13\3\13\6\13q\n\13"+
		"\r\13\16\13r\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\7\16\u0084\n\16\f\16\16\16\u0087\13\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6"+
		"\33\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33\3\34\3\34\3\34\2\2\35\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\2\3\2\t\3\2\62"+
		";\3\2$$\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\t\2\"#%%--"+
		"/\60<<BB]_\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\39\3\2\2\2\5"+
		"=\3\2\2\2\7F\3\2\2\2\tJ\3\2\2\2\13N\3\2\2\2\rS\3\2\2\2\17X\3\2\2\2\21"+
		"]\3\2\2\2\23e\3\2\2\2\25j\3\2\2\2\27t\3\2\2\2\31}\3\2\2\2\33\u0081\3\2"+
		"\2\2\35\u0088\3\2\2\2\37\u008e\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%"+
		"\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009d\3\2\2\2-\u009f\3"+
		"\2\2\2/\u00a1\3\2\2\2\61\u00a3\3\2\2\2\63\u00a5\3\2\2\2\65\u00a8\3\2\2"+
		"\2\67\u00ae\3\2\2\29:\7n\2\2:;\7g\2\2;<\7v\2\2<\4\3\2\2\2=>\7r\2\2>?\7"+
		"t\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2BC\7n\2\2CD\7p\2\2DE\7#\2\2E\6\3\2\2\2"+
		"FG\7k\2\2GH\78\2\2HI\7\66\2\2I\b\3\2\2\2JK\7h\2\2KL\78\2\2LM\7\66\2\2"+
		"M\n\3\2\2\2NO\7d\2\2OP\7q\2\2PQ\7q\2\2QR\7n\2\2R\f\3\2\2\2ST\7e\2\2TU"+
		"\7j\2\2UV\7c\2\2VW\7t\2\2W\16\3\2\2\2XY\7(\2\2YZ\7u\2\2Z[\7v\2\2[\\\7"+
		"t\2\2\\\20\3\2\2\2]^\7U\2\2^_\7v\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7i\2"+
		"\2c\22\3\2\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\24\3"+
		"\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7"+
		"\60\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\26\3\2\2\2"+
		"tx\7$\2\2uw\n\3\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2"+
		"zx\3\2\2\2{|\7$\2\2|\30\3\2\2\2}~\7)\2\2~\177\n\4\2\2\177\u0080\7)\2\2"+
		"\u0080\32\3\2\2\2\u0081\u0085\t\5\2\2\u0082\u0084\t\6\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a\7c\2\2"+
		"\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\36\3\2"+
		"\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7w\2\2\u0091\u0092"+
		"\7g\2\2\u0092 \3\2\2\2\u0093\u0094\7*\2\2\u0094\"\3\2\2\2\u0095\u0096"+
		"\7+\2\2\u0096$\3\2\2\2\u0097\u0098\7<\2\2\u0098&\3\2\2\2\u0099\u009a\7"+
		"=\2\2\u009a(\3\2\2\2\u009b\u009c\7?\2\2\u009c*\3\2\2\2\u009d\u009e\7,"+
		"\2\2\u009e,\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7"+
		"\'\2\2\u00a2\60\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4\62\3\2\2\2\u00a5\u00a6"+
		"\7/\2\2\u00a6\64\3\2\2\2\u00a7\u00a9\t\7\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\b\33\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7^\2\2\u00af\u00b0"+
		"\t\b\2\2\u00b08\3\2\2\2\t\2glrx\u0085\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}