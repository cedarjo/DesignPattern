package com.cedar.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter2 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

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

    // 将输出学院的员工方法，封装到CollegeManager
    // 输出学院员工的信息
    public void printAllEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("-----分公司员工-----");
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }
    }

}

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
        sub.printAllEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----学校总部员工-----");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}
