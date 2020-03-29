package com.cedar.designpattern.strategy.duck.strategy.swim;

public class CanSwimBehavior implements ISwimBehavior {

    @Override
    public void swim() {
        System.out.println("游泳");
    }
    
}
