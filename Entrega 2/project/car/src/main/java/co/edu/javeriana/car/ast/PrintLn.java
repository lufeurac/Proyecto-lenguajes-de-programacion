package co.edu.javeriana.car.ast;

public class PrintLn implements ASTNode {
	private ASTNode termino;
	
	
	public PrintLn(ASTNode termino) {
		super();
		this.termino = termino;
	}


	@Override
	public Object execute() {
		System.out.println(termino.execute());
		return null;
	}

}
