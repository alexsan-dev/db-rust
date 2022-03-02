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
		LET=1, MUT=2, PRINTLN=3, FN=4, I64=5, F64=6, BOOL=7, CHARTYPE=8, STR=9, 
		STRCLASS=10, NUMBER=11, FLOAT=12, STRING=13, CHAR=14, ID=15, BFALSE=16, 
		BTRUE=17, OPENPAR=18, CLOSEPAR=19, OPENBRACKET=20, CLOSEBRACKET=21, ARROW=22, 
		DOT=23, COLOM=24, SEMI=25, COMMA=26, EQUALS=27, MUL=28, DIV=29, MOD=30, 
		ADD=31, SUB=32, WHITESPACE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "MUT", "PRINTLN", "FN", "I64", "F64", "BOOL", "CHARTYPE", "STR", 
			"STRCLASS", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", 
			"OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", "ARROW", "DOT", 
			"COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB", 
			"WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'fn'", "'i64'", "'f64'", "'bool'", 
			"'char'", "'&str'", "'String'", null, null, null, null, null, "'false'", 
			"'true'", "'('", "')'", "'{'", "'}'", "'->'", "'.'", "':'", "';'", "','", 
			"'='", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "FN", "I64", "F64", "BOOL", "CHARTYPE", 
			"STR", "STRCLASS", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", 
			"BTRUE", "OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", "ARROW", 
			"DOT", "COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", "MOD", "ADD", 
			"SUB", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\6\f{\n\f\r\f\16\f|\3\r\6\r\u0080\n\r\r\r\16\r\u0081"+
		"\3\r\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\16\3\16\7\16\u008c\n\16\f\16\16"+
		"\16\u008f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u0099\n\20"+
		"\f\20\16\20\u009c\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\6\"\u00c9\n\"\r\"\16\"\u00ca\3\"\3\"\3#\3#\3#\2\2"+
		"$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E\2\3\2\t\3\2\62;\3\2$$\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7O\3\2\2\2\tX\3\2\2\2\13"+
		"[\3\2\2\2\r_\3\2\2\2\17c\3\2\2\2\21h\3\2\2\2\23m\3\2\2\2\25r\3\2\2\2\27"+
		"z\3\2\2\2\31\177\3\2\2\2\33\u0089\3\2\2\2\35\u0092\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u009d\3\2\2\2#\u00a3\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac"+
		"\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61\u00b5\3\2\2\2"+
		"\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00bf"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00c3\3\2\2\2A\u00c5\3\2\2\2C\u00c8\3\2\2\2E"+
		"\u00ce\3\2\2\2GH\7n\2\2HI\7g\2\2IJ\7v\2\2J\4\3\2\2\2KL\7o\2\2LM\7w\2\2"+
		"MN\7v\2\2N\6\3\2\2\2OP\7r\2\2PQ\7t\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2TU\7"+
		"n\2\2UV\7p\2\2VW\7#\2\2W\b\3\2\2\2XY\7h\2\2YZ\7p\2\2Z\n\3\2\2\2[\\\7k"+
		"\2\2\\]\78\2\2]^\7\66\2\2^\f\3\2\2\2_`\7h\2\2`a\78\2\2ab\7\66\2\2b\16"+
		"\3\2\2\2cd\7d\2\2de\7q\2\2ef\7q\2\2fg\7n\2\2g\20\3\2\2\2hi\7e\2\2ij\7"+
		"j\2\2jk\7c\2\2kl\7t\2\2l\22\3\2\2\2mn\7(\2\2no\7u\2\2op\7v\2\2pq\7t\2"+
		"\2q\24\3\2\2\2rs\7U\2\2st\7v\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2wx\7i\2\2x"+
		"\26\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\30\3\2"+
		"\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\60\2\2\u0084\u0086"+
		"\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\32\3\2\2\2\u0089\u008d\7$\2\2\u008a\u008c\n\3\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091"+
		"\34\3\2\2\2\u0092\u0093\7)\2\2\u0093\u0094\n\4\2\2\u0094\u0095\7)\2\2"+
		"\u0095\36\3\2\2\2\u0096\u009a\t\5\2\2\u0097\u0099\t\6\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		" \3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7$\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad*\3\2\2\2\u00ae\u00af\7\177\2\2\u00af"+
		",\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7@\2\2\u00b2.\3\2\2\2\u00b3\u00b4"+
		"\7\60\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\62\3\2\2\2\u00b7\u00b8"+
		"\7=\2\2\u00b8\64\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba\66\3\2\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc8\3\2\2\2\u00bd\u00be\7,\2\2\u00be:\3\2\2\2\u00bf\u00c0\7"+
		"\61\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7\'\2\2\u00c2>\3\2\2\2\u00c3\u00c4"+
		"\7-\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6B\3\2\2\2\u00c7\u00c9\t"+
		"\7\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\"\2\2\u00cdD\3\2\2\2"+
		"\u00ce\u00cf\7^\2\2\u00cf\u00d0\t\b\2\2\u00d0F\3\2\2\2\t\2|\u0081\u0087"+
		"\u008d\u009a\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}