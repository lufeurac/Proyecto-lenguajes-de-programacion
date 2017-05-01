package co.edu.javeriana.car.ast;

import java.util.Map;

public class Constant implements ASTNode {

	private Object value;
		
	public Constant(Object value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) 
	{		
		return value;
	}

}
