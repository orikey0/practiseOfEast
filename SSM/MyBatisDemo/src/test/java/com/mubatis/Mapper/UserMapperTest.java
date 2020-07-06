package com.mubatis.Mapper;

import com.mybatis.Mapper.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 06 15:38
 * -- 平凡才是唯一的答案 --
 **/
public class UserMapperTest {
    @Test
    public void test_Select(){
//        第一步获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        第二步执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User>lists = mapper.getUserList();
        for (User list : lists) {
            System.out.println(list);
        }
    }
    @Test
    public void test_Id(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        第二步执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void test_insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        第二步执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(6,"梨花","asdkfj"));
        if (res>0){
            System.out.println("插入成功");
        }
//        提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
