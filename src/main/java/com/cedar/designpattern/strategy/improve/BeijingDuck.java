package com.cedar.designpattern.strategy.improve;

public class BeijingDuck extends Duck {

    public BeijingDuck() {
        this.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }

}
