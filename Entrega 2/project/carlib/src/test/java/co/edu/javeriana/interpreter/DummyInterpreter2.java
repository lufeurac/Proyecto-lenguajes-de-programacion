package co.edu.javeriana.interpreter;

import co.edu.javeriana.car.Car;

public class DummyInterpreter2 extends Interpreter {

	@Override
	public void executeProgram(String program, Car car) {
		car.color(255,0,0,255);
		while(true) {
			int action = (int) (Math.random() * 5);
			if (action == 0) {
				car.forward((float) (Math.random() * 100));				
			} else if (action ==1) {
				car.right((float) (Math.random() * 180));
			} else if (action == 2) {
				car.left((float) (Math.random() * 180));
			} else if (action == 3) {
				car.back((float) (Math.random() * 100));				
			} else if (action == 4) {
				car.color((float)Math.random()*255,(float)Math.random()*255,(float)Math.random()*255,255);				
			}	
		}
	}

}
