package co.edu.javeriana.car.ast;

import java.util.Map;

public class PrintLn implements ASTNode {
	private ASTNode termino;
	
	public PrintLn(ASTNode termino) {
		super();
		this.termino = termino;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table) {
		System.out.println(termino.execute(symbol_table));
		return null;
	}

}
