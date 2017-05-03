package co.edu.javeriana.car.ast;

import java.util.List;

public class Ife_cond implements ASTNode
{
    private ASTNode condition;
    private List<ASTNode> body;
    private List<ASTNode> elseBody;

    public Ife_cond(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody)
    {
	super();
	this.condition = condition;
	this.body = body;
	this.elseBody = elseBody;
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
	else
	{
	    for (ASTNode n : elseBody)
	    {
		n.execute(segment);
	    }
	}
	return null;
    }

}
