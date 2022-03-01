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
		CLOSEPAR=18, COLOM=19, SEMI=20, EQUALS=21, MUL=22, DIV=23, MOD=24, ADD=25, 
		SUB=26, WHITESPACE=27;
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
			"CLOSEPAR", "COLOM", "SEMI", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB", 
			"WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'i64'", "'f64'", "'bool'", "'char'", 
			"'&str'", "'String'", null, null, null, null, null, "'false'", "'true'", 
			"'('", "')'", "':'", "';'", "'='", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", 
			"STRCLASS", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", 
			"OPENPAR", "CLOSEPAR", "COLOM", "SEMI", "EQUALS", "MUL", "DIV", "MOD", 
			"ADD", "SUB", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13l\n\13\r\13\16\13m\3\f\6\fq\n\f\r\f"+
		"\16\fr\3\f\3\f\6\fw\n\f\r\f\16\fx\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\6\34\u00af\n\34\r\34\16\34\u00b0\3\34\3\34\3"+
		"\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\2\3\2\t\3\2\62;\3\2$$\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3;\3\2\2\2\5?\3\2\2\2\7C\3\2\2\2\tL\3\2"+
		"\2\2\13P\3\2\2\2\rT\3\2\2\2\17Y\3\2\2\2\21^\3\2\2\2\23c\3\2\2\2\25k\3"+
		"\2\2\2\27p\3\2\2\2\31z\3\2\2\2\33\u0083\3\2\2\2\35\u0087\3\2\2\2\37\u008e"+
		"\3\2\2\2!\u0094\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2"+
		")\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7"+
		"\3\2\2\2\63\u00a9\3\2\2\2\65\u00ab\3\2\2\2\67\u00ae\3\2\2\29\u00b4\3\2"+
		"\2\2;<\7n\2\2<=\7g\2\2=>\7v\2\2>\4\3\2\2\2?@\7o\2\2@A\7w\2\2AB\7v\2\2"+
		"B\6\3\2\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2HI\7n\2\2IJ\7"+
		"p\2\2JK\7#\2\2K\b\3\2\2\2LM\7k\2\2MN\78\2\2NO\7\66\2\2O\n\3\2\2\2PQ\7"+
		"h\2\2QR\78\2\2RS\7\66\2\2S\f\3\2\2\2TU\7d\2\2UV\7q\2\2VW\7q\2\2WX\7n\2"+
		"\2X\16\3\2\2\2YZ\7e\2\2Z[\7j\2\2[\\\7c\2\2\\]\7t\2\2]\20\3\2\2\2^_\7("+
		"\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2b\22\3\2\2\2cd\7U\2\2de\7v\2\2ef\7t\2\2"+
		"fg\7k\2\2gh\7p\2\2hi\7i\2\2i\24\3\2\2\2jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2n\26\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2st\3\2\2\2tv\7\60\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y\30\3\2\2\2z~\7$\2\2{}\n\3\2\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7"+
		"$\2\2\u0082\32\3\2\2\2\u0083\u0084\7)\2\2\u0084\u0085\n\4\2\2\u0085\u0086"+
		"\7)\2\2\u0086\34\3\2\2\2\u0087\u008b\t\5\2\2\u0088\u008a\t\6\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\36\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		" \3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7g\2\2\u0098\"\3\2\2\2\u0099\u009a\7*\2\2\u009a$\3\2\2\2\u009b"+
		"\u009c\7+\2\2\u009c&\3\2\2\2\u009d\u009e\7<\2\2\u009e(\3\2\2\2\u009f\u00a0"+
		"\7=\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7"+
		",\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\60\3\2\2\2\u00a7\u00a8"+
		"\7\'\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\64\3\2\2\2\u00ab\u00ac"+
		"\7/\2\2\u00ac\66\3\2\2\2\u00ad\u00af\t\7\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\b\34\2\2\u00b38\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\u00b6"+
		"\t\b\2\2\u00b6:\3\2\2\2\t\2mrx~\u008b\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}