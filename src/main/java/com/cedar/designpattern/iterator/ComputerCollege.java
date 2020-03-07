package com.cedar.designpattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    
    private Department[] departments;
    int numOfDepartment = 0; // 保存当前数组的对象个数
    
    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java专业", "Java专业");
        addDepartment("Php专业", "Php专业");
        addDepartment("C++专业", "C++专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }
    
    @Override
    public void addDepartment(String name, String desc) {
        this.departments[numOfDepartment] = new Department(name, desc);
        this.numOfDepartment++;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(this.departments);
    }

}
