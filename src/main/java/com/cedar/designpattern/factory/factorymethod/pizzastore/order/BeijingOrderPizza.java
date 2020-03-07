package com.cedar.designpattern.factory.factorymethod.pizzastore.order;

import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.BeijingCheesePizza;
import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.BeijingPepperPizza;
import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class BeijingOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BeijingCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
