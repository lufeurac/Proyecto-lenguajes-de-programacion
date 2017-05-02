package co.edu.javeriana.car.ast;
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

	public Object execute(Code_block segment) 
	{
		car.color((float)red.execute(segment),
				(float)green.execute(segment),
				(float)blue.execute(segment),
				(float)alpha.execute(segment));
		return null;
	}

}
