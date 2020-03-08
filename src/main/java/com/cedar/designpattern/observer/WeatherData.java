package com.cedar.designpattern.observer;

import lombok.Data;

/**
 * 包含最新的天气情况信息
 * 维护了 CurrentConditions对象
 * 当数据有更新时，就主动调用 CurrentConditions对象的update方法（推送）
 * 
 * @author xuxschn
 * @date 2020-03-08 10:02
 */
@Data
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    // 当扩展时，需要在这里添加新的第三方

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }
    
    // 将最新的天气推送给接入方
    private void dataChange() {
        this.currentConditions.update(temperature, pressure, humidity);
    }

    // 当数据有更新时，调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    
}
