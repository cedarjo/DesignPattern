package com.cedar.designpattern.adapter.objadapter;

public class VoltageAdapter implements IVoltage5V {

    // 关联关系中的聚合
    private Voltage220V votage220V;

    public VoltageAdapter(Voltage220V votage220V) {
        this.votage220V = votage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (votage220V != null) {
            int src = votage220V.output220V();
            dst = 5;
            System.out.println("将" + src + " 伏 转化为 " + dst + " 伏");
            return dst;
        }
        return dst;
    }

}
