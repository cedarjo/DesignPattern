package com.cedar.designpattern.strategy.improve;

public class Client {

    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.fly();
    }

}
