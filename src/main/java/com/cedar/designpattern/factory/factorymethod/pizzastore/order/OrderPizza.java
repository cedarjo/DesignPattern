package com.cedar.designpattern.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza == null) {
                break;
            }
            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    public String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    abstract Pizza createPizza(String orderType);

}
