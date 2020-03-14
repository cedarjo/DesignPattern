package com.cedar.designpattern.state.improve;

import java.util.Random;

public class HasCoinState implements State {

    private CandyMachine candyMachine;

    public HasCoinState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("您已经插入了硬币，请扳动扳手！");
    }

    @Override
    public void returnCoin() {
        System.out.println("硬币已退出！");
        candyMachine.setState(candyMachine.getOnReadyState()); // 状态回到待售卖状态
    }

    @Override
    public void turnCrank() {
        System.out.println("出糖果中...");
        Random random = new Random();
        int winner = random.nextInt(10);
        if (winner == 0) {
            candyMachine.setState(candyMachine.getWinnerState());
        } else {
            candyMachine.setState(candyMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
    }

    @Override
    public void printState() {
        System.out.println("*************HAS_COIN*************");
    }

}
