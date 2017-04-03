package co.edu.javeriana.car;

import java.io.File;

import processing.core.PApplet;
import co.edu.javeriana.interpreter.Interpreter;

import com.nootropic.processing.layers.AppletLayers;

/** Representa la ventana donde se ejecutar� el programa de el carro.
 * Para ejecutar la aplicaci�n hay que agregar en el m�todo main una
 * llamada a {@link #run()} de la siguiente forma:
 * <pre>
 * 	public static void main(String args[]) {
 *		CarApplication.run(new MyInterpreter(), new File("programa.logo"));
 *	}
 * </pre>
 * Donde DummyInterpreter corresponde a la instancia de la subclase Interpreter
 * que se quiere utilizar para ejecutar la aplicaci�n de el carro. El segundo argumento
 * corresponde al archivo de texto con el programa que ejecutar� el carro
 * @author jaimepavlich-mariscal
 *
 */
@SuppressWarnings("serial")
public class CarApplication extends PApplet {
	InternalCar internalCar;
	Car car;
	Interpreter interpreter;
	AppletLayers layers;
	public Car getCar() {
		return car;
	}

	Scheduler scheduler;
	private String programFileName;
	private long waitTime;

	public CarApplication(Interpreter interpreter, String programFileName, long waitTime) {
		this.interpreter = interpreter;
		this.programFileName = programFileName;
		this.waitTime = waitTime;
	}

	public void setup() {
		size(800, 600);
		background(0);
		layers = new AppletLayers(this);
		scheduler = new Scheduler();
		internalCar = new InternalCar(this, loadImage("./images/car.png"));
		layers.addLayer(internalCar);
		car = new CarImpl(internalCar, scheduler);
		internalCar.setPos(getWidth() / 2, getHeight() / 2);
		new Thread(new Runnable() {

			@Override
			public void run() {
				interpreter.executeProgram(programFileName, car);
			}
		}).start();
	}

	public void draw() {
		scheduler.executeNext();
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/** Ejecuta la aplicacion de el carro con el interprete y el programa indicado. Este metodo
	 * debe llamarse desde la clase Main.
	 * @param interpreter Instancia de una subclase de {@link Interpreter} que se usara para 
	 * interpretar el programa dado
	 * @param programFileName Archivo con el programa a ejecutar por el carro
	 * @param waitTime Tiempo en milisegundos que el carro esperara antes de ejecutar
	 * el siguiente comando
	 */
	public static void run(final Interpreter interpreter, final String programFileName, long waitTime) {
		CarApplication carApplication = new CarApplication(interpreter,programFileName, waitTime);
		PApplet.runSketch(new String[] { CarApplication.class.getName() },
				carApplication);
	}
	
	public void paint(java.awt.Graphics g) {
	  if (layers != null) {
	    layers.paint(this);
	  } else {
	    super.paint(g);
	  }
	}

}