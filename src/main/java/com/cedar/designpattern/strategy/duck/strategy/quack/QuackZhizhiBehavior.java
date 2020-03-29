package com.cedar.designpattern.strategy.duck.strategy.quack;

public class QuackZhizhiBehavior implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

}
