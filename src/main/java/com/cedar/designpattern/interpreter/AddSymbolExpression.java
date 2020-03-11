package com.cedar.designpattern.interpreter;

import java.util.Map;

/**
 * 加法解释器
 */
public class AddSymbolExpression extends SymbolExpression {

    public AddSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }

}
