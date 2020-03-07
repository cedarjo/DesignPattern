package com.cedar.designpattern.factory.simplefactory.pizzastore.improve;

// 相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
        //        new OrderPizza1();

        new OrderPizza(new SimpleFactory());
    }

}
