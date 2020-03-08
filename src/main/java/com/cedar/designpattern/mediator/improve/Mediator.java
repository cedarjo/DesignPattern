package com.cedar.designpattern.mediator.improve;

/**
 * 中介者接口
 * 
 * @author xuxschn
 * @date 2020-03-08 16:24
 */
public interface Mediator {

    // 将同事对象注册到中介者中，使得中介者知道所有的同事对象
    void register(String colleagueName, Colleague colleague);

    // 中介者通过该接口得到消息来自哪个同事对象，并且状态发生了什么变化，再执行相应操作
    void getMessage(int stateChange, String colleagueName);

    // 同事对象通过该接口将发消息操作委托给中介者来完成
    void sendMessage();
}
