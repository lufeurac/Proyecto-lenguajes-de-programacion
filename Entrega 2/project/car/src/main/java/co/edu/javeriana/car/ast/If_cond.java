package co.edu.javeriana.car.ast;

import java.util.List;

public class If_cond implements ASTNode
{
    private ASTNode condition;
    private List<ASTNode> body;

    public If_cond(ASTNode condition, List<ASTNode> body)
    {
	super();
	this.condition = condition;
	this.body = body;
    }

    @Override
    public Object execute(Code_block segment)
    {
	if ((boolean) condition.execute(segment))
	{
	    for (ASTNode n : body)
	    {
		n.execute(segment);
	    }
	}
	return null;
    }

}
