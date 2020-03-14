package com.cedar.designpattern.strategy.improve;

public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得不好");
    }

}
