package com.ori.control;

import com.ori.pojo.ioc.UserDao;

/**
 * @author OriKey
 * @create 2020- 06- 17 16:51
 * -- 平凡才是唯一的答案 --
 **/
public interface UserService {
    void setUser(UserDao user);
    void getUser();
}
