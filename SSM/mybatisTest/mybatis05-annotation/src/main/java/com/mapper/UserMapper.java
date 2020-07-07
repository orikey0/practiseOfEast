package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 06 21:28
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    @Select("SELECT * from USER ")
    List<User> getUsers();
}
