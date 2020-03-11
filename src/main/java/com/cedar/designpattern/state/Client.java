package com.cedar.designpattern.state;

import java.util.stream.IntStream;

public class Client {

    public static void main(String[] args) {
        // 创建活动对象
        RaffleActivity activity = new RaffleActivity(5);
        // 连续抽奖
        IntStream.iterate(1, i -> i + 1).limit(100).forEach(i -> {
            System.out.println("第 " + i + " 次抽奖");
            activity.reduceMoney();
            activity.raffle();
        });
    }

}
