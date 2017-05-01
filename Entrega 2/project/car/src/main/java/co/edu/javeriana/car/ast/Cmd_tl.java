package co.edu.javeriana.car.ast;
import java.util.Map;

import co.edu.javeriana.car.Car;

public class Cmd_tl implements ASTNode
{
	private Car car;
	private ASTNode amount;
	
	public Cmd_tl(Car car, ASTNode amount) 
	{
		super();
		this.car = car;
		this.amount = amount;
	}
	
	@Override
	public Object execute(Map<String, Object> symbol_table)
	{
		car.left((float)amount.execute(symbol_table));
		return null;
	}

}
