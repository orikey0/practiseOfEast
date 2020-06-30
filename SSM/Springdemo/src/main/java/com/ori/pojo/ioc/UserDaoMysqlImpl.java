package com.ori.pojo.ioc;

/**
 * @author OriKey
 * @create 2020- 06- 17 17:15
 * -- 平凡才是唯一的答案 --
 **/
public class  UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MysqlUser连接");
    }
}
