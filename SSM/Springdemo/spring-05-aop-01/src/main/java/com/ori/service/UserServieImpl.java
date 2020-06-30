package com.ori.service;

/**
 * @author OriKey
 * @create 2020- 06- 29 9:30
 * -- 平凡才是唯一的答案 --
 **/
public class UserServieImpl implements Userservice {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
