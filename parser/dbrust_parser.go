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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 25, 109,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 3, 2, 3, 2, 3, 2, 3, 3, 7, 3, 25,
	10, 3, 12, 3, 14, 3, 28, 11, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 5, 4, 40, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3,
	5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7, 64, 10, 7, 12, 7, 14, 7, 67, 11, 7, 3,
	8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 5, 8, 79, 10,
	8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3,
	9, 5, 9, 93, 10, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 107, 10, 10, 3, 10, 2, 3, 12, 11,
	2, 4, 6, 8, 10, 12, 14, 16, 18, 2, 2, 2, 116, 2, 20, 3, 2, 2, 2, 4, 26,
	3, 2, 2, 2, 6, 39, 3, 2, 2, 2, 8, 41, 3, 2, 2, 2, 10, 49, 3, 2, 2, 2, 12,
	54, 3, 2, 2, 2, 14, 78, 3, 2, 2, 2, 16, 92, 3, 2, 2, 2, 18, 106, 3, 2,
	2, 2, 20, 21, 5, 4, 3, 2, 21, 22, 8, 2, 1, 2, 22, 3, 3, 2, 2, 2, 23, 25,
	5, 6, 4, 2, 24, 23, 3, 2, 2, 2, 25, 28, 3, 2, 2, 2, 26, 24, 3, 2, 2, 2,
	26, 27, 3, 2, 2, 2, 27, 29, 3, 2, 2, 2, 28, 26, 3, 2, 2, 2, 29, 30, 8,
	3, 1, 2, 30, 5, 3, 2, 2, 2, 31, 32, 5, 8, 5, 2, 32, 33, 7, 18, 2, 2, 33,
	34, 8, 4, 1, 2, 34, 40, 3, 2, 2, 2, 35, 36, 5, 10, 6, 2, 36, 37, 7, 18,
	2, 2, 37, 38, 8, 4, 1, 2, 38, 40, 3, 2, 2, 2, 39, 31, 3, 2, 2, 2, 39, 35,
	3, 2, 2, 2, 40, 7, 3, 2, 2, 2, 41, 42, 7, 3, 2, 2, 42, 43, 7, 14, 2, 2,
	43, 44, 7, 17, 2, 2, 44, 45, 5, 16, 9, 2, 45, 46, 7, 19, 2, 2, 46, 47,
	5, 12, 7, 2, 47, 48, 8, 5, 1, 2, 48, 9, 3, 2, 2, 2, 49, 50, 7, 14, 2, 2,
	50, 51, 7, 19, 2, 2, 51, 52, 5, 12, 7, 2, 52, 53, 8, 6, 1, 2, 53, 11, 3,
	2, 2, 2, 54, 55, 8, 7, 1, 2, 55, 56, 5, 18, 10, 2, 56, 57, 8, 7, 1, 2,
	57, 65, 3, 2, 2, 2, 58, 59, 12, 4, 2, 2, 59, 60, 5, 14, 8, 2, 60, 61, 5,
	12, 7, 5, 61, 62, 8, 7, 1, 2, 62, 64, 3, 2, 2, 2, 63, 58, 3, 2, 2, 2, 64,
	67, 3, 2, 2, 2, 65, 63, 3, 2, 2, 2, 65, 66, 3, 2, 2, 2, 66, 13, 3, 2, 2,
	2, 67, 65, 3, 2, 2, 2, 68, 69, 7, 20, 2, 2, 69, 79, 8, 8, 1, 2, 70, 71,
	7, 21, 2, 2, 71, 79, 8, 8, 1, 2, 72, 73, 7, 22, 2, 2, 73, 79, 8, 8, 1,
	2, 74, 75, 7, 23, 2, 2, 75, 79, 8, 8, 1, 2, 76, 77, 7, 24, 2, 2, 77, 79,
	8, 8, 1, 2, 78, 68, 3, 2, 2, 2, 78, 70, 3, 2, 2, 2, 78, 72, 3, 2, 2, 2,
	78, 74, 3, 2, 2, 2, 78, 76, 3, 2, 2, 2, 79, 15, 3, 2, 2, 2, 80, 81, 7,
	4, 2, 2, 81, 93, 8, 9, 1, 2, 82, 83, 7, 5, 2, 2, 83, 93, 8, 9, 1, 2, 84,
	85, 7, 6, 2, 2, 85, 93, 8, 9, 1, 2, 86, 87, 7, 7, 2, 2, 87, 93, 8, 9, 1,
	2, 88, 89, 7, 8, 2, 2, 89, 93, 8, 9, 1, 2, 90, 91, 7, 9, 2, 2, 91, 93,
	8, 9, 1, 2, 92, 80, 3, 2, 2, 2, 92, 82, 3, 2, 2, 2, 92, 84, 3, 2, 2, 2,
	92, 86, 3, 2, 2, 2, 92, 88, 3, 2, 2, 2, 92, 90, 3, 2, 2, 2, 93, 17, 3,
	2, 2, 2, 94, 95, 7, 10, 2, 2, 95, 107, 8, 10, 1, 2, 96, 97, 7, 11, 2, 2,
	97, 107, 8, 10, 1, 2, 98, 99, 7, 12, 2, 2, 99, 107, 8, 10, 1, 2, 100, 101,
	7, 13, 2, 2, 101, 107, 8, 10, 1, 2, 102, 103, 7, 15, 2, 2, 103, 107, 8,
	10, 1, 2, 104, 105, 7, 16, 2, 2, 105, 107, 8, 10, 1, 2, 106, 94, 3, 2,
	2, 2, 106, 96, 3, 2, 2, 2, 106, 98, 3, 2, 2, 2, 106, 100, 3, 2, 2, 2, 106,
	102, 3, 2, 2, 2, 106, 104, 3, 2, 2, 2, 107, 19, 3, 2, 2, 2, 8, 26, 39,
	65, 78, 92, 106,
}
var literalNames = []string{
	"", "'let'", "'i64'", "'f64'", "'bool'", "'char'", "'&str'", "'String'",
	"", "", "", "", "", "'false'", "'true'", "':'", "';'", "'='", "'*'", "'/'",
	"'%'", "'+'", "'-'",
}
var symbolicNames = []string{
	"", "LET", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", "NUMBER",
	"FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "COLOM", "SEMI", "EQUALS",
	"MUL", "DIV", "MOD", "ADD", "SUB", "WHITESPACE",
}

var ruleNames = []string{
	"start", "instructions", "instruction", "declaration", "assignment", "expression",
	"expOp", "valueType", "value",
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
	DBRustParserI64        = 2
	DBRustParserF64        = 3
	DBRustParserBOOL       = 4
	DBRustParserCHARTYPE   = 5
	DBRustParserSTR        = 6
	DBRustParserSTRCLASS   = 7
	DBRustParserNUMBER     = 8
	DBRustParserFLOAT      = 9
	DBRustParserSTRING     = 10
	DBRustParserCHAR       = 11
	DBRustParserID         = 12
	DBRustParserBFALSE     = 13
	DBRustParserBTRUE      = 14
	DBRustParserCOLOM      = 15
	DBRustParserSEMI       = 16
	DBRustParserEQUALS     = 17
	DBRustParserMUL        = 18
	DBRustParserDIV        = 19
	DBRustParserMOD        = 20
	DBRustParserADD        = 21
	DBRustParserSUB        = 22
	DBRustParserWHITESPACE = 23
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
		p.SetState(18)

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
	p.SetState(24)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == DBRustParserLET || _la == DBRustParserID {
		{
			p.SetState(21)

			var _x = p.Instruction()

			localctx.(*InstructionsContext)._instruction = _x
		}
		localctx.(*InstructionsContext).e = append(localctx.(*InstructionsContext).e, localctx.(*InstructionsContext)._instruction)

		p.SetState(26)
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

	// SetDecltn sets the decltn rule contexts.
	SetDecltn(IDeclarationContext)

	// SetAssign sets the assign rule contexts.
	SetAssign(IAssignmentContext)

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

func (s *InstructionContext) SetDecltn(v IDeclarationContext) { s.decltn = v }

func (s *InstructionContext) SetAssign(v IAssignmentContext) { s.assign = v }

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

	p.SetState(37)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserLET:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(29)

			var _x = p.Declaration()

			localctx.(*InstructionContext).decltn = _x
		}
		{
			p.SetState(30)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetDecltn().GetState()

	case DBRustParserID:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(33)

			var _x = p.Assignment()

			localctx.(*InstructionContext).assign = _x
		}
		{
			p.SetState(34)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetAssign().GetState()

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
		p.SetState(39)
		p.Match(DBRustParserLET)
	}
	{
		p.SetState(40)

		var _m = p.Match(DBRustParserID)

		localctx.(*DeclarationContext)._ID = _m
	}
	{
		p.SetState(41)
		p.Match(DBRustParserCOLOM)
	}
	{
		p.SetState(42)

		var _x = p.ValueType()

		localctx.(*DeclarationContext)._valueType = _x
	}
	{
		p.SetState(43)
		p.Match(DBRustParserEQUALS)
	}
	{
		p.SetState(44)

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
		p.SetState(47)

		var _m = p.Match(DBRustParserID)

		localctx.(*AssignmentContext)._ID = _m
	}
	{
		p.SetState(48)
		p.Match(DBRustParserEQUALS)
	}
	{
		p.SetState(49)

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
		p.SetState(53)

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
	p.SetState(63)
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
			p.SetState(56)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(57)

				var _x = p.ExpOp()

				localctx.(*ExpressionContext)._expOp = _x
			}
			{
				p.SetState(58)

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
		p.SetState(65)
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

	p.SetState(76)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserMUL:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(66)
			p.Match(DBRustParserMUL)
		}
		localctx.(*ExpOpContext).state = I.MUL

	case DBRustParserDIV:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(68)
			p.Match(DBRustParserDIV)
		}
		localctx.(*ExpOpContext).state = I.DIV

	case DBRustParserMOD:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(70)
			p.Match(DBRustParserMOD)
		}
		localctx.(*ExpOpContext).state = I.MOD

	case DBRustParserADD:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(72)
			p.Match(DBRustParserADD)
		}
		localctx.(*ExpOpContext).state = I.ADD

	case DBRustParserSUB:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(74)
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

	p.SetState(90)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserI64:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(78)
			p.Match(DBRustParserI64)
		}
		localctx.(*ValueTypeContext).state = I.INTEGER

	case DBRustParserF64:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(80)
			p.Match(DBRustParserF64)
		}
		localctx.(*ValueTypeContext).state = I.FLOAT

	case DBRustParserBOOL:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(82)
			p.Match(DBRustParserBOOL)
		}
		localctx.(*ValueTypeContext).state = I.BOOL

	case DBRustParserCHARTYPE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(84)
			p.Match(DBRustParserCHARTYPE)
		}
		localctx.(*ValueTypeContext).state = I.CHAR

	case DBRustParserSTR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(86)
			p.Match(DBRustParserSTR)
		}
		localctx.(*ValueTypeContext).state = I.STR

	case DBRustParserSTRCLASS:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(88)
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

	p.SetState(104)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(92)

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
			p.SetState(94)

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
			p.SetState(96)

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
			p.SetState(98)

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
			p.SetState(100)

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
			p.SetState(102)

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
