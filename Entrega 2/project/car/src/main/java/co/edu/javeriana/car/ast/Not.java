package co.edu.javeriana.car.ast;

public class Not implements ASTNode
{

    private ASTNode operation;

    public Not(ASTNode operation)
    {
	super();
	this.operation = operation;
    }

    public Object execute(Code_block segment)
    {
	return !(boolean) operation.execute(segment);
    }

}
