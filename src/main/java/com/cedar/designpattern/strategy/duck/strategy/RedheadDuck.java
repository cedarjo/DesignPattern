package com.cedar.designpattern.strategy.duck.strategy;

import com.cedar.designpattern.strategy.duck.strategy.fly.CanFlyBehavior;
import com.cedar.designpattern.strategy.duck.strategy.quack.QuackGuaguaBehavior;
import com.cedar.designpattern.strategy.duck.strategy.swim.CanSwimBehavior;

public class RedheadDuck extends AbstractDuck {

    public RedheadDuck() {
        flyBehavior = new CanFlyBehavior();
        quackBehavior = new QuackGuaguaBehavior();
        swimBehavior = new CanSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("外观：红头");
    }

}
