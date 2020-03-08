package com.cedar.designpattern.mediator.improve;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {

    private Map<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        this.colleagueMap.put(colleagueName, colleague);
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        // 同事对象调用时会提供自己是谁，中介者会拿到该同事对象
        Colleague colleague = this.colleagueMap.get(colleagueName);
        if (colleague == null) {
            System.out.println("没有委托给中介者的对象");
            return;
        }
        if (colleague instanceof Alarm) {
            alarmBranch(stateChange);
        } else if (colleague instanceof CoffeeMachine) {
            coffeeMachineBranch(stateChange);
        } else if (colleague instanceof TV) {
            tvBranch(stateChange);
        } else if (colleague instanceof Curtains) {
            curtainsBranch(stateChange);
        }
    }

    // 闹钟调用
    private void alarmBranch(int stateChange) {
        if (stateChange == Alarm.OPEN) {
            // 定时早起的后续 -> 打开咖啡机，打开电视机
            ((CoffeeMachine) colleagueMap.get(CoffeeMachine.NAME)).startCoffee();
            ((TV) colleagueMap.get(TV.NAME)).startTV();
        } else if (stateChange == Alarm.CLOSE) {
            // 定时要去上班的后续 -> 关闭电视机
            ((TV) colleagueMap.get(TV.NAME)).stopTV();
        }
    }

    // 咖啡机调用
    private void coffeeMachineBranch(int stateChange) {
        if (stateChange == CoffeeMachine.START) {
            // 启动咖啡机的后续 -> 调高电视机音量
            ((TV) colleagueMap.get(TV.NAME)).volumnUp();
        } else if (stateChange == CoffeeMachine.END) {
            // 咖啡已做完的后续 -> 调低电视机音量，打开窗帘
            ((TV) colleagueMap.get(TV.NAME)).volumnDown();
            ((Curtains) colleagueMap.get(Curtains.NAME)).upCurtains();
        }
    }

    // 电视机调用
    private void tvBranch(int stateChange) {
        // 电视机没有相关后续
    }

    // 窗帘调用
    private void curtainsBranch(int stateChange) {
        // 窗帘没有相关后续
    }

    @Override
    public void sendMessage() {
        // TODO 自动生成的方法存根
    }

}
