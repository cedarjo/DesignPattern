package com.cedar.designpattern.strategy.improve;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    public void quack() {
        if (quackBehavior == null) {
            System.out.println("鸭子嘎嘎叫");
        } else {
            quackBehavior.quack();
        }
    }

    public void swim() {
        if (swimBehavior == null) {
            System.out.println("鸭子会游泳");
        } else {
            swimBehavior.swim();
        }
    }

    public void fly() {
        if (flyBehavior == null) {
            System.out.println("鸭子会飞翔");
        } else {
            flyBehavior.fly();
        }
    }

    public abstract void display(); // 显示鸭子信息

}
