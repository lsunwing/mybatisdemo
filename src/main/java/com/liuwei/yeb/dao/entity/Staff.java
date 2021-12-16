package com.liuwei.yeb.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {

    private long serialVersionUID = -7014937301632812629L;

    private Long id;
    private String name;
    private String gender;
    private Date birthday;
    private String mobile;
    private Date inDate;
    private Date outDate;
    private String address;
    private String emMobile;
    private Date createDate;
    private Date updateDate;
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmMobile() {
        return emMobile;
    }

    public void setEmMobile(String emMobile) {
        this.emMobile = emMobile;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", inDate=" + inDate +
                ", outDate=" + outDate +
                ", address='" + address + '\'' +
                ", emMobile='" + emMobile + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
