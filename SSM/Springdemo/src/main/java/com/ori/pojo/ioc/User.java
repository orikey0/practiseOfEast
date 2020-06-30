package com.ori.pojo.ioc;

/**
 * @author OriKey
 * @create 2020- 06- 17 17:23
 * -- 平凡才是唯一的答案 --
 **/
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
