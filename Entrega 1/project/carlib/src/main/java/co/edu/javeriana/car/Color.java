package co.edu.javeriana.car;

class Color extends Action {
	
	private float r;
	private float g;
	private float b;
	private float a;

	public Color(Car car, float r, float g, float b, float a) {
		super(car);
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}

	@Override
	public void execute() {
		car.color(r,g,b,a);
	}

}
