package com.cedar.designpattern.state;

/**
 * 发放奖品的状态
 */
public class DispenseState extends State {

    // 初始化时传入活动引用，发放奖品后改变其状态
    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("处于发奖状态");
    }

    @Override
    public boolean raffle() {
        System.out.println("已抽中");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (this.activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            this.activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发完了!");
            this.activity.setState(activity.getDispenseOutState());
        }
    }

}
