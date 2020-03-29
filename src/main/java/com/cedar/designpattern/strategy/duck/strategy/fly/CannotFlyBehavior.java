package com.cedar.designpattern.strategy.duck.strategy.fly;

public class CannotFlyBehavior implements IFlyBehavior {

    @Override
    public void fly() {
        // 不会飞
    }

}
