grammar MyGrammar;

// rules
myStart :  statement+ EOF;

statement
 : z3Statement+
 ;

z3Statement:   SAT OPAR MODEL z3value+ CPAR ;

z3value:   OPAR DEFINEFUN z3variable_name OPAR z3variable_declaration* CPAR z3var_type z3expression* CPAR #zValue;

z3and :   OPAR Z3AND z3expression+ CPAR #zAndStatement;

z3or:   OPAR Z3OR z3expression+ CPAR;

z3not:   OPAR Z3NOT z3expression+ CPAR;

z3add:   OPAR Z3PLUS z3expression z3expression+ CPAR;

z3subtract:   OPAR Z3MINUS z3expression+ CPAR;

z3ite :  OPAR ITE z3expression z3expression z3expression CPAR #zITEStatement;

z3comparison:   OPAR z3equality z3variable_name* z3expression+ CPAR #zcomparisonStatement;

z3variable_declaration:   OPAR z3variable_name z3var_type CPAR #zvariableDeclaration;

z3var_type
    :   Z3INT
    |   Z3STRING
    |   Z3BOOL
    ;

z3variable_name
    :   ID+ '!' NUMBER+
    | ID
    |(ID|NUMBER)+
    ;

z3equality
    :   EQUAL
    |   BIGGEROREQUAL
    |   BIGGERTHAN
    |   SMALLERTHAN
    |   SMALLEROREQUAL
    ;

z3expression:   z3and
    |   z3or
    |   z3not
    |   z3_let
    |   z3ite
    |   z3add
    |   z3subtract
    |   z3comparison
    |   str_method
    |   other
    |   z3value
    |   z3variable_name
    |   NUMBER
    |   STRING
    |   BOOL
    |   ID
    ;

z3_let
    :   OPAR LET OPAR z3_let_rule+ CPAR z3expression* CPAR
    ;

z3_let_rule
    :   OPAR z3variable_name z3expression+ CPAR
    ;


str_method
    :   str_len
    |   str_substr
    |   str_at
    |   str_concatation
    |   int_to_str
    ;

str_len
    :   OPAR 'str.len' z3variable_name CPAR
    ;

str_substr
    :   OPAR 'str.substr' z3variable_name z3expression z3expression CPAR
    ;

str_at
    :   OPAR 'str.at' z3variable_name z3expression CPAR
    ;

str_concatation
    :   OPAR 'str.++' z3expression+ CPAR
    ;

int_to_str
    :   OPAR 'int.to.str' z3expression+ CPAR
    ;

other
    :   OPAR z3variable_name z3expression+ CPAR
    ;


LEFTCURL : '{';
RIGHTCURL : '}';
OPAR: '(';
CPAR: ')';
Z3PLUS:    '+';
Z3MINUS:    '-';
Z3MULT: '*';
Z3DIV:  '/';
DOT: '.';
BIGGERTHAN: '>';
SMALLERTHAN: '<';
BIGGEROREQUAL: '>=';
SMALLEROREQUAL: '<=';
MODEL: 'model';
LET: 'let';
SAT: 'sat';
DEFINEFUN: 'define-fun';
Z3INT: 'Int';
Z3STRING: 'String';
Z3BOOL: 'Bool';
ITE: 'ite';
Z3AND: 'and';
Z3OR: 'or';
Z3NOT: 'not';
EQUAL: '=';
NEQUAL: '!=';
EQUALCHECK: '==';
COMMA		: ',';
NUMBER     : [0-9]+ ;
BOOL : 'true' | 'false';
STRING : '"' (~["])* '"';
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;
WS  : [ \t\r\n]+ -> skip;
