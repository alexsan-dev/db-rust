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

	// EnterExpOpAlgb1 is called when entering the expOpAlgb1 production.
	EnterExpOpAlgb1(c *ExpOpAlgb1Context)

	// EnterExpOpAlgb2 is called when entering the expOpAlgb2 production.
	EnterExpOpAlgb2(c *ExpOpAlgb2Context)

	// EnterExpOpRel1 is called when entering the expOpRel1 production.
	EnterExpOpRel1(c *ExpOpRel1Context)

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

	// EnterReturnValue is called when entering the returnValue production.
	EnterReturnValue(c *ReturnValueContext)

	// EnterConditions is called when entering the conditions production.
	EnterConditions(c *ConditionsContext)

	// EnterTernaryConditions is called when entering the ternaryConditions production.
	EnterTernaryConditions(c *TernaryConditionsContext)

	// EnterConditionList is called when entering the conditionList production.
	EnterConditionList(c *ConditionListContext)

	// EnterTernConditionList is called when entering the ternConditionList production.
	EnterTernConditionList(c *TernConditionListContext)

	// EnterElseIf is called when entering the elseIf production.
	EnterElseIf(c *ElseIfContext)

	// EnterTernElseIf is called when entering the ternElseIf production.
	EnterTernElseIf(c *TernElseIfContext)

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

	// ExitExpOpAlgb1 is called when exiting the expOpAlgb1 production.
	ExitExpOpAlgb1(c *ExpOpAlgb1Context)

	// ExitExpOpAlgb2 is called when exiting the expOpAlgb2 production.
	ExitExpOpAlgb2(c *ExpOpAlgb2Context)

	// ExitExpOpRel1 is called when exiting the expOpRel1 production.
	ExitExpOpRel1(c *ExpOpRel1Context)

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

	// ExitReturnValue is called when exiting the returnValue production.
	ExitReturnValue(c *ReturnValueContext)

	// ExitConditions is called when exiting the conditions production.
	ExitConditions(c *ConditionsContext)

	// ExitTernaryConditions is called when exiting the ternaryConditions production.
	ExitTernaryConditions(c *TernaryConditionsContext)

	// ExitConditionList is called when exiting the conditionList production.
	ExitConditionList(c *ConditionListContext)

	// ExitTernConditionList is called when exiting the ternConditionList production.
	ExitTernConditionList(c *TernConditionListContext)

	// ExitElseIf is called when exiting the elseIf production.
	ExitElseIf(c *ElseIfContext)

	// ExitTernElseIf is called when exiting the ternElseIf production.
	ExitTernElseIf(c *TernElseIfContext)
}
