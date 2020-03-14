package com.cedar.designpattern.state.improve;

public class SoldState implements State {

    private CandyMachine candyMachine;

    public SoldState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("请稍等，正在发放糖果！");
    }

    @Override
    public void returnCoin() {
        System.out.println("您已扳动扳手，正在为您准备糖果！");
    }

    @Override
    public void turnCrank() {
        System.out.println("出糖果中，请不要重复扳动扳手！");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        System.out.println("糖果已发放！");
        if (candyMachine.getCount() > 0) {
            candyMachine.setState(candyMachine.getOnReadyState());
        } else {
            System.out.println("糖果售罄！通知管理人员补充糖果！");
            candyMachine.setState(candyMachine.getSoldOutState());
        }
    }

    @Override
    public void printState() {
        System.out.println("*************SOLD_STATE*************");
    }

}
