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
		STRCLASS=10, NUMBER=11, FLOAT=12, STRING=13, CHAR=14, ID=15, BFALSE=16, 
		BTRUE=17, OPENPAR=18, CLOSEPAR=19, OPENBRACKET=20, CLOSEBRACKET=21, ARROW=22, 
		DOT=23, COLOM=24, SEMI=25, COMMA=26, EQUALS=27, MUL=28, DIV=29, MOD=30, 
		ADD=31, SUB=32, WHITESPACE=33;
	public static final int
		RULE_start = 0, RULE_instructionsBlock = 1, RULE_instructions = 2, RULE_instruction = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_expList = 6, RULE_expression = 7, 
		RULE_expOp = 8, RULE_valueType = 9, RULE_value = 10, RULE_functionCall = 11, 
		RULE_methods = 12, RULE_printlnCall = 13, RULE_function = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructionsBlock", "instructions", "instruction", "declaration", 
			"assignment", "expList", "expression", "expOp", "valueType", "value", 
			"functionCall", "methods", "printlnCall", "function"
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
			setState(30);
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
			setState(33);
			match(OPENBRACKET);
			setState(34);
			((InstructionsBlockContext)_localctx).instructions = instructions();
			setState(35);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << FN) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(43);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((InstructionContext)_localctx).decltn = declaration();
				setState(47);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((InstructionContext)_localctx).assign = assignment();
				setState(51);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				((InstructionContext)_localctx).mth = methods();
				setState(55);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).mth.state 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				((InstructionContext)_localctx).calls = functionCall();
				setState(59);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).calls.state 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(LET);
				setState(68);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(69);
				match(COLOM);
				setState(70);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(71);
				match(EQUALS);
				setState(72);
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
				setState(75);
				match(LET);
				setState(76);
				match(MUT);
				setState(77);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(78);
				match(COLOM);
				setState(79);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(80);
				match(EQUALS);
				setState(81);
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
				setState(84);
				match(LET);
				setState(85);
				match(MUT);
				setState(86);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(87);
				match(EQUALS);
				setState(88);
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
				setState(91);
				match(LET);
				setState(92);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(93);
				match(EQUALS);
				setState(94);
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
			setState(99);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(100);
			match(EQUALS);
			setState(101);
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
			setState(105);
			((ExpListContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ExpListContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
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
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(COMMA);
					setState(110);
					((ExpListContext)_localctx).expression = expression(0);
					 
					          		((ExpListContext)_localctx).list.l.Add(((ExpListContext)_localctx).expression.state)
					          		_localctx.l = ((ExpListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(117);
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
		public ValueContext value;
		public ExpOpContext expOp;
		public ExpressionContext rightExp;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpOpContext expOp() {
			return getRuleContext(ExpOpContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			{
			setState(119);
			((ExpressionContext)_localctx).value = value();
			 
					sym := ((ExpressionContext)_localctx).value.state
					_localctx.state = I.Expression{
						Value: &sym, 
						Left: nil, 
						Right: nil, 
						Operation: I.NOOP,
					} 
				
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					((ExpressionContext)_localctx).expOp = expOp();
					setState(124);
					((ExpressionContext)_localctx).rightExp = expression(3);

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
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public ExpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOp; }
	}

	public final ExpOpContext expOp() throws RecognitionException {
		ExpOpContext _localctx = new ExpOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expOp);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(MUL);
					
						_localctx.state = I.MUL 
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(DIV);
					
						_localctx.state = I.DIV 
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(MOD);
					
						_localctx.state = I.MOD 
					
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(ADD);
					
						_localctx.state = I.ADD 
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(SUB);
					
						_localctx.state = I.SUB 
					
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(I64);
				 
						_localctx.state = I.INTEGER 
					
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(F64);
				 
						_localctx.state = I.FLOAT 
					
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(BOOL);
				 
						_localctx.state = I.BOOL 
					
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(CHARTYPE);
				 
						_localctx.state = I.CHAR 
					
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(STR);
				 
						_localctx.state = I.STR 
					
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
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
		public MethodsContext methods;
		public FunctionCallContext functionCall;
		public TerminalNode NUMBER() { return getToken(DBRustParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(DBRustParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DBRustParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(DBRustParser.CHAR, 0); }
		public TerminalNode BFALSE() { return getToken(DBRustParser.BFALSE, 0); }
		public TerminalNode BTRUE() { return getToken(DBRustParser.BTRUE, 0); }
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 
						_localctx.state = I.Value{ (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getLine():0), ((ValueContext)_localctx).NUMBER.GetColumn(), I.INTEGER, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null) } 
					
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					
						_localctx.state = I.Value{ (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getLine():0), ((ValueContext)_localctx).FLOAT.GetColumn(), I.FLOAT, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null) } 
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((ValueContext)_localctx).STRING = match(STRING);
				 
						_localctx.state = I.Value{ (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getLine():0), ((ValueContext)_localctx).STRING.GetColumn(), I.STRING, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1] } 
					
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 
						_localctx.state = I.Value{ (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getLine():0), ((ValueContext)_localctx).CHAR.GetColumn(), I.CHAR, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1] } 
					
				}
				break;
			case BFALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 
						_localctx.state = I.Value{ (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getLine():0), ((ValueContext)_localctx).BFALSE.GetColumn(), I.BOOL, (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getText():null) } 
					
				}
				break;
			case BTRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 
						_localctx.state = I.Value{ (((ValueContext)_localctx).BTRUE!=null?((ValueContext)_localctx).BTRUE.getLine():0), ((ValueContext)_localctx).BTRUE.GetColumn(), I.BOOL, (((ValueContext)_localctx).BTRUE!=null?((ValueContext)_localctx).BTRUE.getText():null) } 
					
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				((ValueContext)_localctx).methods = methods();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).methods.state;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				((ValueContext)_localctx).functionCall = functionCall();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).functionCall.state;
					
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(179);
				match(OPENPAR);
				setState(180);
				((FunctionCallContext)_localctx).expList = expList(0);
				setState(181);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn(), I.VOID, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null) }, ((FunctionCallContext)_localctx).expList.l.ToArray() }
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(185);
				match(OPENPAR);
				setState(186);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn(), I.VOID, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null) }, make([]interface{}, 0) }
					
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
			setState(190);
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
			setState(193);
			((PrintlnCallContext)_localctx).PRINTLN = match(PRINTLN);
			setState(194);
			match(OPENPAR);
			setState(195);
			((PrintlnCallContext)_localctx).expList = expList(0);
			setState(196);
			match(CLOSEPAR);

					_localctx.state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ ((PrintlnCallContext)_localctx).PRINTLN.GetLine(), ((PrintlnCallContext)_localctx).PRINTLN.GetColumn(), I.VOID, "Println" }, ((PrintlnCallContext)_localctx).expList.l.ToArray() } }
				
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
		public Token ID;
		public ExpListContext expList;
		public InstructionsBlockContext instructionsBlock;
		public ValueTypeContext valueType;
		public TerminalNode FN() { return getToken(DBRustParser.FN, 0); }
		public TerminalNode ID() { return getToken(DBRustParser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
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
		enterRule(_localctx, 28, RULE_function);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(FN);
				setState(200);
				((FunctionContext)_localctx).ID = match(ID);
				setState(201);
				match(OPENPAR);
				setState(202);
				((FunctionContext)_localctx).expList = expList(0);
				setState(203);
				match(CLOSEPAR);
				setState(204);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).expList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FN);
				setState(208);
				((FunctionContext)_localctx).ID = match(ID);
				setState(209);
				match(OPENPAR);
				setState(210);
				((FunctionContext)_localctx).expList = expList(0);
				setState(211);
				match(CLOSEPAR);
				setState(212);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();
				setState(213);
				match(ARROW);
				setState(214);
				((FunctionContext)_localctx).valueType = valueType();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{"Function"}, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).expList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state };
					
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
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dc\n\20\3\20"+
		"\2\4\16\20\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00ea\2 \3"+
		"\2\2\2\4#\3\2\2\2\6+\3\2\2\2\bC\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16j\3\2"+
		"\2\2\20x\3\2\2\2\22\u0090\3\2\2\2\24\u009e\3\2\2\2\26\u00b2\3\2\2\2\30"+
		"\u00be\3\2\2\2\32\u00c0\3\2\2\2\34\u00c3\3\2\2\2\36\u00db\3\2\2\2 !\5"+
		"\6\4\2!\"\b\2\1\2\"\3\3\2\2\2#$\7\26\2\2$%\5\6\4\2%&\7\27\2\2&\'\b\3\1"+
		"\2\'\5\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2"+
		"\2\2-+\3\2\2\2./\b\4\1\2/\7\3\2\2\2\60\61\5\n\6\2\61\62\7\33\2\2\62\63"+
		"\b\5\1\2\63D\3\2\2\2\64\65\5\f\7\2\65\66\7\33\2\2\66\67\b\5\1\2\67D\3"+
		"\2\2\289\5\32\16\29:\7\33\2\2:;\b\5\1\2;D\3\2\2\2<=\5\30\r\2=>\7\33\2"+
		"\2>?\b\5\1\2?D\3\2\2\2@A\5\36\20\2AB\b\5\1\2BD\3\2\2\2C\60\3\2\2\2C\64"+
		"\3\2\2\2C8\3\2\2\2C<\3\2\2\2C@\3\2\2\2D\t\3\2\2\2EF\7\3\2\2FG\7\21\2\2"+
		"GH\7\32\2\2HI\5\24\13\2IJ\7\35\2\2JK\5\20\t\2KL\b\6\1\2Ld\3\2\2\2MN\7"+
		"\3\2\2NO\7\4\2\2OP\7\21\2\2PQ\7\32\2\2QR\5\24\13\2RS\7\35\2\2ST\5\20\t"+
		"\2TU\b\6\1\2Ud\3\2\2\2VW\7\3\2\2WX\7\4\2\2XY\7\21\2\2YZ\7\35\2\2Z[\5\20"+
		"\t\2[\\\b\6\1\2\\d\3\2\2\2]^\7\3\2\2^_\7\21\2\2_`\7\35\2\2`a\5\20\t\2"+
		"ab\b\6\1\2bd\3\2\2\2cE\3\2\2\2cM\3\2\2\2cV\3\2\2\2c]\3\2\2\2d\13\3\2\2"+
		"\2ef\7\21\2\2fg\7\35\2\2gh\5\20\t\2hi\b\7\1\2i\r\3\2\2\2jk\b\b\1\2kl\5"+
		"\20\t\2lm\b\b\1\2mu\3\2\2\2no\f\4\2\2op\7\34\2\2pq\5\20\t\2qr\b\b\1\2"+
		"rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2"+
		"\2xy\b\t\1\2yz\5\26\f\2z{\b\t\1\2{\u0083\3\2\2\2|}\f\4\2\2}~\5\22\n\2"+
		"~\177\5\20\t\5\177\u0080\b\t\1\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0087\7\36\2\2\u0087\u0091\b\n\1\2\u0088"+
		"\u0089\7\37\2\2\u0089\u0091\b\n\1\2\u008a\u008b\7 \2\2\u008b\u0091\b\n"+
		"\1\2\u008c\u008d\7!\2\2\u008d\u0091\b\n\1\2\u008e\u008f\7\"\2\2\u008f"+
		"\u0091\b\n\1\2\u0090\u0086\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008a\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093"+
		"\7\7\2\2\u0093\u009f\b\13\1\2\u0094\u0095\7\b\2\2\u0095\u009f\b\13\1\2"+
		"\u0096\u0097\7\t\2\2\u0097\u009f\b\13\1\2\u0098\u0099\7\n\2\2\u0099\u009f"+
		"\b\13\1\2\u009a\u009b\7\13\2\2\u009b\u009f\b\13\1\2\u009c\u009d\7\f\2"+
		"\2\u009d\u009f\b\13\1\2\u009e\u0092\3\2\2\2\u009e\u0094\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00b3\b\f\1\2\u00a2\u00a3"+
		"\7\16\2\2\u00a3\u00b3\b\f\1\2\u00a4\u00a5\7\17\2\2\u00a5\u00b3\b\f\1\2"+
		"\u00a6\u00a7\7\20\2\2\u00a7\u00b3\b\f\1\2\u00a8\u00a9\7\22\2\2\u00a9\u00b3"+
		"\b\f\1\2\u00aa\u00ab\7\23\2\2\u00ab\u00b3\b\f\1\2\u00ac\u00ad\5\32\16"+
		"\2\u00ad\u00ae\b\f\1\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\5\30\r\2\u00b0"+
		"\u00b1\b\f\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a2\3\2"+
		"\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\27\3\2\2"+
		"\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7\5\16\b\2\u00b7"+
		"\u00b8\7\25\2\2\u00b8\u00b9\b\r\1\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7"+
		"\21\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00bf\b\r\1\2"+
		"\u00be\u00b4\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00c1"+
		"\5\34\17\2\u00c1\u00c2\b\16\1\2\u00c2\33\3\2\2\2\u00c3\u00c4\7\5\2\2\u00c4"+
		"\u00c5\7\24\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8"+
		"\b\17\1\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7\21\2\2\u00cb"+
		"\u00cc\7\24\2\2\u00cc\u00cd\5\16\b\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf"+
		"\5\4\3\2\u00cf\u00d0\b\20\1\2\u00d0\u00dc\3\2\2\2\u00d1\u00d2\7\6\2\2"+
		"\u00d2\u00d3\7\21\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\5\16\b\2\u00d5"+
		"\u00d6\7\25\2\2\u00d6\u00d7\5\4\3\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\5"+
		"\24\13\2\u00d9\u00da\b\20\1\2\u00da\u00dc\3\2\2\2\u00db\u00c9\3\2\2\2"+
		"\u00db\u00d1\3\2\2\2\u00dc\37\3\2\2\2\f+Ccu\u0083\u0090\u009e\u00b2\u00be"+
		"\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}