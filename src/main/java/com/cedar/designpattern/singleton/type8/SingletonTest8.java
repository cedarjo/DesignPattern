package com.cedar.designpattern.singleton.type8;

public class SingletonTest8 {

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

    // 2. 静态内部类，该类有一个类属性Singleton
    public static class Inner {
        public static Singleton INSTANCE = new Singleton();
    }

    // 3. 对外提供一个公有的静态方法，返回静态内部类的类属性
    public static Singleton getInstance() {
        return Inner.INSTANCE;
    }
}