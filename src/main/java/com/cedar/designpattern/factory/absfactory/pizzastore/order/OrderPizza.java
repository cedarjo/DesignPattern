package com.cedar.designpattern.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        this.factory = factory;
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza == null) {
                System.out.println("订购失败");
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

}
