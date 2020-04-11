package com.cedar.designpattern.observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("更新操作");
    }

}
