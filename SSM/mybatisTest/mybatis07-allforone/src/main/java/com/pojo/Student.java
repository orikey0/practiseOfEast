package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OriKey
 * @create 2020- 07- 07 20:58
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String name;
    Teacher teacher;
}
