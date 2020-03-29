package com.cedar.designpattern.strategy.duck.improve1;

/**
 * 橡皮鸭子
 * @author xuxschn
 */
public class RubberDuck extends AbstractDuck {

    /**
     * 覆盖父类的呱呱叫
     * @author xuxschn
     */
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮");
    }

    /**
     * 覆盖父类的会飞
     * @author xuxschn
     */
    @Override
    public void fly() {
        // 不会飞
    }

}
