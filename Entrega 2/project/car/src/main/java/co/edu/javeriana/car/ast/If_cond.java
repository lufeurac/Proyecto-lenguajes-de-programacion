package co.edu.javeriana.car.ast;

import java.util.List;
import java.util.Map;

public class If_cond implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;
	
	 
	public If_cond(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}


	@Override
	public Object execute(Map<String, Object> symbol_table)
	{
		if ((boolean)condition.execute(symbol_table)) 
		{
			for (ASTNode n : body) 
			{
				n.execute(symbol_table);
			}
		} 
		else 
		{
			for (ASTNode n : elseBody)
			{
				n.execute(symbol_table);
			}
		}
		return null;
	}

}
