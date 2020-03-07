package com.cedar.designpattern.visitor.improve;

public class CompensationVisitor extends Visitor {

    @Override
    public void visit(Element element) {
        Employee employee = (Employee) element;
        System.out.println(employee.getName() + "'s Compensation is "
                + (employee.getDegree() * employee.getVacationDays() * 100));
    }

}
