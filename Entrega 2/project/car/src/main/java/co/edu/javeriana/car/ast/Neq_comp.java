package co.edu.javeriana.car.ast;

public class Neq_comp implements ASTNode {

	private ASTNode termino1;
	private ASTNode termino2;
	
	
	public Neq_comp(ASTNode termino1, ASTNode termino2) {
		super();
		this.termino1 = termino1;
		this.termino2 = termino2;
	}

	@Override
	public Object execute(Code_block segment) {
		return !(termino1.execute(segment).equals(termino2.execute(segment)));
	}
}
