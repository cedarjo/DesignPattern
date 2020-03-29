package com.cedar.designpattern.strategy.duck.strategy.fly;

public class CanFlyBehavior implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞");
    }

}
