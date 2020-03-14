package com.cedar.designpattern.state.improve;

/**
 * 抽象的状态
 * @author xuxschn
 * @date 2020-03-14 15:52
 */
public interface State {

    void insertCoin();

    void returnCoin();

    void turnCrank();

    void dispense();
    
    void printState();

}
