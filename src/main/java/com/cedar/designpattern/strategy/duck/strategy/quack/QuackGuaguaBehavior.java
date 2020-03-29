package com.cedar.designpattern.strategy.duck.strategy.quack;

public class QuackGuaguaBehavior implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

}
