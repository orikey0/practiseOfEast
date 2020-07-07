package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @author OriKey
 * @create 2020- 07- 06 21:18
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("User")
public class User {
    private int id;
    private String name;
    private String pwd;
}
