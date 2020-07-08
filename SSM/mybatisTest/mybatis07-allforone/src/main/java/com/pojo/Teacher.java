package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 07 20:58
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    int id;
    String name;
//    一个老师对应多个学生
    private List<Student> students;
}
