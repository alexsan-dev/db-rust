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
	| assign = assignment SEMI { $state = $assign.state }
	| mth = methods SEMI { $state = $mth.state }
	| calls = functionCall SEMI { $state = $calls.state }
	| fn = function { $state = $fn.state };

// DECLARACIONES
declaration
	returns[I.Declaration state]:
	LET ID COLOM valueType EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{"Declaration"},
			Mut: false,
			Type: $valueType.state,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET MUT ID COLOM valueType EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{"Declaration"},
			Mut: true,
			Type: $valueType.state,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET MUT ID EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{"Declaration"},
			Mut: true,
			Type: I.UNDEF,
			Id: $ID.text, 
			Expression: &expPoint,
		}
	}
	| LET ID EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{"Declaration"},
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
			Instruction: I.Instruction{"Assignment"}, 
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
	leftExp = expression expOp rightExp = expression {
		left, right := $leftExp.state, $rightExp.state;
		$state = I.Expression{ 
			Value: nil, 
			Left: &left,
			Right: &right, 
			Operation: $expOp.state,
		} 
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
	| OPENPAR exp = expression CLOSEPAR {
		exp := $exp.state
		$state = I.Expression{ 
			Value: nil, 
			Left: &exp,
			Right: nil, 
			Operation: I.NOOP,
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
expOp
	returns[I.Operation state]:
	MUL {	
		$state = I.MUL 
	}
	| DIV {	
		$state = I.DIV 
	}
	| MOD {	
		$state = I.MOD 
	}
	| ADD {	
		$state = I.ADD 
	}
	| SUB {	
		$state = I.SUB 
	}
	| NOTEQUALS {	
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
		$state = I.Value{ $NUMBER.GetLine(), $NUMBER.GetColumn(), I.INTEGER, $NUMBER.text } 
	}
	| FLOAT {	
		$state = I.Value{ $FLOAT.GetLine(), $FLOAT.GetColumn(), I.FLOAT, $FLOAT.text } 
	}
	| STRING { 
		$state = I.Value{ $STRING.GetLine(), $STRING.GetColumn(), I.STR, $STRING.text[1:len($STRING.text)-1] } 
	}
	| CHAR { 
		$state = I.Value{ $CHAR.GetLine(), $CHAR.GetColumn(), I.CHAR, $CHAR.text[1:len($CHAR.text)-1] } 
	}
	| BFALSE { 
		$state = I.Value{ $BFALSE.GetLine(), $BFALSE.GetColumn(), I.BOOL, false } 
	}
	| BTRUE { 
		$state = I.Value{ $BTRUE.GetLine(), $BTRUE.GetColumn(), I.BOOL, true } 
		}
	| ID { 
		$state = I.Value{ $ID.GetLine(), $ID.GetColumn(), I.ID, $ID.text } 
	}
	| methods {
		$state = $methods.state;
	}
	| functionCall {
		$state = $functionCall.state;
	};

// LLAMADAS A FUNCIONES
functionCall
	returns[I.IFunctionCall state]:
	ID OPENPAR expList CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ $ID.GetLine(), $ID.GetColumn(), I.VOID, $ID.text }, $expList.l.ToArray() }
  }
	| ID OPENPAR CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ $ID.GetLine(), $ID.GetColumn(), I.VOID, $ID.text }, make([]interface{}, 0) }
	};

// FUNCIONES NATIVAS
methods
	returns[I.IFunctionCall state]:
	printlnCall { $state = $printlnCall.state };

// PRINT
printlnCall
	returns[I.PrintlnCall state]:
	PRINTLN OPENPAR expList CLOSEPAR {
		$state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ $PRINTLN.GetLine(), $PRINTLN.GetColumn(), I.VOID, "Println" }, $expList.l.ToArray() } }
	};

// FUNCIONES
function
	returns[I.Function state]:
	FN ID OPENPAR expList CLOSEPAR instructionsBlock {
		$state = I.Function{ I.Instruction{"Function"}, $ID.text, $expList.l.ToArray(), $instructionsBlock.l.ToArray(), I.VOID };
	}
	| FN ID OPENPAR expList CLOSEPAR instructionsBlock ARROW valueType {
		$state = I.Function{ I.Instruction{"Function"}, $ID.text, $expList.l.ToArray(), $instructionsBlock.l.ToArray(), $valueType.state };
	};