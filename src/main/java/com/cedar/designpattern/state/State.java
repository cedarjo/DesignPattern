package com.cedar.designpattern.state;

/**
 * 抽象的状态类
 */
public abstract class State {

    // 扣除积分
    public abstract void reduceMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract void dispensePrize();

}
