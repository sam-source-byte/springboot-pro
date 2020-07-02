package com.zhuguang.sam.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther: Sam
 * @Date: 2020/6/18 15:03
 * @Description:
 */
@Data
@Table(name="t_question")
public class TQuestion {
    /**
     * Database Column Remarks:
     *   问答主键id
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   学生外键id
     * @mbg.generated
     */
    private String studentId;

    /**
     * Database Column Remarks:
     *   问题内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   问题发布时间
     *
     * @mbg.generated
     */
    private Date date;

    /**
     * Database Column Remarks:
     *   问题悬赏的积分

     *
     * @mbg.generated
     */
    private Integer value;

    /**
     * Database Column Remarks:
     *   问题是否解决： N -未解决  Y -已解决

     *
     * @mbg.generated
     */
    private String status;
}
