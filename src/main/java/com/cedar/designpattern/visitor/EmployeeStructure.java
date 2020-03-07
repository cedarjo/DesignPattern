package com.cedar.designpattern.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeStructure {

    private Map<String, Employee> employees;

    public EmployeeStructure() {
        this.employees = new HashMap<>();
    }

    public void attach(Employee employee) {
        this.employees.put(employee.getName(), employee);
    }

    public void detach(Employee employee) {
        this.employees.remove(employee.getName());
    }

    public void getEmployee(String name) {
        this.employees.get(name);
    }

    public void getCompensation() {
        for (Entry<String, Employee> entry : this.employees.entrySet()) {
            Employee employee = entry.getValue();
            System.out.println(employee.getName() + "'s Compensation is "
                    + (employee.getDegree() * employee.getVacationDays() * 100));
        }
    }

}
