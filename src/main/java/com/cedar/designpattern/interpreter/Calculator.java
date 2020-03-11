package com.cedar.designpattern.interpreter;

import java.util.Map;
import java.util.Stack;

public class Calculator {

    // 定义表达式
    private Expression expression;

    // 构造函数传参，并解析
    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        int i = 0;
        while (i < charArray.length) {
            switch (charArray[i]) {
                case '+':
                    // 如果是加号的话，需要组建一个加法表达式
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[i + 1]));
                    stack.push(new AddSymbolExpression(left, right));
                    i += 2;
                    break;
                case '-':
                    // 如果是减号的话，需要组建一个减法表达式
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[i + 1]));
                    stack.push(new SubSymbolExpression(left, right));
                    i += 2;
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    i += 1;
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }

}
