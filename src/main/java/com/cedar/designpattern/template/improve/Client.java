package com.cedar.designpattern.template.improve;

public class Client {

    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("--制作红豆豆浆--");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();

        // 制作纯豆浆
        System.out.println("--制作纯豆浆--");
        soyaMilk = new PureSoyaMilk();
        soyaMilk.make();
    }

}
