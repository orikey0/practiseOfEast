package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

/**
 * @author OriKey
 * @create 2020- 06- 17 19:54
 * -- 平凡才是唯一的答案 --
 **/
public class Person {
    private String name;
//    直接在属性上即可使用，也可以在set方式上使用
//    使用AutoWired我们可以不用编写Set方法，通过反射的方式
//    使用byType的方式进行注入。
//    使用@Nullable注解之后表示可以为空。
//    如果定义了required = false表示这个变量为null也可以。
//    使用@Resource可以用java的注解进行配置
//    Autowired使用byType
//    @Resource使用byName
    @Nullable
    @Autowired(required = false)
    @Qualifier(value = "cat")//有多个类型的实现的时候使用
//    Qualifier进行匹配指定唯一id对象
    private cat cat;
    @Autowired
    private dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.pojo.cat getCat() {
        return cat;
    }

    public void setCat(com.pojo.cat cat) {
        this.cat = cat;
    }

    public com.pojo.dog getDog() {
        return dog;
    }

    public void setDog(com.pojo.dog dog) {
        this.dog = dog;
    }
}
