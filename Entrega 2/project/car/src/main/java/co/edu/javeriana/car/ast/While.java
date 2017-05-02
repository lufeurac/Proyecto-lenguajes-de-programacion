package co.edu.javeriana.car.ast;

import java.util.List;

public class While implements ASTNode {

	private ASTNode bool;
	private List<ASTNode> body;
	
	public While(ASTNode bool, List<ASTNode> body) {
		super();
		this.bool = bool;
		this.body = body;
	}

	@Override
	public Object execute(Code_block symbolTable) 
	{
		while((boolean) bool.execute(symbolTable))
		{
			for(int i = 0; i < body.size(); i++)
			{
				body.get(i).execute(symbolTable);
			}
		}
		return null;
	}

}
