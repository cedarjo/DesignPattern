package com.cedar.designpattern.factory.factorymethod.pizzastore.pizza;

public class LondonCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println(name + " 准备原材料");
    }

}
