package com.cedar.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    private List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
        addDepartment("服务器安全专业", "服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        this.departments.add(new Department(name, desc));
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(this.departments);
    }

}
