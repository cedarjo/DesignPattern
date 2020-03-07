package com.cedar.designpattern.visitor;

public class MainTest {

    public static void main(String[] args) {
        EmployeeStructure employeeStructure = new EmployeeStructure();
        employeeStructure.attach(new Employee("Tom", 4500, 8, 1));
        employeeStructure.attach(new Employee("Jerry", 6500, 10, 2));
        employeeStructure.attach(new Employee("Jack", 9600, 12, 3));
        
        employeeStructure.getCompensation();
    }

}
