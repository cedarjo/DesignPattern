package com.cedar.designpattern.state;

/**
 * 糖果机
 * 
 * @author xuxschn
 * @date 2020-03-14 14:18
 */
public class CandyMachine {

    final static int SOLD_OUT_STATE = 0; // 售罄状态
    final static int ON_READY_STATE = 1; // 待售卖状态
    final static int HAS_COIN = 2; // 已插入硬币
    final static int SOLD_STATE = 3; // 已售出

    // 实时状态
    private int state;
    // 糖果数量
    private int count;

    public CandyMachine(int count) {
        this.count = count;
        if (count > 0) {
            // 糖果有剩余，可以售卖
            this.state = ON_READY_STATE;
        } else {
            // 糖果无剩余，不可售卖
            this.state = SOLD_OUT_STATE;
        }
    }

    /**
     * 插入硬币
     * 
     * @author xuxschn
     * @date 2020-03-14 14:26
     */
    public void insertCoin() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("糖果已卖光，请不要插入硬币！");
                break;
            case ON_READY_STATE:
                System.out.println("您已插入硬币，请扳动扳手！");
                state = HAS_COIN; // 状态转为已插入硬币
                break;
            case HAS_COIN:
                System.out.println("您已经插入了硬币，请扳动扳手！");
                break;
            case SOLD_STATE:
                System.out.println("请稍等，正在发放糖果！");
                break;
        }
    }

    /**
     * 退回硬币
     * 
     * @author xuxschn
     * @date 2020-03-14 14:26
     */
    public void returnCoin() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("无硬币可退出！");
                break;
            case ON_READY_STATE:
                System.out.println("您尚未插入硬币，无法退出！");
                break;
            case HAS_COIN:
                System.out.println("硬币已退出！");
                state = ON_READY_STATE; // 状态回到待售卖状态
                break;
            case SOLD_STATE:
                System.out.println("您已扳动扳手，正在为您准备糖果！");
                break;
        }
    }

    /**
     * 扳动扳手
     * 
     * @author xuxschn
     * @date 2020-03-14 14:27
     */
    public void turnCrank() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("已售罄！");
                break;
            case ON_READY_STATE:
                System.out.println("请先插入硬币！");
                break;
            case HAS_COIN:
                System.out.println("出糖果中...");
                state = SOLD_STATE;
                dispense();
                break;
            case SOLD_STATE:
                System.out.println("出糖果中，请不要重复扳动扳手！");
                break;
        }
    }

    /**
     * 发放糖果
     * 
     * @author xuxschn
     * @date 2020-03-14 14:27
     */
    private void dispense() {
        count--;
        System.out.println("糖果已发放！");
        if (count > 0) {
            state = ON_READY_STATE;
        } else {
            System.out.println("糖果售罄！通知管理人员补充糖果！");
            state = SOLD_OUT_STATE;
        }
    }

    public void printState() {
        switch (state) {
            case SOLD_OUT_STATE:
                System.out.println("*************SOLD_OUT_STATE*************");
                break;
            case ON_READY_STATE:
                System.out.println("*************ON_READY_STATE*************");
                break;
            case HAS_COIN:
                System.out.println("*************HAS_COIN*************");
                break;
            case SOLD_STATE:
                System.out.println("*************SOLD_STATE*************");
                break;
        }
    }
}
