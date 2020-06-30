package com.ori.control;

import com.ori.pojo.ioc.UserDao;

/**
 * @author OriKey
 * @create 2020- 06- 17 16:52
 * -- 平凡才是唯一的答案 --
 **/
public class UserServiceImpl implements UserService {
    private UserDao user ;


    @Override
    public void setUser(UserDao user) {
        this.user = user;
    }

    @Override
    public void getUser() {
        user.getUser();
    }
}
