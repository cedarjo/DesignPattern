package com.cedar.designpattern.iterator;

import java.util.Iterator;

public interface College {
    
    // 返回college的名称
    String getName();
    
    // 添加一个系
    void addDepartment(String name, String desc);
    
    // 返回系的迭代器
    Iterator<Department> createIterator();

}
