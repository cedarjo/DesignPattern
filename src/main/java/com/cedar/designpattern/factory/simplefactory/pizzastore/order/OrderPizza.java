package com.cedar.designpattern.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购Pizza的类型
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
