grammar Expressao;

programa : (declarar (NEWLINE)*)* ; // Aq começa a declaração de QUALQUER função, variavel e outras coisas

declarar : declararVAR | declararFunc | declararEstruct | coment | arrayInicializacao | estruturaControle | declararPrintln; // aqui direciona para onde vai a declaração

// declaracao das variaveis

declararVAR : type * ID ';'| type  ID  '='  expressao  ';' | type ID '[' ']' ';' | type ID '[' ']' '=' expressao ';'; // Aq eu vou declarar uma váriavel, exemplos: Int i; OU Int i = 0;

declararPrintln : 'println' '(' expr ')'';';

expr : termo ('+' termo)*;

termo : ID | TEXTO;

type : 'int' | 'float' | 'double' | 'char' | 'boolean' | 'vet' | 'void'; // Aq são os tipos das váriaveis

// funcao
declararFunc : type  ID  '(' parametros ')'   bloco  | type  ID  '(' ')'  bloco ; // Aq é a declaração das funções, exemplos: For( i = 0; i>0;++i) {} OU Int Main(){}

parametros :  parametro |  parametro  ','  parametros  ; // Aq são os parametros das funções

parametro : type  ID  | type  ID  '[' ']' | type  ID; // Aq são os tipos de parametros, exemplo: Int x OU Int[] vetorInt

// bloco de codigo
bloco : '{' NEWLINE* (declarar NEWLINE)* '}'; // Aq é para quando eu utliziar um FOR, ELSE, IF ou instruções que utilizem algo em bloco(tudo que tem "{}")

// logica pra comentario
coment : '//' ~NEWLINE* | '/*' ~'*/'* '*/'; // Comentários


//Aqui são exepressõs de atribuição, exemplo: i += 1
atribuicao :    ID  '='  expressao
              | ID  '+='  expressao
              | ID  '-='  expressao
	          | ID '*='  expressao
	          | ID  '/='  expressao
	          | ID  '%='  expressao
	          | ID  '&&='  expressao
	          | ID  '||='  expressao
	          | ID  '='  ID
	          | ID  '+='  ID
	          | ID  '-='  ID
              | ID  '*='  ID
	          | ID  '/='  ID
 	          | ID  '%='  ID
	          | ID  '&&='  ID
	          | ID  '||='  ID;

//Aq são as estuturas das condicionais e lações de repetição
estruturaControle : 'if' '(' expressao ')' bloco
                  | 'if' '(' expressao ')' bloco  'else' bloco
                  | 'while' '(' expressao ')' bloco
		          | 'for' '(' expressao ';' expressao ';' expressao ')' bloco
		          | 'switch' '(' expressao ')' caseLista
		          | 'break' ';'
		          | 'continue' ';'
		          | 'return'  expressao ';';

//Aq é o SWITCH
caseLista: (NEWLINE caseDecl)* | caseDecl*;

//Aq é o CASE
caseDecl: 'case'  expressao ':'  bloco
 	| 'default'  ':'  bloco;

//?
declararEstruct : 'struct' ID '{' (NEWLINE* declararVAR NEWLINE)* '}' NEWLINE* ';';

//Aq é a estrutura do array
array : ID  '[' expressao ']' | ID  '[' ']';

//?
arrayInicializacao : '{' 'expressaoLista' '}';

// Aq vai direcionas para os tipos de expreções(atribução ou logica)
expressao : atribuicao | expreLogica;

//Aq é as expressões logicas, exemplo: i<0 && i>-1
expreLogica : expreRelacional
            | expreLogica '&&'  expreRelacional
            | expreLogica  '||'  expreRelacional
            | '!' expreRelacional;

//Aq é as expressões logicas, exemplo: i<0 && i>-1
expreRelacional : expreAritmetica
                    | expreAritmetica  '>'  expreAritmetica
		            | expreAritmetica  '>='  expreAritmetica
		            | expreAritmetica  '<'  expreAritmetica
		            | expreAritmetica  '<='  expreAritmetica
		            | expreAritmetica  '!='  expreAritmetica
		            | expreAritmetica  '=='  expreAritmetica |
		            ID  '>='  ID;


//Aq é as expressões aritmeticas, exemplo: i+1
expreAritmetica : expreMulti
                    | expreAritmetica  '+'  expreMulti
		            | expreAritmetica  '-'  expreMulti;

//Aq é as expressões de multi, modulo e div
expreMulti : expreUnaria
           | expreMulti  '*'  expreUnaria
		   | expreMulti  '/'  expreUnaria
		   | expreMulti  '%'  expreUnaria;

//Aq são expressões rapidas de Aritmetica, exemplo: i++ OU i--
expreUnaria : exprePostfix
                | '-' expreUnaria
                | '++' exprePostfix
		        | '--' exprePostfix;

//?
exprePostfix : primaria
                 | primaria '[' expressao ']'
                 | primaria '(' argumentos ')'
		         | primaria '.' ID
  		         | primaria '->' ID;

//?
argumentos : 'expressaoLista' | 'vazio';

//Aq são as expressões regulares e suas inicializações.
primaria : ID | array | NUM_INT | NUM_DEC | TEXTO | '(' expressao ')';

NEWLINE : [\r\n]+ ;

ID : [a-zA-Z_] [a-zA-Z_0-9]*; // Definindo ID

NUM_INT : [0-9]+; //Expressão regular do tipo int

NUM_DEC : [0-9]* '.' [0-9]+; // Expressão regular do tipo double/float

TEXTO : '"' ~["]* '"'; //Expressão regular de texto em geral
