package co.edu.javeriana.car;

class Back extends Action {
	
	private float steps;

	public Back(Car car, float steps) {
		super(car);
		this.steps=steps;
	}

	@Override
	public void execute() {
		car.back(steps);
	}

}
