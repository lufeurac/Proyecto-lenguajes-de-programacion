package co.edu.javeriana.car;

class CarImpl implements Car {
	private Scheduler scheduler = new Scheduler();


	private InternalCar car;
	
	public CarImpl(InternalCar car, Scheduler scheduler) {
		this.car = car;
		this.scheduler = scheduler;
	}

	@Override
	public void color(float r, float g, float b, float a) {
		scheduler.schedule(new Color(car,r,g,b,a));
		
	}

	@Override
	public void back(float steps) {
		scheduler.schedule(new Back(car,steps));

		
	}

	@Override
	public void forward(float steps) {
		scheduler.schedule(new Forward(car,steps));
		
	}

	@Override
	public void left(float dAngle) {
		scheduler.schedule(new Left(car,dAngle));
		
	}

	@Override
	public void right(float dAngle) {
		scheduler.schedule(new Right(car,dAngle));
		
	}
	
}
