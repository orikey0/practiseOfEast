package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author OriKey
 * @create 2020- 06- 18 21:18
 * -- 平凡才是唯一的答案 --
 **/
@Configuration//这个也会被Spring容器托管，注册到容器中
//因为它本身是一个配置类相当于之前靠偶的beans.xml
@ComponentScan("com.pojo")
public class JavaConfig {
    @Bean
    public User getUser(){
        return new User();
        //表示最后的返回要注入到bean的对象
    }
}
