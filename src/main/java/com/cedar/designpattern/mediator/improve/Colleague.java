package com.cedar.designpattern.mediator.improve;

/**
 * 各同事接口
 * 
 * @author xuxschn
 * @date 2020-03-08 16:24
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(int stateChange);
}
