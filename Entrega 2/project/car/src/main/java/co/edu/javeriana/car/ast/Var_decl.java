package co.edu.javeriana.car.ast;

public class Var_decl implements ASTNode
{

    private String var_name;

    public Var_decl(String var_name)
    {
	super();
	this.var_name = var_name;
    }

    @Override
    public Object execute(Code_block segment)
    {
	segment.put(var_name, new Object());
	return null;
    }

}
