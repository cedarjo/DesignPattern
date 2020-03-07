package com.cedar.designpattern.visitor;

public class Employee {

    // 员工姓名
    private String name;
    // 员工日薪
    private float income;
    // 剩余假期
    private int vacationDays;
    // 员工级别
    private int degree;

    public Employee(String name, float income, int vacationDays, int degree) {
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

}
