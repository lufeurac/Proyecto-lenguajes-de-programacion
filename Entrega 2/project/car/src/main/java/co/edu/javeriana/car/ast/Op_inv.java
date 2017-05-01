package co.edu.javeriana.car.ast;

import java.util.Map;

public class Op_inv implements ASTNode {
	private ASTNode termino;
	
	public Op_inv(ASTNode termino) {
		super();
		this.termino = termino;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) {
		return (float)termino.execute(symbol_table) * -1;
	}
}
