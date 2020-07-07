package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.expr.NewExpr;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author OriKey
 * @create 2020- 07- 06 15:12
 * -- 平凡才是唯一的答案 --
 **/
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resorce = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resorce);
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
