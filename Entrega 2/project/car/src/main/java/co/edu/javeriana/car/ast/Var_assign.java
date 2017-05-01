package co.edu.javeriana.car.ast;

import java.util.Map;

public class Var_assign implements ASTNode {

	private String var_name;
	private ASTNode expression;	


	public Var_assign(String var_name, ASTNode expression) {
		super();
		this.var_name = var_name;
		this.expression = expression;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) {
		symbol_table.put(var_name, expression.execute(symbol_table) );
		return null;
	}

}
