// Code generated from DBRust.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // DBRust

import "github.com/antlr/antlr4/runtime/Go/antlr"

// DBRustListener is a complete listener for a parse tree produced by DBRustParser.
type DBRustListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstructions is called when entering the instructions production.
	EnterInstructions(c *InstructionsContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterDeclaration is called when entering the declaration production.
	EnterDeclaration(c *DeclarationContext)

	// EnterAssignment is called when entering the assignment production.
	EnterAssignment(c *AssignmentContext)

	// EnterListValues is called when entering the listValues production.
	EnterListValues(c *ListValuesContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpOp is called when entering the expOp production.
	EnterExpOp(c *ExpOpContext)

	// EnterValueType is called when entering the valueType production.
	EnterValueType(c *ValueTypeContext)

	// EnterValue is called when entering the value production.
	EnterValue(c *ValueContext)

	// EnterFunctions is called when entering the functions production.
	EnterFunctions(c *FunctionsContext)

	// EnterPrintlnCall is called when entering the printlnCall production.
	EnterPrintlnCall(c *PrintlnCallContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstructions is called when exiting the instructions production.
	ExitInstructions(c *InstructionsContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitDeclaration is called when exiting the declaration production.
	ExitDeclaration(c *DeclarationContext)

	// ExitAssignment is called when exiting the assignment production.
	ExitAssignment(c *AssignmentContext)

	// ExitListValues is called when exiting the listValues production.
	ExitListValues(c *ListValuesContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpOp is called when exiting the expOp production.
	ExitExpOp(c *ExpOpContext)

	// ExitValueType is called when exiting the valueType production.
	ExitValueType(c *ValueTypeContext)

	// ExitValue is called when exiting the value production.
	ExitValue(c *ValueContext)

	// ExitFunctions is called when exiting the functions production.
	ExitFunctions(c *FunctionsContext)

	// ExitPrintlnCall is called when exiting the printlnCall production.
	ExitPrintlnCall(c *PrintlnCallContext)
}
