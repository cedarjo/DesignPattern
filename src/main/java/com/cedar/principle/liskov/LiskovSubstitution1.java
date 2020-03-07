package com.cedar.principle.liskov;

public class LiskovSubstitution1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

// A类
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类继承了A类
// 增加了一个新功能：完成两个数的相加，然后和9求和
class B extends A {
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}

// 解决方法
// 1. 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的方法，造成原有功能出现错误。在实际编程中，我们常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整体继承体系的复用性会比较差。特别是运行多态比较频繁的时候。
// 通用做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖、聚合、组合等关系代替。
