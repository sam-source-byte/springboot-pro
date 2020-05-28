package com.zhuguang.sam.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/5/27 22:43
 * @Description:
 */
@Table(name="tb_user")
@Data
public class TbUser {
   @Id
   @KeySql(useGeneratedKeys = true)
    private Long id;

    //用户名
    private String userName;

    //密码
    private String password;

    //姓名
    private String name;
    //年纪
    private Integer age;
   //性别，1 男性， 2女性
    private Integer sex;
    //出生日期
    private Date birthday;

    //备注
    private String note;

   //创建时间
    private Date created;

   //创建时间
    private Date updated;


}
