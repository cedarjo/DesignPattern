package com.cedar.designpattern.factory.factorymethod.pizzastore.order;

import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.LondonCheesePizza;
import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.LondonPepperPizza;
import com.cedar.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class LondonOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LondonCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }

}
