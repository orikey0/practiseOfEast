package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OriKey
 * @create 2020- 07- 04 16:13
 * -- 平凡才是唯一的答案 --
 **/
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    String name;
    int id;
    String sex;
}
