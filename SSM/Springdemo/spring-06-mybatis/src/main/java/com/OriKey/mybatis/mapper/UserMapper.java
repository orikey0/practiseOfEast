package com.OriKey.mybatis.mapper;

import com.OriKey.mybatis.pojo.User;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 06- 29 15:14
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    public List<User>selectUser();

}
