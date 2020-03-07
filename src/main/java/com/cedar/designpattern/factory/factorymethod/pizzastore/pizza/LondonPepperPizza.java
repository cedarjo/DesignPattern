package com.cedar.designpattern.factory.factorymethod.pizzastore.pizza;

public class LondonPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println(name + " 准备原材料");
    }

}
