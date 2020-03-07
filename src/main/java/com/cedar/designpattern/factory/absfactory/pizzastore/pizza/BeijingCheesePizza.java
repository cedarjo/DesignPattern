package com.cedar.designpattern.factory.absfactory.pizzastore.pizza;

public class BeijingCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println(name + " 准备原材料");
    }

}
