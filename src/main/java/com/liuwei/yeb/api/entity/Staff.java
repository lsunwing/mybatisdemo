package com.liuwei.yeb.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuwei
 * @since 2021-12-15
 */
@TableName("t_staff")
public class Staff implements Serializable {

    private static final long serialVersionUID = -831233471002283786L;

    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    /**
     * 姓名
     */
    private String staffName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生时间
     */
    private LocalDateTime birthday;

    /**
     * 联系号码
     */
    private String mobile;

    /**
     * 入职时间
     */
    private LocalDateTime inDate;

    /**
     * 离职时间
     */
    private LocalDateTime outDate;

    /**
     * 住址
     */
    private String address;

    /**
     * 紧急联系人
     */
    private String emMobile;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 备注
     */
    private String comment;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
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
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }
    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
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
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
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
            "staffId=" + staffId +
            ", staffName=" + staffName +
            ", gender=" + gender +
            ", birthday=" + birthday +
            ", mobile=" + mobile +
            ", inDate=" + inDate +
            ", outDate=" + outDate +
            ", address=" + address +
            ", emMobile=" + emMobile +
            ", createDate=" + createDate +
            ", updateDate=" + updateDate +
            ", comment=" + comment +
        "}";
    }
}
