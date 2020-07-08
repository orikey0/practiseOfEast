package com.Mapper;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 07 21:00
 * -- 平凡才是唯一的答案 --
 **/
public interface TeacherMapper {
    @Select("Select * from mybatis.teacher where id = #{tid}")
    Teacher getTeacherById(@Param("tid") int id);

    @Select("SELECT * from mybatis.teacher")
    List<Teacher> getTeacher();
}
