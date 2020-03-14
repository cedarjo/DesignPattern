package com.cedar.designpattern.strategy;

public class BeijingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    // 北京鸭不能飞翔
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞");
    }

}
