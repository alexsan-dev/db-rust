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
		LET=1, MUT=2, PRINTLN=3, FN=4, RETURN=5, IF=6, ELSE=7, I64=8, F64=9, BOOL=10, 
		CHARTYPE=11, STR=12, STRCLASS=13, BFALSE=14, BTRUE=15, NUMBER=16, FLOAT=17, 
		STRING=18, CHAR=19, ID=20, OPENPAR=21, CLOSEPAR=22, OPENBRACKET=23, CLOSEBRACKET=24, 
		ARROW=25, DOT=26, COLOM=27, SEMI=28, COMMA=29, MUL=30, DIV=31, MOD=32, 
		ADD=33, SUB=34, LESSOREQUALS=35, MINOR=36, MOREOREQUALS=37, MAJOR=38, 
		EQUALSEQUALS=39, NOTEQUALS=40, EQUALS=41, NOT=42, AND=43, OR=44, WHITESPACE=45;
	public static final int
		RULE_start = 0, RULE_instructionsBlock = 1, RULE_instructions = 2, RULE_instruction = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_expList = 6, RULE_expression = 7, 
		RULE_expOpAlgb1 = 8, RULE_expOpAlgb2 = 9, RULE_expOpRel1 = 10, RULE_valueType = 11, 
		RULE_value = 12, RULE_functionCall = 13, RULE_methods = 14, RULE_printlnCall = 15, 
		RULE_paramList = 16, RULE_param = 17, RULE_function = 18, RULE_returnValue = 19, 
		RULE_conditions = 20, RULE_conditionList = 21, RULE_elseIf = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructionsBlock", "instructions", "instruction", "declaration", 
			"assignment", "expList", "expression", "expOpAlgb1", "expOpAlgb2", "expOpRel1", 
			"valueType", "value", "functionCall", "methods", "printlnCall", "paramList", 
			"param", "function", "returnValue", "conditions", "conditionList", "elseIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'fn'", "'return'", "'if'", "'else'", 
			"'i64'", "'f64'", "'bool'", "'char'", "'&str'", "'String'", "'false'", 
			"'true'", null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'->'", 
			"'.'", "':'", "';'", "','", "'*'", "'/'", "'%'", "'+'", "'-'", "'<='", 
			"'<'", "'>='", "'>'", "'=='", "'!='", "'='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "FN", "RETURN", "IF", "ELSE", "I64", "F64", 
			"BOOL", "CHARTYPE", "STR", "STRCLASS", "BFALSE", "BTRUE", "NUMBER", "FLOAT", 
			"STRING", "CHAR", "ID", "OPENPAR", "CLOSEPAR", "OPENBRACKET", "CLOSEBRACKET", 
			"ARROW", "DOT", "COLOM", "SEMI", "COMMA", "MUL", "DIV", "MOD", "ADD", 
			"SUB", "LESSOREQUALS", "MINOR", "MOREOREQUALS", "MAJOR", "EQUALSEQUALS", 
			"NOTEQUALS", "EQUALS", "NOT", "AND", "OR", "WHITESPACE"
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
			setState(46);
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
			setState(49);
			match(OPENBRACKET);
			setState(50);
			((InstructionsBlockContext)_localctx).instructions = instructions();
			setState(51);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << FN) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(54);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(59);
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
		public ConditionsContext cdtn;
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
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((InstructionContext)_localctx).decltn = declaration();
				setState(63);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((InstructionContext)_localctx).calls = functionCall();
				setState(67);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).calls.state 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				((InstructionContext)_localctx).assign = assignment();
				setState(71);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				((InstructionContext)_localctx).mth = methods();
				setState(75);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).mth.state 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				((InstructionContext)_localctx).fn = function();
				 _localctx.state = ((InstructionContext)_localctx).fn.state 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				((InstructionContext)_localctx).rtn = returnValue();
				setState(82);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).rtn.state 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				((InstructionContext)_localctx).cdtn = conditions();
				 _localctx.state  = ((InstructionContext)_localctx).cdtn.state 
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(LET);
				setState(91);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(92);
				match(COLOM);
				setState(93);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(94);
				match(EQUALS);
				setState(95);
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
				setState(98);
				match(LET);
				setState(99);
				match(MUT);
				setState(100);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(101);
				match(COLOM);
				setState(102);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(103);
				match(EQUALS);
				setState(104);
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
				setState(107);
				match(LET);
				setState(108);
				match(MUT);
				setState(109);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(110);
				match(EQUALS);
				setState(111);
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
				setState(114);
				match(LET);
				setState(115);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(116);
				match(EQUALS);
				setState(117);
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
			setState(122);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(123);
			match(EQUALS);
			setState(124);
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
			setState(128);
			((ExpListContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ExpListContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
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
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					match(COMMA);
					setState(133);
					((ExpListContext)_localctx).expression = expression(0);
					 
					          		((ExpListContext)_localctx).list.l.Add(((ExpListContext)_localctx).expression.state)
					          		_localctx.l = ((ExpListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(140);
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
		public ExpOpAlgb1Context expOpAlgb1;
		public ExpressionContext rightExp;
		public ExpOpAlgb2Context expOpAlgb2;
		public ExpOpRel1Context expOpRel1;
		public TerminalNode OPENPAR() { return getToken(DBRustParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(DBRustParser.CLOSEPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DBRustParser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpOpAlgb1Context expOpAlgb1() {
			return getRuleContext(ExpOpAlgb1Context.class,0);
		}
		public ExpOpAlgb2Context expOpAlgb2() {
			return getRuleContext(ExpOpAlgb2Context.class,0);
		}
		public ExpOpRel1Context expOpRel1() {
			return getRuleContext(ExpOpRel1Context.class,0);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAR:
				{
				setState(142);
				match(OPENPAR);
				setState(143);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(144);
				match(CLOSEPAR);

						_localctx.state = ((ExpressionContext)_localctx).exp.state
					
				}
				break;
			case NOT:
				{
				setState(147);
				match(NOT);
				setState(148);
				((ExpressionContext)_localctx).exp = expression(2);

						exp := ((ExpressionContext)_localctx).exp.state
						_localctx.state = I.Expression{ 
							Value: nil, 
							Left: &exp,
							Right: nil, 
							Operation: I.UNOT,
						} 
					
				}
				break;
			case PRINTLN:
			case IF:
			case BFALSE:
			case BTRUE:
			case NUMBER:
			case FLOAT:
			case STRING:
			case CHAR:
			case ID:
				{
				setState(151);
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
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExp = _prevctx;
						_localctx.leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						((ExpressionContext)_localctx).expOpAlgb1 = expOpAlgb1();
						setState(158);
						((ExpressionContext)_localctx).rightExp = expression(7);

						          		left, right := ((ExpressionContext)_localctx).leftExp.state, ((ExpressionContext)_localctx).rightExp.state;
						          		_localctx.state = I.Expression{ 
						          			Value: nil, 
						          			Left: &left,
						          			Right: &right, 
						          			Operation: ((ExpressionContext)_localctx).expOpAlgb1.state,
						          		} 
						          	
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExp = _prevctx;
						_localctx.leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						((ExpressionContext)_localctx).expOpAlgb2 = expOpAlgb2();
						setState(163);
						((ExpressionContext)_localctx).rightExp = expression(6);

						          		left, right := ((ExpressionContext)_localctx).leftExp.state, ((ExpressionContext)_localctx).rightExp.state;
						          		_localctx.state = I.Expression{ 
						          			Value: nil, 
						          			Left: &left,
						          			Right: &right, 
						          			Operation: ((ExpressionContext)_localctx).expOpAlgb2.state,
						          		} 
						          		
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExp = _prevctx;
						_localctx.leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						((ExpressionContext)_localctx).expOpRel1 = expOpRel1();
						setState(168);
						((ExpressionContext)_localctx).rightExp = expression(5);

						          		left, right := ((ExpressionContext)_localctx).leftExp.state, ((ExpressionContext)_localctx).rightExp.state;
						          		_localctx.state = I.Expression{ 
						          			Value: nil, 
						          			Left: &left,
						          			Right: &right, 
						          			Operation: ((ExpressionContext)_localctx).expOpRel1.state,
						          		} 
						          	
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExpOpAlgb1Context extends ParserRuleContext {
		public I.Operation state;
		public TerminalNode MUL() { return getToken(DBRustParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DBRustParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DBRustParser.MOD, 0); }
		public ExpOpAlgb1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOpAlgb1; }
	}

	public final ExpOpAlgb1Context expOpAlgb1() throws RecognitionException {
		ExpOpAlgb1Context _localctx = new ExpOpAlgb1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expOpAlgb1);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(MUL);
					
						_localctx.state = I.MUL 
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(DIV);
					
						_localctx.state = I.DIV 
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(MOD);
					
						_localctx.state = I.MOD 
					
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

	public static class ExpOpAlgb2Context extends ParserRuleContext {
		public I.Operation state;
		public TerminalNode ADD() { return getToken(DBRustParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DBRustParser.SUB, 0); }
		public ExpOpAlgb2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOpAlgb2; }
	}

	public final ExpOpAlgb2Context expOpAlgb2() throws RecognitionException {
		ExpOpAlgb2Context _localctx = new ExpOpAlgb2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expOpAlgb2);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(ADD);
					
						_localctx.state = I.ADD 
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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

	public static class ExpOpRel1Context extends ParserRuleContext {
		public I.Operation state;
		public TerminalNode NOTEQUALS() { return getToken(DBRustParser.NOTEQUALS, 0); }
		public TerminalNode MOREOREQUALS() { return getToken(DBRustParser.MOREOREQUALS, 0); }
		public TerminalNode LESSOREQUALS() { return getToken(DBRustParser.LESSOREQUALS, 0); }
		public TerminalNode EQUALSEQUALS() { return getToken(DBRustParser.EQUALSEQUALS, 0); }
		public TerminalNode MAJOR() { return getToken(DBRustParser.MAJOR, 0); }
		public TerminalNode MINOR() { return getToken(DBRustParser.MINOR, 0); }
		public TerminalNode AND() { return getToken(DBRustParser.AND, 0); }
		public TerminalNode OR() { return getToken(DBRustParser.OR, 0); }
		public ExpOpRel1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOpRel1; }
	}

	public final ExpOpRel1Context expOpRel1() throws RecognitionException {
		ExpOpRel1Context _localctx = new ExpOpRel1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expOpRel1);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTEQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(NOTEQUALS);
					
						_localctx.state = I.NOTEQUALS 
					
				}
				break;
			case MOREOREQUALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(MOREOREQUALS);
					
						_localctx.state = I.MOREOREQUALS 
					
				}
				break;
			case LESSOREQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(LESSOREQUALS);
					
						_localctx.state = I.LESSOREQUALS 
					
				}
				break;
			case EQUALSEQUALS:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(EQUALSEQUALS);
					
						_localctx.state = I.EQUALSEQUALS 
					
				}
				break;
			case MAJOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(MAJOR);
					
						_localctx.state = I.MAJOR 
					
				}
				break;
			case MINOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(MINOR);
					
						_localctx.state = I.MINOR 
					
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(AND);
					
						_localctx.state = I.AND 
					
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(OR);
					
						_localctx.state = I.OR 
					
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
		enterRule(_localctx, 22, RULE_valueType);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(I64);
				 
						_localctx.state = I.INTEGER 
					
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(F64);
				 
						_localctx.state = I.FLOAT 
					
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(BOOL);
				 
						_localctx.state = I.BOOL 
					
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(CHARTYPE);
				 
						_localctx.state = I.CHAR 
					
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(STR);
				 
						_localctx.state = I.STR 
					
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
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
		public ConditionsContext conditions;
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
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 
						_localctx.state = I.Value{ I.Token{ "NUMBER", ((ValueContext)_localctx).NUMBER.GetLine(), ((ValueContext)_localctx).NUMBER.GetColumn() }, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null), I.INTEGER } 
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					
						_localctx.state = I.Value{ I.Token{ "FLOAT", ((ValueContext)_localctx).FLOAT.GetLine(), ((ValueContext)_localctx).FLOAT.GetColumn() }, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null), I.FLOAT } 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				((ValueContext)_localctx).STRING = match(STRING);
				 
						_localctx.state = I.Value{ I.Token{ "SRING", ((ValueContext)_localctx).STRING.GetLine(), ((ValueContext)_localctx).STRING.GetColumn() }, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1], I.STR } 
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 
						_localctx.state = I.Value{ I.Token{ "CHAR", ((ValueContext)_localctx).CHAR.GetLine(), ((ValueContext)_localctx).CHAR.GetColumn() }, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1], I.CHAR } 
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 
						_localctx.state = I.Value{ I.Token{ "BFALSE", ((ValueContext)_localctx).BFALSE.GetLine(), ((ValueContext)_localctx).BFALSE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 
						_localctx.state = I.Value{ I.Token{ "BTRUE", ((ValueContext)_localctx).BTRUE.GetLine(), ((ValueContext)_localctx).BTRUE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				((ValueContext)_localctx).ID = match(ID);
				 
						_localctx.state = I.Value{ I.Token{ "ID", ((ValueContext)_localctx).ID.GetLine(), ((ValueContext)_localctx).ID.GetColumn() }, (((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null), I.ID } 
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				((ValueContext)_localctx).methods = methods();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).methods.state;
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				((ValueContext)_localctx).functionCall = functionCall();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).functionCall.state;
					
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				((ValueContext)_localctx).conditions = conditions();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).conditions.state;
					
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
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(248);
				match(OPENPAR);
				setState(249);
				((FunctionCallContext)_localctx).expList = expList(0);
				setState(250);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), ((FunctionCallContext)_localctx).expList.l.ToArray() }
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(254);
				match(OPENPAR);
				setState(255);
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
		enterRule(_localctx, 28, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 30, RULE_printlnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((PrintlnCallContext)_localctx).PRINTLN = match(PRINTLN);
			setState(263);
			match(OPENPAR);
			setState(264);
			((PrintlnCallContext)_localctx).expList = expList(0);
			setState(265);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			((ParamListContext)_localctx).param = param();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ParamListContext)_localctx).param.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					setState(272);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273);
					match(COMMA);
					setState(274);
					((ParamListContext)_localctx).param = param();
					 
					          		((ParamListContext)_localctx).list.l.Add(((ParamListContext)_localctx).param.state)
					          		_localctx.l = ((ParamListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((ParamContext)_localctx).ID = match(ID);
			setState(283);
			match(COLOM);
			setState(284);
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
		enterRule(_localctx, 36, RULE_function);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((FunctionContext)_localctx).FN = match(FN);
				setState(288);
				((FunctionContext)_localctx).ID = match(ID);
				setState(289);
				match(OPENPAR);
				setState(290);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(291);
				match(CLOSEPAR);
				setState(292);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((FunctionContext)_localctx).FN = match(FN);
				setState(296);
				((FunctionContext)_localctx).ID = match(ID);
				setState(297);
				match(OPENPAR);
				setState(298);
				match(CLOSEPAR);
				setState(299);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				((FunctionContext)_localctx).FN = match(FN);
				setState(303);
				((FunctionContext)_localctx).ID = match(ID);
				setState(304);
				match(OPENPAR);
				setState(305);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(306);
				match(CLOSEPAR);
				setState(307);
				match(ARROW);
				setState(308);
				((FunctionContext)_localctx).valueType = valueType();
				setState(309);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state, nil };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				((FunctionContext)_localctx).FN = match(FN);
				setState(313);
				((FunctionContext)_localctx).ID = match(ID);
				setState(314);
				match(OPENPAR);
				setState(315);
				match(CLOSEPAR);
				setState(316);
				match(ARROW);
				setState(317);
				((FunctionContext)_localctx).valueType = valueType();
				setState(318);
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
		enterRule(_localctx, 38, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ReturnValueContext)_localctx).RETURN = match(RETURN);
			setState(324);
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

	public static class ConditionsContext extends ParserRuleContext {
		public I.IfControl state;
		public Token IF;
		public ExpressionContext expression;
		public InstructionsBlockContext insBody;
		public ConditionListContext conditionList;
		public InstructionsBlockContext elseBody;
		public TerminalNode IF() { return getToken(DBRustParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionsBlockContext> instructionsBlock() {
			return getRuleContexts(InstructionsBlockContext.class);
		}
		public InstructionsBlockContext instructionsBlock(int i) {
			return getRuleContext(InstructionsBlockContext.class,i);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(DBRustParser.ELSE, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditions);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(328);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(329);
				((ConditionsContext)_localctx).insBody = instructionsBlock();

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), make([]interface{}, 0) };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(333);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(334);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(335);
				((ConditionsContext)_localctx).conditionList = conditionList(0);

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), ((ConditionsContext)_localctx).conditionList.l.ToArray(), make([]interface{}, 0) };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(339);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(340);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(341);
				match(ELSE);
				setState(342);
				((ConditionsContext)_localctx).elseBody = instructionsBlock();

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), ((ConditionsContext)_localctx).elseBody.l.ToArray() };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(346);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(347);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(348);
				((ConditionsContext)_localctx).conditionList = conditionList(0);
				setState(349);
				match(ELSE);
				setState(350);
				((ConditionsContext)_localctx).elseBody = instructionsBlock();

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), ((ConditionsContext)_localctx).conditionList.l.ToArray(), ((ConditionsContext)_localctx).elseBody.l.ToArray() };
					
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

	public static class ConditionListContext extends ParserRuleContext {
		public *arrayList.List l;
		public ConditionListContext list;
		public ElseIfContext elseIf;
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public ConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionList; }
	}

	public final ConditionListContext conditionList() throws RecognitionException {
		return conditionList(0);
	}

	private ConditionListContext conditionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionListContext _localctx = new ConditionListContext(_ctx, _parentState);
		ConditionListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_conditionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			((ConditionListContext)_localctx).elseIf = elseIf();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ConditionListContext)_localctx).elseIf.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionListContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conditionList);
					setState(359);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(360);
					((ConditionListContext)_localctx).elseIf = elseIf();
					 
					          		((ConditionListContext)_localctx).list.l.Add(((ConditionListContext)_localctx).elseIf.state)
					          		_localctx.l = ((ConditionListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ElseIfContext extends ParserRuleContext {
		public I.IfControlFallBack state;
		public Token IF;
		public ExpressionContext expression;
		public InstructionsBlockContext instructionsBlock;
		public TerminalNode ELSE() { return getToken(DBRustParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DBRustParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ELSE);
			setState(369);
			((ElseIfContext)_localctx).IF = match(IF);
			setState(370);
			((ElseIfContext)_localctx).expression = expression(0);
			setState(371);
			((ElseIfContext)_localctx).instructionsBlock = instructionsBlock();

					((ElseIfContext)_localctx).state =  I.IfControlFallBack{ I.Token{ "ElseIf", ((ElseIfContext)_localctx).IF.GetLine(), ((ElseIfContext)_localctx).IF.GetColumn() }, ((ElseIfContext)_localctx).expression.state, ((ElseIfContext)_localctx).instructionsBlock.l.ToArray() };
				
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
		case 16:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 21:
			return conditionList_sempred((ConditionListContext)_localctx, predIndex);
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
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditionList_sempred(ConditionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00b9\n\n\3\13\3\13\3\13\3\13\5\13\u00bf\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d1"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f8\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0118\n\22\f\22\16\22\u011b\13\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0144\n\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0164\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u016e\n\27\f\27\16\27\u0171\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\6\16\20\",\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u0192\2\60\3\2\2\2\4\63\3\2\2"+
		"\2\6;\3\2\2\2\bZ\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0081\3\2\2\2\20\u009c"+
		"\3\2\2\2\22\u00b8\3\2\2\2\24\u00be\3\2\2\2\26\u00d0\3\2\2\2\30\u00de\3"+
		"\2\2\2\32\u00f7\3\2\2\2\34\u0103\3\2\2\2\36\u0105\3\2\2\2 \u0108\3\2\2"+
		"\2\"\u010e\3\2\2\2$\u011c\3\2\2\2&\u0143\3\2\2\2(\u0145\3\2\2\2*\u0163"+
		"\3\2\2\2,\u0165\3\2\2\2.\u0172\3\2\2\2\60\61\5\6\4\2\61\62\b\2\1\2\62"+
		"\3\3\2\2\2\63\64\7\31\2\2\64\65\5\6\4\2\65\66\7\32\2\2\66\67\b\3\1\2\67"+
		"\5\3\2\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2"+
		"=;\3\2\2\2>?\b\4\1\2?\7\3\2\2\2@A\5\n\6\2AB\7\36\2\2BC\b\5\1\2C[\3\2\2"+
		"\2DE\5\34\17\2EF\7\36\2\2FG\b\5\1\2G[\3\2\2\2HI\5\f\7\2IJ\7\36\2\2JK\b"+
		"\5\1\2K[\3\2\2\2LM\5\36\20\2MN\7\36\2\2NO\b\5\1\2O[\3\2\2\2PQ\5&\24\2"+
		"QR\b\5\1\2R[\3\2\2\2ST\5(\25\2TU\7\36\2\2UV\b\5\1\2V[\3\2\2\2WX\5*\26"+
		"\2XY\b\5\1\2Y[\3\2\2\2Z@\3\2\2\2ZD\3\2\2\2ZH\3\2\2\2ZL\3\2\2\2ZP\3\2\2"+
		"\2ZS\3\2\2\2ZW\3\2\2\2[\t\3\2\2\2\\]\7\3\2\2]^\7\26\2\2^_\7\35\2\2_`\5"+
		"\30\r\2`a\7+\2\2ab\5\20\t\2bc\b\6\1\2c{\3\2\2\2de\7\3\2\2ef\7\4\2\2fg"+
		"\7\26\2\2gh\7\35\2\2hi\5\30\r\2ij\7+\2\2jk\5\20\t\2kl\b\6\1\2l{\3\2\2"+
		"\2mn\7\3\2\2no\7\4\2\2op\7\26\2\2pq\7+\2\2qr\5\20\t\2rs\b\6\1\2s{\3\2"+
		"\2\2tu\7\3\2\2uv\7\26\2\2vw\7+\2\2wx\5\20\t\2xy\b\6\1\2y{\3\2\2\2z\\\3"+
		"\2\2\2zd\3\2\2\2zm\3\2\2\2zt\3\2\2\2{\13\3\2\2\2|}\7\26\2\2}~\7+\2\2~"+
		"\177\5\20\t\2\177\u0080\b\7\1\2\u0080\r\3\2\2\2\u0081\u0082\b\b\1\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\b\b\1\2\u0084\u008c\3\2\2\2\u0085\u0086\f"+
		"\4\2\2\u0086\u0087\7\37\2\2\u0087\u0088\5\20\t\2\u0088\u0089\b\b\1\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\b\t\1\2\u0090\u0091\7\27\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\30\2"+
		"\2\u0093\u0094\b\t\1\2\u0094\u009d\3\2\2\2\u0095\u0096\7,\2\2\u0096\u0097"+
		"\5\20\t\4\u0097\u0098\b\t\1\2\u0098\u009d\3\2\2\2\u0099\u009a\5\32\16"+
		"\2\u009a\u009b\b\t\1\2\u009b\u009d\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0095"+
		"\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00af\3\2\2\2\u009e\u009f\f\b\2\2\u009f"+
		"\u00a0\5\22\n\2\u00a0\u00a1\5\20\t\t\u00a1\u00a2\b\t\1\2\u00a2\u00ae\3"+
		"\2\2\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\5\20\t\b"+
		"\u00a6\u00a7\b\t\1\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\f\6\2\2\u00a9\u00aa"+
		"\5\26\f\2\u00aa\u00ab\5\20\t\7\u00ab\u00ac\b\t\1\2\u00ac\u00ae\3\2\2\2"+
		"\u00ad\u009e\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\21\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7 \2\2\u00b3\u00b9\b\n\1\2\u00b4\u00b5\7!\2"+
		"\2\u00b5\u00b9\b\n\1\2\u00b6\u00b7\7\"\2\2\u00b7\u00b9\b\n\1\2\u00b8\u00b2"+
		"\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\23\3\2\2\2\u00ba"+
		"\u00bb\7#\2\2\u00bb\u00bf\b\13\1\2\u00bc\u00bd\7$\2\2\u00bd\u00bf\b\13"+
		"\1\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00c1"+
		"\7*\2\2\u00c1\u00d1\b\f\1\2\u00c2\u00c3\7\'\2\2\u00c3\u00d1\b\f\1\2\u00c4"+
		"\u00c5\7%\2\2\u00c5\u00d1\b\f\1\2\u00c6\u00c7\7)\2\2\u00c7\u00d1\b\f\1"+
		"\2\u00c8\u00c9\7(\2\2\u00c9\u00d1\b\f\1\2\u00ca\u00cb\7&\2\2\u00cb\u00d1"+
		"\b\f\1\2\u00cc\u00cd\7-\2\2\u00cd\u00d1\b\f\1\2\u00ce\u00cf\7.\2\2\u00cf"+
		"\u00d1\b\f\1\2\u00d0\u00c0\3\2\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00c4\3\2"+
		"\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\n\2"+
		"\2\u00d3\u00df\b\r\1\2\u00d4\u00d5\7\13\2\2\u00d5\u00df\b\r\1\2\u00d6"+
		"\u00d7\7\f\2\2\u00d7\u00df\b\r\1\2\u00d8\u00d9\7\r\2\2\u00d9\u00df\b\r"+
		"\1\2\u00da\u00db\7\16\2\2\u00db\u00df\b\r\1\2\u00dc\u00dd\7\17\2\2\u00dd"+
		"\u00df\b\r\1\2\u00de\u00d2\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d6\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\31\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00f8\b\16\1\2\u00e2\u00e3\7\23"+
		"\2\2\u00e3\u00f8\b\16\1\2\u00e4\u00e5\7\24\2\2\u00e5\u00f8\b\16\1\2\u00e6"+
		"\u00e7\7\25\2\2\u00e7\u00f8\b\16\1\2\u00e8\u00e9\7\20\2\2\u00e9\u00f8"+
		"\b\16\1\2\u00ea\u00eb\7\21\2\2\u00eb\u00f8\b\16\1\2\u00ec\u00ed\7\26\2"+
		"\2\u00ed\u00f8\b\16\1\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\b\16\1\2\u00f0"+
		"\u00f8\3\2\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\b\16\1\2\u00f3\u00f8"+
		"\3\2\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\b\16\1\2\u00f6\u00f8\3\2\2\2"+
		"\u00f7\u00e0\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e6"+
		"\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\33\3\2\2"+
		"\2\u00f9\u00fa\7\26\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\5\16\b\2\u00fc"+
		"\u00fd\7\30\2\2\u00fd\u00fe\b\17\1\2\u00fe\u0104\3\2\2\2\u00ff\u0100\7"+
		"\26\2\2\u0100\u0101\7\27\2\2\u0101\u0102\7\30\2\2\u0102\u0104\b\17\1\2"+
		"\u0103\u00f9\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\35\3\2\2\2\u0105\u0106"+
		"\5 \21\2\u0106\u0107\b\20\1\2\u0107\37\3\2\2\2\u0108\u0109\7\5\2\2\u0109"+
		"\u010a\7\27\2\2\u010a\u010b\5\16\b\2\u010b\u010c\7\30\2\2\u010c\u010d"+
		"\b\21\1\2\u010d!\3\2\2\2\u010e\u010f\b\22\1\2\u010f\u0110\5$\23\2\u0110"+
		"\u0111\b\22\1\2\u0111\u0119\3\2\2\2\u0112\u0113\f\4\2\2\u0113\u0114\7"+
		"\37\2\2\u0114\u0115\5$\23\2\u0115\u0116\b\22\1\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0112\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a#\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\26\2\2\u011d\u011e"+
		"\7\35\2\2\u011e\u011f\5\30\r\2\u011f\u0120\b\23\1\2\u0120%\3\2\2\2\u0121"+
		"\u0122\7\6\2\2\u0122\u0123\7\26\2\2\u0123\u0124\7\27\2\2\u0124\u0125\5"+
		"\"\22\2\u0125\u0126\7\30\2\2\u0126\u0127\5\4\3\2\u0127\u0128\b\24\1\2"+
		"\u0128\u0144\3\2\2\2\u0129\u012a\7\6\2\2\u012a\u012b\7\26\2\2\u012b\u012c"+
		"\7\27\2\2\u012c\u012d\7\30\2\2\u012d\u012e\5\4\3\2\u012e\u012f\b\24\1"+
		"\2\u012f\u0144\3\2\2\2\u0130\u0131\7\6\2\2\u0131\u0132\7\26\2\2\u0132"+
		"\u0133\7\27\2\2\u0133\u0134\5\"\22\2\u0134\u0135\7\30\2\2\u0135\u0136"+
		"\7\33\2\2\u0136\u0137\5\30\r\2\u0137\u0138\5\4\3\2\u0138\u0139\b\24\1"+
		"\2\u0139\u0144\3\2\2\2\u013a\u013b\7\6\2\2\u013b\u013c\7\26\2\2\u013c"+
		"\u013d\7\27\2\2\u013d\u013e\7\30\2\2\u013e\u013f\7\33\2\2\u013f\u0140"+
		"\5\30\r\2\u0140\u0141\5\4\3\2\u0141\u0142\b\24\1\2\u0142\u0144\3\2\2\2"+
		"\u0143\u0121\3\2\2\2\u0143\u0129\3\2\2\2\u0143\u0130\3\2\2\2\u0143\u013a"+
		"\3\2\2\2\u0144\'\3\2\2\2\u0145\u0146\7\7\2\2\u0146\u0147\5\20\t\2\u0147"+
		"\u0148\b\25\1\2\u0148)\3\2\2\2\u0149\u014a\7\b\2\2\u014a\u014b\5\20\t"+
		"\2\u014b\u014c\5\4\3\2\u014c\u014d\b\26\1\2\u014d\u0164\3\2\2\2\u014e"+
		"\u014f\7\b\2\2\u014f\u0150\5\20\t\2\u0150\u0151\5\4\3\2\u0151\u0152\5"+
		",\27\2\u0152\u0153\b\26\1\2\u0153\u0164\3\2\2\2\u0154\u0155\7\b\2\2\u0155"+
		"\u0156\5\20\t\2\u0156\u0157\5\4\3\2\u0157\u0158\7\t\2\2\u0158\u0159\5"+
		"\4\3\2\u0159\u015a\b\26\1\2\u015a\u0164\3\2\2\2\u015b\u015c\7\b\2\2\u015c"+
		"\u015d\5\20\t\2\u015d\u015e\5\4\3\2\u015e\u015f\5,\27\2\u015f\u0160\7"+
		"\t\2\2\u0160\u0161\5\4\3\2\u0161\u0162\b\26\1\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0149\3\2\2\2\u0163\u014e\3\2\2\2\u0163\u0154\3\2\2\2\u0163\u015b\3\2"+
		"\2\2\u0164+\3\2\2\2\u0165\u0166\b\27\1\2\u0166\u0167\5.\30\2\u0167\u0168"+
		"\b\27\1\2\u0168\u016f\3\2\2\2\u0169\u016a\f\4\2\2\u016a\u016b\5.\30\2"+
		"\u016b\u016c\b\27\1\2\u016c\u016e\3\2\2\2\u016d\u0169\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170-\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\7\t\2\2\u0173\u0174\7\b\2\2\u0174\u0175\5\20"+
		"\t\2\u0175\u0176\5\4\3\2\u0176\u0177\b\30\1\2\u0177/\3\2\2\2\23;Zz\u008c"+
		"\u009c\u00ad\u00af\u00b8\u00be\u00d0\u00de\u00f7\u0103\u0119\u0143\u0163"+
		"\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}