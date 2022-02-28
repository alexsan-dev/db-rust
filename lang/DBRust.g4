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
	| fn = functions SEMI { $state = $fn.state };

// DECLARACIONES
declaration
	returns[I.Declaration state]:
	LET ID COLOM valueType EQUALS expression {
		expPoint := $expression.state
		$state = I.Declaration{ 
			Instruction: I.Instruction{"Declaration"},
			Type: $valueType.state,
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
	MUL {	$state = I.MUL }
	| DIV {	$state = I.DIV }
	| MOD {	$state = I.MOD }
	| ADD {	$state = I.ADD }
	| SUB {	$state = I.SUB };

// TIPOS DE DATOS
valueType
	returns[I.ValueType state]:
	I64 { $state = I.INTEGER }
	| F64 { $state = I.FLOAT }
	| BOOL { $state = I.BOOL }
	| CHARTYPE { $state = I.CHAR }
	| STR { $state = I.STR }
	| STRCLASS { $state = I.STRING };

// VALORES PRIMITIVOS
value
	returns[I.Value state]:
	NUMBER { $state = I.Value{ $NUMBER.line, $NUMBER.GetColumn(), I.INTEGER, $NUMBER.text } }
	| FLOAT {	$state = I.Value{ $FLOAT.line, $FLOAT.GetColumn(), I.FLOAT, $FLOAT.text } }
	| STRING { $state = I.Value{ $STRING.line, $STRING.GetColumn(), I.STRING, $STRING.text[1:len($STRING.text)-1] } 
		}
	| CHAR { $state = I.Value{ $CHAR.line, $CHAR.GetColumn(), I.CHAR, $CHAR.text[1:len($CHAR.text)-1] } 
		}
	| BFALSE { $state = I.Value{ $BFALSE.line, $BFALSE.GetColumn(), I.BOOL, $BFALSE.text } }
	| BTRUE { $state = I.Value{ $BTRUE.line, $BTRUE.GetColumn(), I.BOOL, $BTRUE.text } };

// FUNCIONES
functions
	returns[I.IFunctionCall state]:
	printlnCall { $state = $printlnCall.state };

// PRINT
printlnCall
	returns[I.IFunctionCall state]:
	PRINTLN OPENPAR expression CLOSEPAR {
		expPoint := $expression.state
		$state = I.PrintlnCall{ I.FunctionCall{ "PrintLn", []*I.Expression{&expPoint} } }
	};