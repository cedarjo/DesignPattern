package com.cedar.designpattern.state;

/**
 * 发放奖品的状态
 */
public class DispenseOutState extends State {

    // 初始化时传入活动引用
    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("奖品发送完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次参加");
    }

}
