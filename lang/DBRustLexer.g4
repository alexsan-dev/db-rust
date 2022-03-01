lexer grammar DBRustLexer;

// PALABRAS RESERVADAS
LET: 'let';
MUT: 'mut';
PRINTLN: 'println!';

// TIPOS
I64: 'i64';
F64: 'f64';
BOOL: 'bool';
CHARTYPE: 'char';
STR: '&str';
STRCLASS: 'String';

// VALORES
NUMBER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~["]* '"';
CHAR: '\'' ~['] '\'';
ID: ([a-zA-Z_]) [a-zA-Z0-9_]*;
BFALSE: 'false';
BTRUE: 'true';

// SIMBOLOS
OPENPAR: '(';
CLOSEPAR: ')';
COLOM: ':';
SEMI: ';';
COMMA: ',';
EQUALS: '=';
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
