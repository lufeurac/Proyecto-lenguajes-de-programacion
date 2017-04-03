package co.edu.javeriana.car;

abstract class Action {
	protected Car car;
	public Action(Car car) {
		this.car = car;
	}
	public abstract void execute();

}
