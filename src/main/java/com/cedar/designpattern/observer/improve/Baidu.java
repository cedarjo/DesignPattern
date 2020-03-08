package com.cedar.designpattern.observer.improve;

import lombok.Data;

@Data
public class Baidu implements Observer {

    private float temperature; // 温度
    private float pressure; // 压强
    private float humidity; // 湿度

    @Override
    public String getId() {
        return "baidu";
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("#####百度天气预报今日天气情况#####");
        System.out.println("今天气温: " + temperature + " ℃");
        System.out.println("今天压强: " + pressure + " Pa");
        System.out.println("今天湿度: " + humidity + " %");
    }

}
