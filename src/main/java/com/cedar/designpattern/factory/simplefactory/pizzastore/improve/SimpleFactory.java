package com.cedar.designpattern.factory.simplefactory.pizzastore.improve;

import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

}
