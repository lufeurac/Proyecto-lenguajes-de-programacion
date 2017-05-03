package co.edu.javeriana.car.ast;

public class Or implements ASTNode
{

    private ASTNode operation_A;
    private ASTNode operation_B;

    public Or(ASTNode operation_A, ASTNode operation_B)
    {
	super();
	this.operation_A = operation_A;
	this.operation_B = operation_B;
    }

    public Object execute(Code_block segment)
    {
	return (boolean) operation_A.execute(segment) || (boolean) operation_B.execute(segment);
    }

}
