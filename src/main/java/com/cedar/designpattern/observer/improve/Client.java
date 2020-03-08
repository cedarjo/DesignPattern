package com.cedar.designpattern.observer.improve;

public class Client {

    public static void main(String[] args) {
        // 天气站
        WeatherData weatherData = new WeatherData();
        // 注册各观察者
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        Baidu baidu = new Baidu();
        weatherData.registerObserver(baidu);
        Sina sina = new Sina();
        weatherData.registerObserver(sina);
        // 发布消息
        weatherData.setData(30, 150, 40);
        // 移除一个观察者
        weatherData.removeObserver(baidu);
        // 天气情况变化
        System.out.println("天气情况发生变化");
        weatherData.setData(40, 100, 50);
    }

}
