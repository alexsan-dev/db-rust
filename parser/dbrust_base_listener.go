// Code generated from DBRust.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // DBRust

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseDBRustListener is a complete listener for a parse tree produced by DBRustParser.
type BaseDBRustListener struct{}

var _ DBRustListener = &BaseDBRustListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseDBRustListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseDBRustListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseDBRustListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseDBRustListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseDBRustListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseDBRustListener) ExitStart(ctx *StartContext) {}

// EnterInstructionsBlock is called when production instructionsBlock is entered.
func (s *BaseDBRustListener) EnterInstructionsBlock(ctx *InstructionsBlockContext) {}

// ExitInstructionsBlock is called when production instructionsBlock is exited.
func (s *BaseDBRustListener) ExitInstructionsBlock(ctx *InstructionsBlockContext) {}

// EnterInstructions is called when production instructions is entered.
func (s *BaseDBRustListener) EnterInstructions(ctx *InstructionsContext) {}

// ExitInstructions is called when production instructions is exited.
func (s *BaseDBRustListener) ExitInstructions(ctx *InstructionsContext) {}

// EnterInstruction is called when production instruction is entered.
func (s *BaseDBRustListener) EnterInstruction(ctx *InstructionContext) {}

// ExitInstruction is called when production instruction is exited.
func (s *BaseDBRustListener) ExitInstruction(ctx *InstructionContext) {}

// EnterDeclaration is called when production declaration is entered.
func (s *BaseDBRustListener) EnterDeclaration(ctx *DeclarationContext) {}

// ExitDeclaration is called when production declaration is exited.
func (s *BaseDBRustListener) ExitDeclaration(ctx *DeclarationContext) {}

// EnterAssignment is called when production assignment is entered.
func (s *BaseDBRustListener) EnterAssignment(ctx *AssignmentContext) {}

// ExitAssignment is called when production assignment is exited.
func (s *BaseDBRustListener) ExitAssignment(ctx *AssignmentContext) {}

// EnterExpList is called when production expList is entered.
func (s *BaseDBRustListener) EnterExpList(ctx *ExpListContext) {}

// ExitExpList is called when production expList is exited.
func (s *BaseDBRustListener) ExitExpList(ctx *ExpListContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseDBRustListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseDBRustListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpOp is called when production expOp is entered.
func (s *BaseDBRustListener) EnterExpOp(ctx *ExpOpContext) {}

// ExitExpOp is called when production expOp is exited.
func (s *BaseDBRustListener) ExitExpOp(ctx *ExpOpContext) {}

// EnterValueType is called when production valueType is entered.
func (s *BaseDBRustListener) EnterValueType(ctx *ValueTypeContext) {}

// ExitValueType is called when production valueType is exited.
func (s *BaseDBRustListener) ExitValueType(ctx *ValueTypeContext) {}

// EnterValue is called when production value is entered.
func (s *BaseDBRustListener) EnterValue(ctx *ValueContext) {}

// ExitValue is called when production value is exited.
func (s *BaseDBRustListener) ExitValue(ctx *ValueContext) {}

// EnterFunctionCall is called when production functionCall is entered.
func (s *BaseDBRustListener) EnterFunctionCall(ctx *FunctionCallContext) {}

// ExitFunctionCall is called when production functionCall is exited.
func (s *BaseDBRustListener) ExitFunctionCall(ctx *FunctionCallContext) {}

// EnterMethods is called when production methods is entered.
func (s *BaseDBRustListener) EnterMethods(ctx *MethodsContext) {}

// ExitMethods is called when production methods is exited.
func (s *BaseDBRustListener) ExitMethods(ctx *MethodsContext) {}

// EnterPrintlnCall is called when production printlnCall is entered.
func (s *BaseDBRustListener) EnterPrintlnCall(ctx *PrintlnCallContext) {}

// ExitPrintlnCall is called when production printlnCall is exited.
func (s *BaseDBRustListener) ExitPrintlnCall(ctx *PrintlnCallContext) {}

// EnterFunction is called when production function is entered.
func (s *BaseDBRustListener) EnterFunction(ctx *FunctionContext) {}

// ExitFunction is called when production function is exited.
func (s *BaseDBRustListener) ExitFunction(ctx *FunctionContext) {}
