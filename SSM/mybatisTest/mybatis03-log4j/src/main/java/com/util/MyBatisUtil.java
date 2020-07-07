package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author OriKey
 * @create 2020- 07- 06 20:55
 * -- 平凡才是唯一的答案 --
 **/
public class MyBatisUtil {
//    SqlSessionFactory对象：本质就是一个连接池对象，
//    最佳作用域就是应用作用域，最简单的实现方式就是使用单例模式进行实现
    public static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSeesion(){
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder对象的作用就是解析XML文件，
//            生成一个相应的SqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//            返回一个SQL Session对象：相当于是一个向连接池发送的请求
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
