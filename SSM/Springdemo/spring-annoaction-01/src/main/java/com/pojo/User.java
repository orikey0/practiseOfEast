package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author OriKey
 * @create 2020- 06- 18 20:38
 * -- 平凡才是唯一的答案 --
 **/
//等价于<bean id = "user" class = "com.pojo.User"/>
@Component
@Scope("prototype")
public class User {
//    等价于<property name = "name" value = "String"/>
    @Value("String")
    private String name;

    public User() {
        this.name = "hello";
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
