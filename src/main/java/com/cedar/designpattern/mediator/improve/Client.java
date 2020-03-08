package com.cedar.designpattern.mediator.improve;

import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // 中介者
        Mediator mediator = new ConcreteMediator();
        // 闹钟
        Alarm alarm = new Alarm(mediator);
        // 咖啡机
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator);
        // 电视机
        TV tv = new TV(mediator);
        // 窗帘
        Curtains curtains = new Curtains(mediator);

        // 早起的定时器
        alarm.sendAlarm(Alarm.OPEN);
        // 模拟咖啡制作中...
        TimeUnit.SECONDS.sleep(2);
        // 咖啡制作完成
        coffeeMachine.finishCoffee();
        // 模拟喝咖啡看了会儿电视，定时器触发该去上班了
        TimeUnit.SECONDS.sleep(2);
        // 定时器再次启动
        alarm.sendAlarm(Alarm.CLOSE);
    }

}
