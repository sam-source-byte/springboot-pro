package com.zhuguang.sam.pojo;

import lombok.Data;

import javax.persistence.Table;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/6/18 15:02
 * @Description:
 */
@Data
@Table(name="t_student")
public class TStudent {

    private Integer id;

    /**
     * Database Column Remarks:
     *   账户名称
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   学生积分数
     *
     * @mbg.generated
     */
    private Integer points;

    /**
     * Database Column Remarks:
     *   学生邮件地址
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   学生手机号码
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * @mbg.generated
     */
    private String studentNum;

    /**
     * Database Column Remarks:
     *   学生真实姓名
     */
    private String trueName;

}
