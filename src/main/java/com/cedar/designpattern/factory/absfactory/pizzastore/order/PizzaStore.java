package com.cedar.designpattern.factory.absfactory.pizzastore.order;

// 相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
        // 创建北京口味的各种pizza
        new OrderPizza(new BeijingFactory());
    }

}