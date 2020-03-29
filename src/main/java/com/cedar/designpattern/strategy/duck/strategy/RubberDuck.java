package com.cedar.designpattern.strategy.duck.strategy;

import com.cedar.designpattern.strategy.duck.strategy.fly.CannotFlyBehavior;
import com.cedar.designpattern.strategy.duck.strategy.quack.QuackZhizhiBehavior;
import com.cedar.designpattern.strategy.duck.strategy.swim.CanSwimBehavior;

public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        flyBehavior = new CannotFlyBehavior();
        quackBehavior = new QuackZhizhiBehavior();
        swimBehavior = new CanSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮");
    }

}
