package com.cedar.designpattern.prototype.improve;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        System.out.println("sheep: " + sheep.hashCode());
        System.out.println("sheep2: " + sheep2.hashCode());
        System.out.println("sheep3: " + sheep3.hashCode());
    }

}
