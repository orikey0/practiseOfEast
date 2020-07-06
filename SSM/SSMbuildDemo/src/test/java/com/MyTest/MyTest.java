package com.MyTest;

import com.pojo.Books;
import com.service.BookService;
import com.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 07- 05 12:16
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookServiceImpl.class);
        System.out.println(bookService.queryBookById(1));
    }
}
