package co.edu.javeriana.interpreter;

import co.edu.javeriana.car.Car;

public abstract class Interpreter {

	public Interpreter(){
		
	}
	
	public abstract void executeProgram(String program, Car car);

}
