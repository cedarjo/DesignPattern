package com.cedar.designpattern.state.improve;

import lombok.Getter;
import lombok.Setter;

public class CandyMachine {

    @Getter
    private State soldOutState;
    @Getter
    private State onReadyState;
    @Getter
    private State hasCoinState;
    @Getter
    private State soldState;
    @Getter
    private State winnerState;

    @Setter
    private State state;
    @Getter
    private int count;

    public CandyMachine(int count) {
        this.count = count;
        this.soldOutState = new SoldOutState(this);
        this.onReadyState = new OnReadyState(this);
        this.hasCoinState = new HasCoinState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        if (count > 0) {
            state = this.onReadyState;
        } else {
            state = this.soldOutState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseCandy() {
        if (count > 0) {
            count--;
            System.out.println("一块糖果已经发放");
        }
    }

    public void printState() {
        state.printState();
    }

}
