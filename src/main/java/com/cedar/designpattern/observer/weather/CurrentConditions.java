package com.cedar.designpattern.observer.weather;

import lombok.Data;

@Data
public class CurrentConditions implements Observer {

    private float temperature; // 温度
    private float pressure; // 压强
    private float humidity; // 湿度

    @Override
    public String getId() {
        return "current-conditions";
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("今天气温: " + temperature + " ℃");
        System.out.println("今天压强: " + pressure + " Pa");
        System.out.println("今天湿度: " + humidity + " %");
    }

}
