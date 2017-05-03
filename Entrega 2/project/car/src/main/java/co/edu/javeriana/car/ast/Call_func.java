package co.edu.javeriana.car.ast;

import java.util.List;

public class Call_func implements ASTNode
{

    private String name;
    private List<Object> parameters;

    public Call_func(String name, List<Object> parameters)
    {
	super();
	this.name = name;
	this.parameters = parameters;
    }

    @Override
    public Object execute(Code_block segment)
    {
	New_func function = (New_func) segment.funCall(name);
	int i = 0;
	if (function != null)
	{
	    Code_block temp_segment = new Code_block(segment);
	    for (String parameter : function.getParameters())
	    {
		temp_segment.varDeclaration(parameter);
		try
		{
		    temp_segment.varAssignment(parameter, ((ASTNode) this.parameters.get(i++)).execute(segment));
		}
		catch (Exception e)
		{
		    System.out.println("Wrong arguments in function: " + this.name);
		    System.exit(0);
		}
	    }
	    for (ASTNode node : function.getBody())
	    {
		node.execute(temp_segment);
	    }
	}
	else
	{
	    System.out.println("Error calling for an undeclared function: " + this.name);
	    System.exit(0);
	}
	return null;
    }
}
