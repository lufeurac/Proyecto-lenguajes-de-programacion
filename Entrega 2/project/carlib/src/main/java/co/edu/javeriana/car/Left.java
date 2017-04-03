package co.edu.javeriana.car;

class Left extends Action {
	
	private float angle;

	public Left(Car car, float angle) {
		super(car);
		this.angle=angle;
	}

	@Override
	public void execute() {
		car.left(angle);
	}

}
