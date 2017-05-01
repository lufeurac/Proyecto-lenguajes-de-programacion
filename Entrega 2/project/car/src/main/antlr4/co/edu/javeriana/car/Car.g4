/*
 * Pontificia Universidad Javeriana
 * Luis Felipe Urdaneta Acevedo
 * Lenguajes de programacion 2017-01
 * Entrega #1
*/
grammar Car;

@header{
  import java.util.Map;
  import java.util.HashMap;
  import java.util.List;
  import java.util.ArrayList;
  import co.edu.javeriana.car.*;
  import co.edu.javeriana.car.ast.*;
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
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> symbol_table = new HashMap<String,Object>();		
	}
	(sentence {body.add($sentence.node);})*
	{
		for (ASTNode n : body) 
		{
			n.execute(symbol_table);
		}
	}
		
;

sentence returns [ASTNode node]:
	cmd_color {$node = $cmd_color.node;}|
	cmd_mf {$node = $cmd_mf.node;}		|
	cmd_bk {$node = $cmd_bk.node;}		|
	cmd_tl {$node = $cmd_tl.node;}		|
	cmd_tr {$node = $cmd_tr.node;}		|
	print_ln {$node = $print_ln.node;}	|
	conditional {$node = $conditional.node;}|
	expression {$node = $expression.node;}|
	var_decl {$node = $var_decl.node;} |
	var_assign {$node = $var_assign.node;}
;

var_decl returns [ASTNode node]: 
	LET ID {$node = new Var_decl($ID.text);}
;

var_assign returns [ASTNode node]:
	ID ASSING expression {$node = new Var_assign($ID.text, $expression.node);}
;

print_ln returns [ASTNode node]:
	WRLN sentence
	{
		$node = new PrintLn($sentence.node);
	}
; 

cmd_color returns [ASTNode node]: 
	COLOR r=input COMMA g=input COMMA b=input COMMA a=input
	{
		$node = new Set_color(car, $r.node, $g.node, $b.node, $a.node);
	}
;
	
cmd_mf returns [ASTNode node]:
	FW t1=input
	{
		$node = new Cmd_mf(car, $t1.node);
	}
;

cmd_bk returns [ASTNode node]:
	BK t1=input
	{
		$node = new Cmd_bk(car, $t1.node);
	}
;

cmd_tl returns [ASTNode node]:
	TL t1=input
	{
		$node = new Cmd_tl(car, $t1.node);
	}
;

cmd_tr returns [ASTNode node]:
	TR t1=input
	{
		$node = new Cmd_tr(car, $t1.node);
	}
;

conditional returns [ASTNode node]:
	IF PAO expression PAC 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();		
	}
	BOP (t1=sentence { body.add($t1.node);})* BCL
	ELSE
	{
		List<ASTNode> elseBody = new ArrayList<ASTNode>();		
	}
	BOP (t2=sentence { elseBody.add($t2.node);})* BCL
	{
		$node = new If_cond($expression.node, body, elseBody);
	}
;

log_op returns [ASTNode node]:
//	t1=booleanify OR t2=booleanify {$node = new Or($t1.node, $t2.node);}|
//	t1=booleanify AND t2=booleanify {$node = new And($t1.node, $t2.node);}|
//	NOT booleanify {$node = new Not($booleanify.node);}|
//	booleanify {$node = $booleanify.node;}
;
	

booleanify returns [ASTNode node]:
	t1=expression LT  t2=expression {$node = new Lt_comp($t1.node, $t2.node);}|
	t1=expression LOE t2=expression {$node = new Loe_comp($t1.node, $t2.node);}|
	t1=expression GT  t2=expression {$node = new Gt_comp($t1.node, $t2.node);}|
	t1=expression GOE t2=expression {$node = new Goe_comp($t1.node, $t2.node);}|
	t1=expression EQ  t2=expression {$node = new Eq_comp($t1.node, $t2.node);}|
	t1=expression NEQ t2=expression {$node = new Neq_comp($t1.node, $t2.node);}
;

expression returns [ASTNode node]:
	t1=exp_sub {$node = $t1.node;}
		(PLUS t2=exp_sub{$node = new Op_sum($node, $t2.node);})* 
;

exp_sub returns [ASTNode node]:
	t1=exp_mult {$node = $t1.node;}
		(MINUS t2=exp_mult{$node = new Op_sub($node, $t2.node);})*
;

exp_mult returns [ASTNode node]:
	t1=exp_div {$node = $t1.node;}
		(MULT t2=exp_div{$node = new Op_mult($node, $t2.node);})*
;

exp_div returns [ASTNode node]:
	t1=exp_inv {$node = $t1.node;}
		(DIV t2=exp_inv{$node = new Op_div($node, $t2.node);})*
;

exp_inv returns [ASTNode node]:
	t1=input {$node = $t1.node;} |
		(MINUS t2=input{$node = new Op_inv($t2.node);})
;

input returns [ASTNode node]:
	NUMBER {$node = new Constant(Float.parseFloat($NUMBER.text));} 		|
	ID {$node = new Var_ref($ID.text);}		|
	STRING {$node = new Constant($STRING.text);}		|
	BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}	|
	PAO expression {$node = $expression.node;} PAC
	
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