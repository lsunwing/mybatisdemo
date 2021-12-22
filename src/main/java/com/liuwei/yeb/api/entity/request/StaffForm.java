package com.liuwei.yeb.api.entity.request;

public class StaffForm extends BaseForm {
    String staffName;
    String gender;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
