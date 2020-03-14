package com.cedar.designpattern.state.improve;

public class OnReadyState implements State {

    private CandyMachine candyMachine;

    public OnReadyState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("您已插入硬币，请扳动扳手！");
        candyMachine.setState(candyMachine.getHasCoinState());
    }

    @Override
    public void returnCoin() {
        System.out.println("您尚未插入硬币，无法退出！");
    }

    @Override
    public void turnCrank() {
        System.out.println("请先插入硬币！");
    }

    @Override
    public void dispense() {
        
    }

    @Override
    public void printState() {
        System.out.println("*************ON_READY_STATE*************");
    }

}
