// Code generated from DBRust.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // DBRust

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import I "main/interfaces"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 28, 126,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 3, 2,
	3, 2, 3, 2, 3, 3, 7, 3, 29, 10, 3, 12, 3, 14, 3, 32, 11, 3, 3, 3, 3, 3,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	5, 4, 48, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6,
	3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7,
	3, 7, 7, 7, 72, 10, 7, 12, 7, 14, 7, 75, 11, 7, 3, 8, 3, 8, 3, 8, 3, 8,
	3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 5, 8, 87, 10, 8, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 101, 10, 9,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 5, 10, 115, 10, 10, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 2, 3, 12, 13, 2, 4, 6, 8, 10, 12, 14, 16, 18,
	20, 22, 2, 2, 2, 132, 2, 24, 3, 2, 2, 2, 4, 30, 3, 2, 2, 2, 6, 47, 3, 2,
	2, 2, 8, 49, 3, 2, 2, 2, 10, 57, 3, 2, 2, 2, 12, 62, 3, 2, 2, 2, 14, 86,
	3, 2, 2, 2, 16, 100, 3, 2, 2, 2, 18, 114, 3, 2, 2, 2, 20, 116, 3, 2, 2,
	2, 22, 119, 3, 2, 2, 2, 24, 25, 5, 4, 3, 2, 25, 26, 8, 2, 1, 2, 26, 3,
	3, 2, 2, 2, 27, 29, 5, 6, 4, 2, 28, 27, 3, 2, 2, 2, 29, 32, 3, 2, 2, 2,
	30, 28, 3, 2, 2, 2, 30, 31, 3, 2, 2, 2, 31, 33, 3, 2, 2, 2, 32, 30, 3,
	2, 2, 2, 33, 34, 8, 3, 1, 2, 34, 5, 3, 2, 2, 2, 35, 36, 5, 8, 5, 2, 36,
	37, 7, 21, 2, 2, 37, 38, 8, 4, 1, 2, 38, 48, 3, 2, 2, 2, 39, 40, 5, 10,
	6, 2, 40, 41, 7, 21, 2, 2, 41, 42, 8, 4, 1, 2, 42, 48, 3, 2, 2, 2, 43,
	44, 5, 20, 11, 2, 44, 45, 7, 21, 2, 2, 45, 46, 8, 4, 1, 2, 46, 48, 3, 2,
	2, 2, 47, 35, 3, 2, 2, 2, 47, 39, 3, 2, 2, 2, 47, 43, 3, 2, 2, 2, 48, 7,
	3, 2, 2, 2, 49, 50, 7, 3, 2, 2, 50, 51, 7, 15, 2, 2, 51, 52, 7, 20, 2,
	2, 52, 53, 5, 16, 9, 2, 53, 54, 7, 22, 2, 2, 54, 55, 5, 12, 7, 2, 55, 56,
	8, 5, 1, 2, 56, 9, 3, 2, 2, 2, 57, 58, 7, 15, 2, 2, 58, 59, 7, 22, 2, 2,
	59, 60, 5, 12, 7, 2, 60, 61, 8, 6, 1, 2, 61, 11, 3, 2, 2, 2, 62, 63, 8,
	7, 1, 2, 63, 64, 5, 18, 10, 2, 64, 65, 8, 7, 1, 2, 65, 73, 3, 2, 2, 2,
	66, 67, 12, 4, 2, 2, 67, 68, 5, 14, 8, 2, 68, 69, 5, 12, 7, 5, 69, 70,
	8, 7, 1, 2, 70, 72, 3, 2, 2, 2, 71, 66, 3, 2, 2, 2, 72, 75, 3, 2, 2, 2,
	73, 71, 3, 2, 2, 2, 73, 74, 3, 2, 2, 2, 74, 13, 3, 2, 2, 2, 75, 73, 3,
	2, 2, 2, 76, 77, 7, 23, 2, 2, 77, 87, 8, 8, 1, 2, 78, 79, 7, 24, 2, 2,
	79, 87, 8, 8, 1, 2, 80, 81, 7, 25, 2, 2, 81, 87, 8, 8, 1, 2, 82, 83, 7,
	26, 2, 2, 83, 87, 8, 8, 1, 2, 84, 85, 7, 27, 2, 2, 85, 87, 8, 8, 1, 2,
	86, 76, 3, 2, 2, 2, 86, 78, 3, 2, 2, 2, 86, 80, 3, 2, 2, 2, 86, 82, 3,
	2, 2, 2, 86, 84, 3, 2, 2, 2, 87, 15, 3, 2, 2, 2, 88, 89, 7, 5, 2, 2, 89,
	101, 8, 9, 1, 2, 90, 91, 7, 6, 2, 2, 91, 101, 8, 9, 1, 2, 92, 93, 7, 7,
	2, 2, 93, 101, 8, 9, 1, 2, 94, 95, 7, 8, 2, 2, 95, 101, 8, 9, 1, 2, 96,
	97, 7, 9, 2, 2, 97, 101, 8, 9, 1, 2, 98, 99, 7, 10, 2, 2, 99, 101, 8, 9,
	1, 2, 100, 88, 3, 2, 2, 2, 100, 90, 3, 2, 2, 2, 100, 92, 3, 2, 2, 2, 100,
	94, 3, 2, 2, 2, 100, 96, 3, 2, 2, 2, 100, 98, 3, 2, 2, 2, 101, 17, 3, 2,
	2, 2, 102, 103, 7, 11, 2, 2, 103, 115, 8, 10, 1, 2, 104, 105, 7, 12, 2,
	2, 105, 115, 8, 10, 1, 2, 106, 107, 7, 13, 2, 2, 107, 115, 8, 10, 1, 2,
	108, 109, 7, 14, 2, 2, 109, 115, 8, 10, 1, 2, 110, 111, 7, 16, 2, 2, 111,
	115, 8, 10, 1, 2, 112, 113, 7, 17, 2, 2, 113, 115, 8, 10, 1, 2, 114, 102,
	3, 2, 2, 2, 114, 104, 3, 2, 2, 2, 114, 106, 3, 2, 2, 2, 114, 108, 3, 2,
	2, 2, 114, 110, 3, 2, 2, 2, 114, 112, 3, 2, 2, 2, 115, 19, 3, 2, 2, 2,
	116, 117, 5, 22, 12, 2, 117, 118, 8, 11, 1, 2, 118, 21, 3, 2, 2, 2, 119,
	120, 7, 4, 2, 2, 120, 121, 7, 18, 2, 2, 121, 122, 5, 12, 7, 2, 122, 123,
	7, 19, 2, 2, 123, 124, 8, 12, 1, 2, 124, 23, 3, 2, 2, 2, 8, 30, 47, 73,
	86, 100, 114,
}
var literalNames = []string{
	"", "'let'", "'println!'", "'i64'", "'f64'", "'bool'", "'char'", "'&str'",
	"'String'", "", "", "", "", "", "'false'", "'true'", "'('", "')'", "':'",
	"';'", "'='", "'*'", "'/'", "'%'", "'+'", "'-'",
}
var symbolicNames = []string{
	"", "LET", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS",
	"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR",
	"CLOSEPAR", "COLOM", "SEMI", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB",
	"WHITESPACE",
}

var ruleNames = []string{
	"start", "instructions", "instruction", "declaration", "assignment", "expression",
	"expOp", "valueType", "value", "functions", "printlnCall",
}

type DBRustParser struct {
	*antlr.BaseParser
}

// NewDBRustParser produces a new parser instance for the optional input antlr.TokenStream.
//
// The *DBRustParser instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewDBRustParser(input antlr.TokenStream) *DBRustParser {
	this := new(DBRustParser)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "DBRust.g4"

	return this
}

// DBRustParser tokens.
const (
	DBRustParserEOF        = antlr.TokenEOF
	DBRustParserLET        = 1
	DBRustParserPRINTLN    = 2
	DBRustParserI64        = 3
	DBRustParserF64        = 4
	DBRustParserBOOL       = 5
	DBRustParserCHARTYPE   = 6
	DBRustParserSTR        = 7
	DBRustParserSTRCLASS   = 8
	DBRustParserNUMBER     = 9
	DBRustParserFLOAT      = 10
	DBRustParserSTRING     = 11
	DBRustParserCHAR       = 12
	DBRustParserID         = 13
	DBRustParserBFALSE     = 14
	DBRustParserBTRUE      = 15
	DBRustParserOPENPAR    = 16
	DBRustParserCLOSEPAR   = 17
	DBRustParserCOLOM      = 18
	DBRustParserSEMI       = 19
	DBRustParserEQUALS     = 20
	DBRustParserMUL        = 21
	DBRustParserDIV        = 22
	DBRustParserMOD        = 23
	DBRustParserADD        = 24
	DBRustParserSUB        = 25
	DBRustParserWHITESPACE = 26
)

// DBRustParser rules.
const (
	DBRustParserRULE_start        = 0
	DBRustParserRULE_instructions = 1
	DBRustParserRULE_instruction  = 2
	DBRustParserRULE_declaration  = 3
	DBRustParserRULE_assignment   = 4
	DBRustParserRULE_expression   = 5
	DBRustParserRULE_expOp        = 6
	DBRustParserRULE_valueType    = 7
	DBRustParserRULE_value        = 8
	DBRustParserRULE_functions    = 9
	DBRustParserRULE_printlnCall  = 10
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instructions returns the _instructions rule contexts.
	Get_instructions() IInstructionsContext

	// Set_instructions sets the _instructions rule contexts.
	Set_instructions(IInstructionsContext)

	// GetList returns the list attribute.
	GetList() *arrayList.List

	// SetList sets the list attribute.
	SetList(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	list          *arrayList.List
	_instructions IInstructionsContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_instructions() IInstructionsContext { return s._instructions }

func (s *StartContext) Set_instructions(v IInstructionsContext) { s._instructions = v }

func (s *StartContext) GetList() *arrayList.List { return s.list }

func (s *StartContext) SetList(v *arrayList.List) { s.list = v }

func (s *StartContext) Instructions() IInstructionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *DBRustParser) Start() (localctx IStartContext) {
	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, DBRustParserRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(22)

		var _x = p.Instructions()

		localctx.(*StartContext)._instructions = _x
	}
	localctx.(*StartContext).list = localctx.(*StartContext).Get_instructions().GetL()

	return localctx
}

// IInstructionsContext is an interface to support dynamic dispatch.
type IInstructionsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruction returns the _instruction rule contexts.
	Get_instruction() IInstructionContext

	// Set_instruction sets the _instruction rule contexts.
	Set_instruction(IInstructionContext)

	// GetE returns the e rule context list.
	GetE() []IInstructionContext

	// SetE sets the e rule context list.
	SetE([]IInstructionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstructionsContext differentiates from other interfaces.
	IsInstructionsContext()
}

type InstructionsContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	l            *arrayList.List
	_instruction IInstructionContext
	e            []IInstructionContext
}

func NewEmptyInstructionsContext() *InstructionsContext {
	var p = new(InstructionsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_instructions
	return p
}

func (*InstructionsContext) IsInstructionsContext() {}

func NewInstructionsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionsContext {
	var p = new(InstructionsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_instructions

	return p
}

func (s *InstructionsContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionsContext) Get_instruction() IInstructionContext { return s._instruction }

func (s *InstructionsContext) Set_instruction(v IInstructionContext) { s._instruction = v }

func (s *InstructionsContext) GetE() []IInstructionContext { return s.e }

func (s *InstructionsContext) SetE(v []IInstructionContext) { s.e = v }

func (s *InstructionsContext) GetL() *arrayList.List { return s.l }

func (s *InstructionsContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstructionsContext) AllInstruction() []IInstructionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstructionContext)(nil)).Elem())
	var tst = make([]IInstructionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstructionContext)
		}
	}

	return tst
}

func (s *InstructionsContext) Instruction(i int) IInstructionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstructionContext)
}

func (s *InstructionsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterInstructions(s)
	}
}

func (s *InstructionsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitInstructions(s)
	}
}

func (p *DBRustParser) Instructions() (localctx IInstructionsContext) {
	localctx = NewInstructionsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, DBRustParserRULE_instructions)

	localctx.(*InstructionsContext).l = arrayList.New()

	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(28)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<DBRustParserLET)|(1<<DBRustParserPRINTLN)|(1<<DBRustParserID))) != 0 {
		{
			p.SetState(25)

			var _x = p.Instruction()

			localctx.(*InstructionsContext)._instruction = _x
		}
		localctx.(*InstructionsContext).e = append(localctx.(*InstructionsContext).e, localctx.(*InstructionsContext)._instruction)

		p.SetState(30)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*InstructionsContext).GetE()
	for _, e := range listInt {
		localctx.(*InstructionsContext).l.Add(e.GetState())
	}

	return localctx
}

// IInstructionContext is an interface to support dynamic dispatch.
type IInstructionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetDecltn returns the decltn rule contexts.
	GetDecltn() IDeclarationContext

	// GetAssign returns the assign rule contexts.
	GetAssign() IAssignmentContext

	// GetFn returns the fn rule contexts.
	GetFn() IFunctionsContext

	// SetDecltn sets the decltn rule contexts.
	SetDecltn(IDeclarationContext)

	// SetAssign sets the assign rule contexts.
	SetAssign(IAssignmentContext)

	// SetFn sets the fn rule contexts.
	SetFn(IFunctionsContext)

	// GetState returns the state attribute.
	GetState() I.IInstruction

	// SetState sets the state attribute.
	SetState(I.IInstruction)

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.IInstruction
	decltn IDeclarationContext
	assign IAssignmentContext
	fn     IFunctionsContext
}

func NewEmptyInstructionContext() *InstructionContext {
	var p = new(InstructionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_instruction
	return p
}

func (*InstructionContext) IsInstructionContext() {}

func NewInstructionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionContext {
	var p = new(InstructionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_instruction

	return p
}

func (s *InstructionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionContext) GetDecltn() IDeclarationContext { return s.decltn }

func (s *InstructionContext) GetAssign() IAssignmentContext { return s.assign }

func (s *InstructionContext) GetFn() IFunctionsContext { return s.fn }

func (s *InstructionContext) SetDecltn(v IDeclarationContext) { s.decltn = v }

func (s *InstructionContext) SetAssign(v IAssignmentContext) { s.assign = v }

func (s *InstructionContext) SetFn(v IFunctionsContext) { s.fn = v }

func (s *InstructionContext) GetState() I.IInstruction { return s.state }

func (s *InstructionContext) SetState(v I.IInstruction) { s.state = v }

func (s *InstructionContext) SEMI() antlr.TerminalNode {
	return s.GetToken(DBRustParserSEMI, 0)
}

func (s *InstructionContext) Declaration() IDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclarationContext)
}

func (s *InstructionContext) Assignment() IAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAssignmentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAssignmentContext)
}

func (s *InstructionContext) Functions() IFunctionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionsContext)
}

func (s *InstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterInstruction(s)
	}
}

func (s *InstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitInstruction(s)
	}
}

func (p *DBRustParser) Instruction() (localctx IInstructionContext) {
	localctx = NewInstructionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, DBRustParserRULE_instruction)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(45)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserLET:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(33)

			var _x = p.Declaration()

			localctx.(*InstructionContext).decltn = _x
		}
		{
			p.SetState(34)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetDecltn().GetState()

	case DBRustParserID:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(37)

			var _x = p.Assignment()

			localctx.(*InstructionContext).assign = _x
		}
		{
			p.SetState(38)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetAssign().GetState()

	case DBRustParserPRINTLN:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(41)

			var _x = p.Functions()

			localctx.(*InstructionContext).fn = _x
		}
		{
			p.SetState(42)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetFn().GetState()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IDeclarationContext is an interface to support dynamic dispatch.
type IDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_valueType returns the _valueType rule contexts.
	Get_valueType() IValueTypeContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_valueType sets the _valueType rule contexts.
	Set_valueType(IValueTypeContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.Declaration

	// SetState sets the state attribute.
	SetState(I.Declaration)

	// IsDeclarationContext differentiates from other interfaces.
	IsDeclarationContext()
}

type DeclarationContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.Declaration
	_ID         antlr.Token
	_valueType  IValueTypeContext
	_expression IExpressionContext
}

func NewEmptyDeclarationContext() *DeclarationContext {
	var p = new(DeclarationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_declaration
	return p
}

func (*DeclarationContext) IsDeclarationContext() {}

func NewDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclarationContext {
	var p = new(DeclarationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_declaration

	return p
}

func (s *DeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclarationContext) Get_ID() antlr.Token { return s._ID }

func (s *DeclarationContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *DeclarationContext) Get_valueType() IValueTypeContext { return s._valueType }

func (s *DeclarationContext) Get_expression() IExpressionContext { return s._expression }

func (s *DeclarationContext) Set_valueType(v IValueTypeContext) { s._valueType = v }

func (s *DeclarationContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *DeclarationContext) GetState() I.Declaration { return s.state }

func (s *DeclarationContext) SetState(v I.Declaration) { s.state = v }

func (s *DeclarationContext) LET() antlr.TerminalNode {
	return s.GetToken(DBRustParserLET, 0)
}

func (s *DeclarationContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *DeclarationContext) COLOM() antlr.TerminalNode {
	return s.GetToken(DBRustParserCOLOM, 0)
}

func (s *DeclarationContext) ValueType() IValueTypeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueTypeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueTypeContext)
}

func (s *DeclarationContext) EQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserEQUALS, 0)
}

func (s *DeclarationContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *DeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterDeclaration(s)
	}
}

func (s *DeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitDeclaration(s)
	}
}

func (p *DBRustParser) Declaration() (localctx IDeclarationContext) {
	localctx = NewDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, DBRustParserRULE_declaration)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(47)
		p.Match(DBRustParserLET)
	}
	{
		p.SetState(48)

		var _m = p.Match(DBRustParserID)

		localctx.(*DeclarationContext)._ID = _m
	}
	{
		p.SetState(49)
		p.Match(DBRustParserCOLOM)
	}
	{
		p.SetState(50)

		var _x = p.ValueType()

		localctx.(*DeclarationContext)._valueType = _x
	}
	{
		p.SetState(51)
		p.Match(DBRustParserEQUALS)
	}
	{
		p.SetState(52)

		var _x = p.expression(0)

		localctx.(*DeclarationContext)._expression = _x
	}

	expPoint := localctx.(*DeclarationContext).Get_expression().GetState()
	localctx.(*DeclarationContext).state = I.Declaration{
		Instruction: I.Instruction{"Declaration"},
		Type:        localctx.(*DeclarationContext).Get_valueType().GetState(),
		Id: (func() string {
			if localctx.(*DeclarationContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*DeclarationContext).Get_ID().GetText()
			}
		}()),
		Expression: &expPoint,
	}

	return localctx
}

// IAssignmentContext is an interface to support dynamic dispatch.
type IAssignmentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.Assignment

	// SetState sets the state attribute.
	SetState(I.Assignment)

	// IsAssignmentContext differentiates from other interfaces.
	IsAssignmentContext()
}

type AssignmentContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.Assignment
	_ID         antlr.Token
	_expression IExpressionContext
}

func NewEmptyAssignmentContext() *AssignmentContext {
	var p = new(AssignmentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_assignment
	return p
}

func (*AssignmentContext) IsAssignmentContext() {}

func NewAssignmentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AssignmentContext {
	var p = new(AssignmentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_assignment

	return p
}

func (s *AssignmentContext) GetParser() antlr.Parser { return s.parser }

func (s *AssignmentContext) Get_ID() antlr.Token { return s._ID }

func (s *AssignmentContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *AssignmentContext) Get_expression() IExpressionContext { return s._expression }

func (s *AssignmentContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AssignmentContext) GetState() I.Assignment { return s.state }

func (s *AssignmentContext) SetState(v I.Assignment) { s.state = v }

func (s *AssignmentContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *AssignmentContext) EQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserEQUALS, 0)
}

func (s *AssignmentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AssignmentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AssignmentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AssignmentContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterAssignment(s)
	}
}

func (s *AssignmentContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitAssignment(s)
	}
}

func (p *DBRustParser) Assignment() (localctx IAssignmentContext) {
	localctx = NewAssignmentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, DBRustParserRULE_assignment)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(55)

		var _m = p.Match(DBRustParserID)

		localctx.(*AssignmentContext)._ID = _m
	}
	{
		p.SetState(56)
		p.Match(DBRustParserEQUALS)
	}
	{
		p.SetState(57)

		var _x = p.expression(0)

		localctx.(*AssignmentContext)._expression = _x
	}

	expPoint := localctx.(*AssignmentContext).Get_expression().GetState()
	localctx.(*AssignmentContext).state = I.Assignment{
		Instruction: I.Instruction{"Assignment"},
		Id: (func() string {
			if localctx.(*AssignmentContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*AssignmentContext).Get_ID().GetText()
			}
		}()),
		Expression: &expPoint,
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetLeftExp returns the leftExp rule contexts.
	GetLeftExp() IExpressionContext

	// Get_value returns the _value rule contexts.
	Get_value() IValueContext

	// Get_expOp returns the _expOp rule contexts.
	Get_expOp() IExpOpContext

	// GetRightExp returns the rightExp rule contexts.
	GetRightExp() IExpressionContext

	// SetLeftExp sets the leftExp rule contexts.
	SetLeftExp(IExpressionContext)

	// Set_value sets the _value rule contexts.
	Set_value(IValueContext)

	// Set_expOp sets the _expOp rule contexts.
	Set_expOp(IExpOpContext)

	// SetRightExp sets the rightExp rule contexts.
	SetRightExp(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.Expression

	// SetState sets the state attribute.
	SetState(I.Expression)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	state    I.Expression
	leftExp  IExpressionContext
	_value   IValueContext
	_expOp   IExpOpContext
	rightExp IExpressionContext
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) GetLeftExp() IExpressionContext { return s.leftExp }

func (s *ExpressionContext) Get_value() IValueContext { return s._value }

func (s *ExpressionContext) Get_expOp() IExpOpContext { return s._expOp }

func (s *ExpressionContext) GetRightExp() IExpressionContext { return s.rightExp }

func (s *ExpressionContext) SetLeftExp(v IExpressionContext) { s.leftExp = v }

func (s *ExpressionContext) Set_value(v IValueContext) { s._value = v }

func (s *ExpressionContext) Set_expOp(v IExpOpContext) { s._expOp = v }

func (s *ExpressionContext) SetRightExp(v IExpressionContext) { s.rightExp = v }

func (s *ExpressionContext) GetState() I.Expression { return s.state }

func (s *ExpressionContext) SetState(v I.Expression) { s.state = v }

func (s *ExpressionContext) Value() IValueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueContext)
}

func (s *ExpressionContext) ExpOp() IExpOpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpOpContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpOpContext)
}

func (s *ExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *DBRustParser) Expression() (localctx IExpressionContext) {
	return p.expression(0)
}

func (p *DBRustParser) expression(_p int) (localctx IExpressionContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpressionContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 10
	p.EnterRecursionRule(localctx, 10, DBRustParserRULE_expression, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(61)

		var _x = p.Value()

		localctx.(*ExpressionContext)._value = _x
	}

	sym := localctx.(*ExpressionContext).Get_value().GetState()
	localctx.(*ExpressionContext).state = I.Expression{
		Value:     &sym,
		Left:      nil,
		Right:     nil,
		Operation: I.NOOP,
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(71)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewExpressionContext(p, _parentctx, _parentState)
			localctx.(*ExpressionContext).leftExp = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_expression)
			p.SetState(64)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(65)

				var _x = p.ExpOp()

				localctx.(*ExpressionContext)._expOp = _x
			}
			{
				p.SetState(66)

				var _x = p.expression(3)

				localctx.(*ExpressionContext).rightExp = _x
			}

			left, right := localctx.(*ExpressionContext).GetLeftExp().GetState(), localctx.(*ExpressionContext).GetRightExp().GetState()
			localctx.(*ExpressionContext).state = I.Expression{
				Value:     nil,
				Left:      &left,
				Right:     &right,
				Operation: localctx.(*ExpressionContext).Get_expOp().GetState(),
			}

		}
		p.SetState(73)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext())
	}

	return localctx
}

// IExpOpContext is an interface to support dynamic dispatch.
type IExpOpContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.Operation

	// SetState sets the state attribute.
	SetState(I.Operation)

	// IsExpOpContext differentiates from other interfaces.
	IsExpOpContext()
}

type ExpOpContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.Operation
}

func NewEmptyExpOpContext() *ExpOpContext {
	var p = new(ExpOpContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expOp
	return p
}

func (*ExpOpContext) IsExpOpContext() {}

func NewExpOpContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpOpContext {
	var p = new(ExpOpContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expOp

	return p
}

func (s *ExpOpContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpOpContext) GetState() I.Operation { return s.state }

func (s *ExpOpContext) SetState(v I.Operation) { s.state = v }

func (s *ExpOpContext) MUL() antlr.TerminalNode {
	return s.GetToken(DBRustParserMUL, 0)
}

func (s *ExpOpContext) DIV() antlr.TerminalNode {
	return s.GetToken(DBRustParserDIV, 0)
}

func (s *ExpOpContext) MOD() antlr.TerminalNode {
	return s.GetToken(DBRustParserMOD, 0)
}

func (s *ExpOpContext) ADD() antlr.TerminalNode {
	return s.GetToken(DBRustParserADD, 0)
}

func (s *ExpOpContext) SUB() antlr.TerminalNode {
	return s.GetToken(DBRustParserSUB, 0)
}

func (s *ExpOpContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpOpContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpOpContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpOp(s)
	}
}

func (s *ExpOpContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpOp(s)
	}
}

func (p *DBRustParser) ExpOp() (localctx IExpOpContext) {
	localctx = NewExpOpContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, DBRustParserRULE_expOp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(84)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserMUL:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(74)
			p.Match(DBRustParserMUL)
		}
		localctx.(*ExpOpContext).state = I.MUL

	case DBRustParserDIV:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(76)
			p.Match(DBRustParserDIV)
		}
		localctx.(*ExpOpContext).state = I.DIV

	case DBRustParserMOD:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(78)
			p.Match(DBRustParserMOD)
		}
		localctx.(*ExpOpContext).state = I.MOD

	case DBRustParserADD:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(80)
			p.Match(DBRustParserADD)
		}
		localctx.(*ExpOpContext).state = I.ADD

	case DBRustParserSUB:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(82)
			p.Match(DBRustParserSUB)
		}
		localctx.(*ExpOpContext).state = I.SUB

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IValueTypeContext is an interface to support dynamic dispatch.
type IValueTypeContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.ValueType

	// SetState sets the state attribute.
	SetState(I.ValueType)

	// IsValueTypeContext differentiates from other interfaces.
	IsValueTypeContext()
}

type ValueTypeContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.ValueType
}

func NewEmptyValueTypeContext() *ValueTypeContext {
	var p = new(ValueTypeContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_valueType
	return p
}

func (*ValueTypeContext) IsValueTypeContext() {}

func NewValueTypeContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ValueTypeContext {
	var p = new(ValueTypeContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_valueType

	return p
}

func (s *ValueTypeContext) GetParser() antlr.Parser { return s.parser }

func (s *ValueTypeContext) GetState() I.ValueType { return s.state }

func (s *ValueTypeContext) SetState(v I.ValueType) { s.state = v }

func (s *ValueTypeContext) I64() antlr.TerminalNode {
	return s.GetToken(DBRustParserI64, 0)
}

func (s *ValueTypeContext) F64() antlr.TerminalNode {
	return s.GetToken(DBRustParserF64, 0)
}

func (s *ValueTypeContext) BOOL() antlr.TerminalNode {
	return s.GetToken(DBRustParserBOOL, 0)
}

func (s *ValueTypeContext) CHARTYPE() antlr.TerminalNode {
	return s.GetToken(DBRustParserCHARTYPE, 0)
}

func (s *ValueTypeContext) STR() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTR, 0)
}

func (s *ValueTypeContext) STRCLASS() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTRCLASS, 0)
}

func (s *ValueTypeContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueTypeContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ValueTypeContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterValueType(s)
	}
}

func (s *ValueTypeContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitValueType(s)
	}
}

func (p *DBRustParser) ValueType() (localctx IValueTypeContext) {
	localctx = NewValueTypeContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, DBRustParserRULE_valueType)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(98)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserI64:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(86)
			p.Match(DBRustParserI64)
		}
		localctx.(*ValueTypeContext).state = I.INTEGER

	case DBRustParserF64:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(88)
			p.Match(DBRustParserF64)
		}
		localctx.(*ValueTypeContext).state = I.FLOAT

	case DBRustParserBOOL:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(90)
			p.Match(DBRustParserBOOL)
		}
		localctx.(*ValueTypeContext).state = I.BOOL

	case DBRustParserCHARTYPE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(92)
			p.Match(DBRustParserCHARTYPE)
		}
		localctx.(*ValueTypeContext).state = I.CHAR

	case DBRustParserSTR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(94)
			p.Match(DBRustParserSTR)
		}
		localctx.(*ValueTypeContext).state = I.STR

	case DBRustParserSTRCLASS:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(96)
			p.Match(DBRustParserSTRCLASS)
		}
		localctx.(*ValueTypeContext).state = I.STRING

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IValueContext is an interface to support dynamic dispatch.
type IValueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Get_CHAR returns the _CHAR token.
	Get_CHAR() antlr.Token

	// Get_BFALSE returns the _BFALSE token.
	Get_BFALSE() antlr.Token

	// Get_BTRUE returns the _BTRUE token.
	Get_BTRUE() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// Set_CHAR sets the _CHAR token.
	Set_CHAR(antlr.Token)

	// Set_BFALSE sets the _BFALSE token.
	Set_BFALSE(antlr.Token)

	// Set_BTRUE sets the _BTRUE token.
	Set_BTRUE(antlr.Token)

	// GetState returns the state attribute.
	GetState() I.Value

	// SetState sets the state attribute.
	SetState(I.Value)

	// IsValueContext differentiates from other interfaces.
	IsValueContext()
}

type ValueContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	state   I.Value
	_NUMBER antlr.Token
	_FLOAT  antlr.Token
	_STRING antlr.Token
	_CHAR   antlr.Token
	_BFALSE antlr.Token
	_BTRUE  antlr.Token
}

func NewEmptyValueContext() *ValueContext {
	var p = new(ValueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_value
	return p
}

func (*ValueContext) IsValueContext() {}

func NewValueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ValueContext {
	var p = new(ValueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_value

	return p
}

func (s *ValueContext) GetParser() antlr.Parser { return s.parser }

func (s *ValueContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *ValueContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *ValueContext) Get_STRING() antlr.Token { return s._STRING }

func (s *ValueContext) Get_CHAR() antlr.Token { return s._CHAR }

func (s *ValueContext) Get_BFALSE() antlr.Token { return s._BFALSE }

func (s *ValueContext) Get_BTRUE() antlr.Token { return s._BTRUE }

func (s *ValueContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *ValueContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *ValueContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *ValueContext) Set_CHAR(v antlr.Token) { s._CHAR = v }

func (s *ValueContext) Set_BFALSE(v antlr.Token) { s._BFALSE = v }

func (s *ValueContext) Set_BTRUE(v antlr.Token) { s._BTRUE = v }

func (s *ValueContext) GetState() I.Value { return s.state }

func (s *ValueContext) SetState(v I.Value) { s.state = v }

func (s *ValueContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(DBRustParserNUMBER, 0)
}

func (s *ValueContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(DBRustParserFLOAT, 0)
}

func (s *ValueContext) STRING() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTRING, 0)
}

func (s *ValueContext) CHAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCHAR, 0)
}

func (s *ValueContext) BFALSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserBFALSE, 0)
}

func (s *ValueContext) BTRUE() antlr.TerminalNode {
	return s.GetToken(DBRustParserBTRUE, 0)
}

func (s *ValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ValueContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterValue(s)
	}
}

func (s *ValueContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitValue(s)
	}
}

func (p *DBRustParser) Value() (localctx IValueContext) {
	localctx = NewValueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, DBRustParserRULE_value)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(112)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(100)

			var _m = p.Match(DBRustParserNUMBER)

			localctx.(*ValueContext)._NUMBER = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_NUMBER() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_NUMBER().GetLine()
			}
		}()), localctx.(*ValueContext).Get_NUMBER().GetColumn(), I.INTEGER, (func() string {
			if localctx.(*ValueContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_NUMBER().GetText()
			}
		}())}

	case DBRustParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(102)

			var _m = p.Match(DBRustParserFLOAT)

			localctx.(*ValueContext)._FLOAT = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_FLOAT() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_FLOAT().GetLine()
			}
		}()), localctx.(*ValueContext).Get_FLOAT().GetColumn(), I.FLOAT, (func() string {
			if localctx.(*ValueContext).Get_FLOAT() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_FLOAT().GetText()
			}
		}())}

	case DBRustParserSTRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(104)

			var _m = p.Match(DBRustParserSTRING)

			localctx.(*ValueContext)._STRING = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_STRING().GetLine()
			}
		}()), localctx.(*ValueContext).Get_STRING().GetColumn(), I.STRING, (func() string {
			if localctx.(*ValueContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*ValueContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_STRING().GetText()
			}
		}()))-1]}

	case DBRustParserCHAR:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(106)

			var _m = p.Match(DBRustParserCHAR)

			localctx.(*ValueContext)._CHAR = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_CHAR() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_CHAR().GetLine()
			}
		}()), localctx.(*ValueContext).Get_CHAR().GetColumn(), I.CHAR, (func() string {
			if localctx.(*ValueContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_CHAR().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*ValueContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_CHAR().GetText()
			}
		}()))-1]}

	case DBRustParserBFALSE:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(108)

			var _m = p.Match(DBRustParserBFALSE)

			localctx.(*ValueContext)._BFALSE = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_BFALSE() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_BFALSE().GetLine()
			}
		}()), localctx.(*ValueContext).Get_BFALSE().GetColumn(), I.BOOL, (func() string {
			if localctx.(*ValueContext).Get_BFALSE() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_BFALSE().GetText()
			}
		}())}

	case DBRustParserBTRUE:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(110)

			var _m = p.Match(DBRustParserBTRUE)

			localctx.(*ValueContext)._BTRUE = _m
		}
		localctx.(*ValueContext).state = I.Value{(func() int {
			if localctx.(*ValueContext).Get_BTRUE() == nil {
				return 0
			} else {
				return localctx.(*ValueContext).Get_BTRUE().GetLine()
			}
		}()), localctx.(*ValueContext).Get_BTRUE().GetColumn(), I.BOOL, (func() string {
			if localctx.(*ValueContext).Get_BTRUE() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_BTRUE().GetText()
			}
		}())}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IFunctionsContext is an interface to support dynamic dispatch.
type IFunctionsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printlnCall returns the _printlnCall rule contexts.
	Get_printlnCall() IPrintlnCallContext

	// Set_printlnCall sets the _printlnCall rule contexts.
	Set_printlnCall(IPrintlnCallContext)

	// GetState returns the state attribute.
	GetState() I.IFunctionCall

	// SetState sets the state attribute.
	SetState(I.IFunctionCall)

	// IsFunctionsContext differentiates from other interfaces.
	IsFunctionsContext()
}

type FunctionsContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	state        I.IFunctionCall
	_printlnCall IPrintlnCallContext
}

func NewEmptyFunctionsContext() *FunctionsContext {
	var p = new(FunctionsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_functions
	return p
}

func (*FunctionsContext) IsFunctionsContext() {}

func NewFunctionsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionsContext {
	var p = new(FunctionsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_functions

	return p
}

func (s *FunctionsContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionsContext) Get_printlnCall() IPrintlnCallContext { return s._printlnCall }

func (s *FunctionsContext) Set_printlnCall(v IPrintlnCallContext) { s._printlnCall = v }

func (s *FunctionsContext) GetState() I.IFunctionCall { return s.state }

func (s *FunctionsContext) SetState(v I.IFunctionCall) { s.state = v }

func (s *FunctionsContext) PrintlnCall() IPrintlnCallContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrintlnCallContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrintlnCallContext)
}

func (s *FunctionsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterFunctions(s)
	}
}

func (s *FunctionsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitFunctions(s)
	}
}

func (p *DBRustParser) Functions() (localctx IFunctionsContext) {
	localctx = NewFunctionsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, DBRustParserRULE_functions)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(114)

		var _x = p.PrintlnCall()

		localctx.(*FunctionsContext)._printlnCall = _x
	}
	localctx.(*FunctionsContext).state = localctx.(*FunctionsContext).Get_printlnCall().GetState()

	return localctx
}

// IPrintlnCallContext is an interface to support dynamic dispatch.
type IPrintlnCallContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.IFunctionCall

	// SetState sets the state attribute.
	SetState(I.IFunctionCall)

	// IsPrintlnCallContext differentiates from other interfaces.
	IsPrintlnCallContext()
}

type PrintlnCallContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.IFunctionCall
	_expression IExpressionContext
}

func NewEmptyPrintlnCallContext() *PrintlnCallContext {
	var p = new(PrintlnCallContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_printlnCall
	return p
}

func (*PrintlnCallContext) IsPrintlnCallContext() {}

func NewPrintlnCallContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintlnCallContext {
	var p = new(PrintlnCallContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_printlnCall

	return p
}

func (s *PrintlnCallContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintlnCallContext) Get_expression() IExpressionContext { return s._expression }

func (s *PrintlnCallContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *PrintlnCallContext) GetState() I.IFunctionCall { return s.state }

func (s *PrintlnCallContext) SetState(v I.IFunctionCall) { s.state = v }

func (s *PrintlnCallContext) PRINTLN() antlr.TerminalNode {
	return s.GetToken(DBRustParserPRINTLN, 0)
}

func (s *PrintlnCallContext) OPENPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENPAR, 0)
}

func (s *PrintlnCallContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *PrintlnCallContext) CLOSEPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEPAR, 0)
}

func (s *PrintlnCallContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintlnCallContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintlnCallContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterPrintlnCall(s)
	}
}

func (s *PrintlnCallContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitPrintlnCall(s)
	}
}

func (p *DBRustParser) PrintlnCall() (localctx IPrintlnCallContext) {
	localctx = NewPrintlnCallContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, DBRustParserRULE_printlnCall)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(117)
		p.Match(DBRustParserPRINTLN)
	}
	{
		p.SetState(118)
		p.Match(DBRustParserOPENPAR)
	}
	{
		p.SetState(119)

		var _x = p.expression(0)

		localctx.(*PrintlnCallContext)._expression = _x
	}
	{
		p.SetState(120)
		p.Match(DBRustParserCLOSEPAR)
	}

	expPoint := localctx.(*PrintlnCallContext).Get_expression().GetState()
	localctx.(*PrintlnCallContext).state = I.PrintlnCall{I.FunctionCall{"PrintLn", []*I.Expression{&expPoint}}}

	return localctx
}

func (p *DBRustParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 5:
		var t *ExpressionContext = nil
		if localctx != nil {
			t = localctx.(*ExpressionContext)
		}
		return p.Expression_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *DBRustParser) Expression_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
