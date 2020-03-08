package com.cedar.designpattern.observer.improve;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    private Map<String, Observer> observers = new LinkedHashMap<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observers.put(observer.getId(), observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer.getId());
    }

    // 当数据有更新时，调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    // 将最新的天气推送给接入方
    private void dataChange() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Entry<String, Observer> entry : this.observers.entrySet()) {
            System.out.println("notify " + entry.getKey());
            entry.getValue().update(temperature, pressure, humidity);
        }
    }

}
