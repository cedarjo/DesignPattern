package com.cedar.designpattern.mediator.improve;

public class Alarm extends Colleague {
    
    public static final String NAME = "Alarm";

    public final static int OPEN = 1; // 定时早起
    public final static int CLOSE = 0; // 定时去上班

    public Alarm(Mediator mediator) {
        super(mediator, NAME);
        mediator.register(getName(), this);
    }

    public void sendAlarm(int stateChange) {
        // 定时器触发
        System.out.println("定时器触发!!!");
        // 定时器触发后的调用其他功能任务交给中介者来完成
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 闹铃委托中介者完成消息的发送
        getMediator().getMessage(stateChange, getName());
    }

}
