package co.edu.javeriana.car.ast;

import java.util.Map;

public class Eq_comp implements ASTNode {

	private ASTNode termino1;
	private ASTNode termino2;
	
	
	public Eq_comp(ASTNode termino1, ASTNode termino2) {
		super();
		this.termino1 = termino1;
		this.termino2 = termino2;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) {
		return termino1.execute(symbol_table).equals(termino2.execute(symbol_table));
	}
}
