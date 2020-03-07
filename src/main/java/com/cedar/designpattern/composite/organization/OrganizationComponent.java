package com.cedar.designpattern.composite.organization;

public abstract class OrganizationComponent {

    private String name; // 名字
    private String des; // 说明

    protected void add(OrganizationComponent component) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 构造器
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // 子类都需要实现该方法
    protected abstract void print();

}
