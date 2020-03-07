package com.cedar.designpattern.facade;

// 灯光
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    private TheaterLight() {

    }

    public void on() {
        System.out.println(" theater-light on ");
    }

    public void off() {
        System.out.println(" theater-light off ");
    }

    public void dim() {
        System.out.println(" theater-light dim ");
    }

    public void bright() {
        System.out.println(" theater-light bright ");
    }

}
