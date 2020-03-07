package com.cedar.designpattern.visitor.improve;

public class MainTest {

    public static void main(String[] args) {
        Visitor visitor = new CompensationVisitor();
        EmployeeStructure employeeStructure = new EmployeeStructure();
        employeeStructure.attach(new Employee("Tom", 4500, 8, 1));
        employeeStructure.attach(new Employee("Jerry", 6500, 10, 2));
        employeeStructure.attach(new Employee("Jack", 9600, 12, 3));
        
        employeeStructure.getCompensation(visitor);
        
        System.out.println("-----------");
        
        visitor = new Compensation2Visitor();
        employeeStructure.getCompensation(visitor);
    }

}
