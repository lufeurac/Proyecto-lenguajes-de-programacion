package co.edu.javeriana.car.ast;

public class Var_ref implements ASTNode {

	private String var_name;
			
	
	public Var_ref(String var_name) {
		super();
		this.var_name = var_name;
	}


	@Override
	public Object execute(Code_block segment) 
	{
		return segment.get(var_name);
	}

}
