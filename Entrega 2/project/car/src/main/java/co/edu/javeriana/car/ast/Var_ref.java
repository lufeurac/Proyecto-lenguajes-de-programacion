package co.edu.javeriana.car.ast;

import java.util.Map;

public class Var_ref implements ASTNode {

	private String var_name;
			
	
	public Var_ref(String var_name) {
		super();
		this.var_name = var_name;
	}


	@Override
	public Object execute(Map<String, Object> symbol_table) 
	{
		return symbol_table.get(var_name);
	}

}
