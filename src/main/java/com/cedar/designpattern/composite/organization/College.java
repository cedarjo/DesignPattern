package com.cedar.designpattern.composite.organization;

import java.util.ArrayList;
import java.util.List;

// 学院，可以管理系
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizations = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        this.organizations.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        this.organizations.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("--------" + getName());
        // 遍历子节点
        this.organizations.forEach(org -> org.print());
    }

}
