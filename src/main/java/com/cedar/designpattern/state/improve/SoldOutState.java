package com.cedar.designpattern.state.improve;

public class SoldOutState implements State {

    private CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("糖果已卖光，请不要插入硬币！");
    }

    @Override
    public void returnCoin() {
        System.out.println("无硬币可退出！");
    }

    @Override
    public void turnCrank() {
        System.out.println("已售罄！");
    }

    @Override
    public void dispense() {
    }

    @Override
    public void printState() {
        System.out.println("*************SOLD_OUT_STATE*************");
    }

}
