package com.cedar.principle.demeter;

import java.util.ArrayList;
import java.util.List;

// 客户端
public class Demeter1 {

    public static void main(String[] args) {
        // 创建了一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学院的员工id和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

// 学校总部的员工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// 学院的员工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id= " + i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

// 学校管理类
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id= " + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("-----分公司员工-----");
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----学校总部员工-----");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}

// 分析 
// SchoolManager 类的直接朋友类有：Employee、CollegeManager
// CollegeEmployee不是直接朋友，违背了 迪米特法则

// 应用实例改进
// 1. 前面设计的问题在于SchoolManager中，CollegeEmployee类并不是SchoolManager类的直接朋友
// 2. 按照迪米特法则，应该避免类中出现这样非直接朋友关系的耦合
