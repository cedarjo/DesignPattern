package com.cedar.designpattern.strategy.duck.imrove2;

public abstract class AbstractDuck {

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public abstract void display();

    /*
     * 问题：重复代码
     * MallardDuck中“呱呱叫”和RedheadDuck中“呱呱叫”一致
     * 如果要统一改动“呱呱叫”，就要修改所有子类中的实现
     * 改进：聚合、组合优于继承，将鸭子与鸭子行为的关系由继承改为聚合
     * 详见 improve3 包
     */

}

/**
 * 绿头鸭
 * @author xuxschn
 */
class MallardDuck extends AbstractDuck
        implements IFlyBehavior, IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：绿头");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

}

/**
 * 红头鸭
 * @author xuxschn
 */
class RedheadDuck extends AbstractDuck
        implements IFlyBehavior, IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：红头");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

}

/**
 * 橡皮鸭
 * @author xuxschn
 */
class RubberDuck extends AbstractDuck
        implements IFlyBehavior, IQuackBehavior {

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void fly() {
        // 不会飞
    }

}