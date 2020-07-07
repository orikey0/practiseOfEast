package com.mybatis.Mapper;

import com.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author OriKey
 * @create 2020- 07- 06 15:24
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    public List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);

    int addUser2(Map<String, Object> map);
    int updateUser(User user);

    int deleteUserById(int id);
}
