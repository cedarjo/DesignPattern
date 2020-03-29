package com.cedar.designpattern.strategy.duck.improve1;

import org.junit.Test;

public class DuckClient1 {

    @Test
    public void rubberDuckTest() {
        AbstractDuck duck = new RubberDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
    }

    /*
     * 问题：后续会增加更多的鸭子，行为待定需求不明
     * 每当新鸭子出现，都要检查是否要覆盖父类的方法
     * 改进方案：将动作抽象为接口
     * 详见 improve2 包
     */

}
