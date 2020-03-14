package com.cedar.designpattern.responsibilitychain;

import lombok.Setter;

public abstract class Approver {

    @Setter
    protected Approver successor; // 后继者
    protected String name; // 处理器名称

    public Approver(String name) {
        this.name = name;
    }

    // 处理审批请求的方法，得到一个请求，处理是子类完成的
    public abstract void process(PurchaseRequest request);

}
