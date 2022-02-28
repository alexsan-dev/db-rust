lexer grammar DBRustLexer;

NUMBER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~["]* '"';
CHAR: '\'' ~['] '\'';
ID: ([a-zA-Z_]) [a-zA-Z0-9_]*;
BFALSE: 'false';
BTRUE: 'true';

SEMI: ';';
EQUALS: '=';
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';

WHITESPACE: [ \r\n\t]+ -> skip;