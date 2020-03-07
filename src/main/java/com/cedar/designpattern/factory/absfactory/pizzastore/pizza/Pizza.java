package com.cedar.designpattern.factory.absfactory.pizzastore.pizza;

// 将Pizza类做成抽象的
public abstract class Pizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    // 准备原材料，不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    // 烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    // 切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing;");
    }

}
