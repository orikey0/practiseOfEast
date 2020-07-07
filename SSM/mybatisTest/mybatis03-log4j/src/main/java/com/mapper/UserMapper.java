package com.mapper;

import com.pojo.User;

import java.util.List;
import java.util.Map;

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
//    更新项目
    int updateUser(User user);
//    模糊查询
    List<User> getUserByName(String name);
//    实现分页
    List<User> getUserNameByLimit(Map<String,Integer>Object);
}
