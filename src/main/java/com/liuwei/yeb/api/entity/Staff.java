package com.liuwei.yeb.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
@Data
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
}
