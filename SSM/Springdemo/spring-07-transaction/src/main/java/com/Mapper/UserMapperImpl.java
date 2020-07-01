package com.Mapper;

import com.pojo.User;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 06- 30 21:10
 * -- 平凡才是唯一的答案 --
 **/
@Setter
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sessionTemplate;

    
    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
