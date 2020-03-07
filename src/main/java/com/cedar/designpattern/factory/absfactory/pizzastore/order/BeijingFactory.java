package com.cedar.designpattern.factory.absfactory.pizzastore.order;

import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.BeijingCheesePizza;
import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.BeijingPepperPizza;
import com.cedar.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

public class BeijingFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BeijingCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
