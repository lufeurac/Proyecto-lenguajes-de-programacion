package co.edu.javeriana.car.ast;

import co.edu.javeriana.car.Car;

public class Cmd_tr implements ASTNode
{
    private Car car;
    private ASTNode amount;

    public Cmd_tr(Car car, ASTNode amount)
    {
	super();
	this.car = car;
	this.amount = amount;
    }

    @Override
    public Object execute(Code_block segment)
    {
	car.right((float) amount.execute(segment));
	return null;
    }

}
