package com.cedar.designpattern.observer.weather;

public interface Subject {

    // 注册一个观察者
    void registerObserver(Observer observer);

    // 移除一个观察者
    void removeObserver(Observer observer);

    // 通知所有观察者
    void notifyObservers();
}
