package com.cedar.designpattern.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {

    // 这里我们需要Department 是以怎样的方式存储
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department...departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        Department department = departments[position];
        position++;
        return department;
    }

    // 默认空实现
    @Override
    public void remove() {

    }

}
