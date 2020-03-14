package com.cedar.designpattern.responsibilitychain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void process(PurchaseRequest request) {
        if (request.getPrice() > 30000) {
            System.out.println("请求编号 ID = " + request.getId() + " 被 " + this.name + " 处理！");
        } else {
            successor.process(request);
        }
    }

}
