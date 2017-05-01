package co.edu.javeriana.car.ast;
import java.util.Map;

import co.edu.javeriana.car.Car;

public class Cmd_mf implements ASTNode
{
	private Car car;
	private ASTNode amount;
	
	public Cmd_mf(Car car, ASTNode amount) 
	{
		super();
		this.car = car;
		this.amount = amount;
	}

	@Override
	public Object execute(Map<String, Object> symbol_table)
	{
		car.forward((float)amount.execute(symbol_table));
		return null;
	}

}
