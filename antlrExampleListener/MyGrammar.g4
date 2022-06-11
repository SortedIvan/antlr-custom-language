grammar MyGrammar;

// rules
myStart :  statement+ EOF;

statement
 : z3Statement+
 ;

z3Statement:   SAT OPAR z3value+ CPAR ;

z3value:   OPAR DEFINEFUN z3variable_name OPAR z3variable_declaration* CPAR Z3INT z3expression* CPAR #zValue;

z3and :   OPAR Z3AND z3expression+ CPAR #zAndStatement;

z3ite :  OPAR ITE z3expression z3expression z3expression CPAR #zITEStatement;

z3comparison:   OPAR EQUAL z3variable_name NUMBER* CPAR #zcomparisonStatement;

z3variable_declaration:   OPAR z3variable_name Z3INT CPAR #zvariableDeclaration;

z3variable_name
    :   ID+ '!' NUMBER+
    | ID
    ;

z3expression:   z3and
    |   z3ite
    |   z3comparison
    |   z3value
    |   z3variable_name
    |   NUMBER
    |   ID
    ;


//bool_expression:
numberA		: NUMBER;
numberB		: NUMBER;
numberC		: NUMBER;
numberD		: NUMBER;

LEFTCURL : '{';
RIGHTCURL : '}';
OPAR: '(';
CPAR: ')';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
NOT: 'not';
AND: '&&';
OR: '||';
BIGGERTHAN: '>';
SMALLERTHAN: '<';
BIGGEROREQUAL: '>=';
SMALLEROREQUAL: '<=';
INT_INIT: 'int_var';
STRING_INIT: 'string_var';
BOOL_INIT: 'bool_var';
CHAR_INIT: 'char_var';
INT_PARAM: 'int_par';
STRING_PARAM: 'string_par';
BOOL_PARAM: 'bool_par';
PRINT: 'print';
IF: 'if';
FOR: 'for';
FI			: 'fi';
WHILE		: 'while';
THEN		: 'then';
DO			: 'do';
DOT			: '.';
ELSE: 'else';
DECLAREFUNVOID: 'declare_fun_void';
DECLAREFUNSTRING: 'declare_fun_string';
DECLAREFUNINT: 'declare_fun_int';
DECLAREFUNBOOL: 'declare_fun_bool';
RETURN: 'return';
SAT: 'sat';
DEFINEFUN: 'define-fun';
Z3INT: 'Int';
ITE: 'ite';
Z3AND: 'and';
EQUAL: '=';
NEQUAL: '!=';
EQUALCHECK: '==';
COMMA		: ',';
NUMBER     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;
BOOL : 'true' | 'false';
STRING : '"' (~["])+ '"';
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

