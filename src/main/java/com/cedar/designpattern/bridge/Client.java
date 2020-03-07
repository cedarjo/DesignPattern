package com.cedar.designpattern.bridge;

public class Client {

    public static void main(String[] args) {
        Phone xiaomiFoledPhone = new FoldedPhone(new XiaoMi());
        xiaomiFoledPhone.open();
    }
    
    
}
