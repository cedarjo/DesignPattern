package com.cedar.designpattern.responsibilitychain;

public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 31000);

        // 创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("杨校长");

        // 维护链
        departmentApprover.setSuccessor(collegeApprover);
        collegeApprover.setSuccessor(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setSuccessor(schoolMasterApprover);
        schoolMasterApprover.setSuccessor(departmentApprover);

        // 执行
        departmentApprover.process(request);
    }

}
