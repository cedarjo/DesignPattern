/**
 * 
 */
package com.cedar.designpattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author xuxschn
 * @date 2020-03-07 20:28
 */
public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;
    
    public ProxyFactory(Object object) {
        this.target = object;
    }
    
    // 返回一个代理对象: target对象的代理对象
    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        
        // 设置父类
        enhancer.setSuperclass(this.target.getClass());
        
        // 设置回调函数
        enhancer.setCallback(this);
        
        // 创建子类对象，即代理对象
        return enhancer.create();
    }
    
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(method.getName());
        System.out.println(obj.getClass().getName());
        return method.invoke(this.target, args);
    }

}
