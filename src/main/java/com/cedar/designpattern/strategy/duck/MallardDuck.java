package com.cedar.designpattern.strategy.duck;

/**
 * 绿头鸭
 * 
 * @author xuxschn
 */
public class MallardDuck extends AbstractDuck {

    @Override
    public void display() {
        System.out.println("外观：绿头");
    }

}
