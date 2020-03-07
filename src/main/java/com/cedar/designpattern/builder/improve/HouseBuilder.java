package com.cedar.designpattern.builder.improve;

// 抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    // 将建造的流程写好，抽象方法
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    // 建造房子好后，将产品返回
    public House buildHouse() {
        return house;
    }
}
