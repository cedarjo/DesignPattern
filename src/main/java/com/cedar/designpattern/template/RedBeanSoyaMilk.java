package com.cedar.designpattern.template;

public class RedBeanSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("第二步：添加新鲜红豆 ");
    }

}
