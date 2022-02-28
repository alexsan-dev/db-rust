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
	instructions {$list = $instructions.l};

// LISTA DE INSTRUCCIONES
instructions
	returns[*arrayList.List l]
	@init {
    $l =  arrayList.New()
  }:
	e += instruction* {
      listInt := localctx.(*InstructionsContext).GetE()
      		for _, e := range listInt {
	          $l.Add(e.GetState())
          }
    };

// INSTRUCCIONES
instruction
	returns[I.IInstruction state]:
	assign = assignment SEMI { 
			$state = $assign.state
	};

// ASIGNACIONES
assignment
	returns[I.Assignment state]:
	idText = ID EQUALS exp = expression {
		expPoint := $exp.state
		$state = I.Assignment{$idText.text, &expPoint}
	};

// EXPRESIONES
expression
	returns[I.Expression state]:
	leftExp = expression expOp rightExp = expression {
		left, right := $leftExp.state, $rightExp.state;
			$state = I.Expression{ 
				Value: nil, Left: &left, Right: &right, Operation: $expOp.state } 
	}
	| value { 
		sym := $value.state
		$state = I.Expression{ 
			Value: &sym, Left: nil, Right: nil, Operation: I.NOOP } 
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
		 };

// VALORES PRIMITIVOS
value
	returns[I.Value state]:
	NUMBER {
			$state = I.Value{I.INTEGER, $NUMBER.text}
	}
	| FLOAT {
			$state = I.Value{I.FLOAT, $FLOAT.text} 
		}
	| STRING {
			$state = I.Value{I.STRING, $STRING.text[1:len($STRING.text)-1]} 
		}
	| CHAR {
			$state = I.Value{I.CHAR, $CHAR.text[1:len($CHAR.text)-1]} 
		}
	| BFALSE {
			$state = I.Value{I.BOOL, $BFALSE.text} 
		}
	| BTRUE {
			$state = I.Value{I.BOOL, $BTRUE.text} 
	};