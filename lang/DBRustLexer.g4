lexer grammar DBRustLexer;

// PALABRAS RESERVADAS
LET: 'let';
MUT: 'mut';
PRINTLN: 'println!';
FN: 'fn';
RETURN: 'return';
IF: 'if';
ELSE: 'else';

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
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';
LESSOREQUALS: '<=';
MINOR: '<';
MOREOREQUALS: '>=';
MAJOR: '>';
EQUALSEQUALS: '==';
NOTEQUALS: '!=';
EQUALS: '=';
NOT: '!';
AND: '&&';
OR: '||';

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
