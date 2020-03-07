package com.cedar.designpattern.factory.factorymethod.pizzastore.pizza;

public class BeijingPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println(name + " 准备原材料");
    }

}
