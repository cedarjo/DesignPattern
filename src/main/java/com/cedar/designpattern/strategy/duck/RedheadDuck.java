package com.cedar.designpattern.strategy.duck;

/**
 * 红头鸭
 * @author xuxschn
 */
public class RedheadDuck extends AbstractDuck {

    @Override
    public void display() {
        System.out.println("外观：红头");
    }

}
