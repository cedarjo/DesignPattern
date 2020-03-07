/**
 * 
 */
package com.cedar.designpattern.proxy.cglib;

/**
 * @author xuxschn
 * @date 2020-03-07 20:36
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teach());
        Teach proxy = (Teach)proxyFactory.getProxyInstance();
        proxy.teach();
    }
    
}
