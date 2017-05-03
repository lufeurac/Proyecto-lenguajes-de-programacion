package co.edu.javeriana.car.ast;

import java.util.HashMap;

public class Code_block
{
    private HashMap<String, Object> symbol_table;
    private HashMap<String, Object> function_table;
    private Code_block previous;

    public Code_block()
    {
	this.symbol_table = new HashMap<String, Object>();
	this.function_table = new HashMap<String, Object>();
	this.previous = null;
    }

    public Code_block(Code_block previous)
    {
	this.symbol_table = new HashMap<String, Object>();
	this.function_table = new HashMap<String, Object>();
	this.previous = previous;
    }

    public void put(String key, Object value)
    {
	this.symbol_table.put(key, value);
    }

    public Object get(String key)
    {
	Object found = null;
	for (Code_block segment = this; segment != null; segment = segment.previous)
	{
	    found = (Object) (segment.symbol_table.get(key));
	    if (found != null)
	    {
		return found;
	    }
	}
	return found;
    }

    public void varDeclaration(String key)
    {
	this.symbol_table.put(key, new Object());
    }

    public void funDeclaration(String key, Object value)
    {
	this.function_table.put(key, value);
    }

    public void varAssignment(String key, Object value)
    {
	Object found = null;
	for (Code_block segment = this; segment != null; segment = segment.previous)
	{
	    found = (Object) (segment.symbol_table.get(key));
//	    System.out.println(found.toString());
	    if (found != null)
	    {
		segment.put(key, value);
		return;
	    }
	}
    }

    public Object funCall(String key)
    {
	Object found = null;
	for (Code_block segment = this; segment != null; segment = segment.previous)
	{
	    found = (Object) (segment.function_table.get(key));
	    if (found != null)
	    {
		return found;
	    }
	}
	return found;
    }
}
