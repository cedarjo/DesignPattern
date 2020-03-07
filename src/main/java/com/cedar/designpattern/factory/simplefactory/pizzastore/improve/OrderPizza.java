package com.cedar.designpattern.factory.simplefactory.pizzastore.improve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cedar.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    private SimpleFactory factory;

    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
    }

    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);
        do {
            Pizza pizza = this.factory.createPizza(getType());
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
