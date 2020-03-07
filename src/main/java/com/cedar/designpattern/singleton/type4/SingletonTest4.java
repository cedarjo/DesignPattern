package com.cedar.designpattern.singleton.type4;

public class SingletonTest4 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

class Singleton {
    // 1. 构造器私有化
    private Singleton() {
    }

    private static Singleton INSTANCE;

    // 2. 对外提供一个公有的静态方法，加入了同步处理代码，解决了线程不安全的问题
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}