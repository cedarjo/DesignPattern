package com.cedar.designpattern.interpreter;

import java.util.Map;

/**
 * 变量的解释器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量的名称，返回对应的数值
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }

}
