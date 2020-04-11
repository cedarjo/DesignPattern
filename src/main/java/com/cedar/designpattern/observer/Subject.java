package com.cedar.designpattern.observer;

/**
 * 主题/被观察者
 * @author xuxschn
 */
public interface Subject {

    // 注册
    void registerObserver(Observer observer);

    // 撤销
    void removeObserver(Observer observer);
    
    // 更新
    void notifyObservers();
    
}
