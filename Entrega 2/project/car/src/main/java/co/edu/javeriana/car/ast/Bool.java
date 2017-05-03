package co.edu.javeriana.car.ast;

public class Bool implements ASTNode
{

    private ASTNode operation;

    public Bool(ASTNode operation)
    {
	super();
	this.operation = operation;
    }

    public Object execute(Code_block segment)
    {
	return (boolean) operation.execute(segment);
    }

}
