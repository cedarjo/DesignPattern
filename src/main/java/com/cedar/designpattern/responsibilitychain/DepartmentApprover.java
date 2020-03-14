package com.cedar.designpattern.responsibilitychain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void process(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号 ID = " + request.getId() + " 被 " + this.name + " 处理！");
        } else {
            // 交给后继者
            successor.process(request);
        }
    }

}
