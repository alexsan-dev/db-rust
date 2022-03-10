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
		LET=1, MUT=2, PRINTLN=3, FN=4, RETURN=5, IF=6, ELSE=7, MATCH=8, I64=9, 
		F64=10, BOOL=11, CHARTYPE=12, STR=13, STRCLASS=14, UNDERSCORE=15, BFALSE=16, 
		BTRUE=17, NUMBER=18, FLOAT=19, STRING=20, CHAR=21, ID=22, OPENPAR=23, 
		CLOSEPAR=24, OPENBRACKET=25, CLOSEBRACKET=26, ARROW=27, DBLARROW=28, DOT=29, 
		COLOM=30, SEMI=31, COMMA=32, MUL=33, DIV=34, MOD=35, ADD=36, SUB=37, LESSOREQUALS=38, 
		MINOR=39, MOREOREQUALS=40, MAJOR=41, EQUALSEQUALS=42, NOTEQUALS=43, EQUALS=44, 
		NOT=45, AND=46, OR=47, WHITESPACE=48;
	public static final int
		RULE_start = 0, RULE_instructionsBlock = 1, RULE_instructions = 2, RULE_instruction = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_expList = 6, RULE_expression = 7, 
		RULE_expOpAlgb1 = 8, RULE_expOpAlgb2 = 9, RULE_expOpRel1 = 10, RULE_valueType = 11, 
		RULE_value = 12, RULE_functionCall = 13, RULE_methods = 14, RULE_printlnCall = 15, 
		RULE_paramList = 16, RULE_param = 17, RULE_function = 18, RULE_returnValue = 19, 
		RULE_conditions = 20, RULE_ternaryConditions = 21, RULE_conditionList = 22, 
		RULE_ternConditionList = 23, RULE_elseIf = 24, RULE_ternElseIf = 25, RULE_matchExp = 26, 
		RULE_matchCaseList = 27, RULE_matchCase = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instructionsBlock", "instructions", "instruction", "declaration", 
			"assignment", "expList", "expression", "expOpAlgb1", "expOpAlgb2", "expOpRel1", 
			"valueType", "value", "functionCall", "methods", "printlnCall", "paramList", 
			"param", "function", "returnValue", "conditions", "ternaryConditions", 
			"conditionList", "ternConditionList", "elseIf", "ternElseIf", "matchExp", 
			"matchCaseList", "matchCase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'mut'", "'println!'", "'fn'", "'return'", "'if'", "'else'", 
			"'match'", "'i64'", "'f64'", "'bool'", "'char'", "'&str'", "'String'", 
			"'_'", "'false'", "'true'", null, null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'->'", "'=>'", "'.'", "':'", "';'", "','", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'='", 
			"'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "MUT", "PRINTLN", "FN", "RETURN", "IF", "ELSE", "MATCH", 
			"I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", "UNDERSCORE", "BFALSE", 
			"BTRUE", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "OPENPAR", "CLOSEPAR", 
			"OPENBRACKET", "CLOSEBRACKET", "ARROW", "DBLARROW", "DOT", "COLOM", "SEMI", 
			"COMMA", "MUL", "DIV", "MOD", "ADD", "SUB", "LESSOREQUALS", "MINOR", 
			"MOREOREQUALS", "MAJOR", "EQUALSEQUALS", "NOTEQUALS", "EQUALS", "NOT", 
			"AND", "OR", "WHITESPACE"
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
			setState(58);
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
			setState(61);
			match(OPENBRACKET);
			setState(62);
			((InstructionsBlockContext)_localctx).instructions = instructions();
			setState(63);
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
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					((InstructionsContext)_localctx).instruction = instruction();
					((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public MatchExpContext mtch;
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
		public MatchExpContext matchExp() {
			return getRuleContext(MatchExpContext.class,0);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((InstructionContext)_localctx).decltn = declaration();
				setState(75);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).decltn.state 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((InstructionContext)_localctx).calls = functionCall();
				setState(79);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).calls.state 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				((InstructionContext)_localctx).assign = assignment();
				setState(83);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).assign.state 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				((InstructionContext)_localctx).mth = methods();
				setState(87);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).mth.state 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				((InstructionContext)_localctx).fn = function();
				 _localctx.state = ((InstructionContext)_localctx).fn.state 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				((InstructionContext)_localctx).rtn = returnValue();
				setState(94);
				match(SEMI);
				 _localctx.state = ((InstructionContext)_localctx).rtn.state 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				((InstructionContext)_localctx).cdtn = conditions();
				 _localctx.state  = ((InstructionContext)_localctx).cdtn.state 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				((InstructionContext)_localctx).mtch = matchExp();
				 _localctx.state = ((InstructionContext)_localctx).mtch.state 
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(LET);
				setState(106);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(107);
				match(COLOM);
				setState(108);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(109);
				match(EQUALS);
				setState(110);
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
				setState(113);
				match(LET);
				setState(114);
				match(MUT);
				setState(115);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(116);
				match(COLOM);
				setState(117);
				((DeclarationContext)_localctx).valueType = valueType();
				setState(118);
				match(EQUALS);
				setState(119);
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
				setState(122);
				match(LET);
				setState(123);
				match(MUT);
				setState(124);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(125);
				match(EQUALS);
				setState(126);
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
				setState(129);
				match(LET);
				setState(130);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(131);
				match(EQUALS);
				setState(132);
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
			setState(137);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(138);
			match(EQUALS);
			setState(139);
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
			setState(143);
			((ExpListContext)_localctx).expression = expression(0);
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ExpListContext)_localctx).expression.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
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
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					match(COMMA);
					setState(148);
					((ExpListContext)_localctx).expression = expression(0);
					 
					          		((ExpListContext)_localctx).list.l.Add(((ExpListContext)_localctx).expression.state)
					          		_localctx.l = ((ExpListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(155);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAR:
				{
				setState(157);
				match(OPENPAR);
				setState(158);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(159);
				match(CLOSEPAR);

						_localctx.state = ((ExpressionContext)_localctx).exp.state
					
				}
				break;
			case NOT:
				{
				setState(162);
				match(NOT);
				setState(163);
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
			case MATCH:
			case BFALSE:
			case BTRUE:
			case NUMBER:
			case FLOAT:
			case STRING:
			case CHAR:
			case ID:
				{
				setState(166);
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
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExp = _prevctx;
						_localctx.leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						((ExpressionContext)_localctx).expOpAlgb1 = expOpAlgb1();
						setState(173);
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
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						((ExpressionContext)_localctx).expOpAlgb2 = expOpAlgb2();
						setState(178);
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
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						((ExpressionContext)_localctx).expOpRel1 = expOpRel1();
						setState(183);
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
				setState(190);
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
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(MUL);
					
						_localctx.state = I.MUL 
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(DIV);
					
						_localctx.state = I.DIV 
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ADD);
					
						_localctx.state = I.ADD 
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTEQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(NOTEQUALS);
					
						_localctx.state = I.NOTEQUALS 
					
				}
				break;
			case MOREOREQUALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(MOREOREQUALS);
					
						_localctx.state = I.MOREOREQUALS 
					
				}
				break;
			case LESSOREQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(LESSOREQUALS);
					
						_localctx.state = I.LESSOREQUALS 
					
				}
				break;
			case EQUALSEQUALS:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(EQUALSEQUALS);
					
						_localctx.state = I.EQUALSEQUALS 
					
				}
				break;
			case MAJOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(MAJOR);
					
						_localctx.state = I.MAJOR 
					
				}
				break;
			case MINOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(MINOR);
					
						_localctx.state = I.MINOR 
					
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				match(AND);
					
						_localctx.state = I.AND 
					
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I64:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(I64);
				 
						_localctx.state = I.INTEGER 
					
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(F64);
				 
						_localctx.state = I.FLOAT 
					
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(BOOL);
				 
						_localctx.state = I.BOOL 
					
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(CHARTYPE);
				 
						_localctx.state = I.CHAR 
					
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(STR);
				 
						_localctx.state = I.STR 
					
				}
				break;
			case STRCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
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
		public TernaryConditionsContext ternaryConditions;
		public MatchExpContext matchExp;
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
		public TernaryConditionsContext ternaryConditions() {
			return getRuleContext(TernaryConditionsContext.class,0);
		}
		public MatchExpContext matchExp() {
			return getRuleContext(MatchExpContext.class,0);
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 
						_localctx.state = I.Value{ I.Token{ "NUMBER", ((ValueContext)_localctx).NUMBER.GetLine(), ((ValueContext)_localctx).NUMBER.GetColumn() }, (((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null), I.INTEGER } 
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((ValueContext)_localctx).FLOAT = match(FLOAT);
					
						_localctx.state = I.Value{ I.Token{ "FLOAT", ((ValueContext)_localctx).FLOAT.GetLine(), ((ValueContext)_localctx).FLOAT.GetColumn() }, (((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null), I.FLOAT } 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				((ValueContext)_localctx).STRING = match(STRING);
				 
						_localctx.state = I.Value{ I.Token{ "SRING", ((ValueContext)_localctx).STRING.GetLine(), ((ValueContext)_localctx).STRING.GetColumn() }, (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)[1:len((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))-1], I.STR } 
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				((ValueContext)_localctx).CHAR = match(CHAR);
				 
						_localctx.state = I.Value{ I.Token{ "CHAR", ((ValueContext)_localctx).CHAR.GetLine(), ((ValueContext)_localctx).CHAR.GetColumn() }, (((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null)[1:len((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null))-1], I.CHAR } 
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				((ValueContext)_localctx).BFALSE = match(BFALSE);
				 
						_localctx.state = I.Value{ I.Token{ "BFALSE", ((ValueContext)_localctx).BFALSE.GetLine(), ((ValueContext)_localctx).BFALSE.GetColumn() }, false, I.BOOL } 
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				((ValueContext)_localctx).BTRUE = match(BTRUE);
				 
						_localctx.state = I.Value{ I.Token{ "BTRUE", ((ValueContext)_localctx).BTRUE.GetLine(), ((ValueContext)_localctx).BTRUE.GetColumn() }, true, I.BOOL } 
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				((ValueContext)_localctx).ID = match(ID);
				 
						_localctx.state = I.Value{ I.Token{ "ID", ((ValueContext)_localctx).ID.GetLine(), ((ValueContext)_localctx).ID.GetColumn() }, (((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null), I.ID } 
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				((ValueContext)_localctx).methods = methods();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).methods.state;
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				((ValueContext)_localctx).functionCall = functionCall();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).functionCall.state;
					
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				((ValueContext)_localctx).ternaryConditions = ternaryConditions();

						((ValueContext)_localctx).state =  ((ValueContext)_localctx).ternaryConditions.state;
					
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				((ValueContext)_localctx).matchExp = matchExp();
				 _localctx.state = ((ValueContext)_localctx).matchExp.state 
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(266);
				match(OPENPAR);
				setState(267);
				((FunctionCallContext)_localctx).expList = expList(0);
				setState(268);
				match(CLOSEPAR);

						_localctx.state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", ((FunctionCallContext)_localctx).ID.GetLine(), ((FunctionCallContext)_localctx).ID.GetColumn() }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), I.VOID }, (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null), ((FunctionCallContext)_localctx).expList.l.ToArray() }
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(272);
				match(OPENPAR);
				setState(273);
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
			setState(277);
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
			setState(280);
			((PrintlnCallContext)_localctx).PRINTLN = match(PRINTLN);
			setState(281);
			match(OPENPAR);
			setState(282);
			((PrintlnCallContext)_localctx).expList = expList(0);
			setState(283);
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
			setState(287);
			((ParamListContext)_localctx).param = param();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ParamListContext)_localctx).param.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
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
					setState(290);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(291);
					match(COMMA);
					setState(292);
					((ParamListContext)_localctx).param = param();
					 
					          		((ParamListContext)_localctx).list.l.Add(((ParamListContext)_localctx).param.state)
					          		_localctx.l = ((ParamListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(299);
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
			setState(300);
			((ParamContext)_localctx).ID = match(ID);
			setState(301);
			match(COLOM);
			setState(302);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((FunctionContext)_localctx).FN = match(FN);
				setState(306);
				((FunctionContext)_localctx).ID = match(ID);
				setState(307);
				match(OPENPAR);
				setState(308);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(309);
				match(CLOSEPAR);
				setState(310);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				((FunctionContext)_localctx).FN = match(FN);
				setState(314);
				((FunctionContext)_localctx).ID = match(ID);
				setState(315);
				match(OPENPAR);
				setState(316);
				match(CLOSEPAR);
				setState(317);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), make([]interface{}, 0), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), I.VOID, nil };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				((FunctionContext)_localctx).FN = match(FN);
				setState(321);
				((FunctionContext)_localctx).ID = match(ID);
				setState(322);
				match(OPENPAR);
				setState(323);
				((FunctionContext)_localctx).paramList = paramList(0);
				setState(324);
				match(CLOSEPAR);
				setState(325);
				match(ARROW);
				setState(326);
				((FunctionContext)_localctx).valueType = valueType();
				setState(327);
				((FunctionContext)_localctx).instructionsBlock = instructionsBlock();

						((FunctionContext)_localctx).state =  I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", ((FunctionContext)_localctx).FN.GetLine(), ((FunctionContext)_localctx).FN.GetColumn() }, (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).paramList.l.ToArray(), ((FunctionContext)_localctx).instructionsBlock.l.ToArray(), ((FunctionContext)_localctx).valueType.state, nil };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				((FunctionContext)_localctx).FN = match(FN);
				setState(331);
				((FunctionContext)_localctx).ID = match(ID);
				setState(332);
				match(OPENPAR);
				setState(333);
				match(CLOSEPAR);
				setState(334);
				match(ARROW);
				setState(335);
				((FunctionContext)_localctx).valueType = valueType();
				setState(336);
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
			setState(341);
			((ReturnValueContext)_localctx).RETURN = match(RETURN);
			setState(342);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(346);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(347);
				((ConditionsContext)_localctx).insBody = instructionsBlock();

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), make([]interface{}, 0) };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(351);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(352);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(353);
				((ConditionsContext)_localctx).conditionList = conditionList(0);

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), ((ConditionsContext)_localctx).conditionList.l.ToArray(), make([]interface{}, 0) };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(357);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(358);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(359);
				match(ELSE);
				setState(360);
				((ConditionsContext)_localctx).elseBody = instructionsBlock();

						((ConditionsContext)_localctx).state =  I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", ((ConditionsContext)_localctx).IF.GetLine(), ((ConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((ConditionsContext)_localctx).expression.state, ((ConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), ((ConditionsContext)_localctx).elseBody.l.ToArray() };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				((ConditionsContext)_localctx).IF = match(IF);
				setState(364);
				((ConditionsContext)_localctx).expression = expression(0);
				setState(365);
				((ConditionsContext)_localctx).insBody = instructionsBlock();
				setState(366);
				((ConditionsContext)_localctx).conditionList = conditionList(0);
				setState(367);
				match(ELSE);
				setState(368);
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

	public static class TernaryConditionsContext extends ParserRuleContext {
		public I.IfTernaryControl state;
		public Token IF;
		public ExpressionContext firstExp;
		public InstructionsContext insBody;
		public ExpressionContext ternExp;
		public TernConditionListContext ternConditionList;
		public InstructionsContext elseBody;
		public ExpressionContext elseTernExp;
		public TerminalNode IF() { return getToken(DBRustParser.IF, 0); }
		public List<TerminalNode> OPENBRACKET() { return getTokens(DBRustParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(DBRustParser.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(DBRustParser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(DBRustParser.CLOSEBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TernConditionListContext ternConditionList() {
			return getRuleContext(TernConditionListContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(DBRustParser.ELSE, 0); }
		public TernaryConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryConditions; }
	}

	public final TernaryConditionsContext ternaryConditions() throws RecognitionException {
		TernaryConditionsContext _localctx = new TernaryConditionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ternaryConditions);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				((TernaryConditionsContext)_localctx).IF = match(IF);
				setState(374);
				((TernaryConditionsContext)_localctx).firstExp = expression(0);
				setState(375);
				match(OPENBRACKET);
				setState(376);
				((TernaryConditionsContext)_localctx).insBody = instructions();
				setState(377);
				((TernaryConditionsContext)_localctx).ternExp = expression(0);
				setState(378);
				match(CLOSEBRACKET);

						trueExp := ((TernaryConditionsContext)_localctx).ternExp.state;
						((TernaryConditionsContext)_localctx).state =  I.IfTernaryControl{ I.IfControl{ I.Instruction{ "TernaryControl" }, I.Value{ I.Token{ "IF", ((TernaryConditionsContext)_localctx).IF.GetLine(), ((TernaryConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((TernaryConditionsContext)_localctx).firstExp.state, ((TernaryConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), make([]interface{}, 0) }, &trueExp, nil };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				((TernaryConditionsContext)_localctx).IF = match(IF);
				setState(382);
				((TernaryConditionsContext)_localctx).firstExp = expression(0);
				setState(383);
				match(OPENBRACKET);
				setState(384);
				((TernaryConditionsContext)_localctx).insBody = instructions();
				setState(385);
				((TernaryConditionsContext)_localctx).ternExp = expression(0);
				setState(386);
				match(CLOSEBRACKET);
				setState(387);
				((TernaryConditionsContext)_localctx).ternConditionList = ternConditionList(0);

						trueExp := ((TernaryConditionsContext)_localctx).ternExp.state;
						((TernaryConditionsContext)_localctx).state =  I.IfTernaryControl{ I.IfControl{ I.Instruction{ "TernaryControl" }, I.Value{ I.Token{ "IF", ((TernaryConditionsContext)_localctx).IF.GetLine(), ((TernaryConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((TernaryConditionsContext)_localctx).firstExp.state, ((TernaryConditionsContext)_localctx).insBody.l.ToArray(), ((TernaryConditionsContext)_localctx).ternConditionList.l.ToArray(), make([]interface{}, 0) }, &trueExp, nil };
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				((TernaryConditionsContext)_localctx).IF = match(IF);
				setState(391);
				((TernaryConditionsContext)_localctx).firstExp = expression(0);
				setState(392);
				match(OPENBRACKET);
				setState(393);
				((TernaryConditionsContext)_localctx).insBody = instructions();
				setState(394);
				((TernaryConditionsContext)_localctx).ternExp = expression(0);
				setState(395);
				match(CLOSEBRACKET);
				setState(396);
				match(ELSE);
				setState(397);
				match(OPENBRACKET);
				setState(398);
				((TernaryConditionsContext)_localctx).elseBody = instructions();
				setState(399);
				((TernaryConditionsContext)_localctx).elseTernExp = expression(0);
				setState(400);
				match(CLOSEBRACKET);

						trueExp, elseExp := ((TernaryConditionsContext)_localctx).ternExp.state, ((TernaryConditionsContext)_localctx).elseTernExp.state;
						((TernaryConditionsContext)_localctx).state =  I.IfTernaryControl{ I.IfControl{ I.Instruction{ "TernaryControl" }, I.Value{ I.Token{ "IF", ((TernaryConditionsContext)_localctx).IF.GetLine(), ((TernaryConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((TernaryConditionsContext)_localctx).firstExp.state, ((TernaryConditionsContext)_localctx).insBody.l.ToArray(), make([]interface{}, 0), ((TernaryConditionsContext)_localctx).elseBody.l.ToArray() }, &trueExp, &elseExp };
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				((TernaryConditionsContext)_localctx).IF = match(IF);
				setState(404);
				((TernaryConditionsContext)_localctx).firstExp = expression(0);
				setState(405);
				match(OPENBRACKET);
				setState(406);
				((TernaryConditionsContext)_localctx).insBody = instructions();
				setState(407);
				((TernaryConditionsContext)_localctx).ternExp = expression(0);
				setState(408);
				match(CLOSEBRACKET);
				setState(409);
				((TernaryConditionsContext)_localctx).ternConditionList = ternConditionList(0);
				setState(410);
				match(ELSE);
				setState(411);
				match(OPENBRACKET);
				setState(412);
				((TernaryConditionsContext)_localctx).elseBody = instructions();
				setState(413);
				((TernaryConditionsContext)_localctx).elseTernExp = expression(0);
				setState(414);
				match(CLOSEBRACKET);

						trueExp, elseExp := ((TernaryConditionsContext)_localctx).ternExp.state, ((TernaryConditionsContext)_localctx).elseTernExp.state;
						((TernaryConditionsContext)_localctx).state =  I.IfTernaryControl{ I.IfControl{ I.Instruction{ "TernaryControl" }, I.Value{ I.Token{ "IF", ((TernaryConditionsContext)_localctx).IF.GetLine(), ((TernaryConditionsContext)_localctx).IF.GetColumn() }, "If", I.VOID }, ((TernaryConditionsContext)_localctx).firstExp.state, ((TernaryConditionsContext)_localctx).insBody.l.ToArray(), ((TernaryConditionsContext)_localctx).ternConditionList.l.ToArray(), ((TernaryConditionsContext)_localctx).elseBody.l.ToArray() }, &trueExp, &elseExp };
					
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_conditionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			((ConditionListContext)_localctx).elseIf = elseIf();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((ConditionListContext)_localctx).elseIf.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
					setState(423);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(424);
					((ConditionListContext)_localctx).elseIf = elseIf();
					 
					          		((ConditionListContext)_localctx).list.l.Add(((ConditionListContext)_localctx).elseIf.state)
					          		_localctx.l = ((ConditionListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class TernConditionListContext extends ParserRuleContext {
		public *arrayList.List l;
		public TernConditionListContext list;
		public TernElseIfContext ternElseIf;
		public TernElseIfContext ternElseIf() {
			return getRuleContext(TernElseIfContext.class,0);
		}
		public TernConditionListContext ternConditionList() {
			return getRuleContext(TernConditionListContext.class,0);
		}
		public TernConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternConditionList; }
	}

	public final TernConditionListContext ternConditionList() throws RecognitionException {
		return ternConditionList(0);
	}

	private TernConditionListContext ternConditionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TernConditionListContext _localctx = new TernConditionListContext(_ctx, _parentState);
		TernConditionListContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_ternConditionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			((TernConditionListContext)_localctx).ternElseIf = ternElseIf();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((TernConditionListContext)_localctx).ternElseIf.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TernConditionListContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_ternConditionList);
					setState(436);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(437);
					((TernConditionListContext)_localctx).ternElseIf = ternElseIf();
					 
					          		((TernConditionListContext)_localctx).list.l.Add(((TernConditionListContext)_localctx).ternElseIf.state)
					          		_localctx.l = ((TernConditionListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 48, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ELSE);
			setState(446);
			((ElseIfContext)_localctx).IF = match(IF);
			setState(447);
			((ElseIfContext)_localctx).expression = expression(0);
			setState(448);
			((ElseIfContext)_localctx).instructionsBlock = instructionsBlock();

					((ElseIfContext)_localctx).state =  I.IfControlFallBack{ I.Token{ "ElseIf", ((ElseIfContext)_localctx).IF.GetLine(), ((ElseIfContext)_localctx).IF.GetColumn() }, ((ElseIfContext)_localctx).expression.state, ((ElseIfContext)_localctx).instructionsBlock.l.ToArray(), nil };
				
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

	public static class TernElseIfContext extends ParserRuleContext {
		public I.IfControlFallBack state;
		public Token IF;
		public ExpressionContext firstExp;
		public InstructionsContext instructions;
		public ExpressionContext ternExp;
		public TerminalNode ELSE() { return getToken(DBRustParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DBRustParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(DBRustParser.OPENBRACKET, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(DBRustParser.CLOSEBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternElseIf; }
	}

	public final TernElseIfContext ternElseIf() throws RecognitionException {
		TernElseIfContext _localctx = new TernElseIfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ternElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(ELSE);
			setState(452);
			((TernElseIfContext)_localctx).IF = match(IF);
			setState(453);
			((TernElseIfContext)_localctx).firstExp = expression(0);
			setState(454);
			match(OPENBRACKET);
			setState(455);
			((TernElseIfContext)_localctx).instructions = instructions();
			setState(456);
			((TernElseIfContext)_localctx).ternExp = expression(0);
			setState(457);
			match(CLOSEBRACKET);

					trueExp := ((TernElseIfContext)_localctx).ternExp.state
					((TernElseIfContext)_localctx).state =  I.IfControlFallBack{ I.Token{ "ElseIf", ((TernElseIfContext)_localctx).IF.GetLine(), ((TernElseIfContext)_localctx).IF.GetColumn() }, ((TernElseIfContext)_localctx).firstExp.state, ((TernElseIfContext)_localctx).instructions.l.ToArray(), &trueExp };
				
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

	public static class MatchExpContext extends ParserRuleContext {
		public I.MatchControl state;
		public Token MATCH;
		public ExpressionContext trueExp;
		public MatchCaseListContext matchCaseList;
		public InstructionsBlockContext defBody;
		public ExpressionContext defExp;
		public TerminalNode MATCH() { return getToken(DBRustParser.MATCH, 0); }
		public TerminalNode OPENBRACKET() { return getToken(DBRustParser.OPENBRACKET, 0); }
		public MatchCaseListContext matchCaseList() {
			return getRuleContext(MatchCaseListContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(DBRustParser.UNDERSCORE, 0); }
		public TerminalNode DBLARROW() { return getToken(DBRustParser.DBLARROW, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(DBRustParser.CLOSEBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBRustParser.COMMA, 0); }
		public MatchExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExp; }
	}

	public final MatchExpContext matchExp() throws RecognitionException {
		MatchExpContext _localctx = new MatchExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchExp);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((MatchExpContext)_localctx).MATCH = match(MATCH);
				setState(461);
				((MatchExpContext)_localctx).trueExp = expression(0);
				setState(462);
				match(OPENBRACKET);
				setState(463);
				((MatchExpContext)_localctx).matchCaseList = matchCaseList(0);
				setState(464);
				match(UNDERSCORE);
				setState(465);
				match(DBLARROW);
				setState(466);
				((MatchExpContext)_localctx).defBody = instructionsBlock();
				setState(467);
				match(CLOSEBRACKET);

						defCase := ((MatchExpContext)_localctx).defBody.l.ToArray()
						((MatchExpContext)_localctx).state =  I.MatchControl{ I.Instruction{ "Match" }, I.Value{ I.Token{ "Match", ((MatchExpContext)_localctx).MATCH.GetLine(), ((MatchExpContext)_localctx).MATCH.GetColumn() }, "Match", I.VOID }, ((MatchExpContext)_localctx).trueExp.state, ((MatchExpContext)_localctx).matchCaseList.l.ToArray(), &defCase, nil }; 
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				((MatchExpContext)_localctx).MATCH = match(MATCH);
				setState(471);
				((MatchExpContext)_localctx).trueExp = expression(0);
				setState(472);
				match(OPENBRACKET);
				setState(473);
				((MatchExpContext)_localctx).matchCaseList = matchCaseList(0);
				setState(474);
				match(UNDERSCORE);
				setState(475);
				match(DBLARROW);
				setState(476);
				((MatchExpContext)_localctx).defExp = expression(0);
				setState(477);
				match(COMMA);
				setState(478);
				match(CLOSEBRACKET);

						defCase := ((MatchExpContext)_localctx).defExp.state;
						((MatchExpContext)_localctx).state =  I.MatchControl{ I.Instruction{ "Match" }, I.Value{ I.Token{ "Match", ((MatchExpContext)_localctx).MATCH.GetLine(), ((MatchExpContext)_localctx).MATCH.GetColumn() }, "Match", I.VOID }, ((MatchExpContext)_localctx).trueExp.state, ((MatchExpContext)_localctx).matchCaseList.l.ToArray(), nil, &defCase }; 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				((MatchExpContext)_localctx).MATCH = match(MATCH);
				setState(482);
				((MatchExpContext)_localctx).trueExp = expression(0);
				setState(483);
				match(OPENBRACKET);
				setState(484);
				((MatchExpContext)_localctx).matchCaseList = matchCaseList(0);
				setState(485);
				match(CLOSEBRACKET);

						((MatchExpContext)_localctx).state =  I.MatchControl{ I.Instruction{ "Match" }, I.Value{ I.Token{ "Match", ((MatchExpContext)_localctx).MATCH.GetLine(), ((MatchExpContext)_localctx).MATCH.GetColumn() }, "Match", I.VOID }, ((MatchExpContext)_localctx).trueExp.state, ((MatchExpContext)_localctx).matchCaseList.l.ToArray(), nil, nil }; 
					
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

	public static class MatchCaseListContext extends ParserRuleContext {
		public *arrayList.List l;
		public MatchCaseListContext list;
		public MatchCaseContext matchCase;
		public MatchCaseContext matchCase() {
			return getRuleContext(MatchCaseContext.class,0);
		}
		public MatchCaseListContext matchCaseList() {
			return getRuleContext(MatchCaseListContext.class,0);
		}
		public MatchCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCaseList; }
	}

	public final MatchCaseListContext matchCaseList() throws RecognitionException {
		return matchCaseList(0);
	}

	private MatchCaseListContext matchCaseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MatchCaseListContext _localctx = new MatchCaseListContext(_ctx, _parentState);
		MatchCaseListContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_matchCaseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(491);
			((MatchCaseListContext)_localctx).matchCase = matchCase();
			 
					_localctx.l = arrayList.New()
					_localctx.l.Add(((MatchCaseListContext)_localctx).matchCase.state)
				
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MatchCaseListContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_matchCaseList);
					setState(494);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(495);
					((MatchCaseListContext)_localctx).matchCase = matchCase();
					 
					          		((MatchCaseListContext)_localctx).list.l.Add(((MatchCaseListContext)_localctx).matchCase.state)
					          		_localctx.l = ((MatchCaseListContext)_localctx).list.l
					            
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class MatchCaseContext extends ParserRuleContext {
		public I.CaseMatchControl state;
		public ExpressionContext expression;
		public Token DBLARROW;
		public InstructionsBlockContext instructionsBlock;
		public ExpressionContext caseExp;
		public ExpressionContext lastExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DBLARROW() { return getToken(DBRustParser.DBLARROW, 0); }
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBRustParser.COMMA, 0); }
		public MatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCase; }
	}

	public final MatchCaseContext matchCase() throws RecognitionException {
		MatchCaseContext _localctx = new MatchCaseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_matchCase);
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				((MatchCaseContext)_localctx).expression = expression(0);
				setState(504);
				((MatchCaseContext)_localctx).DBLARROW = match(DBLARROW);
				setState(505);
				((MatchCaseContext)_localctx).instructionsBlock = instructionsBlock();

						body := ((MatchCaseContext)_localctx).instructionsBlock.l.ToArray()
						((MatchCaseContext)_localctx).state =  I.CaseMatchControl{ I.Token{ "MatchCase", ((MatchCaseContext)_localctx).DBLARROW.GetLine(), ((MatchCaseContext)_localctx).DBLARROW.GetColumn() }, ((MatchCaseContext)_localctx).expression.state, &body, nil };
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((MatchCaseContext)_localctx).caseExp = expression(0);
				setState(509);
				((MatchCaseContext)_localctx).DBLARROW = match(DBLARROW);
				setState(510);
				((MatchCaseContext)_localctx).lastExp = expression(0);
				setState(511);
				match(COMMA);

						lastExpVal := ((MatchCaseContext)_localctx).lastExp.state
						((MatchCaseContext)_localctx).state =  I.CaseMatchControl{ I.Token{ "MatchCase", ((MatchCaseContext)_localctx).DBLARROW.GetLine(), ((MatchCaseContext)_localctx).DBLARROW.GetColumn() }, ((MatchCaseContext)_localctx).caseExp.state, nil, &lastExpVal };
					
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
		case 16:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 22:
			return conditionList_sempred((ConditionListContext)_localctx, predIndex);
		case 23:
			return ternConditionList_sempred((TernConditionListContext)_localctx, predIndex);
		case 27:
			return matchCaseList_sempred((MatchCaseListContext)_localctx, predIndex);
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
	private boolean ternConditionList_sempred(TernConditionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean matchCaseList_sempred(MatchCaseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0207\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c8\n\n\3\13\3\13\3\13\3\13\5\13\u00ce\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00e0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ee"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u010a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0116"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u012a\n\22\f\22\16\22\u012d\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0156\n\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0176\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a4\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u01ae\n\30\f\30\16\30\u01b1\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u01bb\n\31\f\31\16\31\u01be\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01eb\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01f5\n"+
		"\35\f\35\16\35\u01f8\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0205\n\36\3\36\2\b\16\20\".\608\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\2\2\u0224\2<\3\2\2\2\4"+
		"?\3\2\2\2\6G\3\2\2\2\bi\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u0090"+
		"\3\2\2\2\20\u00ab\3\2\2\2\22\u00c7\3\2\2\2\24\u00cd\3\2\2\2\26\u00df\3"+
		"\2\2\2\30\u00ed\3\2\2\2\32\u0109\3\2\2\2\34\u0115\3\2\2\2\36\u0117\3\2"+
		"\2\2 \u011a\3\2\2\2\"\u0120\3\2\2\2$\u012e\3\2\2\2&\u0155\3\2\2\2(\u0157"+
		"\3\2\2\2*\u0175\3\2\2\2,\u01a3\3\2\2\2.\u01a5\3\2\2\2\60\u01b2\3\2\2\2"+
		"\62\u01bf\3\2\2\2\64\u01c5\3\2\2\2\66\u01ea\3\2\2\28\u01ec\3\2\2\2:\u0204"+
		"\3\2\2\2<=\5\6\4\2=>\b\2\1\2>\3\3\2\2\2?@\7\33\2\2@A\5\6\4\2AB\7\34\2"+
		"\2BC\b\3\1\2C\5\3\2\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HJ\3\2\2\2IG\3\2\2\2JK\b\4\1\2K\7\3\2\2\2LM\5\n\6\2MN\7!\2\2NO\b\5"+
		"\1\2Oj\3\2\2\2PQ\5\34\17\2QR\7!\2\2RS\b\5\1\2Sj\3\2\2\2TU\5\f\7\2UV\7"+
		"!\2\2VW\b\5\1\2Wj\3\2\2\2XY\5\36\20\2YZ\7!\2\2Z[\b\5\1\2[j\3\2\2\2\\]"+
		"\5&\24\2]^\b\5\1\2^j\3\2\2\2_`\5(\25\2`a\7!\2\2ab\b\5\1\2bj\3\2\2\2cd"+
		"\5*\26\2de\b\5\1\2ej\3\2\2\2fg\5\66\34\2gh\b\5\1\2hj\3\2\2\2iL\3\2\2\2"+
		"iP\3\2\2\2iT\3\2\2\2iX\3\2\2\2i\\\3\2\2\2i_\3\2\2\2ic\3\2\2\2if\3\2\2"+
		"\2j\t\3\2\2\2kl\7\3\2\2lm\7\30\2\2mn\7 \2\2no\5\30\r\2op\7.\2\2pq\5\20"+
		"\t\2qr\b\6\1\2r\u008a\3\2\2\2st\7\3\2\2tu\7\4\2\2uv\7\30\2\2vw\7 \2\2"+
		"wx\5\30\r\2xy\7.\2\2yz\5\20\t\2z{\b\6\1\2{\u008a\3\2\2\2|}\7\3\2\2}~\7"+
		"\4\2\2~\177\7\30\2\2\177\u0080\7.\2\2\u0080\u0081\5\20\t\2\u0081\u0082"+
		"\b\6\1\2\u0082\u008a\3\2\2\2\u0083\u0084\7\3\2\2\u0084\u0085\7\30\2\2"+
		"\u0085\u0086\7.\2\2\u0086\u0087\5\20\t\2\u0087\u0088\b\6\1\2\u0088\u008a"+
		"\3\2\2\2\u0089k\3\2\2\2\u0089s\3\2\2\2\u0089|\3\2\2\2\u0089\u0083\3\2"+
		"\2\2\u008a\13\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008d\7.\2\2\u008d\u008e"+
		"\5\20\t\2\u008e\u008f\b\7\1\2\u008f\r\3\2\2\2\u0090\u0091\b\b\1\2\u0091"+
		"\u0092\5\20\t\2\u0092\u0093\b\b\1\2\u0093\u009b\3\2\2\2\u0094\u0095\f"+
		"\4\2\2\u0095\u0096\7\"\2\2\u0096\u0097\5\20\t\2\u0097\u0098\b\b\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f"+
		"\b\t\1\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\32\2"+
		"\2\u00a2\u00a3\b\t\1\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6"+
		"\5\20\t\4\u00a6\u00a7\b\t\1\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\5\32\16"+
		"\2\u00a9\u00aa\b\t\1\2\u00aa\u00ac\3\2\2\2\u00ab\u009e\3\2\2\2\u00ab\u00a4"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00be\3\2\2\2\u00ad\u00ae\f\b\2\2\u00ae"+
		"\u00af\5\22\n\2\u00af\u00b0\5\20\t\t\u00b0\u00b1\b\t\1\2\u00b1\u00bd\3"+
		"\2\2\2\u00b2\u00b3\f\7\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\5\20\t\b"+
		"\u00b5\u00b6\b\t\1\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8\f\6\2\2\u00b8\u00b9"+
		"\5\26\f\2\u00b9\u00ba\5\20\t\7\u00ba\u00bb\b\t\1\2\u00bb\u00bd\3\2\2\2"+
		"\u00bc\u00ad\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\21\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c8\b\n\1\2\u00c3\u00c4\7$\2"+
		"\2\u00c4\u00c8\b\n\1\2\u00c5\u00c6\7%\2\2\u00c6\u00c8\b\n\1\2\u00c7\u00c1"+
		"\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\23\3\2\2\2\u00c9"+
		"\u00ca\7&\2\2\u00ca\u00ce\b\13\1\2\u00cb\u00cc\7\'\2\2\u00cc\u00ce\b\13"+
		"\1\2\u00cd\u00c9\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d0"+
		"\7-\2\2\u00d0\u00e0\b\f\1\2\u00d1\u00d2\7*\2\2\u00d2\u00e0\b\f\1\2\u00d3"+
		"\u00d4\7(\2\2\u00d4\u00e0\b\f\1\2\u00d5\u00d6\7,\2\2\u00d6\u00e0\b\f\1"+
		"\2\u00d7\u00d8\7+\2\2\u00d8\u00e0\b\f\1\2\u00d9\u00da\7)\2\2\u00da\u00e0"+
		"\b\f\1\2\u00db\u00dc\7\60\2\2\u00dc\u00e0\b\f\1\2\u00dd\u00de\7\61\2\2"+
		"\u00de\u00e0\b\f\1\2\u00df\u00cf\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d3"+
		"\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\13\2"+
		"\2\u00e2\u00ee\b\r\1\2\u00e3\u00e4\7\f\2\2\u00e4\u00ee\b\r\1\2\u00e5\u00e6"+
		"\7\r\2\2\u00e6\u00ee\b\r\1\2\u00e7\u00e8\7\16\2\2\u00e8\u00ee\b\r\1\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\u00ee\b\r\1\2\u00eb\u00ec\7\20\2\2\u00ec\u00ee"+
		"\b\r\1\2\u00ed\u00e1\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\31\3\2\2"+
		"\2\u00ef\u00f0\7\24\2\2\u00f0\u010a\b\16\1\2\u00f1\u00f2\7\25\2\2\u00f2"+
		"\u010a\b\16\1\2\u00f3\u00f4\7\26\2\2\u00f4\u010a\b\16\1\2\u00f5\u00f6"+
		"\7\27\2\2\u00f6\u010a\b\16\1\2\u00f7\u00f8\7\22\2\2\u00f8\u010a\b\16\1"+
		"\2\u00f9\u00fa\7\23\2\2\u00fa\u010a\b\16\1\2\u00fb\u00fc\7\30\2\2\u00fc"+
		"\u010a\b\16\1\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\b\16\1\2\u00ff\u010a"+
		"\3\2\2\2\u0100\u0101\5\34\17\2\u0101\u0102\b\16\1\2\u0102\u010a\3\2\2"+
		"\2\u0103\u0104\5,\27\2\u0104\u0105\b\16\1\2\u0105\u010a\3\2\2\2\u0106"+
		"\u0107\5\66\34\2\u0107\u0108\b\16\1\2\u0108\u010a\3\2\2\2\u0109\u00ef"+
		"\3\2\2\2\u0109\u00f1\3\2\2\2\u0109\u00f3\3\2\2\2\u0109\u00f5\3\2\2\2\u0109"+
		"\u00f7\3\2\2\2\u0109\u00f9\3\2\2\2\u0109\u00fb\3\2\2\2\u0109\u00fd\3\2"+
		"\2\2\u0109\u0100\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0106\3\2\2\2\u010a"+
		"\33\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u010d\7\31\2\2\u010d\u010e\5\16"+
		"\b\2\u010e\u010f\7\32\2\2\u010f\u0110\b\17\1\2\u0110\u0116\3\2\2\2\u0111"+
		"\u0112\7\30\2\2\u0112\u0113\7\31\2\2\u0113\u0114\7\32\2\2\u0114\u0116"+
		"\b\17\1\2\u0115\u010b\3\2\2\2\u0115\u0111\3\2\2\2\u0116\35\3\2\2\2\u0117"+
		"\u0118\5 \21\2\u0118\u0119\b\20\1\2\u0119\37\3\2\2\2\u011a\u011b\7\5\2"+
		"\2\u011b\u011c\7\31\2\2\u011c\u011d\5\16\b\2\u011d\u011e\7\32\2\2\u011e"+
		"\u011f\b\21\1\2\u011f!\3\2\2\2\u0120\u0121\b\22\1\2\u0121\u0122\5$\23"+
		"\2\u0122\u0123\b\22\1\2\u0123\u012b\3\2\2\2\u0124\u0125\f\4\2\2\u0125"+
		"\u0126\7\"\2\2\u0126\u0127\5$\23\2\u0127\u0128\b\22\1\2\u0128\u012a\3"+
		"\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c#\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\30\2\2"+
		"\u012f\u0130\7 \2\2\u0130\u0131\5\30\r\2\u0131\u0132\b\23\1\2\u0132%\3"+
		"\2\2\2\u0133\u0134\7\6\2\2\u0134\u0135\7\30\2\2\u0135\u0136\7\31\2\2\u0136"+
		"\u0137\5\"\22\2\u0137\u0138\7\32\2\2\u0138\u0139\5\4\3\2\u0139\u013a\b"+
		"\24\1\2\u013a\u0156\3\2\2\2\u013b\u013c\7\6\2\2\u013c\u013d\7\30\2\2\u013d"+
		"\u013e\7\31\2\2\u013e\u013f\7\32\2\2\u013f\u0140\5\4\3\2\u0140\u0141\b"+
		"\24\1\2\u0141\u0156\3\2\2\2\u0142\u0143\7\6\2\2\u0143\u0144\7\30\2\2\u0144"+
		"\u0145\7\31\2\2\u0145\u0146\5\"\22\2\u0146\u0147\7\32\2\2\u0147\u0148"+
		"\7\35\2\2\u0148\u0149\5\30\r\2\u0149\u014a\5\4\3\2\u014a\u014b\b\24\1"+
		"\2\u014b\u0156\3\2\2\2\u014c\u014d\7\6\2\2\u014d\u014e\7\30\2\2\u014e"+
		"\u014f\7\31\2\2\u014f\u0150\7\32\2\2\u0150\u0151\7\35\2\2\u0151\u0152"+
		"\5\30\r\2\u0152\u0153\5\4\3\2\u0153\u0154\b\24\1\2\u0154\u0156\3\2\2\2"+
		"\u0155\u0133\3\2\2\2\u0155\u013b\3\2\2\2\u0155\u0142\3\2\2\2\u0155\u014c"+
		"\3\2\2\2\u0156\'\3\2\2\2\u0157\u0158\7\7\2\2\u0158\u0159\5\20\t\2\u0159"+
		"\u015a\b\25\1\2\u015a)\3\2\2\2\u015b\u015c\7\b\2\2\u015c\u015d\5\20\t"+
		"\2\u015d\u015e\5\4\3\2\u015e\u015f\b\26\1\2\u015f\u0176\3\2\2\2\u0160"+
		"\u0161\7\b\2\2\u0161\u0162\5\20\t\2\u0162\u0163\5\4\3\2\u0163\u0164\5"+
		".\30\2\u0164\u0165\b\26\1\2\u0165\u0176\3\2\2\2\u0166\u0167\7\b\2\2\u0167"+
		"\u0168\5\20\t\2\u0168\u0169\5\4\3\2\u0169\u016a\7\t\2\2\u016a\u016b\5"+
		"\4\3\2\u016b\u016c\b\26\1\2\u016c\u0176\3\2\2\2\u016d\u016e\7\b\2\2\u016e"+
		"\u016f\5\20\t\2\u016f\u0170\5\4\3\2\u0170\u0171\5.\30\2\u0171\u0172\7"+
		"\t\2\2\u0172\u0173\5\4\3\2\u0173\u0174\b\26\1\2\u0174\u0176\3\2\2\2\u0175"+
		"\u015b\3\2\2\2\u0175\u0160\3\2\2\2\u0175\u0166\3\2\2\2\u0175\u016d\3\2"+
		"\2\2\u0176+\3\2\2\2\u0177\u0178\7\b\2\2\u0178\u0179\5\20\t\2\u0179\u017a"+
		"\7\33\2\2\u017a\u017b\5\6\4\2\u017b\u017c\5\20\t\2\u017c\u017d\7\34\2"+
		"\2\u017d\u017e\b\27\1\2\u017e\u01a4\3\2\2\2\u017f\u0180\7\b\2\2\u0180"+
		"\u0181\5\20\t\2\u0181\u0182\7\33\2\2\u0182\u0183\5\6\4\2\u0183\u0184\5"+
		"\20\t\2\u0184\u0185\7\34\2\2\u0185\u0186\5\60\31\2\u0186\u0187\b\27\1"+
		"\2\u0187\u01a4\3\2\2\2\u0188\u0189\7\b\2\2\u0189\u018a\5\20\t\2\u018a"+
		"\u018b\7\33\2\2\u018b\u018c\5\6\4\2\u018c\u018d\5\20\t\2\u018d\u018e\7"+
		"\34\2\2\u018e\u018f\7\t\2\2\u018f\u0190\7\33\2\2\u0190\u0191\5\6\4\2\u0191"+
		"\u0192\5\20\t\2\u0192\u0193\7\34\2\2\u0193\u0194\b\27\1\2\u0194\u01a4"+
		"\3\2\2\2\u0195\u0196\7\b\2\2\u0196\u0197\5\20\t\2\u0197\u0198\7\33\2\2"+
		"\u0198\u0199\5\6\4\2\u0199\u019a\5\20\t\2\u019a\u019b\7\34\2\2\u019b\u019c"+
		"\5\60\31\2\u019c\u019d\7\t\2\2\u019d\u019e\7\33\2\2\u019e\u019f\5\6\4"+
		"\2\u019f\u01a0\5\20\t\2\u01a0\u01a1\7\34\2\2\u01a1\u01a2\b\27\1\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u0177\3\2\2\2\u01a3\u017f\3\2\2\2\u01a3\u0188\3\2"+
		"\2\2\u01a3\u0195\3\2\2\2\u01a4-\3\2\2\2\u01a5\u01a6\b\30\1\2\u01a6\u01a7"+
		"\5\62\32\2\u01a7\u01a8\b\30\1\2\u01a8\u01af\3\2\2\2\u01a9\u01aa\f\4\2"+
		"\2\u01aa\u01ab\5\62\32\2\u01ab\u01ac\b\30\1\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01a9\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0/\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\31\1\2\u01b3\u01b4"+
		"\5\64\33\2\u01b4\u01b5\b\31\1\2\u01b5\u01bc\3\2\2\2\u01b6\u01b7\f\4\2"+
		"\2\u01b7\u01b8\5\64\33\2\u01b8\u01b9\b\31\1\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\61\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7\t\2\2\u01c0\u01c1"+
		"\7\b\2\2\u01c1\u01c2\5\20\t\2\u01c2\u01c3\5\4\3\2\u01c3\u01c4\b\32\1\2"+
		"\u01c4\63\3\2\2\2\u01c5\u01c6\7\t\2\2\u01c6\u01c7\7\b\2\2\u01c7\u01c8"+
		"\5\20\t\2\u01c8\u01c9\7\33\2\2\u01c9\u01ca\5\6\4\2\u01ca\u01cb\5\20\t"+
		"\2\u01cb\u01cc\7\34\2\2\u01cc\u01cd\b\33\1\2\u01cd\65\3\2\2\2\u01ce\u01cf"+
		"\7\n\2\2\u01cf\u01d0\5\20\t\2\u01d0\u01d1\7\33\2\2\u01d1\u01d2\58\35\2"+
		"\u01d2\u01d3\7\21\2\2\u01d3\u01d4\7\36\2\2\u01d4\u01d5\5\4\3\2\u01d5\u01d6"+
		"\7\34\2\2\u01d6\u01d7\b\34\1\2\u01d7\u01eb\3\2\2\2\u01d8\u01d9\7\n\2\2"+
		"\u01d9\u01da\5\20\t\2\u01da\u01db\7\33\2\2\u01db\u01dc\58\35\2\u01dc\u01dd"+
		"\7\21\2\2\u01dd\u01de\7\36\2\2\u01de\u01df\5\20\t\2\u01df\u01e0\7\"\2"+
		"\2\u01e0\u01e1\7\34\2\2\u01e1\u01e2\b\34\1\2\u01e2\u01eb\3\2\2\2\u01e3"+
		"\u01e4\7\n\2\2\u01e4\u01e5\5\20\t\2\u01e5\u01e6\7\33\2\2\u01e6\u01e7\5"+
		"8\35\2\u01e7\u01e8\7\34\2\2\u01e8\u01e9\b\34\1\2\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01ce\3\2\2\2\u01ea\u01d8\3\2\2\2\u01ea\u01e3\3\2\2\2\u01eb\67\3\2\2"+
		"\2\u01ec\u01ed\b\35\1\2\u01ed\u01ee\5:\36\2\u01ee\u01ef\b\35\1\2\u01ef"+
		"\u01f6\3\2\2\2\u01f0\u01f1\f\4\2\2\u01f1\u01f2\5:\36\2\u01f2\u01f3\b\35"+
		"\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f79\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f9\u01fa\5\20\t\2\u01fa\u01fb\7\36\2\2\u01fb\u01fc\5\4\3\2\u01fc\u01fd"+
		"\b\36\1\2\u01fd\u0205\3\2\2\2\u01fe\u01ff\5\20\t\2\u01ff\u0200\7\36\2"+
		"\2\u0200\u0201\5\20\t\2\u0201\u0202\7\"\2\2\u0202\u0203\b\36\1\2\u0203"+
		"\u0205\3\2\2\2\u0204\u01f9\3\2\2\2\u0204\u01fe\3\2\2\2\u0205;\3\2\2\2"+
		"\30Gi\u0089\u009b\u00ab\u00bc\u00be\u00c7\u00cd\u00df\u00ed\u0109\u0115"+
		"\u012b\u0155\u0175\u01a3\u01af\u01bc\u01ea\u01f6\u0204";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}