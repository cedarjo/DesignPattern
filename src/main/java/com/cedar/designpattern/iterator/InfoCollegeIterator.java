package com.cedar.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Department> {

    // 这里我们需要Department 是以怎样的方式存储
    List<Department> departments;
    int index = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Department next() {
        return departments.get(index);
    }

    // 默认空实现
    @Override
    public void remove() {

    }

}
