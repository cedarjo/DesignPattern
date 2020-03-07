package com.cedar.designpattern.proxy.staticproxy;

public class TeachProxy implements ITeach {

    private ITeach iTeach;
    
    public TeachProxy(ITeach teach) {
        this.iTeach = teach;
    }

    @Override
    public void teach() {
        System.out.println("前置增强");
        iTeach.teach();
        System.out.println("后置增强");
    }

}
