package co.edu.javeriana.car.ast;

import java.util.List;

public class Call_func implements ASTNode {

	private String name;
	private List<Object> parameters;

	public Call_func(String name, List<Object> parameters) {
		super();
		this.name = name;
		this.parameters = parameters;
	}

	@Override
	public Object execute(Code_block context) {
		New_func function = (New_func) context.funCall(name);
		int i = 0;
		if (function != null) {
			Code_block newContext = new Code_block(context);
			for (String parameter : function.getParameters()) {
				newContext.varDeclaration(parameter);
				try {
					newContext.varAssignment(parameter, ((ASTNode) this.parameters.get(i++)).execute(context));
				} catch (Exception e) {
					System.out.println("Wrong arguments in function: " + this.name);
					System.exit(0);
				}
			}
			for (ASTNode node : function.getBody()) {
				node.execute(newContext);
			}
		} else {
			System.out.println("Error calling for an undeclared function: " + this.name);
			System.exit(0);
		}
		return null;
	}
}
