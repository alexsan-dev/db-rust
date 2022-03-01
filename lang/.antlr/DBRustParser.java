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
		CLOSEPAR=18, COLOM=19, SEMI=20, EQUALS=21, MUL=22, DIV=23, MOD=24, ADD=25, 
		SUB=26, WHITESPACE=27;
	public static final int
		RULE_start = 0, RULE_instructions = 1, RULE_instruction = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_expression = 5, RULE_expOp = 6, RULE_valueType = 7, 
		RULE_value = 8, RULE_functions = 9, RULE_printlnCall = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructions", "instruction", "declaration", "assignment", 
			"expression", "expOp", "valueType", "value", "functions", "printlnCall"
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
			setState(22);
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(30);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((InstructionContext)_localctx).decltn = declaration();
				setState(34);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((InstructionContext)_localctx).assign = assignment();
				setState(38);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((InstructionContext)_localctx).fn = functions();
				setState(42);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(LET);
				setState(48);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(49);
				match(COLOM);
				setState(50);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(51);
				match(EQUALS);
				setState(52);
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
				setState(55);
				match(LET);
				setState(56);
				match(MUT);
				setState(57);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(58);
				match(COLOM);
				setState(59);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(60);
				match(EQUALS);
				setState(61);
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
				setState(64);
				match(LET);
				setState(65);
				match(MUT);
				setState(66);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(67);
				match(EQUALS);
				setState(68);
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
				setState(71);
				match(LET);
				setState(72);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(73);
				match(EQUALS);
				setState(74);
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
			setState(79);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(80);
			match(EQUALS);
			setState(81);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
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
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
					setState(88);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(89);
					((ExpressionContext)_localctx).expOp = expOp();
					setState(90);
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
				setState(97);
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
		enterRule(_localctx, 12, RULE_expOp);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(MUL);
					_localctx.state = I.MUL 
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(DIV);
					_localctx.state = I.DIV 
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(MOD);
					_localctx.state = I.MOD 
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(ADD);
					_localctx.state = I.ADD 
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
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
		enterRule(_localctx, 14, RULE_valueType);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(I64);
				 _localctx.state = I.INTEGER 
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(F64);
				 _localctx.state = I.FLOAT 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(BOOL);
				 _localctx.state = I.BOOL 
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(CHARTYPE);
				 _localctx.state = I.CHAR 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(STR);
				 _localctx.state = I.STR 
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
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
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getLine():0), ((ValueContext)_localctx).NUMBER.GetColumn(), I.INTEGER, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null) } 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					_localctx.state = I.Value{ (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getLine():0), ((ValueContext)_localctx).FLOAT.GetColumn(), I.FLOAT, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null) } 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				((ValueContext)_localctx).STRING = match(STRING);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getLine():0), ((ValueContext)_localctx).STRING.GetColumn(), I.STRING, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1] } 
						
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getLine():0), ((ValueContext)_localctx).CHAR.GetColumn(), I.CHAR, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1] } 
						
				}
				break;
			case BFALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 _localctx.state = I.Value{ (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getLine():0), ((ValueContext)_localctx).BFALSE.GetColumn(), I.BOOL, (((ValueContext)_localctx).BFALSE!=null?((ValueContext)_localctx).BFALSE.getText():null) } 
				}
				break;
			case BTRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
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
		enterRule(_localctx, 18, RULE_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(DBRustParser.PRINTLN, 0); }
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public PrintlnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnCall; }
	}

	public final PrintlnCallContext printlnCall() throws RecognitionException {
		PrintlnCallContext _localctx = new PrintlnCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printlnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(PRINTLN);
			setState(142);
			match(OPENPAR);
			setState(143);
			((PrintlnCallContext)_localctx).expression = expression(0);
			setState(144);
			match(CLOSEPAR);

					expPoint := ((PrintlnCallContext)_localctx).expression.state
					_localctx.state = I.PrintlnCall{ I.FunctionCall{ "PrintLn", []*I.Expression{&expPoint} } }
				
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u008b\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\3\f\r\2\4"+
		"\6\b\n\f\16\20\22\24\26\2\2\2\u009f\2\30\3\2\2\2\4\36\3\2\2\2\6/\3\2\2"+
		"\2\bO\3\2\2\2\nQ\3\2\2\2\fV\3\2\2\2\16n\3\2\2\2\20|\3\2\2\2\22\u008a\3"+
		"\2\2\2\24\u008c\3\2\2\2\26\u008f\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32"+
		"\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\3\1\2\"\5\3\2\2\2#$\5\b\5\2$%\7"+
		"\26\2\2%&\b\4\1\2&\60\3\2\2\2\'(\5\n\6\2()\7\26\2\2)*\b\4\1\2*\60\3\2"+
		"\2\2+,\5\24\13\2,-\7\26\2\2-.\b\4\1\2.\60\3\2\2\2/#\3\2\2\2/\'\3\2\2\2"+
		"/+\3\2\2\2\60\7\3\2\2\2\61\62\7\3\2\2\62\63\7\20\2\2\63\64\7\25\2\2\64"+
		"\65\5\20\t\2\65\66\7\27\2\2\66\67\5\f\7\2\678\b\5\1\28P\3\2\2\29:\7\3"+
		"\2\2:;\7\4\2\2;<\7\20\2\2<=\7\25\2\2=>\5\20\t\2>?\7\27\2\2?@\5\f\7\2@"+
		"A\b\5\1\2AP\3\2\2\2BC\7\3\2\2CD\7\4\2\2DE\7\20\2\2EF\7\27\2\2FG\5\f\7"+
		"\2GH\b\5\1\2HP\3\2\2\2IJ\7\3\2\2JK\7\20\2\2KL\7\27\2\2LM\5\f\7\2MN\b\5"+
		"\1\2NP\3\2\2\2O\61\3\2\2\2O9\3\2\2\2OB\3\2\2\2OI\3\2\2\2P\t\3\2\2\2QR"+
		"\7\20\2\2RS\7\27\2\2ST\5\f\7\2TU\b\6\1\2U\13\3\2\2\2VW\b\7\1\2WX\5\22"+
		"\n\2XY\b\7\1\2Ya\3\2\2\2Z[\f\4\2\2[\\\5\16\b\2\\]\5\f\7\5]^\b\7\1\2^`"+
		"\3\2\2\2_Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2"+
		"de\7\30\2\2eo\b\b\1\2fg\7\31\2\2go\b\b\1\2hi\7\32\2\2io\b\b\1\2jk\7\33"+
		"\2\2ko\b\b\1\2lm\7\34\2\2mo\b\b\1\2nd\3\2\2\2nf\3\2\2\2nh\3\2\2\2nj\3"+
		"\2\2\2nl\3\2\2\2o\17\3\2\2\2pq\7\6\2\2q}\b\t\1\2rs\7\7\2\2s}\b\t\1\2t"+
		"u\7\b\2\2u}\b\t\1\2vw\7\t\2\2w}\b\t\1\2xy\7\n\2\2y}\b\t\1\2z{\7\13\2\2"+
		"{}\b\t\1\2|p\3\2\2\2|r\3\2\2\2|t\3\2\2\2|v\3\2\2\2|x\3\2\2\2|z\3\2\2\2"+
		"}\21\3\2\2\2~\177\7\f\2\2\177\u008b\b\n\1\2\u0080\u0081\7\r\2\2\u0081"+
		"\u008b\b\n\1\2\u0082\u0083\7\16\2\2\u0083\u008b\b\n\1\2\u0084\u0085\7"+
		"\17\2\2\u0085\u008b\b\n\1\2\u0086\u0087\7\21\2\2\u0087\u008b\b\n\1\2\u0088"+
		"\u0089\7\22\2\2\u0089\u008b\b\n\1\2\u008a~\3\2\2\2\u008a\u0080\3\2\2\2"+
		"\u008a\u0082\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\b\13\1\2\u008e"+
		"\25\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0091\7\23\2\2\u0091\u0092\5\f\7"+
		"\2\u0092\u0093\7\24\2\2\u0093\u0094\b\f\1\2\u0094\27\3\2\2\2\t\36/Oan"+
		"|\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}