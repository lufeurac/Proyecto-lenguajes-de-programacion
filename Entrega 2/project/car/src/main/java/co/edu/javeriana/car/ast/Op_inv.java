package co.edu.javeriana.car.ast;

public class Op_inv implements ASTNode
{
    private ASTNode termino;

    public Op_inv(ASTNode termino)
    {
	super();
	this.termino = termino;
    }

    @Override
    public Object execute(Code_block segment)
    {
	return (float) termino.execute(segment) * -1;
    }
}
