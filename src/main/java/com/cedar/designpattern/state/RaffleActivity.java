package com.cedar.designpattern.state;

import lombok.Data;

/**
 * 抽奖活动
 */
@Data
public class RaffleActivity {

    // 当前状态，根据活动变化
    private State state;
    // 奖品数量
    private int count;
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    // 扣分
    public void reduceMoney() {
        this.state.reduceMoney();
    }

    // 抽奖
    public void raffle() {
        if (this.state.raffle()) {
            this.state.dispensePrize();
        }
    }

    public int getCount() {
        int count = this.count;
        this.count--;
        return count;
    }

}
