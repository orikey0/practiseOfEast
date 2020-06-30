package com.proxy.demo04;

/**
 * @author OriKey
 * @create 2020- 06- 28 0:24
 * -- 平凡才是唯一的答案 --
 **/
public class UserService implements UserServiceImpl {
    @Override
    public void add() {
        System.out.println("执行add方法");
    }

    @Override
    public void delete() {
        System.out.println("执行delete方法");
    }

    @Override
    public void insert() {
        System.out.println("执行insert方法");
    }

    @Override
    public void select() {
        System.out.println("执行select方法");
    }
}
