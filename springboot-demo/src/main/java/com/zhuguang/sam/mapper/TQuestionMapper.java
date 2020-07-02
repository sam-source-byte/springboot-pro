package com.zhuguang.sam.mapper;

import com.zhuguang.sam.pojo.TQuestion;
import com.zhuguang.sam.vo.QuestionStudentVO;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/6/18 19:36
 * @Description:
 */
public interface TQuestionMapper extends BaseMapper<TQuestion> {
    /**
     *
     * @param page 翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @return
     */
    @Select("SELECT t_question.*,t_student.`name` FROM t_question,t_student WHERE t_question.student_id=t_student.id")
    List<QuestionStudentVO> getQuestionStudent(Pagination page);
}
