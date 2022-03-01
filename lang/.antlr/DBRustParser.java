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
		LET=1, MUT=2, PRINTLN=3, I64=4, F64=5, BOOL=6, CHARTYPE=7, STR=8, STRCLASS=9, 
		NUMBER=10, FLOAT=11, STRING=12, CHAR=13, ID=14, BFALSE=15, BTRUE=16, OPENPAR=17, 
		CLOSEPAR=18, COLOM=19, SEMI=20, COMMA=21, EQUALS=22, MUL=23, DIV=24, MOD=25, 
		ADD=26, SUB=27, WHITESPACE=28;
	public static final int
		RULE_start = 0, RULE_instructions = 1, RULE_instruction = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_listValues = 5, RULE_expression = 6, RULE_expOp = 7, 
		RULE_valueType = 8, RULE_value = 9, RULE_functions = 10, RULE_printlnCall = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructions", "instruction", "declaration", "assignment", 
			"listValues", "expression", "expOp", "valueType", "value", "functions", 
			"printlnCall"
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
			setState(24);
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
		enterRule(_localctx, 2, RULE_instructions);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(27);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(32);
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
		public FunctionsContext fn;
		public TerminalNode SEMI() { return getToken(DBRustParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((InstructionContext)_localctx).decltn = declaration();
				setState(36);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((InstructionContext)_localctx).assign = assignment();
				setState(40);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((InstructionContext)_localctx).fn = functions();
				setState(44);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).fn.state 
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
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(LET);
				setState(50);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(51);
				match(COLOM);
				setState(52);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(53);
				match(EQUALS);
				setState(54);
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
				setState(57);
				match(LET);
				setState(58);
				match(MUT);
				setState(59);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(60);
				match(COLOM);
				setState(61);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(62);
				match(EQUALS);
				setState(63);
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
				setState(66);
				match(LET);
				setState(67);
				match(MUT);
				setState(68);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(69);
				match(EQUALS);
				setState(70);
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
				setState(73);
				match(LET);
				setState(74);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(75);
				match(EQUALS);
				setState(76);
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
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(82);
			match(EQUALS);
			setState(83);
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

	public static class ListValuesContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListValuesContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBRustParser.COMMA, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public ListValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValues; }
	}

	public final ListValuesContext listValues() throws RecognitionException {
		return listValues(0);
	}

	private ListValuesContext listValues(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListValuesContext _localctx = new ListValuesContext(_ctx, _parentState);
		ListValuesContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_listValues, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			((ListValuesContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ListValuesContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListValuesContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listValues);
					setState(90);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(91);
					match(COMMA);
					setState(92);
					((ListValuesContext)_localctx).expression = expression(0);
					 
					          		((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.state)
					          		_localctx.l = ((ListValuesContext)_localctx).list.l
					            
					}
					} 
				}
				setState(99);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
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
			setState(111);
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
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					((ExpressionContext)_localctx).expOp = expOp();
					setState(106);
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
				setState(113);
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
		enterRule(_localctx, 14, RULE_expOp);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(MUL);
					_localctx.state = I.MUL 
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(DIV);
					_localctx.state = I.DIV 
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(MOD);
					_localctx.state = I.MOD 
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(ADD);
					_localctx.state = I.ADD 
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
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
		enterRule(_localctx, 16, RULE_valueType);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(I64);
				 _localctx.state = I.INTEGER 
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(F64);
				 _localctx.state = I.FLOAT 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(BOOL);
				 _localctx.state = I.BOOL 
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(CHARTYPE);
				 _localctx.state = I.CHAR 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(STR);
				 _localctx.state = I.STR 
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
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
		public I.Value state;
		public Token NUMBER;
		public Token FLOAT;
		public Token STRING;
		public Token CHAR;
		public Token BFALSE;
		public Token BTRUE;
		public TerminalNode NUMBER() { return getToken(DBRustParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(DBRustParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DBRustParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(DBRustParser.CHAR, 0); }
		public TerminalNode BFALSE() { return getToken(DBRustParser.BFALSE, 0); }
		public TerminalNode BTRUE() { return getToken(DBRustParser.BTRUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getLine():0), ((ValueContext)_localctx).NUMBER.GetColumn(), I.INTEGER, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null) } 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					_localctx.state = I.Value{ (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getLine():0), ((ValueContext)_localctx).FLOAT.GetColumn(), I.FLOAT, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null) } 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				((ValueContext)_localctx).STRING = match(STRING);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getLine():0), ((ValueContext)_localctx).STRING.GetColumn(), I.STRING, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1] } 
						
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getLine():0), ((ValueContext)_localctx).CHAR.GetColumn(), I.CHAR, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1] } 
						
				}
				break;
			case BFALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getLine():0), ((ValueContext)_localctx).BFALSE.GetColumn(), I.BOOL, (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getText():null) } 
				}
				break;
			case BTRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).BTRUE!=null?((ValueContext)_localctx).BTRUE.getLine():0), ((ValueContext)_localctx).BTRUE.GetColumn(), I.BOOL, (((ValueContext)_localctx).BTRUE!=null?((ValueContext)_localctx).BTRUE.getText():null) } 
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

	public static class FunctionsContext extends ParserRuleContext {
		public I.IFunctionCall state;
		public PrintlnCallContext printlnCall;
		public PrintlnCallContext printlnCall() {
			return getRuleContext(PrintlnCallContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((FunctionsContext)_localctx).printlnCall = printlnCall();
			 _localctx.state = ((FunctionsContext)_localctx).printlnCall.state 
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
		public I.IFunctionCall state;
		public ListValuesContext listValues;
		public TerminalNode PRINTLN() { return getToken(DBRustParser.PRINTLN, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public PrintlnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnCall; }
	}

	public final PrintlnCallContext printlnCall() throws RecognitionException {
		PrintlnCallContext _localctx = new PrintlnCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printlnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PRINTLN);
			setState(158);
			match(OPENPAR);
			setState(159);
			((PrintlnCallContext)_localctx).listValues = listValues(0);
			setState(160);
			match(CLOSEPAR);

					_localctx.state = I.PrintlnCall{ I.FunctionCall{ "PrintLn", ((PrintlnCallContext)_localctx).listValues.l.ToArray() } }
				
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
		case 5:
			return listValues_sempred((ListValuesContext)_localctx, predIndex);
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listValues_sempred(ListValuesContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\2\4\f\16\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00af\2\32\3\2\2\2"+
		"\4 \3\2\2\2\6\61\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fX\3\2\2\2\16f\3\2\2\2"+
		"\20~\3\2\2\2\22\u008c\3\2\2\2\24\u009a\3\2\2\2\26\u009c\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\33\5\4\3\2\33\34\b\2\1\2\34\3\3\2\2\2\35\37\5\6\4\2\36\35"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\b\3"+
		"\1\2$\5\3\2\2\2%&\5\b\5\2&\'\7\26\2\2\'(\b\4\1\2(\62\3\2\2\2)*\5\n\6\2"+
		"*+\7\26\2\2+,\b\4\1\2,\62\3\2\2\2-.\5\26\f\2./\7\26\2\2/\60\b\4\1\2\60"+
		"\62\3\2\2\2\61%\3\2\2\2\61)\3\2\2\2\61-\3\2\2\2\62\7\3\2\2\2\63\64\7\3"+
		"\2\2\64\65\7\20\2\2\65\66\7\25\2\2\66\67\5\22\n\2\678\7\30\2\289\5\16"+
		"\b\29:\b\5\1\2:R\3\2\2\2;<\7\3\2\2<=\7\4\2\2=>\7\20\2\2>?\7\25\2\2?@\5"+
		"\22\n\2@A\7\30\2\2AB\5\16\b\2BC\b\5\1\2CR\3\2\2\2DE\7\3\2\2EF\7\4\2\2"+
		"FG\7\20\2\2GH\7\30\2\2HI\5\16\b\2IJ\b\5\1\2JR\3\2\2\2KL\7\3\2\2LM\7\20"+
		"\2\2MN\7\30\2\2NO\5\16\b\2OP\b\5\1\2PR\3\2\2\2Q\63\3\2\2\2Q;\3\2\2\2Q"+
		"D\3\2\2\2QK\3\2\2\2R\t\3\2\2\2ST\7\20\2\2TU\7\30\2\2UV\5\16\b\2VW\b\6"+
		"\1\2W\13\3\2\2\2XY\b\7\1\2YZ\5\16\b\2Z[\b\7\1\2[c\3\2\2\2\\]\f\4\2\2]"+
		"^\7\27\2\2^_\5\16\b\2_`\b\7\1\2`b\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\r\3\2\2\2ec\3\2\2\2fg\b\b\1\2gh\5\24\13\2hi\b\b\1\2iq\3"+
		"\2\2\2jk\f\4\2\2kl\5\20\t\2lm\5\16\b\5mn\b\b\1\2np\3\2\2\2oj\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\7\31\2\2u\177\b"+
		"\t\1\2vw\7\32\2\2w\177\b\t\1\2xy\7\33\2\2y\177\b\t\1\2z{\7\34\2\2{\177"+
		"\b\t\1\2|}\7\35\2\2}\177\b\t\1\2~t\3\2\2\2~v\3\2\2\2~x\3\2\2\2~z\3\2\2"+
		"\2~|\3\2\2\2\177\21\3\2\2\2\u0080\u0081\7\6\2\2\u0081\u008d\b\n\1\2\u0082"+
		"\u0083\7\7\2\2\u0083\u008d\b\n\1\2\u0084\u0085\7\b\2\2\u0085\u008d\b\n"+
		"\1\2\u0086\u0087\7\t\2\2\u0087\u008d\b\n\1\2\u0088\u0089\7\n\2\2\u0089"+
		"\u008d\b\n\1\2\u008a\u008b\7\13\2\2\u008b\u008d\b\n\1\2\u008c\u0080\3"+
		"\2\2\2\u008c\u0082\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\7\f\2"+
		"\2\u008f\u009b\b\13\1\2\u0090\u0091\7\r\2\2\u0091\u009b\b\13\1\2\u0092"+
		"\u0093\7\16\2\2\u0093\u009b\b\13\1\2\u0094\u0095\7\17\2\2\u0095\u009b"+
		"\b\13\1\2\u0096\u0097\7\21\2\2\u0097\u009b\b\13\1\2\u0098\u0099\7\22\2"+
		"\2\u0099\u009b\b\13\1\2\u009a\u008e\3\2\2\2\u009a\u0090\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\25\3\2\2\2\u009c\u009d\5\30\r\2\u009d\u009e\b\f\1\2\u009e\27"+
		"\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5\f\7\2"+
		"\u00a2\u00a3\7\24\2\2\u00a3\u00a4\b\r\1\2\u00a4\31\3\2\2\2\n \61Qcq~\u008c"+
		"\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}