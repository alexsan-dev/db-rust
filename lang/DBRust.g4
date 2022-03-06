grammar DBRust;

options {
	tokenVocab = DBRustLexer;
}

@header {
	import I "main/interfaces"
	import arrayList "github.com/colegno/arraylist"
}

// INICIO
start
	returns[*arrayList.List list]:
	instructions { $list = $instructions.l };

// BLOQUE DE INSTRUCCIONES
instructionsBlock
	returns[*arrayList.List l]:
	OPENBRACKET instructions CLOSEBRACKET {
				$l = $instructions.l
		};

// LISTA DE INSTRUCCIONES
instructions
	returns[*arrayList.List l]
	@init {
    $l =  arrayList.New()
  }:
	e += instruction* {
      listInt := localctx.(*InstructionsContext).GetE()
      		for _, e := range listInt{
	          $l.Add(e.GetState())
          }
    };

// INSTRUCCIONES
instruction
	returns[I.IInstruction state]:
	decltn = declaration SEMI { $state = $decltn.state }
	| calls = functionCall SEMI { $state = $calls.state }
	| assign = assignment SEMI { $state = $assign.state }
	| mth = methods SEMI { $state = $mth.state }
	| fn = function { $state = $fn.state }
	| rtn = returnValue SEMI { $state = $rtn.state }
	| cdtn = conditions { $state  = $cdtn.state };

// DECLARACIONES
declaration
	returns[I.Declaration state]:
	LET ID COLOM valueType EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{ "Declaration" },
			Mut: false,
			Type: $valueType.state,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET MUT ID COLOM valueType EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{ "Declaration" },
			Mut: true,
			Type: $valueType.state,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET MUT ID EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{ "Declaration" },
			Mut: true,
			Type: I.UNDEF,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET ID EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{ "Declaration" },
			Mut: true,
			Type:  I.UNDEF,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	};

// ASIGNACIONES
assignment
	returns[I.Assignment state]:
	ID EQUALS expression {
		expPoint := $expression.state
		$state = I.Assignment{ 
			Instruction: I.Instruction{ "Assignment" }, 
			Id: $ID.text, 
			Expression: &expPoint,
		}
	};

// LISTA DE EXPRESIONES
expList
	returns[*arrayList.List l]:
	list = expList COMMA expression { 
		$list.l.Add($expression.state)
		$l = $list.l
  }
	| expression { 
		$l = arrayList.New()
		$l.Add($expression.state)
	};

// EXPRESIONES
expression
	returns[I.Expression state]:
	leftExp = expression expOpAlgb1 rightExp = expression {
		left, right := $leftExp.state, $rightExp.state;
		$state = I.Expression{ 
			Value: nil, 
			Left: &left,
			Right: &right, 
			Operation: $expOpAlgb1.state,
		} 
	}
	| leftExp = expression expOpAlgb2 rightExp = expression {
		left, right := $leftExp.state, $rightExp.state;
		$state = I.Expression{ 
			Value: nil, 
			Left: &left,
			Right: &right, 
			Operation: $expOpAlgb2.state,
		} 
		}
	| leftExp = expression expOpRel1 rightExp = expression {
		left, right := $leftExp.state, $rightExp.state;
		$state = I.Expression{ 
			Value: nil, 
			Left: &left,
			Right: &right, 
			Operation: $expOpRel1.state,
		} 
	}
	| OPENPAR exp = expression CLOSEPAR {
		$state = $exp.state
	}
	| NOT exp = expression {
		exp := $exp.state
		$state = I.Expression{ 
			Value: nil, 
			Left: &exp,
			Right: nil, 
			Operation: I.UNOT,
		} 
	}
	| value { 
		sym := $value.state
		$state = I.Expression{
			Value: &sym, 
			Left: nil, 
			Right: nil, 
			Operation: I.NOOP,
		} 
	};

// OPERADORES
expOpAlgb1
	returns[I.Operation state]:
	MUL {	
		$state = I.MUL 
	}
	| DIV {	
		$state = I.DIV 
	}
	| MOD {	
		$state = I.MOD 
	};

expOpAlgb2
	returns[I.Operation state]:
	ADD {	
		$state = I.ADD 
	}
	| SUB {	
		$state = I.SUB 
		};

expOpRel1
	returns[I.Operation state]:
	NOTEQUALS {	
		$state = I.NOTEQUALS 
	}
	| MOREOREQUALS {	
		$state = I.MOREOREQUALS 
	}
	| LESSOREQUALS {	
		$state = I.LESSOREQUALS 
	}
	| EQUALSEQUALS {	
		$state = I.EQUALSEQUALS 
	}
	| MAJOR {	
		$state = I.MAJOR 
	}
	| MINOR {	
		$state = I.MINOR 
	}
	| AND {	
		$state = I.AND 
	}
	| OR {	
		$state = I.OR 
	};

valueType // TIPOS DE DATOS
	returns[I.ValueType state]:
	I64 { 
		$state = I.INTEGER 
	}
	| F64 { 
		$state = I.FLOAT 
	}
	| BOOL { 
		$state = I.BOOL 
	}
	| CHARTYPE { 
		$state = I.CHAR 
	}
	| STR { 
		$state = I.STR 
	}
	| STRCLASS { 
		$state = I.STRING 
	};

// VALORES PRIMITIVOS
value
	returns[I.IValue state]:
	NUMBER { 
		$state = I.Value{ I.Token{ "NUMBER", $NUMBER.GetLine(), $NUMBER.GetColumn() }, $NUMBER.text, I.INTEGER } 
	}
	| FLOAT {	
		$state = I.Value{ I.Token{ "FLOAT", $FLOAT.GetLine(), $FLOAT.GetColumn() }, $FLOAT.text, I.FLOAT } 
	}
	| STRING { 
		$state = I.Value{ I.Token{ "SRING", $STRING.GetLine(), $STRING.GetColumn() }, $STRING.text[1:len($STRING.text)-1], I.STR } 
	}
	| CHAR { 
		$state = I.Value{ I.Token{ "CHAR", $CHAR.GetLine(), $CHAR.GetColumn() }, $CHAR.text[1:len($CHAR.text)-1], I.CHAR } 
	}
	| BFALSE { 
		$state = I.Value{ I.Token{ "BFALSE", $BFALSE.GetLine(), $BFALSE.GetColumn() }, false, I.BOOL } 
	}
	| BTRUE { 
		$state = I.Value{ I.Token{ "BTRUE", $BTRUE.GetLine(), $BTRUE.GetColumn() }, false, I.BOOL } 
	}
	| ID { 
		$state = I.Value{ I.Token{ "ID", $ID.GetLine(), $ID.GetColumn() }, $ID.text, I.ID } 
	}
	| methods {
		$state = $methods.state;
	}
	| functionCall {
		$state = $functionCall.state;
	}
	| conditions {
		$state = $conditions.state;
	};

// LLAMADAS A FUNCIONES
functionCall
	returns[I.IFunctionCall state]:
	ID OPENPAR expList CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", $ID.GetLine(), $ID.GetColumn() }, $ID.text, I.VOID }, $ID.text, $expList.l.ToArray() }
  }
	| ID OPENPAR CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "FunctionCall", $ID.GetLine(), $ID.GetColumn() }, $ID.text, I.VOID }, $ID.text, make([]interface{}, 0) }
	};

// FUNCIONES NATIVAS
methods
	returns[I.IFunctionCall state]:
	printlnCall { $state = $printlnCall.state };

// PRINT
printlnCall
	returns[I.PrintlnCall state]:
	PRINTLN OPENPAR expList CLOSEPAR {
		$state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{ "FunctionCall" }, I.Value{ I.Token{ "Println", $PRINTLN.GetLine(), $PRINTLN.GetColumn() }, "Println", I.VOID }, "Println", $expList.l.ToArray() } }
	};

// LISTA DE PARAMETROS
paramList
	returns[*arrayList.List l]:
	list = paramList COMMA param { 
		$list.l.Add($param.state)
		$l = $list.l
  }
	| param { 
		$l = arrayList.New()
		$l.Add($param.state)
	};

// PARAMETRO
param
	returns[I.FunctionParam state]:
	ID COLOM valueType {
		$state = I.FunctionParam{ $ID.text, $valueType.state };
	};

// FUNCIONES
function
	returns[I.Function state]:
	FN ID OPENPAR paramList CLOSEPAR instructionsBlock {
		$state = I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, $paramList.l.ToArray(), $instructionsBlock.l.ToArray(), I.VOID, nil };
	}
	| FN ID OPENPAR CLOSEPAR instructionsBlock {
		$state = I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, make([]interface{}, 0), $instructionsBlock.l.ToArray(), I.VOID, nil };
	}
	| FN ID OPENPAR paramList CLOSEPAR ARROW valueType instructionsBlock {
		$state = I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, $paramList.l.ToArray(), $instructionsBlock.l.ToArray(), $valueType.state, nil };
	}
	| FN ID OPENPAR CLOSEPAR ARROW valueType instructionsBlock {
		$state = I.Function{ I.Instruction{ "Function" }, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, make([]interface{}, 0), $instructionsBlock.l.ToArray(), $valueType.state, nil };
	};

// RETURN
returnValue
	returns[I.ReturnValue state]:
	RETURN expression {
		$state = I.ReturnValue{ I.Instruction{ "Return" }, I.Token{ "Return", $RETURN.GetLine(), $RETURN.GetColumn() }, $expression.state }
	};

// CONDICIONALES
conditions
	returns[I.IfControl state]:
	IF expression insBody = instructionsBlock {
		$state = I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", $IF.GetLine(), $IF.GetColumn() }, "If", I.VOID }, $expression.state, $insBody.l.ToArray(), make([]interface{}, 0), make([]interface{}, 0) };
	}
	| IF expression insBody = instructionsBlock conditionList {
		$state = I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", $IF.GetLine(), $IF.GetColumn() }, "If", I.VOID }, $expression.state, $insBody.l.ToArray(), $conditionList.l.ToArray(), make([]interface{}, 0) };
	}
	| IF expression insBody = instructionsBlock ELSE elseBody = instructionsBlock {
		$state = I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", $IF.GetLine(), $IF.GetColumn() }, "If", I.VOID }, $expression.state, $insBody.l.ToArray(), make([]interface{}, 0), $elseBody.l.ToArray() };
	}
	| IF expression insBody = instructionsBlock conditionList ELSE elseBody = instructionsBlock {
		$state = I.IfControl{ I.Instruction{ "Control" }, I.Value{ I.Token{ "IF", $IF.GetLine(), $IF.GetColumn() }, "If", I.VOID }, $expression.state, $insBody.l.ToArray(), $conditionList.l.ToArray(), $elseBody.l.ToArray() };
	};

// LISTA DE ELSE IFS
conditionList
	returns[*arrayList.List l]:
	list = conditionList elseIf { 
		$list.l.Add($elseIf.state)
		$l = $list.l
  }
	| elseIf { 
		$l = arrayList.New()
		$l.Add($elseIf.state)
	};

// ELSE IF
elseIf
	returns[I.IfControlFallBack state]:
	ELSE IF expression instructionsBlock {
		$state = I.IfControlFallBack{ I.Token{ "ElseIf", $IF.GetLine(), $IF.GetColumn() }, $expression.state, $instructionsBlock.l.ToArray() };
	};