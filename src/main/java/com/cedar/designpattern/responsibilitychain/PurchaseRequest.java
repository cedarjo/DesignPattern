package com.cedar.designpattern.responsibilitychain;

import java.util.UUID;

import lombok.Data;

@Data
public class PurchaseRequest {

    private int type; // 请求类型
    private float price;
    private String id;

    public PurchaseRequest(int type, float price) {
        this.id = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        this.type = type;
        this.price = price;
    }

}
