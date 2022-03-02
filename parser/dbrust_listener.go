// Code generated from DBRust.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // DBRust

import "github.com/antlr/antlr4/runtime/Go/antlr"

// DBRustListener is a complete listener for a parse tree produced by DBRustParser.
type DBRustListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstructionsBlock is called when entering the instructionsBlock production.
	EnterInstructionsBlock(c *InstructionsBlockContext)

	// EnterInstructions is called when entering the instructions production.
	EnterInstructions(c *InstructionsContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterDeclaration is called when entering the declaration production.
	EnterDeclaration(c *DeclarationContext)

	// EnterAssignment is called when entering the assignment production.
	EnterAssignment(c *AssignmentContext)

	// EnterExpList is called when entering the expList production.
	EnterExpList(c *ExpListContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpOp is called when entering the expOp production.
	EnterExpOp(c *ExpOpContext)

	// EnterValueType is called when entering the valueType production.
	EnterValueType(c *ValueTypeContext)

	// EnterValue is called when entering the value production.
	EnterValue(c *ValueContext)

	// EnterFunctionCall is called when entering the functionCall production.
	EnterFunctionCall(c *FunctionCallContext)

	// EnterMethods is called when entering the methods production.
	EnterMethods(c *MethodsContext)

	// EnterPrintlnCall is called when entering the printlnCall production.
	EnterPrintlnCall(c *PrintlnCallContext)

	// EnterParamList is called when entering the paramList production.
	EnterParamList(c *ParamListContext)

	// EnterParam is called when entering the param production.
	EnterParam(c *ParamContext)

	// EnterFunction is called when entering the function production.
	EnterFunction(c *FunctionContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstructionsBlock is called when exiting the instructionsBlock production.
	ExitInstructionsBlock(c *InstructionsBlockContext)

	// ExitInstructions is called when exiting the instructions production.
	ExitInstructions(c *InstructionsContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitDeclaration is called when exiting the declaration production.
	ExitDeclaration(c *DeclarationContext)

	// ExitAssignment is called when exiting the assignment production.
	ExitAssignment(c *AssignmentContext)

	// ExitExpList is called when exiting the expList production.
	ExitExpList(c *ExpListContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpOp is called when exiting the expOp production.
	ExitExpOp(c *ExpOpContext)

	// ExitValueType is called when exiting the valueType production.
	ExitValueType(c *ValueTypeContext)

	// ExitValue is called when exiting the value production.
	ExitValue(c *ValueContext)

	// ExitFunctionCall is called when exiting the functionCall production.
	ExitFunctionCall(c *FunctionCallContext)

	// ExitMethods is called when exiting the methods production.
	ExitMethods(c *MethodsContext)

	// ExitPrintlnCall is called when exiting the printlnCall production.
	ExitPrintlnCall(c *PrintlnCallContext)

	// ExitParamList is called when exiting the paramList production.
	ExitParamList(c *ParamListContext)

	// ExitParam is called when exiting the param production.
	ExitParam(c *ParamContext)

	// ExitFunction is called when exiting the function production.
	ExitFunction(c *FunctionContext)
}
