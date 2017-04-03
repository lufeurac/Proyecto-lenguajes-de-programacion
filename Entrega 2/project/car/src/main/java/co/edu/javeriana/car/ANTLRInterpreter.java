package co.edu.javeriana.car;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import co.edu.javeriana.interpreter.Interpreter;

public class ANTLRInterpreter extends Interpreter {

	@Override
	public void executeProgram(String program, Car car) {
        try {
    		System.out.println("Interpreting file " + program);

    		CarLexer lexer = new CarLexer(new ANTLRFileStream(program));
    		CommonTokenStream tokens = new CommonTokenStream(lexer);
    		CarParser parser = new CarParser(car, tokens);

    		CarParser.StartContext tree = parser.start();

    		CarCustomVisitor visitor = new CarCustomVisitor();
    		visitor.visit(tree);

    		System.out.println("Interpretation finished");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
