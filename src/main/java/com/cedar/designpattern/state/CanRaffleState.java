package com.cedar.designpattern.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {

    // 初始化时传入活动引用，扣除积分后改变其状态
    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("已经扣取过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等!");
        Random random = new Random();
        int num = random.nextInt(10);
        // 10%中奖几率
        if (num == 0) {
            // 中奖，改变状态为领取奖品
            System.out.println("恭喜中奖!");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，未能抽中奖品!");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }

}
