package co.edu.javeriana.car.ast;

import java.util.Scanner;

public class Read implements ASTNode
{

    private String input;

    public Read(String var_name)
    {
	super();
	this.input = var_name;
    }

    @Override
    public Object execute(Code_block segment)
    {
	String line;
	Scanner scanner = new Scanner(System.in);
	try
	{
	    if (scanner.hasNext())
	    {
		line = scanner.nextLine();
		segment.varAssignment(input, Double.parseDouble(line));
	    }
	}
	catch (NumberFormatException e)
	{
	    if (scanner.hasNext())
	    {
		line = scanner.nextLine();
		segment.varAssignment(input, line);
	    }
	}
	scanner.close();
	return null;
    }
}
