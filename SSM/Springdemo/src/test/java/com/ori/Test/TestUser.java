package com.ori.Test;

import com.ori.control.UserService;
import com.ori.control.UserServiceImpl;
import com.ori.pojo.ioc.User;
import com.ori.pojo.ioc.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 17 16:54
 * -- 平凡才是唯一的答案 --
 **/
public class TestUser {
    @Test
    public void test(){
        UserService userService = new UserServiceImpl() ;
        userService.setUser(new UserDaoImpl());
        userService.getUser();
    }
    @Test
    public void test_spring_ioc(){
        ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
        UserService service=(UserService) context.getBean("UserServiceImpl");
        service.getUser();
    }
    @Test
    public void test_user(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.getAge());
    }
}
