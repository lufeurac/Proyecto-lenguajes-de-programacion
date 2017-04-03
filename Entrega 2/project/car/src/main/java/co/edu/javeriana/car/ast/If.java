package co.edu.javeriana.car.ast;

import java.util.List;

public class If implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;
	
	 
	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}


	@Override
	public Object execute()
	{
		if ((boolean)condition.execute()) 
		{
			for (ASTNode n : body) 
			{
				n.execute();
			}
		} 
		else 
		{
			for (ASTNode n : elseBody)
			{
				n.execute();
			}
		}
		return null;
	}

}
