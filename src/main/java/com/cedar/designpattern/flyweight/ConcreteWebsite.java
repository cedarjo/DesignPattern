package com.cedar.designpattern.flyweight;

public class ConcreteWebsite extends Website {

    // 共享的部分，内部状态
    private String type = ""; // 网站发布的形式（类型）

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    // user是非共享的部分，外部状态
    @Override
    public void use(String user) {
        System.out.println("网站发布形式为: " + type + " " + user + " 在使用中...");
    }

}
