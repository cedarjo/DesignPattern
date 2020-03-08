package com.cedar.designpattern.mediator.improve;

public class Curtains extends Colleague {

    public static final String NAME = "Curtains";

    public Curtains(Mediator mediator) {
        super(mediator, NAME);
        mediator.register(getName(), this);
    }

    public void upCurtains() {
        System.out.println("窗帘拉开");
    }

    @Override
    public void sendMessage(int stateChange) {
        // 电视机委托中介者完成消息的发送
        getMediator().getMessage(stateChange, getName());
    }

}
