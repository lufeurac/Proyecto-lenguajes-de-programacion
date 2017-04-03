package co.edu.javeriana.interpreter;

import java.io.File;

import co.edu.javeriana.car.CarApplication;


public class Test1 {

	/** Este metodo muestra la forma de ejecutar la aplicacion. El primer parametro
	 * corresponde al interprete que procesara el programa fuente que se pasa como segundo parametro.
	 * 
	 * Para crear un interprete propio, basta con crear una subclase de
	 * {@link Interpreter} e implementar el metodo {@link Interpreter#executeProgram(File, co.edu.javeriana.car.Car)},
	 * el cual  deberia ser capaz de procesar el archivo programa.logo
	 */
	public static void main(String args[]) {
		
		CarApplication.run(new DummyInterpreter(), "programa.car", 100);
	}

}
