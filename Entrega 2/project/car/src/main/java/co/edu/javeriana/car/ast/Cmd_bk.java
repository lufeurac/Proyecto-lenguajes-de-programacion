package co.edu.javeriana.car.ast;

import co.edu.javeriana.car.Car;

public class Cmd_bk implements ASTNode
{
    private Car car;
    private ASTNode amount;

    public Cmd_bk(Car car, ASTNode amount)
    {
	super();
	this.car = car;
	this.amount = amount;
    }

    @Override
    public Object execute(Code_block segment)
    {
	car.back((float) amount.execute(segment));
	return null;
    }

}
