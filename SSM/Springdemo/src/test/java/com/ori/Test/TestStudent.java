package com.ori.Test;

import com.ori.pojo.di.Student;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 06- 17 18:55
 * -- 平凡才是唯一的答案 --
 **/
public class TestStudent {
    @Test
    public void test_Student(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
