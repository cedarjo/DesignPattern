package com.cedar.designpattern.visitor.improve;

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

    public void getCompensation(Visitor visitor) {
        for (Entry<String, Employee> entry : this.employees.entrySet()) {
            Employee employee = entry.getValue();
            employee.accept(visitor);
        }
    }

}
