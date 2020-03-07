package com.cedar.designpattern.composite.organization;

public class Client {

    public static void main(String[] args) {
        // 系
        OrganizationComponent department1 = new Department("计算机系", "计算机系");
        OrganizationComponent department2 = new Department("软件系", "软件系");
        OrganizationComponent department3 = new Department("工程系", "工程系");

        // 学院
        OrganizationComponent college1 = new College("计算机学院", "计算机系");
        college1.add(department1);
        college1.add(department2);
        OrganizationComponent college2 = new College("自动化学院", "自动化学院");
        college2.add(department3);

        // 大学
        OrganizationComponent university = new University("清华大学", "清华大学");
        university.add(college1);
        university.add(college2);
        
        university.print();
    }

}
