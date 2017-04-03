package co.edu.javeriana.car;

class Forward extends Action {
	
	private float steps;

	public Forward(Car car, float steps) {
		super(car);
		this.steps=steps;
	}

	@Override
	public void execute() {
		car.forward(steps);
	}

}
