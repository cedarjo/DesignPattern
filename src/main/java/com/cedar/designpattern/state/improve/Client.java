package com.cedar.designpattern.state.improve;

public class Client {

    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(20);
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
        
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
    }
    
}
