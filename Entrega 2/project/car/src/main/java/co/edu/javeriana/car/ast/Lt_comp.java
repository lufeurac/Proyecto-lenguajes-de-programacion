package co.edu.javeriana.car.ast;

public class Lt_comp implements ASTNode {

	private ASTNode termino1;
	private ASTNode termino2;
	
	
	public Lt_comp(ASTNode termino1, ASTNode termino2) {
		super();
		this.termino1 = termino1;
		this.termino2 = termino2;
	}

	@Override
	public Object execute(Code_block segment) {
		return (float)termino1.execute(segment) < (float)termino2.execute(segment);
	}
}
