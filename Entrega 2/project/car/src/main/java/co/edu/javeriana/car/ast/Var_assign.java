package co.edu.javeriana.car.ast;

public class Var_assign implements ASTNode {

	private String var_name;
	private ASTNode expression;	


	public Var_assign(String var_name, ASTNode expression) {
		super();
		this.var_name = var_name;
		this.expression = expression;
	}

	@Override
	public Object execute(Code_block segment) {
		segment.put(var_name, expression.execute(segment) );
		return null;
	}

}
