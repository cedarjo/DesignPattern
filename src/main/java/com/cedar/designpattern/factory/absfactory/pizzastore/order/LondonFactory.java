package com.cedar.designpattern.factory.absfactory.pizzastore.order;

import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.LondonCheesePizza;
import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.LondonPepperPizza;
import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

public class LondonFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LondonCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }

}
