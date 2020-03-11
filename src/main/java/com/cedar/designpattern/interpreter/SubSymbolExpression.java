package com.cedar.designpattern.interpreter;

import java.util.Map;

/**
 * 减法解释器
 */
public class SubSymbolExpression extends SymbolExpression {

    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }

}
