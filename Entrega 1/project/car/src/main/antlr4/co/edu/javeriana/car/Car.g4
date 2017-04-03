/*
 * Pontificia Universidad Javeriana
 * Luis Felipe Urdaneta Acevedo
 * Lenguajes de programacion 2017-01
 * Entrega #1
*/
grammar Car;

@header{
  import co.edu.javeriana.car.*;
  import co.edu.javeriana.interpreter.*;
}


@parser::members {
  private Car car;
  public CarParser(Car car, TokenStream input) {
    this(input);
    this.car = car;
  }
 
}

start:
	sentence*
;

sentence:
	cmd_color | cmd_mf | cmd_mb | cmd_tr | cmd_tl
;

cmd_color: 
	COLOR r=number COMMA g=number COMMA b=number COMMA a=number
	{
		System.out.println("El carro usa el color " + $r.text + "," + $g.text + "," + $b.text + "," + $a.text);
		car.color($r.value,$g.value,$b.value,$a.value);
	}
;
cmd_mf:
	FW n=number
	{
		System.out.println("El carro avanza "+ $n.value + " unidades");
		car.forward($n.value);
	}
;
cmd_mb: 
	BK n=number
	{
		System.out.println("El carro retrocede "+ $n.value + " unidades");
		car.back($n.value);
	}
;
cmd_tr:
	TR n=number
	{
		System.out.println("El carro gira " + $n.value + " unidades a la derecha");
		car.right($n.value);
	}
;
cmd_tl:
	TL n=number
	{
		System.out.println("El carro gira " + $n.value + " unidades a la izquierda");
		car.left($n.value);
	}
;
number returns [float value]:
	NUMBER {$value = Float.parseFloat($NUMBER.text);}
;


BK: 'run_backwards';
TR: 'turn_right';
TL: 'turn_left';
FW: 'run_forward';

LET: 'let';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
READ: 'read';
WRLN: 'writeln';
FUNC: 'function';
COLOR: 'color';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

BOP: '{';
BCL: '}';
PAO: '(';
PAC: ')';
COMMA: ',';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
EQ: '==';
GOE: '>=';
LOE: '<=';
NEQ: '<>';

ASSING: '=';

ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+('.'[0-9]+)*;
BOOLEAN: ('#t'|'#f');
STRING: '"'~('"')'"';

WS
:
	[ \t\r\n]+ -> skip
;