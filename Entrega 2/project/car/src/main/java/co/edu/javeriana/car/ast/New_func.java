package co.edu.javeriana.car.ast;

import java.util.List;

public class New_func implements ASTNode
{

    private String name;
    private List<ASTNode> body;
    private List<String> parameters;

    public New_func(String name, List<ASTNode> body, List<String> parameters)
    {
	super();
	this.name = name;
	this.body = body;
	this.parameters = parameters;
    }

    public List<ASTNode> getBody()
    {
	return body;
    }

    public void setBody(List<ASTNode> body)
    {
	this.body = body;
    }

    public List<String> getParameters()
    {
	return parameters;
    }

    public void setParameters(List<String> parameters)
    {
	this.parameters = parameters;
    }

    @Override
    public Object execute(Code_block symbol_table)
    {
	symbol_table.funDeclaration(this.name, this);
	return null;
    }
}
