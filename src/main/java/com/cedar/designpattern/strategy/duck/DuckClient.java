package com.cedar.designpattern.strategy.duck;

import org.junit.Test;

public class DuckClient {

    @Test
    public void mallardDuckTest() {
        AbstractDuck duck = new MallardDuck();
        duck.quack();
        duck.swim();
        duck.display();
    }

    @Test
    public void redheadDuckTest() {
        AbstractDuck duck = new RedheadDuck();
        duck.quack();
        duck.swim();
        duck.display();
    }

    /*
     * 新需求：接入一个橡皮鸭 RubberDuck
     * 于是新建了RubberDuck类
     */

    /**
     * 橡皮鸭
     * 
     * @author xuxschn
     */
    class RubberDuck extends AbstractDuck {

        @Override
        public void quack() {
            System.out.println("吱吱叫");
        }

        @Override
        public void display() {
            System.out.println("外观：橡皮");
        }

    }

    @Test
    public void rubberDuckTest() {
        AbstractDuck duck = new RubberDuck();
        duck.quack();
        duck.swim();
        duck.display();
    }

    /*
     * 新需求：绿头鸭和红头鸭要有飞的功能
     * 于是对AbstractDuck做了增强
     * // 新增的需求，飞的能力
     * public void fly() {
     * System.out.println("鸭子飞");
     * }
     */

    @Test
    public void flyDuckTest() {
        AbstractDuck duck = new MallardDuck();
        duck.fly();
        duck = new RedheadDuck();
        duck.fly();
        duck = new RubberDuck();
        duck.fly();
    }

    /*
     * 问题：橡皮鸭子也会飞了
     * 改进方案：子类覆盖父类的方法
     * 详见 improve1 包
     */

}
