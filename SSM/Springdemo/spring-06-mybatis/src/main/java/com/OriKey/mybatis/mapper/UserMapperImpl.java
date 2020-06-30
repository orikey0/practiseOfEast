package com.OriKey.mybatis.mapper;

import com.OriKey.mybatis.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 06- 29 17:49
 * -- 平凡才是唯一的答案 --
 **/
public class UserMapperImpl implements UserMapper {
//    我们的所有操作都是用sqlSession来执行，现在使用sqlSessionTemplate操作
    private SqlSessionTemplate sqlSession;

    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
