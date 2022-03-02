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
		LET=1, MUT=2, PRINTLN=3, FN=4, I64=5, F64=6, BOOL=7, CHARTYPE=8, STR=9, 
		STRCLASS=10, BFALSE=11, BTRUE=12, NUMBER=13, FLOAT=14, STRING=15, CHAR=16, 
		ID=17, OPENPAR=18, CLOSEPAR=19, OPENBRACKET=20, CLOSEBRACKET=21, ARROW=22, 
		DOT=23, COLOM=24, SEMI=25, COMMA=26, AND=27, OR=28, NOTEQUALS=29, EQUALSEQUALS=30, 
		MOREOREQUALS=31, LESSOREQUALS=32, NOT=33, EQUALS=34, MAJOR=35, MINOR=36, 
		MUL=37, DIV=38, MOD=39, ADD=40, SUB=41, WHITESPACE=42;
	public static final int
		RULE_start = 0, RULE_instructionsBlock = 1, RULE_instructions = 2, RULE_instruction = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_expList = 6, RULE_expression = 7, 
		RULE_expOp = 8, RULE_valueType = 9, RULE_value = 10, RULE_functionCall = 11, 
		RULE_methods = 12, RULE_printlnCall = 13, RULE_paramList = 14, RULE_param = 15, 
		RULE_function = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructionsBlock", "instructions", "instruction", "declaration", 
			"assignment", "expList", "expression", "expOp", "valueType", "value", 
			"functionCall", "methods", "printlnCall", "paramList", "param", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'fn'", "'i64'", "'f64'", "'bool'", 
			"'char'", "'&str'", "'String'", "'false'", "'true'", null, null, null, 
			null, null, "'('", "')'", "'{'", "'}'", "'->'", "'.'", "':'", "';'", 
			"','", "'&&'", "'||'", "'!='", "'=='", "'>='", "'<='", "'!'", "'='", 
			"'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "FN", "I64", "F64", "BOOL", "CHARTYPE", 
			"STR", "STRCLASS", "BFALSE", "BTRUE", "NUMBER", "FLOAT", "STRING", "CHAR", 
			"ID", "OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", "ARROW", 
			"DOT", "COLOM", "SEMI", "COMMA", "AND", "OR", "NOTEQUALS", "EQUALSEQUALS", 
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
			setState(34);
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
			setState(37);
			match(OPENBRACKET);
			setState(38);
			((InstructionsBlockContext)_localctx).instructions = instructions();
			setState(39);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << FN) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(47);
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
		public AssignmentContext assign;
		public MethodsContext mth;
		public FunctionCallContext calls;
		public FunctionContext fn;
		public TerminalNode SEMI() { return getToken(DBRustParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((InstructionContext)_localctx).decltn = declaration();
				setState(51);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((InstructionContext)_localctx).assign = assignment();
				setState(55);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				((InstructionContext)_localctx).mth = methods();
				setState(59);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).mth.state 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				((InstructionContext)_localctx).calls = functionCall();
				setState(63);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).calls.state 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				((InstructionContext)_localctx).fn = function();
				 _localctx.state = ((InstructionContext)_localctx).fn.state 
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(LET);
				setState(72);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(73);
				match(COLOM);
				setState(74);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(75);
				match(EQUALS);
				setState(76);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{"Declaration"},
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
				setState(79);
				match(LET);
				setState(80);
				match(MUT);
				setState(81);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(82);
				match(COLOM);
				setState(83);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(84);
				match(EQUALS);
				setState(85);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{"Declaration"},
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
				setState(88);
				match(LET);
				setState(89);
				match(MUT);
				setState(90);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(91);
				match(EQUALS);
				setState(92);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{"Declaration"},
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
				setState(95);
				match(LET);
				setState(96);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(97);
				match(EQUALS);
				setState(98);
				((DeclarationContext)_localctx).expression = expression(0);

						expPoint := ((DeclarationContext)_localctx).expression.state
						_localctx.state = I.Declaration{ 
							Instruction: I.Instruction{"Declaration"},
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
			setState(103);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(104);
			match(EQUALS);
			setState(105);
			((AssignmentContext)_localctx).expression = expression(0);

					expPoint := ((AssignmentContext)_localctx).expression.state
					_localctx.state = I.Assignment{ 
						Instruction: I.Instruction{"Assignment"}, 
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
			setState(109);
			((ExpListContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ExpListContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
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
					setState(112);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(113);
					match(COMMA);
					setState(114);
					((ExpListContext)_localctx).expression = expression(0);
					 
					          		((ExpListContext)_localctx).list.l.Add(((ExpListContext)_localctx).expression.state)
					          		_localctx.l = ((ExpListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(121);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(123);
				match(NOT);
				setState(124);
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
				setState(127);
				match(OPENPAR);
				setState(128);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(129);
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
				setState(132);
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
			setState(144);
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
					setState(137);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(138);
					((ExpressionContext)_localctx).expOp = expOp();
					setState(139);
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
				setState(146);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(MUL);
					
						_localctx.state = I.MUL 
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(DIV);
					
						_localctx.state = I.DIV 
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(MOD);
					
						_localctx.state = I.MOD 
					
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(ADD);
					
						_localctx.state = I.ADD 
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(SUB);
					
						_localctx.state = I.SUB 
					
				}
				break;
			case NOTEQUALS:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(NOTEQUALS);
					
							_localctx.state = I.NOTEQUALS 
					
				}
				break;
			case MOREOREQUALS:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(MOREOREQUALS);
					
							_localctx.state = I.MOREOREQUALS 
					
				}
				break;
			case LESSOREQUALS:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(LESSOREQUALS);
					
							_localctx.state = I.LESSOREQUALS 
					
				}
				break;
			case EQUALSEQUALS:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				match(EQUALSEQUALS);
					
							_localctx.state = I.EQUALSEQUALS 
					
				}
				break;
			case MAJOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				match(MAJOR);
					
							_localctx.state = I.MAJOR 
					
				}
				break;
			case MINOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(167);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(I64);
				 
						_localctx.state = I.INTEGER 
					
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(F64);
				 
						_localctx.state = I.FLOAT 
					
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(BOOL);
				 
						_localctx.state = I.BOOL 
					
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(CHARTYPE);
				 
						_localctx.state = I.CHAR 
					
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(STR);
				 
						_localctx.state = I.STR 
					
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 
						_localctx.state = I.Value{ I.Token{ "NUMBER", ((ValueContext)_localctx).NUMBER.GetLine(), ((ValueContext)_localctx).NUMBER.GetColumn() }, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null), I.INTEGER } 
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					
						_localctx.state = I.Value{ I.Token{ "FLOAT", ((ValueContext)_localctx).FLOAT.GetLine(), ((ValueContext)_localctx).FLOAT.GetColumn() }, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null), I.FLOAT } 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				((ValueContext)_localctx).STRING = match(STRING);
				 
						_localctx.state = I.Value{ I.Token{ "SRING", ((ValueContext)_localctx).STRING.GetLine(), ((ValueContext)_localctx).STRING.GetColumn() }, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1], I.STR } 
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 
						_localctx.state = I.Value{ I.Token{ "CHAR", ((ValueContext)_localctx).CHAR.GetLine(), ((ValueContext)_localctx).CHAR.GetColumn() }, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1], I.CHAR } 
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 
						_localctx.state = I.Value{ I.Token{ "BFALSE", ((ValueContext)_localctx).BFALSE.GetLine(), ((ValueContext)_localctx).BFALSE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 
						_localctx.state = I.Value{ I.Token{ "BTRUE", ((ValueContext)_localctx).BTRUE.GetLine(), ((ValueContext)_localctx).BTRUE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				((ValueContext)_localctx).ID = match(ID);
				 
						_localctx.state = I.Value{ I.Token{ "ID", ((ValueContext)_localctx).ID.GetLine(), ((ValueContext)_localctx).ID.GetColumn() }, (((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null), I.ID } 
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				((ValueContext)_localctx).methods = methods();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).methods.state;
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(208);
				match(OPENPAR);
				setState(209);
				((FunctionCallContext)_localctx).expList = expList(0);
				setState(210);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, ((FunctionCallContext)_localctx).expList.l.ToArray() }
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(214);
				match(OPENPAR);
				setState(215);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, make([]interface{}, 0) }
					
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
			setState(219);
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
			setState(222);
			((PrintlnCallContext)_localctx).PRINTLN = match(PRINTLN);
			setState(223);
			match(OPENPAR);
			setState(224);
			((PrintlnCallContext)_localctx).expList = expList(0);
			setState(225);
			match(CLOSEPAR);

					_localctx.state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "Println", ((PrintlnCallContext)_localctx).PRINTLN.GetLine(), ((PrintlnCallContext)_localctx).PRINTLN.GetColumn() }, "Println", I.VOID }, ((PrintlnCallContext)_localctx).expList.l.ToArray() } }
				
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
			setState(229);
			((ParamListContext)_localctx).param = param();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ParamListContext)_localctx).param.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
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
					setState(232);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(233);
					match(COMMA);
					setState(234);
					((ParamListContext)_localctx).param = param();
					 
					          		((ParamListContext)_localctx).list.l.Add(((ParamListContext)_localctx).param.state)
					          		_localctx.l = ((ParamListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(241);
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
			setState(242);
			((ParamContext)_localctx).ID = match(ID);
			setState(243);
			match(COLOM);
			setState(244);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((FunctionContext)_localctx).FN = match(FN);
				setState(248);
				((FunctionContext)_localctx).ID = match(ID);
				setState(249);
				match(OPENPAR);
				setState(250);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(251);
				match(CLOSEPAR);
				setState(252);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((FunctionContext)_localctx).FN = match(FN);
				setState(256);
				((FunctionContext)_localctx).ID = match(ID);
				setState(257);
				match(OPENPAR);
				setState(258);
				match(CLOSEPAR);
				setState(259);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				((FunctionContext)_localctx).FN = match(FN);
				setState(263);
				((FunctionContext)_localctx).ID = match(ID);
				setState(264);
				match(OPENPAR);
				setState(265);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(266);
				match(CLOSEPAR);
				setState(267);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();
				setState(268);
				match(ARROW);
				setState(269);
				((FunctionContext)_localctx).valueType = valueType();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				((FunctionContext)_localctx).FN = match(FN);
				setState(273);
				((FunctionContext)_localctx).ID = match(ID);
				setState(274);
				match(OPENPAR);
				setState(275);
				match(CLOSEPAR);
				setState(276);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();
				setState(277);
				match(ARROW);
				setState(278);
				((FunctionContext)_localctx).valueType = valueType();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state };
					
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"h\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b"+
		"\f\b\16\b{\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u008a\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d0\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f0"+
		"\n\20\f\20\16\20\u00f3\13\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u011c\n\22\3\22\2\5\16\20\36\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\2\2\u0134\2$\3\2\2\2\4\'\3\2\2\2\6/\3\2\2\2\b"+
		"G\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20\u0089\3\2\2\2\22\u00ab"+
		"\3\2\2\2\24\u00b9\3\2\2\2\26\u00cf\3\2\2\2\30\u00db\3\2\2\2\32\u00dd\3"+
		"\2\2\2\34\u00e0\3\2\2\2\36\u00e6\3\2\2\2 \u00f4\3\2\2\2\"\u011b\3\2\2"+
		"\2$%\5\6\4\2%&\b\2\1\2&\3\3\2\2\2\'(\7\26\2\2()\5\6\4\2)*\7\27\2\2*+\b"+
		"\3\1\2+\5\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\b\4\1\2\63\7\3\2\2\2\64\65\5\n\6\2"+
		"\65\66\7\33\2\2\66\67\b\5\1\2\67H\3\2\2\289\5\f\7\29:\7\33\2\2:;\b\5\1"+
		"\2;H\3\2\2\2<=\5\32\16\2=>\7\33\2\2>?\b\5\1\2?H\3\2\2\2@A\5\30\r\2AB\7"+
		"\33\2\2BC\b\5\1\2CH\3\2\2\2DE\5\"\22\2EF\b\5\1\2FH\3\2\2\2G\64\3\2\2\2"+
		"G8\3\2\2\2G<\3\2\2\2G@\3\2\2\2GD\3\2\2\2H\t\3\2\2\2IJ\7\3\2\2JK\7\23\2"+
		"\2KL\7\32\2\2LM\5\24\13\2MN\7$\2\2NO\5\20\t\2OP\b\6\1\2Ph\3\2\2\2QR\7"+
		"\3\2\2RS\7\4\2\2ST\7\23\2\2TU\7\32\2\2UV\5\24\13\2VW\7$\2\2WX\5\20\t\2"+
		"XY\b\6\1\2Yh\3\2\2\2Z[\7\3\2\2[\\\7\4\2\2\\]\7\23\2\2]^\7$\2\2^_\5\20"+
		"\t\2_`\b\6\1\2`h\3\2\2\2ab\7\3\2\2bc\7\23\2\2cd\7$\2\2de\5\20\t\2ef\b"+
		"\6\1\2fh\3\2\2\2gI\3\2\2\2gQ\3\2\2\2gZ\3\2\2\2ga\3\2\2\2h\13\3\2\2\2i"+
		"j\7\23\2\2jk\7$\2\2kl\5\20\t\2lm\b\7\1\2m\r\3\2\2\2no\b\b\1\2op\5\20\t"+
		"\2pq\b\b\1\2qy\3\2\2\2rs\f\4\2\2st\7\34\2\2tu\5\20\t\2uv\b\b\1\2vx\3\2"+
		"\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2\2|}\b"+
		"\t\1\2}~\7#\2\2~\177\5\20\t\5\177\u0080\b\t\1\2\u0080\u008a\3\2\2\2\u0081"+
		"\u0082\7\24\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\25\2\2\u0084\u0085"+
		"\b\t\1\2\u0085\u008a\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\b\t\1\2"+
		"\u0088\u008a\3\2\2\2\u0089|\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0086\3"+
		"\2\2\2\u008a\u0092\3\2\2\2\u008b\u008c\f\6\2\2\u008c\u008d\5\22\n\2\u008d"+
		"\u008e\5\20\t\7\u008e\u008f\b\t\1\2\u008f\u0091\3\2\2\2\u0090\u008b\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\'\2\2\u0096\u00ac\b\n\1"+
		"\2\u0097\u0098\7(\2\2\u0098\u00ac\b\n\1\2\u0099\u009a\7)\2\2\u009a\u00ac"+
		"\b\n\1\2\u009b\u009c\7*\2\2\u009c\u00ac\b\n\1\2\u009d\u009e\7+\2\2\u009e"+
		"\u00ac\b\n\1\2\u009f\u00a0\7\37\2\2\u00a0\u00ac\b\n\1\2\u00a1\u00a2\7"+
		"!\2\2\u00a2\u00ac\b\n\1\2\u00a3\u00a4\7\"\2\2\u00a4\u00ac\b\n\1\2\u00a5"+
		"\u00a6\7 \2\2\u00a6\u00ac\b\n\1\2\u00a7\u00a8\7%\2\2\u00a8\u00ac\b\n\1"+
		"\2\u00a9\u00aa\7&\2\2\u00aa\u00ac\b\n\1\2\u00ab\u0095\3\2\2\2\u00ab\u0097"+
		"\3\2\2\2\u00ab\u0099\3\2\2\2\u00ab\u009b\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab"+
		"\u009f\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2"+
		"\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae"+
		"\7\7\2\2\u00ae\u00ba\b\13\1\2\u00af\u00b0\7\b\2\2\u00b0\u00ba\b\13\1\2"+
		"\u00b1\u00b2\7\t\2\2\u00b2\u00ba\b\13\1\2\u00b3\u00b4\7\n\2\2\u00b4\u00ba"+
		"\b\13\1\2\u00b5\u00b6\7\13\2\2\u00b6\u00ba\b\13\1\2\u00b7\u00b8\7\f\2"+
		"\2\u00b8\u00ba\b\13\1\2\u00b9\u00ad\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00d0\b\f\1\2\u00bd\u00be"+
		"\7\20\2\2\u00be\u00d0\b\f\1\2\u00bf\u00c0\7\21\2\2\u00c0\u00d0\b\f\1\2"+
		"\u00c1\u00c2\7\22\2\2\u00c2\u00d0\b\f\1\2\u00c3\u00c4\7\r\2\2\u00c4\u00d0"+
		"\b\f\1\2\u00c5\u00c6\7\16\2\2\u00c6\u00d0\b\f\1\2\u00c7\u00c8\7\23\2\2"+
		"\u00c8\u00d0\b\f\1\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\b\f\1\2\u00cb\u00d0"+
		"\3\2\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\b\f\1\2\u00ce\u00d0\3\2\2\2"+
		"\u00cf\u00bb\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00bf\3\2\2\2\u00cf\u00c1"+
		"\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d2\7\23\2"+
		"\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\7\25\2\2\u00d5"+
		"\u00d6\b\r\1\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7"+
		"\24\2\2\u00d9\u00da\7\25\2\2\u00da\u00dc\b\r\1\2\u00db\u00d1\3\2\2\2\u00db"+
		"\u00d7\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\b\16"+
		"\1\2\u00df\33\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3"+
		"\5\16\b\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\b\17\1\2\u00e5\35\3\2\2\2\u00e6"+
		"\u00e7\b\20\1\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\b\20\1\2\u00e9\u00f1\3"+
		"\2\2\2\u00ea\u00eb\f\4\2\2\u00eb\u00ec\7\34\2\2\u00ec\u00ed\5 \21\2\u00ed"+
		"\u00ee\b\20\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7\23\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\5"+
		"\24\13\2\u00f7\u00f8\b\21\1\2\u00f8!\3\2\2\2\u00f9\u00fa\7\6\2\2\u00fa"+
		"\u00fb\7\23\2\2\u00fb\u00fc\7\24\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe"+
		"\7\25\2\2\u00fe\u00ff\5\4\3\2\u00ff\u0100\b\22\1\2\u0100\u011c\3\2\2\2"+
		"\u0101\u0102\7\6\2\2\u0102\u0103\7\23\2\2\u0103\u0104\7\24\2\2\u0104\u0105"+
		"\7\25\2\2\u0105\u0106\5\4\3\2\u0106\u0107\b\22\1\2\u0107\u011c\3\2\2\2"+
		"\u0108\u0109\7\6\2\2\u0109\u010a\7\23\2\2\u010a\u010b\7\24\2\2\u010b\u010c"+
		"\5\36\20\2\u010c\u010d\7\25\2\2\u010d\u010e\5\4\3\2\u010e\u010f\7\30\2"+
		"\2\u010f\u0110\5\24\13\2\u0110\u0111\b\22\1\2\u0111\u011c\3\2\2\2\u0112"+
		"\u0113\7\6\2\2\u0113\u0114\7\23\2\2\u0114\u0115\7\24\2\2\u0115\u0116\7"+
		"\25\2\2\u0116\u0117\5\4\3\2\u0117\u0118\7\30\2\2\u0118\u0119\5\24\13\2"+
		"\u0119\u011a\b\22\1\2\u011a\u011c\3\2\2\2\u011b\u00f9\3\2\2\2\u011b\u0101"+
		"\3\2\2\2\u011b\u0108\3\2\2\2\u011b\u0112\3\2\2\2\u011c#\3\2\2\2\16/Gg"+
		"y\u0089\u0092\u00ab\u00b9\u00cf\u00db\u00f1\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}