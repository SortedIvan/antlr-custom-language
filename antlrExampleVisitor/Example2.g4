
grammar Example2;

start2: block* EOF;

block
 : expression #expr
 | variable #assignVariable
 | print_statement #print
 | loop #loopStatement
 | ifStat #ifStatement
 | url #urlStatement
 ;

loop		: WHILE expression DO block;

ifStat		: IF expression THEN block ( ELSE block )? FI;

url			: numberA DOT numberB DOT numberC DOT numberD;

print_statement: PRINT op=(NUMBER | BOOL | ID | STRING) #printVariable
               | PRINT mathExpression # printExpr
               ;

expression: mathExpression #MathExpr
           | BOOL   #ValueBool
           | STRING #ValueString
           ;

variable : int_variable
         | bool_variable
         | string_variable
         ;

int_variable : INT_INIT ID (EQUAL mathExpression)? #intAssignment
               | ID EQUAL mathExpression #intAssignValue
               ;

bool_variable : BOOL_INIT ID (EQUAL mathExpression)? #boolAssignment
               | BOOL_INIT ID EQUAL BOOL #boolAssignValue
               ;

string_variable : STRING_INIT ID (EQUAL STRING)? #stringAssignment
               | ID EQUAL STRING #stringAssignValue
               ;

mathExpression: mathExpression op=MUL mathExpression # MUL
               | mathExpression op=DIV mathExpression # DIV
               | mathExpression op=ADD mathExpression # ADD
               | mathExpression op=SUB mathExpression # SUB
               | mathExpression op=POW mathExpression # POW
               | mathExpression op=FACT #FACT
               | mathExpression op=EQUALCHECK mathExpression #EQUALCheck
               | OPAR mathExpression CPAR #parents
               | NUMBER #ValueNumber
               | STRING #StringValueExpr
               | ID #ValueVariable
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
INT_INIT: 'int_var';
STRING_INIT: 'string_var';
BOOL_INIT: 'bool_var';
CHAR_INIT: 'char_var';
PRINT: 'print';
IF: 'if';
FI			: 'fi';
WHILE		: 'while';
THEN		: 'then';
DO			: 'do';
DOT			: '.';
ELSE: 'else';
FOR: 'for';
EQUAL: '=';
NEQUAL: '!=';
EQUALCHECK: '==';
COMMA		: ',';
NUMBER     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;
BOOL : 'true' | 'false';
STRING : '"' (~["])+ '"';
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

