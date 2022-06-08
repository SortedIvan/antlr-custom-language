
grammar Example2;

start2: statement* EOF;

statement //statement
 : expression #expr
 | variable #assignVariable
 | print_statement #print
 | loop #loopStatement
 | ifStat #ifStatement
 | url #urlStatement
 | z3OutputSudokuA #Z3OutputWeek3
 | LEFTCURL statement+ RIGHTCURL #statementBody
 | declareFunctions #declareFunction
 | call_functions #callFunctions
 ;

loop		: WHILE expression DO statement;


ifStat		: IF expression THEN LEFTCURL statement RIGHTCURL( ELSE statement )? FI;

url			: numberA DOT numberB DOT numberC DOT numberD;

print_statement: PRINT expression # printExpr ;


expression: mathExpression #MathExpr
           | BOOL   #ValueBool
           | STRING #ValueString
           ;

variable : int_variable
         | bool_variable
         | string_variable
         ;

int_variable : INT_INIT ID (EQUAL statement)? #intAssignment
               | ID EQUAL statement #intAssignValue
               ;

bool_variable : BOOL_INIT ID (EQUAL mathExpression)? #boolAssignment
               | BOOL_INIT ID EQUAL BOOL #boolAssignValue
               ;

string_variable : STRING_INIT ID (EQUAL statement)? #stringAssignment
               | ID EQUAL statement #stringAssignValue
               ;

mathExpression: mathExpression op=MUL mathExpression # MUL
               | mathExpression op=DIV mathExpression # DIV
               | mathExpression op=ADD mathExpression # ADD
               | mathExpression op=SUB mathExpression # SUB
               | mathExpression op=POW mathExpression # POW
               | mathExpression op=FACT #FACT
               | mathExpression op=EQUALCHECK mathExpression #EQUALCheck
               | mathExpression op=AND mathExpression #ANDoperation
               | mathExpression op=NEQUAL mathExpression #NOToperation
               | mathExpression op=OR mathExpression #ORoperation
               | mathExpression op=BIGGERTHAN mathExpression #BIGGERoperation
               | mathExpression op=SMALLERTHAN mathExpression #SMALLERoperation
               | mathExpression op=BIGGEROREQUAL mathExpression #BIGOREQUALoperation
               | mathExpression op=SMALLEROREQUAL mathExpression #SMALLOREQUALoperation
               | OPAR mathExpression CPAR #parents
               | NUMBER #ValueNumber
               | STRING #StringValueExpr
               | ID #ValueVariable
               ;

declareFunctions: declare_body ID OPAR expression? CPAR statement RETURN expression
                ;

declare_body: DECLAREFUNVOID    #declareFunVoid
            | DECLAREFUNSTRING  #declareFunString
            | DECLAREFUNINT     #declareFunInt
            | DECLAREFUNBOOL    #declareFunBool
            ;

call_functions: ID OPAR expression? CPAR
                ;

z3OutputSudokuA: SAT OPAR z3OutputSudokuA* CPAR #satBody
                | OPAR DEFINEFUN Z3VARNAME OPAR CPAR Z3INT NUMBER CPAR #defineFunBody
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
PRINT: 'print';
IF: 'if';
FOR: 'for';
FI			: 'fi';
WHILE		: 'while';
THEN		: 'then';
DO			: 'do';
DOT			: '.';
ELSE: 'else';
SAT: 'sat';
DEFINEFUN: 'define-fun';
DECLAREFUNVOID: 'declare_fun_void';
DECLAREFUNSTRING: 'declare_fun_string';
DECLAREFUNINT: 'declare_fun_int';
DECLAREFUNBOOL: 'declare_fun_bool';
RETURN: 'return';
Z3INT: 'Int';
Z3VARNAME: [a-z][0-9][0-9]*;
EQUAL: '=';
NEQUAL: '!=';
EQUALCHECK: '==';
COMMA		: ',';
NUMBER     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;
BOOL : 'true' | 'false';
STRING : '"' (~["])+ '"';
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

