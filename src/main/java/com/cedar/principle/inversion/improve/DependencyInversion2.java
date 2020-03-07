package com.cedar.principle.inversion.improve;

public class DependencyInversion2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }

}

// 定义接口
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：hello, world";
    }

}

class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信消息：hello, OK";
    }
}

// 方式2
class Person {

    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }

}
