package co.edu.javeriana.car.ast;
import java.util.Map;

import co.edu.javeriana.car.Car;

public class Set_color implements ASTNode 
{

	private Car car;
	private ASTNode red;
	private ASTNode green;
	private ASTNode blue;
	private ASTNode alpha;
	
	public Set_color(Car car, ASTNode red, ASTNode green, ASTNode blue, ASTNode alpha) 
	{
		super();
		this.car = car;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}

	public Object execute(Map<String, Object> symbol_table) 
	{
		car.color((float)red.execute(symbol_table),
				(float)green.execute(symbol_table),
				(float)blue.execute(symbol_table),
				(float)alpha.execute(symbol_table));
		return null;
	}

}
