package com.cedar.designpattern.interpreter.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelTest {

    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("10*(2+1)*1+66");
        Object value = expression.getValue();
        System.out.println(value);

    }

}
