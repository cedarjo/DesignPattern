package com.cedar.designpattern.flyweight.integer;

public class IntegerTest {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);
        System.out.println(x.equals(y));
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(w == x);
        System.out.println(w == y);

        // valueOf方法中使用了享元模式
    }

}
