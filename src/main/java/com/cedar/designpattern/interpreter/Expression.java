package com.cedar.designpattern.interpreter;

import java.util.Map;

/**
 * 抽象类表达式，通过Map的键值对，可以获取到各个变量的值
 */
public abstract class Expression {

    /**
     * 解释公式和数值
     * Map中存储的是 {"a":10,"b":20}
     */
    public abstract int interpreter(Map<String, Integer> var);

}
