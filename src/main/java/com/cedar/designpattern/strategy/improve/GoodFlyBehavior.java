package com.cedar.designpattern.strategy.improve;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得很好");
    }

}
