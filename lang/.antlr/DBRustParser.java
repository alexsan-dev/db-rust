// Generated from /Users/alex/Desktop/FIUSAC/Compi2/db-rust/lang/DBRust.g4 by ANTLR 4.8

	import I "main/interfaces"
	import arrayList "github.com/colegno/arraylist"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBRustParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_instructionsBlock = 1, RULE_instructions = 2, RULE_instruction = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_expList = 6, RULE_expression = 7, 
		RULE_expOp = 8, RULE_valueType = 9, RULE_value = 10, RULE_functionCall = 11, 
		RULE_methods = 12, RULE_printlnCall = 13, RULE_paramList = 14, RULE_param = 15, 
		RULE_function = 16, RULE_returnValue = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructionsBlock", "instructions", "instruction", "declaration", 
			"assignment", "expList", "expression", "expOp", "valueType", "value", 
			"functionCall", "methods", "printlnCall", "paramList", "param", "function", 
			"returnValue"
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

	@Override
	public String getGrammarFileName() { return "DBRust.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBRustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List list;
		public InstructionsContext instructions;
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((StartContext)_localctx).instructions = instructions();
			 _localctx.list = ((StartContext)_localctx).instructions.l 
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

	public static class InstructionsBlockContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstructionsContext instructions;
		public TerminalNode OPENBRACKET() { return getToken(DBRustParser.OPENBRACKET, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(DBRustParser.CLOSEBRACKET, 0); }
		public InstructionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionsBlock; }
	}

	public final InstructionsBlockContext instructionsBlock() throws RecognitionException {
		InstructionsBlockContext _localctx = new InstructionsBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructionsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(OPENBRACKET);
			setState(40);
			((InstructionsBlockContext)_localctx).instructions = instructions();
			setState(41);
			match(CLOSEBRACKET);

							_localctx.l = ((InstructionsBlockContext)_localctx).instructions.l
					
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

	public static class InstructionsContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstructionContext instruction;
		public List<InstructionContext> e = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructions);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << FN) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      listInt := localctx.(*InstructionsContext).GetE()
			      		for _, e := range listInt{
				          _localctx.l.Add(e.GetState())
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

	public static class InstructionContext extends ParserRuleContext {
		public I.IInstruction state;
		public DeclarationContext decltn;
		public FunctionCallContext calls;
		public AssignmentContext assign;
		public MethodsContext mth;
		public FunctionContext fn;
		public ReturnValueContext rtn;
		public TerminalNode SEMI() { return getToken(DBRustParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ReturnValueContext returnValue() {
			return getRuleContext(ReturnValueContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((InstructionContext)_localctx).decltn = declaration();
				setState(53);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				((InstructionContext)_localctx).calls = functionCall();
				setState(57);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).calls.state 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				((InstructionContext)_localctx).assign = assignment();
				setState(61);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				((InstructionContext)_localctx).mth = methods();
				setState(65);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).mth.state 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				((InstructionContext)_localctx).fn = function();
				 _localctx.state = ((InstructionContext)_localctx).fn.state 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				((InstructionContext)_localctx).rtn = returnValue();
				setState(72);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).rtn.state 
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public I.Declaration state;
		public Token ID;
		public ValueTypeContext valueType;
		public ExpressionContext expression;
		public TerminalNode LET() { return getToken(DBRustParser.LET, 0); }
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode COLOM() { return getToken(DBRustParser.COLOM, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DBRustParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUT() { return getToken(DBRustParser.MUT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(LET);
				setState(78);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(79);
				match(COLOM);
				setState(80);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(81);
				match(EQUALS);
				setState(82);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{ "Declaration" },
							Mut: false,
							Type: ((DeclarationContext)_localctx).valueType.state,
							Id: (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), 
							Expression: &expPoint,
						}
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(LET);
				setState(86);
				match(MUT);
				setState(87);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(88);
				match(COLOM);
				setState(89);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(90);
				match(EQUALS);
				setState(91);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{ "Declaration" },
							Mut: true,
							Type: ((DeclarationContext)_localctx).valueType.state,
							Id: (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), 
							Expression: &expPoint,
						}
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(LET);
				setState(95);
				match(MUT);
				setState(96);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(97);
				match(EQUALS);
				setState(98);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{ "Declaration" },
							Mut: true,
							Type: I.UNDEF,
							Id: (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), 
							Expression: &expPoint,
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(LET);
				setState(102);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(103);
				match(EQUALS);
				setState(104);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{ "Declaration" },
							Mut: true,
							Type:  I.UNDEF,
							Id: (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), 
							Expression: &expPoint,
						}
					
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public I.Assignment state;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DBRustParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(110);
			match(EQUALS);
			setState(111);
			((AssignmentContext)_localctx).expression = expression(0);

					expPoint := ((AssignmentContext)_localctx).expression.state
					_localctx.state = I.Assignment{ 
						Instruction: I.Instruction{ "Assignment" }, 
						Id: (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), 
						Expression: &expPoint,
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

	public static class ExpListContext extends ParserRuleContext {
		public *arrayList.List l;
		public ExpListContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBRustParser.COMMA, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
	}

	public final ExpListContext expList() throws RecognitionException {
		return expList(0);
	}

	private ExpListContext expList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpListContext _localctx = new ExpListContext(_ctx, _parentState);
		ExpListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			((ExpListContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ExpListContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpListContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expList);
					setState(118);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(119);
					match(COMMA);
					setState(120);
					((ExpListContext)_localctx).expression = expression(0);
					 
					          		((ExpListContext)_localctx).list.l.Add(((ExpListContext)_localctx).expression.state)
					          		_localctx.l = ((ExpListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public I.Expression state;
		public ExpressionContext leftExp;
		public ExpressionContext exp;
		public ValueContext value;
		public ExpOpContext expOp;
		public ExpressionContext rightExp;
		public TerminalNode NOT() { return getToken(DBRustParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpOpContext expOp() {
			return getRuleContext(ExpOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(129);
				match(NOT);
				setState(130);
				((ExpressionContext)_localctx).exp = expression(3);

						exp := ((ExpressionContext)_localctx).exp.state
						_localctx.state = I.Expression{ 
							Value: nil, 
							Left: &exp,
							Right: nil, 
							Operation: I.UNOT,
						} 
					
				}
				break;
			case OPENPAR:
				{
				setState(133);
				match(OPENPAR);
				setState(134);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(135);
				match(CLOSEPAR);

						exp := ((ExpressionContext)_localctx).exp.state
						_localctx.state = I.Expression{ 
							Value: nil, 
							Left: &exp,
							Right: nil, 
							Operation: I.NOOP,
						} 
					
				}
				break;
			case PRINTLN:
			case BFALSE:
			case BTRUE:
			case NUMBER:
			case FLOAT:
			case STRING:
			case CHAR:
			case ID:
				{
				setState(138);
				((ExpressionContext)_localctx).value = value();
				 
						sym := ((ExpressionContext)_localctx).value.state
						_localctx.state = I.Expression{
							Value: &sym, 
							Left: nil, 
							Right: nil, 
							Operation: I.NOOP,
						} 
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.leftExp = _prevctx;
					_localctx.leftExp = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(143);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(144);
					((ExpressionContext)_localctx).expOp = expOp();
					setState(145);
					((ExpressionContext)_localctx).rightExp = expression(5);

					          		left, right := ((ExpressionContext)_localctx).leftExp.state, ((ExpressionContext)_localctx).rightExp.state;
					          		_localctx.state = I.Expression{ 
					          			Value: nil, 
					          			Left: &left,
					          			Right: &right, 
					          			Operation: ((ExpressionContext)_localctx).expOp.state,
					          		} 
					          	
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpOpContext extends ParserRuleContext {
		public I.Operation state;
		public TerminalNode MUL() { return getToken(DBRustParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DBRustParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DBRustParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(DBRustParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DBRustParser.SUB, 0); }
		public TerminalNode NOTEQUALS() { return getToken(DBRustParser.NOTEQUALS, 0); }
		public TerminalNode MOREOREQUALS() { return getToken(DBRustParser.MOREOREQUALS, 0); }
		public TerminalNode LESSOREQUALS() { return getToken(DBRustParser.LESSOREQUALS, 0); }
		public TerminalNode EQUALSEQUALS() { return getToken(DBRustParser.EQUALSEQUALS, 0); }
		public TerminalNode MAJOR() { return getToken(DBRustParser.MAJOR, 0); }
		public TerminalNode MINOR() { return getToken(DBRustParser.MINOR, 0); }
		public ExpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOp; }
	}

	public final ExpOpContext expOp() throws RecognitionException {
		ExpOpContext _localctx = new ExpOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expOp);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(MUL);
					
						_localctx.state = I.MUL 
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(DIV);
					
						_localctx.state = I.DIV 
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(MOD);
					
						_localctx.state = I.MOD 
					
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(ADD);
					
						_localctx.state = I.ADD 
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(SUB);
					
						_localctx.state = I.SUB 
					
				}
				break;
			case NOTEQUALS:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(NOTEQUALS);
					
							_localctx.state = I.NOTEQUALS 
					
				}
				break;
			case MOREOREQUALS:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				match(MOREOREQUALS);
					
							_localctx.state = I.MOREOREQUALS 
					
				}
				break;
			case LESSOREQUALS:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				match(LESSOREQUALS);
					
							_localctx.state = I.LESSOREQUALS 
					
				}
				break;
			case EQUALSEQUALS:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(EQUALSEQUALS);
					
							_localctx.state = I.EQUALSEQUALS 
					
				}
				break;
			case MAJOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				match(MAJOR);
					
							_localctx.state = I.MAJOR 
					
				}
				break;
			case MINOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				match(MINOR);
					
								_localctx.state = I.MINOR 
					
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

	public static class ValueTypeContext extends ParserRuleContext {
		public I.ValueType state;
		public TerminalNode I64() { return getToken(DBRustParser.I64, 0); }
		public TerminalNode F64() { return getToken(DBRustParser.F64, 0); }
		public TerminalNode BOOL() { return getToken(DBRustParser.BOOL, 0); }
		public TerminalNode CHARTYPE() { return getToken(DBRustParser.CHARTYPE, 0); }
		public TerminalNode STR() { return getToken(DBRustParser.STR, 0); }
		public TerminalNode STRCLASS() { return getToken(DBRustParser.STRCLASS, 0); }
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueType);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(I64);
				 
						_localctx.state = I.INTEGER 
					
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(F64);
				 
						_localctx.state = I.FLOAT 
					
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(BOOL);
				 
						_localctx.state = I.BOOL 
					
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(CHARTYPE);
				 
						_localctx.state = I.CHAR 
					
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(STR);
				 
						_localctx.state = I.STR 
					
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(STRCLASS);
				 
						_localctx.state = I.STRING 
					
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

	public static class ValueContext extends ParserRuleContext {
		public I.IValue state;
		public Token NUMBER;
		public Token FLOAT;
		public Token STRING;
		public Token CHAR;
		public Token BFALSE;
		public Token BTRUE;
		public Token ID;
		public MethodsContext methods;
		public FunctionCallContext functionCall;
		public TerminalNode NUMBER() { return getToken(DBRustParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(DBRustParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DBRustParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(DBRustParser.CHAR, 0); }
		public TerminalNode BFALSE() { return getToken(DBRustParser.BFALSE, 0); }
		public TerminalNode BTRUE() { return getToken(DBRustParser.BTRUE, 0); }
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 
						_localctx.state = I.Value{ I.Token{ "NUMBER", ((ValueContext)_localctx).NUMBER.GetLine(), ((ValueContext)_localctx).NUMBER.GetColumn() }, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null), I.INTEGER } 
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					
						_localctx.state = I.Value{ I.Token{ "FLOAT", ((ValueContext)_localctx).FLOAT.GetLine(), ((ValueContext)_localctx).FLOAT.GetColumn() }, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null), I.FLOAT } 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((ValueContext)_localctx).STRING = match(STRING);
				 
						_localctx.state = I.Value{ I.Token{ "SRING", ((ValueContext)_localctx).STRING.GetLine(), ((ValueContext)_localctx).STRING.GetColumn() }, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1], I.STR } 
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 
						_localctx.state = I.Value{ I.Token{ "CHAR", ((ValueContext)_localctx).CHAR.GetLine(), ((ValueContext)_localctx).CHAR.GetColumn() }, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1], I.CHAR } 
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 
						_localctx.state = I.Value{ I.Token{ "BFALSE", ((ValueContext)_localctx).BFALSE.GetLine(), ((ValueContext)_localctx).BFALSE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 
						_localctx.state = I.Value{ I.Token{ "BTRUE", ((ValueContext)_localctx).BTRUE.GetLine(), ((ValueContext)_localctx).BTRUE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				((ValueContext)_localctx).ID = match(ID);
				 
						_localctx.state = I.Value{ I.Token{ "ID", ((ValueContext)_localctx).ID.GetLine(), ((ValueContext)_localctx).ID.GetColumn() }, (((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null), I.ID } 
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				((ValueContext)_localctx).methods = methods();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).methods.state;
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				((ValueContext)_localctx).functionCall = functionCall();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).functionCall.state;
					
				}
				break;
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

	public static class FunctionCallContext extends ParserRuleContext {
		public I.IFunctionCall state;
		public Token ID;
		public ExpListContext expList;
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(214);
				match(OPENPAR);
				setState(215);
				((FunctionCallContext)_localctx).expList = expList(0);
				setState(216);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), ((FunctionCallContext)_localctx).expList.l.ToArray() }
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(220);
				match(OPENPAR);
				setState(221);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), make([]interface{}, 0) }
					
				}
				break;
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

	public static class MethodsContext extends ParserRuleContext {
		public I.IFunctionCall state;
		public PrintlnCallContext printlnCall;
		public PrintlnCallContext printlnCall() {
			return getRuleContext(PrintlnCallContext.class,0);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((MethodsContext)_localctx).printlnCall = printlnCall();
			 _localctx.state = ((MethodsContext)_localctx).printlnCall.state 
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

	public static class PrintlnCallContext extends ParserRuleContext {
		public I.PrintlnCall state;
		public Token PRINTLN;
		public ExpListContext expList;
		public TerminalNode PRINTLN() { return getToken(DBRustParser.PRINTLN, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public PrintlnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnCall; }
	}

	public final PrintlnCallContext printlnCall() throws RecognitionException {
		PrintlnCallContext _localctx = new PrintlnCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printlnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((PrintlnCallContext)_localctx).PRINTLN = match(PRINTLN);
			setState(229);
			match(OPENPAR);
			setState(230);
			((PrintlnCallContext)_localctx).expList = expList(0);
			setState(231);
			match(CLOSEPAR);

					_localctx.state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "Println", ((PrintlnCallContext)_localctx).PRINTLN.GetLine(), ((PrintlnCallContext)_localctx).PRINTLN.GetColumn() }, "Println", I.VOID }, "Println", ((PrintlnCallContext)_localctx).expList.l.ToArray() } }
				
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

	public static class ParamListContext extends ParserRuleContext {
		public *arrayList.List l;
		public ParamListContext list;
		public ParamContext param;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBRustParser.COMMA, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		return paramList(0);
	}

	private ParamListContext paramList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamListContext _localctx = new ParamListContext(_ctx, _parentState);
		ParamListContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			((ParamListContext)_localctx).param = param();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ParamListContext)_localctx).param.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(238);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(239);
					match(COMMA);
					setState(240);
					((ParamListContext)_localctx).param = param();
					 
					          		((ParamListContext)_localctx).list.l.Add(((ParamListContext)_localctx).param.state)
					          		_localctx.l = ((ParamListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public I.FunctionParam state;
		public Token ID;
		public ValueTypeContext valueType;
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode COLOM() { return getToken(DBRustParser.COLOM, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((ParamContext)_localctx).ID = match(ID);
			setState(249);
			match(COLOM);
			setState(250);
			((ParamContext)_localctx).valueType = valueType();

					((ParamContext)_localctx).state =  I.FunctionParam{ (((ParamContext)_localctx).ID!=null?((ParamContext)_localctx).ID.getText():null), ((ParamContext)_localctx).valueType.state };
				
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

	public static class FunctionContext extends ParserRuleContext {
		public I.Function state;
		public Token FN;
		public Token ID;
		public ParamListContext paramList;
		public InstructionsBlockContext instructionsBlock;
		public ValueTypeContext valueType;
		public TerminalNode FN() { return getToken(DBRustParser.FN, 0); }
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(DBRustParser.ARROW, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((FunctionContext)_localctx).FN = match(FN);
				setState(254);
				((FunctionContext)_localctx).ID = match(ID);
				setState(255);
				match(OPENPAR);
				setState(256);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(257);
				match(CLOSEPAR);
				setState(258);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((FunctionContext)_localctx).FN = match(FN);
				setState(262);
				((FunctionContext)_localctx).ID = match(ID);
				setState(263);
				match(OPENPAR);
				setState(264);
				match(CLOSEPAR);
				setState(265);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				((FunctionContext)_localctx).FN = match(FN);
				setState(269);
				((FunctionContext)_localctx).ID = match(ID);
				setState(270);
				match(OPENPAR);
				setState(271);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(272);
				match(CLOSEPAR);
				setState(273);
				match(ARROW);
				setState(274);
				((FunctionContext)_localctx).valueType = valueType();
				setState(275);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state, nil };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				((FunctionContext)_localctx).FN = match(FN);
				setState(279);
				((FunctionContext)_localctx).ID = match(ID);
				setState(280);
				match(OPENPAR);
				setState(281);
				match(CLOSEPAR);
				setState(282);
				match(ARROW);
				setState(283);
				((FunctionContext)_localctx).valueType = valueType();
				setState(284);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state, nil };
					
				}
				break;
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

	public static class ReturnValueContext extends ParserRuleContext {
		public I.ReturnValue state;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(DBRustParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnValue; }
	}

	public final ReturnValueContext returnValue() throws RecognitionException {
		ReturnValueContext _localctx = new ReturnValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((ReturnValueContext)_localctx).RETURN = match(RETURN);
			setState(290);
			((ReturnValueContext)_localctx).expression = expression(0);

					_localctx.state = I.ReturnValue{ I.Instruction{ "Return" }, I.Token{ "Return", ((ReturnValueContext)_localctx).RETURN.GetLine(), ((ReturnValueContext)_localctx).RETURN.GetColumn() }, ((ReturnValueContext)_localctx).expression.state }
				
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expList_sempred((ExpListContext)_localctx, predIndex);
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expList_sempred(ExpListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c0\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e2"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0122\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\2\5\16\20\36\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\2\2\u013e\2&\3\2\2\2\4)\3\2\2\2\6\61\3\2\2\2\bM\3\2\2\2\n"+
		"m\3\2\2\2\fo\3\2\2\2\16t\3\2\2\2\20\u008f\3\2\2\2\22\u00b1\3\2\2\2\24"+
		"\u00bf\3\2\2\2\26\u00d5\3\2\2\2\30\u00e1\3\2\2\2\32\u00e3\3\2\2\2\34\u00e6"+
		"\3\2\2\2\36\u00ec\3\2\2\2 \u00fa\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2"+
		"\2&\'\5\6\4\2\'(\b\2\1\2(\3\3\2\2\2)*\7\27\2\2*+\5\6\4\2+,\7\30\2\2,-"+
		"\b\3\1\2-\5\3\2\2\2.\60\5\b\5\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66"+
		"\67\5\n\6\2\678\7\34\2\289\b\5\1\29N\3\2\2\2:;\5\30\r\2;<\7\34\2\2<=\b"+
		"\5\1\2=N\3\2\2\2>?\5\f\7\2?@\7\34\2\2@A\b\5\1\2AN\3\2\2\2BC\5\32\16\2"+
		"CD\7\34\2\2DE\b\5\1\2EN\3\2\2\2FG\5\"\22\2GH\b\5\1\2HN\3\2\2\2IJ\5$\23"+
		"\2JK\7\34\2\2KL\b\5\1\2LN\3\2\2\2M\66\3\2\2\2M:\3\2\2\2M>\3\2\2\2MB\3"+
		"\2\2\2MF\3\2\2\2MI\3\2\2\2N\t\3\2\2\2OP\7\3\2\2PQ\7\24\2\2QR\7\33\2\2"+
		"RS\5\24\13\2ST\7%\2\2TU\5\20\t\2UV\b\6\1\2Vn\3\2\2\2WX\7\3\2\2XY\7\4\2"+
		"\2YZ\7\24\2\2Z[\7\33\2\2[\\\5\24\13\2\\]\7%\2\2]^\5\20\t\2^_\b\6\1\2_"+
		"n\3\2\2\2`a\7\3\2\2ab\7\4\2\2bc\7\24\2\2cd\7%\2\2de\5\20\t\2ef\b\6\1\2"+
		"fn\3\2\2\2gh\7\3\2\2hi\7\24\2\2ij\7%\2\2jk\5\20\t\2kl\b\6\1\2ln\3\2\2"+
		"\2mO\3\2\2\2mW\3\2\2\2m`\3\2\2\2mg\3\2\2\2n\13\3\2\2\2op\7\24\2\2pq\7"+
		"%\2\2qr\5\20\t\2rs\b\7\1\2s\r\3\2\2\2tu\b\b\1\2uv\5\20\t\2vw\b\b\1\2w"+
		"\177\3\2\2\2xy\f\4\2\2yz\7\35\2\2z{\5\20\t\2{|\b\b\1\2|~\3\2\2\2}x\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0083\b\t\1\2\u0083\u0084\7$\2\2\u0084\u0085\5\20\t"+
		"\5\u0085\u0086\b\t\1\2\u0086\u0090\3\2\2\2\u0087\u0088\7\25\2\2\u0088"+
		"\u0089\5\20\t\2\u0089\u008a\7\26\2\2\u008a\u008b\b\t\1\2\u008b\u0090\3"+
		"\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\b\t\1\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0082\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0098\3\2"+
		"\2\2\u0091\u0092\f\6\2\2\u0092\u0093\5\22\n\2\u0093\u0094\5\20\t\7\u0094"+
		"\u0095\b\t\1\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7(\2\2\u009c\u00b2\b\n\1\2\u009d\u009e\7)\2\2\u009e"+
		"\u00b2\b\n\1\2\u009f\u00a0\7*\2\2\u00a0\u00b2\b\n\1\2\u00a1\u00a2\7+\2"+
		"\2\u00a2\u00b2\b\n\1\2\u00a3\u00a4\7,\2\2\u00a4\u00b2\b\n\1\2\u00a5\u00a6"+
		"\7 \2\2\u00a6\u00b2\b\n\1\2\u00a7\u00a8\7\"\2\2\u00a8\u00b2\b\n\1\2\u00a9"+
		"\u00aa\7#\2\2\u00aa\u00b2\b\n\1\2\u00ab\u00ac\7!\2\2\u00ac\u00b2\b\n\1"+
		"\2\u00ad\u00ae\7&\2\2\u00ae\u00b2\b\n\1\2\u00af\u00b0\7\'\2\2\u00b0\u00b2"+
		"\b\n\1\2\u00b1\u009b\3\2\2\2\u00b1\u009d\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1"+
		"\u00a1\3\2\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a7\3\2"+
		"\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00c0\b\13\1"+
		"\2\u00b5\u00b6\7\t\2\2\u00b6\u00c0\b\13\1\2\u00b7\u00b8\7\n\2\2\u00b8"+
		"\u00c0\b\13\1\2\u00b9\u00ba\7\13\2\2\u00ba\u00c0\b\13\1\2\u00bb\u00bc"+
		"\7\f\2\2\u00bc\u00c0\b\13\1\2\u00bd\u00be\7\r\2\2\u00be\u00c0\b\13\1\2"+
		"\u00bf\u00b3\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\25\3\2\2\2\u00c1"+
		"\u00c2\7\20\2\2\u00c2\u00d6\b\f\1\2\u00c3\u00c4\7\21\2\2\u00c4\u00d6\b"+
		"\f\1\2\u00c5\u00c6\7\22\2\2\u00c6\u00d6\b\f\1\2\u00c7\u00c8\7\23\2\2\u00c8"+
		"\u00d6\b\f\1\2\u00c9\u00ca\7\16\2\2\u00ca\u00d6\b\f\1\2\u00cb\u00cc\7"+
		"\17\2\2\u00cc\u00d6\b\f\1\2\u00cd\u00ce\7\24\2\2\u00ce\u00d6\b\f\1\2\u00cf"+
		"\u00d0\5\32\16\2\u00d0\u00d1\b\f\1\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\5"+
		"\30\r\2\u00d3\u00d4\b\f\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5"+
		"\u00c3\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5\u00c9\3\2"+
		"\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9\7\25"+
		"\2\2\u00d9\u00da\5\16\b\2\u00da\u00db\7\26\2\2\u00db\u00dc\b\r\1\2\u00dc"+
		"\u00e2\3\2\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\7\25\2\2\u00df\u00e0\7"+
		"\26\2\2\u00e0\u00e2\b\r\1\2\u00e1\u00d7\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"\31\3\2\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\b\16\1\2\u00e5\33\3\2\2"+
		"\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9\5\16\b\2\u00e9"+
		"\u00ea\7\26\2\2\u00ea\u00eb\b\17\1\2\u00eb\35\3\2\2\2\u00ec\u00ed\b\20"+
		"\1\2\u00ed\u00ee\5 \21\2\u00ee\u00ef\b\20\1\2\u00ef\u00f7\3\2\2\2\u00f0"+
		"\u00f1\f\4\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\b"+
		"\20\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00f7\3\2\2"+
		"\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\5\24\13\2\u00fd"+
		"\u00fe\b\21\1\2\u00fe!\3\2\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\7\24\2"+
		"\2\u0101\u0102\7\25\2\2\u0102\u0103\5\36\20\2\u0103\u0104\7\26\2\2\u0104"+
		"\u0105\5\4\3\2\u0105\u0106\b\22\1\2\u0106\u0122\3\2\2\2\u0107\u0108\7"+
		"\6\2\2\u0108\u0109\7\24\2\2\u0109\u010a\7\25\2\2\u010a\u010b\7\26\2\2"+
		"\u010b\u010c\5\4\3\2\u010c\u010d\b\22\1\2\u010d\u0122\3\2\2\2\u010e\u010f"+
		"\7\6\2\2\u010f\u0110\7\24\2\2\u0110\u0111\7\25\2\2\u0111\u0112\5\36\20"+
		"\2\u0112\u0113\7\26\2\2\u0113\u0114\7\31\2\2\u0114\u0115\5\24\13\2\u0115"+
		"\u0116\5\4\3\2\u0116\u0117\b\22\1\2\u0117\u0122\3\2\2\2\u0118\u0119\7"+
		"\6\2\2\u0119\u011a\7\24\2\2\u011a\u011b\7\25\2\2\u011b\u011c\7\26\2\2"+
		"\u011c\u011d\7\31\2\2\u011d\u011e\5\24\13\2\u011e\u011f\5\4\3\2\u011f"+
		"\u0120\b\22\1\2\u0120\u0122\3\2\2\2\u0121\u00ff\3\2\2\2\u0121\u0107\3"+
		"\2\2\2\u0121\u010e\3\2\2\2\u0121\u0118\3\2\2\2\u0122#\3\2\2\2\u0123\u0124"+
		"\7\7\2\2\u0124\u0125\5\20\t\2\u0125\u0126\b\23\1\2\u0126%\3\2\2\2\16\61"+
		"Mm\177\u008f\u0098\u00b1\u00bf\u00d5\u00e1\u00f7\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}