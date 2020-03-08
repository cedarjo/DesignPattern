package com.cedar.designpattern.observer;

public class Client {

    public static void main(String[] args) {
        // 创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        // 更新天气情况
        weatherData.setData(30, 150, 40);
        // 天气情况变化
        System.out.println("天气情况发生变化");
        weatherData.setData(40, 100, 50);
    }
    
    /**
     * 问题分析
     * 1. 其他第三方接入气象站获取数据的问题
     * 2. 无法在运行时动态的添加第三方
     * 3. 违反了OCP原则
     */
    
}
