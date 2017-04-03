package co.edu.javeriana.interpreter;

import co.edu.javeriana.car.Car;

public class DummyInterpreter3 extends Interpreter {

	@Override
	public void executeProgram(String program, Car car) {
		car.color(255,0,0,255);
		for (int i=0; i< 100; i++) {
			car.forward(5);
			car.right(10);
		}
	}

}
