package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author OriKey
 * @create 2020- 06- 18 21:18
 * -- 平凡才是唯一的答案 --
 **/
//说明这个类呗Spring接管了，注册到了容器中。
@Component
public class User {
    @Value("JavaConfig")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
