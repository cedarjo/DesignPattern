package com.cedar.designpattern.facade;

public class HomeTheaterFacade {

    // 定义各个子系统的对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    // 构造器
    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分4步

    public void ready() {
        // 打开爆米花机
        this.popcorn.on();
        // 让爆米花机开始工作
        this.popcorn.pop();
        // 屏幕放下来
        this.screen.down();
        // 投影仪打开
        this.projector.on();
        // 立体声打开
        this.stereo.on();
        // dvd打开
        this.dvdPlayer.on();
        // 灯光调暗
        this.theaterLight.dim();
    }

    public void play() {
        this.dvdPlayer.play();
    }

    public void pause() {
        this.dvdPlayer.pause();
    }

    public void end() {
        // 关闭爆米花机
        this.popcorn.off();
        // 灯光调亮
        this.theaterLight.bright();
        // 屏幕升起来
        this.screen.up();
        // 投影仪关闭
        this.projector.off();
        // 立体声关掉
        this.stereo.off();
        // dvd打开
        this.dvdPlayer.off();
    }

}
