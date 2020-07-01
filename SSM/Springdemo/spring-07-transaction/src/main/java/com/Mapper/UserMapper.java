package com.Mapper;

import com.pojo.User;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 06- 30 21:02
 * -- 平凡才是唯一的答案 --
 **/
public interface UserMapper {
    public List<User>selectAll();
    public void add(User user);
    public void delete(int id);
}
