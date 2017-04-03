package co.edu.javeriana.car;

class Right extends Action {
	
	private float angle;

	public Right(Car car, float angle) {
		super(car);
		this.angle=angle;
	}

	@Override
	public void execute() {
		car.right(angle);
	}

}
