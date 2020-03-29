package com.cedar.designpattern.strategy.duck.strategy;

import com.cedar.designpattern.strategy.duck.strategy.fly.IFlyBehavior;
import com.cedar.designpattern.strategy.duck.strategy.quack.IQuackBehavior;
import com.cedar.designpattern.strategy.duck.strategy.swim.ISwimBehavior;

public abstract class AbstractDuck {

    protected IQuackBehavior quackBehavior;
    protected ISwimBehavior swimBehavior;
    protected IFlyBehavior flyBehavior;

    public AbstractDuck() {

    }

    public AbstractDuck(IQuackBehavior quackBehavior, ISwimBehavior swimBehavior, IFlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        this.swimBehavior.swim();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public abstract void display();

}
