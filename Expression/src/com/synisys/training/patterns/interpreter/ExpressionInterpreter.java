package com.synisys.training.patterns.interpreter;


import com.synisys.training.patterns.interpreter.parser.ExpressionNode;

public class ExpressionInterpreter {


	public double interpret(ExpressionNode expression, Context context){
		expression.accept(new VariableResolver(context.getValues()));
		return expression.getValue();
	}

}
