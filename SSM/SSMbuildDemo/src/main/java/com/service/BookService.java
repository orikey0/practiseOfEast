package com.service;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 04 23:30
 * -- 平凡才是唯一的答案 --
 **/
public interface BookService {
    //    插入一本书
    int insert(Books record);

    //    int insertSelective(Books record);
//  删除
    int deleteBookById(@Param("bookId") int id);
    //  更改
    int updateBook(Books record);
    //  查询
    Books queryBookById(int id);

    //  查询全部
    List<Books> queryAllBook();
}
