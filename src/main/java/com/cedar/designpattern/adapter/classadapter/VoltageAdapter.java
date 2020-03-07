package com.cedar.designpattern.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        int dst = 5;
        System.out.println("将" + src + " 伏 转化为 " + dst + " 伏");
        return dst;
    }

}
