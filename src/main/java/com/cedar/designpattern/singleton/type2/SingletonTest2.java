package com.cedar.designpattern.singleton.type2;

public class SingletonTest2 {

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

    private final static Singleton INSTANCE;

    // 2. 在静态代码块中创建对象实例
    static {
        INSTANCE = new Singleton();
    }

    // 3. 对外提供一个公有的静态方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}