package com.mybatis.Mapper;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 06 15:24
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    public List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
}
