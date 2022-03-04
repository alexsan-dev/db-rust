lexer grammar DBRustLexer;

// PALABRAS RESERVADAS
LET: 'let';
MUT: 'mut';
PRINTLN: 'println!';
FN: 'fn';
RETURN: 'return';

// TIPOS
I64: 'i64';
F64: 'f64';
BOOL: 'bool';
CHARTYPE: 'char';
STR: '&str';
STRCLASS: 'String';

// VALORES
BFALSE: 'false';
BTRUE: 'true';
NUMBER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~["]* '"';
CHAR: '\'' ~['] '\'';
ID: ([a-zA-Z_]) [a-zA-Z0-9_]*;

// SIMBOLOS
OPENPAR: '(';
CLOSEPAR: ')';
OPENBRACKET: '{';
CLOSEBRACKET: '}';
ARROW: '->';
DOT: '.';
COLOM: ':';
SEMI: ';';
COMMA: ',';
AND: '&&';
OR: '||';
NOTEQUALS: '!=';
EQUALSEQUALS: '==';
MOREOREQUALS: '>=';
LESSOREQUALS: '<=';
NOT: '!';
EQUALS: '=';
MAJOR: '>';
MINOR: '<';
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';

WHITESPACE: [ \r\n\t]+ -> skip;

fragment ESC_SEQ:
	'\\' (
		'\\'
		| '@'
		| '['
		| ']'
		| '.'
		| '#'
		| '+'
		| '-'
		| '!'
		| ':'
		| ' '
	);
