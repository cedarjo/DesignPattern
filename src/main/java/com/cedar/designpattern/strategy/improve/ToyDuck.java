package com.cedar.designpattern.strategy.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        this.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

}
