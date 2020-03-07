package com.cedar.designpattern.builder.improve;

public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println(" 高楼打地基100米");
    }

    @Override
    public void buildWall() {
        System.out.println(" 高楼砌墙20厘米");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼透明屋顶");
    }

}
