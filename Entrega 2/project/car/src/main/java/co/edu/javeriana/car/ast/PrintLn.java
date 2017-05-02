package co.edu.javeriana.car.ast;

public class PrintLn implements ASTNode {
	private ASTNode termino;
	
	public PrintLn(ASTNode termino) {
		super();
		this.termino = termino;
	}

	@Override
	public Object execute(Code_block segment) {
//		if(termino.execute(symbol_table).equals("#t"))
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
		System.out.println(termino.execute(segment));
		return null;
	}

}
