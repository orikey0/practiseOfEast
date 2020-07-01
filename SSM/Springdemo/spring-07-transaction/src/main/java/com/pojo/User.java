package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author OriKey
 * @create 2020- 06- 30 20:59
 * -- 平凡才是唯一的答案 --
 **/
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
