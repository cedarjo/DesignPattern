package com.cedar.designpattern.state;

public class Client {

    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(2);
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
        candyMachine.turnCrank();
    }
    
}
