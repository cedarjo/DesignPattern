package com.cedar.designpattern.interpreter;

/**
 * 抽象运算符号解释器
 * 这里，每个运算符号都只和自己左右两个操作数有关系
 * 左右两个操作数可能是一个解析的结果，也可能是数值，无论何种类型，都是Expression的实现类
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
