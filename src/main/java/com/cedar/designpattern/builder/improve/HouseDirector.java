package com.cedar.designpattern.builder.improve;

// 指挥者，指定制造流程，返回产品
public class HouseDirector {

    HouseBuilder houseBuilder = null;
    
    // 构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    
    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
    
}
