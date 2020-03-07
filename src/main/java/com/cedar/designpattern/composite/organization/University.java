package com.cedar.designpattern.composite.organization;

import java.util.ArrayList;
import java.util.List;

// 学校，可以管理学院
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizations = new ArrayList<>();

    public University(String name, String des) {
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
        System.out.println("----" + getName());
        // 遍历子节点
        this.organizations.forEach(org -> org.print());
    }

}
