package com.ori.pojo.ioc;

/**
 * @author OriKey
 * @create 2020- 06- 17 16:50
 * -- 平凡才是唯一的答案 --
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户数据");
    }
}
