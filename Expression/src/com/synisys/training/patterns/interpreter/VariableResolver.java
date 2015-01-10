
package com.synisys.training.patterns.interpreter;

import com.synisys.training.patterns.interpreter.parser.*;

import java.util.Map;

/**
 * A visitor that sets a variable with a specific name to a given value
 */
public class VariableResolver implements ExpressionNodeVisitor {

  private final Map<String, Double> variableValues;

  public VariableResolver(Map<String, Double> variableValues)
  {
    this.variableValues= variableValues;
  }

  /**
   * Checks the nodes name against the name to set and sets the value if the two
   * strings match
   */
  public void visit(VariableExpressionNode node)
  {
    Double value = variableValues.get(node.getName());
    if (value != null)
      node.setValue(value);
  }

  /** Do nothing */
  public void visit(ConstantExpressionNode node)
  {}

  /** Do nothing */
  public void visit(AdditionExpressionNode node)
  {}

  /** Do nothing */
  public void visit(MultiplicationExpressionNode node)
  {}

  /** Do nothing */
  public void visit(ExponentiationExpressionNode node)
  {}

  /** Do nothing */
  public void visit(FunctionExpressionNode node)
  {}

}
