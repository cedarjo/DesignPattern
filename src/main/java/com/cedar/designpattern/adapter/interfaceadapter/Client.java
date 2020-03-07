package com.cedar.designpattern.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        Interface6 inter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        inter.m1();
    }

}
