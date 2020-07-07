package com.mapper;

import com.pojo.User;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 06 21:28
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    List<User> userList();
    User getUserById(int id);
    int addUser(User user);
    int deleteUserById(int id);
    int updateUser(User user);
    List<User> getUserByName(String name);
}
