package com.cedar.designpattern.mediator.improve;

public class TV extends Colleague {

    public static final String NAME = "TV";

    public TV(Mediator mediator) {
        super(mediator, NAME);
        mediator.register(getName(), this);
    }

    public void startTV() {
        System.out.println("打开电视");
    }

    public void stopTV() {
        System.out.println("关闭电视");
    }

    public void volumnUp() {
        System.out.println("调高音量");
    }

    public void volumnDown() {
        System.out.println("调低音量");
    }

    @Override
    public void sendMessage(int stateChange) {
        // 电视机委托中介者完成消息的发送
        getMediator().getMessage(stateChange, getName());
    }

}
