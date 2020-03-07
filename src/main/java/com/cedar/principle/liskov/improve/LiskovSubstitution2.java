package com.cedar.principle.liskov.improve;

public class LiskovSubstitution2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("------------");
        B2 b2 = new B2();
        System.out.println("11+3=" + b2.func1(11, 3));
        System.out.println("1+8=" + b2.func1(1, 8));
        System.out.println("11+3+9=" + b2.func2(11, 3));
        System.out.println("11-3=" + b2.func3(11, 3));
        System.out.println("1-8=" + b2.func3(1, 8));
    }
}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类
}

// A类
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类
// 使用依赖
class B1 extends Base {

}

// B类
// 使用组合
class B2 extends Base {
    private A a = new A();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }

    public int func3(int num1, int num2) {
        return this.a.func1(num1, num2);
    }
}

// B类
// 使用聚合
class B3 extends Base {

}