package com.cedar.designpattern.mediator.improve;

public class CoffeeMachine extends Colleague {

    public static final String NAME = "CoffeeMachine";

    public static final int START = 1;
    public static final int END = 0;

    public CoffeeMachine(Mediator mediator) {
        super(mediator, NAME);
        mediator.register(getName(), this);
    }

    public void startCoffee() {
        System.out.println("咖啡机启动，做咖啡...");
        sendMessage(START);
    }

    public void finishCoffee() {
        System.out.println("咖啡已做完");
        sendMessage(END);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 咖啡机委托中介者完成消息的发送
        getMediator().getMessage(stateChange, getName());
    }

}
