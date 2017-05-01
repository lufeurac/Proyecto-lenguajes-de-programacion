package co.edu.javeriana.car.ast;

import java.util.Map;

public class Var_decl implements ASTNode {

	private String var_name;
			
	
	public Var_decl(String var_name) {
		super();
		this.var_name = var_name;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) {
		symbol_table.put(var_name, new Object());
		return null;
	}

}
