package com.cedar.designpattern.facade;

// DVD播放器
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    private DVDPlayer() {

    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is play ");
    }

    public void pause() {
        System.out.println(" dvd is pause ");
    }

}
