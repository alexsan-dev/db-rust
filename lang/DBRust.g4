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
	};

// LLAMADAS A FUNCIONES
functionCall
	returns[I.IFunctionCall state]:
	ID OPENPAR expList CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "FunctionCall", $ID.GetLine(), $ID.GetColumn() }, $ID.text, I.VOID }, $expList.l.ToArray() }
  }
	| ID OPENPAR CLOSEPAR {
		$state = I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "FunctionCall", $ID.GetLine(), $ID.GetColumn() }, $ID.text, I.VOID }, make([]interface{}, 0) }
	};

// FUNCIONES NATIVAS
methods
	returns[I.IFunctionCall state]:
	printlnCall { $state = $printlnCall.state };

// PRINT
printlnCall
	returns[I.PrintlnCall state]:
	PRINTLN OPENPAR expList CLOSEPAR {
		$state = I.PrintlnCall{ I.FunctionCall{ I.Instruction{"FunctionCall"}, I.Value{ I.Token{ "Println", $PRINTLN.GetLine(), $PRINTLN.GetColumn() }, "Println", I.VOID }, $expList.l.ToArray() } }
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
		$state = I.Function{ I.Instruction{"Function"}, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, $paramList.l.ToArray(), $instructionsBlock.l.ToArray(), I.VOID };
	}
	| FN ID OPENPAR CLOSEPAR instructionsBlock {
		$state = I.Function{ I.Instruction{"Function"}, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, make([]interface{}, 0), $instructionsBlock.l.ToArray(), I.VOID };
	}
	| FN ID OPENPAR paramList CLOSEPAR instructionsBlock ARROW valueType {
		$state = I.Function{ I.Instruction{"Function"}, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, $paramList.l.ToArray(), $instructionsBlock.l.ToArray(), $valueType.state };
	}
	| FN ID OPENPAR CLOSEPAR instructionsBlock ARROW valueType {
		$state = I.Function{ I.Instruction{"Function"}, I.Token{ "Function", $FN.GetLine(), $FN.GetColumn() }, $ID.text, make([]interface{}, 0), $instructionsBlock.l.ToArray(), $valueType.state };
	};