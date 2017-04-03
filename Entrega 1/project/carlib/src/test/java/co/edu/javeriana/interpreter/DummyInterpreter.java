package co.edu.javeriana.interpreter;

import co.edu.javeriana.car.Car;

public class DummyInterpreter extends Interpreter {

	@Override
	public void executeProgram(String program, Car car) {
		car.color(255, 0, 0, 255);
		for (int i = 0; i < 5; i++) {
			car.forward(100);
			car.left(45);
		}
		car.forward(100);

	}

}
