/*
 * Pontificia Universidad Javeriana
 * Luis Felipe Urdaneta Acevedo
 * Lenguajes de programacion 2017-01
 * Entrega #2
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
		Code_block segment = new Code_block();		
	}
	(sentence {body.add($sentence.node);})*
	{
		for (ASTNode n : body) 
		{
			n.execute(segment);
		}
	}		
;

sentence returns [ASTNode node]:
	var_decl {$node = $var_decl.node;} |
	print_ln {$node = $print_ln.node;}	|
	var_assign {$node = $var_assign.node;}|
	cmd_color {$node = $cmd_color.node;}|
	cmd_mf {$node = $cmd_mf.node;}		|
	cmd_bk {$node = $cmd_bk.node;}		|
	cmd_tl {$node = $cmd_tl.node;}		|
	cmd_tr {$node = $cmd_tr.node;}		|
	conditional {$node = $conditional.node;}|
	repeat_this_stuff {$node = $repeat_this_stuff.node;}|
	function {$node = $function.node;}|
	function_call {$node = $function_call.node;}|
	log_op {$node = $log_op.node;}|
	expression {$node = $expression.node;}
;

var_decl returns [ASTNode node]: 
	LET ID {$node = new Var_decl($ID.text);} |
	LET ID ASSING expression {$node = new Var_assign($ID.text, $expression.node);}
;

var_assign returns [ASTNode node]:
	ID ASSING (expression {$node = new Var_assign($ID.text, $expression.node);})+
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
	IF PAO log_op PAC 
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
		$node = new Ife_cond($log_op.node, body, elseBody);
	} 
	|
	IF PAO log_op PAC 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();		
	}
	BOP (t1=sentence { body.add($t1.node);})* BCL
	{
		$node = new If_cond($log_op.node, body);		
	}
;

repeat_this_stuff returns [ASTNode node]:
	WHILE PAO (log_op)+ PAC
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	BOP (sentence {body.add($sentence.node);})* BCL
	{
		$node = new While($log_op.node, body);
	}
;

function returns [ASTNode node]: 
	 FUNC fun_name = ID PAO
	 {
		List<ASTNode> body = new ArrayList<ASTNode>();
		List<String> parameters = new ArrayList<String>();
	 }
	 ((ID {parameters.add($ID.text);})?)((COMMA (ID {parameters.add($ID.text);}))*)	
	 PAC 
	 BOP (sentence {body.add($sentence.node);})* BCL
	 {
		$node = new New_func($fun_name.text, body, parameters);
	 }
;

function_call returns [ASTNode node]:
	  ID PAO
  	  {
  	  	List<Object> parameters = new ArrayList<Object>();
	  }
	  (((expression {parameters.add($expression.node);})?)((COMMA (expression{parameters.add($expression.node);}))*))
	  PAC
	  {
		$node = new Call_func($ID.text, parameters);		
	  }
; 

log_op returns [ASTNode node]:
	(t1=booleanify AND t2=booleanify {$node = new And($t1.node, $t2.node);})+ |
	(t1=booleanify OR t2=booleanify {$node = new Or($t1.node, $t2.node);})+|
	(NOT booleanify {$node = new Not($booleanify.node);})+ |
	booleanify {$node = new Bool($booleanify.node);}
;
	
booleanify returns [ASTNode node]:
	t1=expression LT  t2=expression {$node = new Lt_comp($t1.node, $t2.node);}|
	t1=expression LOE t2=expression {$node = new Loe_comp($t1.node, $t2.node);}|
	t1=expression GT  t2=expression {$node = new Gt_comp($t1.node, $t2.node);}|
	t1=expression GOE t2=expression {$node = new Goe_comp($t1.node, $t2.node);}|
	t1=expression EQ  t2=expression {$node = new Eq_comp($t1.node, $t2.node);}|
	t1=expression NEQ t2=expression {$node = new Neq_comp($t1.node, $t2.node);}|
	BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
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
STRING: '"'~('"')*'"';

WS
:
	[ \t\r\n]+ -> skip
;