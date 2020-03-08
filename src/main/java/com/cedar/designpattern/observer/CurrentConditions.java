package com.cedar.designpattern.observer;

import lombok.Data;

/**
 * 当前天气情况
 * @author xuxschn
 * @date 2020-03-08 09:55
 */
@Data
public class CurrentConditions {

    private float temperature; // 温度
    private float pressure; // 压强
    private float humidity; // 湿度
    
    // 更新天气情况, 由weather data来调用（推送模式）
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("今天气温: " + temperature + " ℃");
        System.out.println("今天压强: " + pressure + " Pa");
        System.out.println("今天湿度: " + humidity + " %");
    }
}
