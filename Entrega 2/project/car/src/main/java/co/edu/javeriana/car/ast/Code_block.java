package co.edu.javeriana.car.ast;

import java.util.HashMap;

public class Code_block {
	private HashMap<String, Object> symbolTable;
	private HashMap<String, Object> functionTable;
	private Code_block previous;

	public Code_block() {
		this.symbolTable = new HashMap<String, Object>();
		this.functionTable = new HashMap<String, Object>();
		this.previous = null;
	}

	public Code_block(Code_block previous) {
		this.symbolTable = new HashMap<String, Object>();
		this.functionTable = new HashMap<String, Object>();
		this.previous = previous;
	}

	public void put(String key, Object value) {
		this.symbolTable.put(key, value);
	}

	public Object get(String key) {
		Object found = null;
		for (Code_block context = this; context != null; context = context.previous) {
			found = (Object) (context.symbolTable.get(key));
			if (found != null) {
				return found;
			}
		}
		return found;
	}

	public void varDeclaration(String key) {
		this.symbolTable.put(key, new Object());
	}

	public void funDeclaration(String key, Object value) {
		this.functionTable.put(key, value);
	}

	public void varAssignment(String key, Object value) {
		Object found = null;
		for (Code_block context = this; context != null; context = context.previous) {
			found = (Object) (context.symbolTable.get(key));
			if (found != null) {
				context.put(key, value);
				return;
			}
		}
	}

	public Object funCall(String key) {
		Object found = null;
		for (Code_block context = this; context != null; context = context.previous) {
			found = (Object) (context.functionTable.get(key));
			if (found != null) {
				return found;
			}
		}
		return found;
	}
}
