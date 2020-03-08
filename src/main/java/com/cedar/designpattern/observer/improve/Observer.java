package com.cedar.designpattern.observer.improve;

public interface Observer {

    String getId();

    // 更新
    void update(float temperature, float pressure, float humidity);
}
