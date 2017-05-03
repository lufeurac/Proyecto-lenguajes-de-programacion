package co.edu.javeriana.car.ast;

public class Op_div implements ASTNode
{
    private ASTNode termino1;
    private ASTNode termino2;

    public Op_div(ASTNode termino1, ASTNode termino2)
    {
	super();
	this.termino1 = termino1;
	this.termino2 = termino2;
    }

    @Override
    public Object execute(Code_block segment)
    {
	return (float) termino1.execute(segment) / (float) termino2.execute(segment);
    }

}
