package edu.buffalo.cse.jive.finiteStateMachine.expression.arithmetic;

import edu.buffalo.cse.jive.finiteStateMachine.expression.value.ValueExpression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class DivisionExpression extends ArithmeticExpression {

	public DivisionExpression() {
		super();
	}

	public DivisionExpression(ValueExpression expressionA, ValueExpression expressionB) {
		super(expressionA, expressionB);
	}

	@Override
	public Object getValue() {
		return getExpressionA().divide(getExpressionB());
	}

}
