package com.cedar.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    // 学院集合
    List<College> colleges;

    public OutputImpl(List<College> colleges) {
        super();
        this.colleges = colleges;
    }

    // 遍历所有的学院，然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        for (College college : colleges) {
            System.out.println("====" + college.getName() + "====");
            printDepartment(college.createIterator());
        }
    }

    // 学院输出系
    private void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

}
