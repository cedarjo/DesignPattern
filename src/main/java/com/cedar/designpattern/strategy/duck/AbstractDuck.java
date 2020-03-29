package com.cedar.designpattern.strategy.duck;

/**
 * 鸭子抽象类
 * 
 * @author xuxschn
 */
public abstract class AbstractDuck {

    public void quack() {
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 鸭子的长相抽象
     * 
     * @author xuxschn
     */
    public abstract void display();

    // 新增的需求，飞的能力
    public void fly() {
        System.out.println("飞");
    }

}
