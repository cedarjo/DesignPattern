package com.cedar.designpattern.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭子");
    }

}
