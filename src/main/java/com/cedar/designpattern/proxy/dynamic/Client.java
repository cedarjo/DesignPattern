package com.cedar.designpattern.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        ITeach targe = new Teach();
        ProxyFactory proxyFactory = new ProxyFactory(targe);
        Object proxy = proxyFactory.getProxyInstance();
        ((ITeach) proxy).teach();
        System.out.println(proxy.getClass());
    }

}
