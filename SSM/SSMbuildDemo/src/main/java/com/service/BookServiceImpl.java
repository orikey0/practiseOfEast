package com.service;

import com.mapper.BooksMapper;
import com.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 04 23:36
 * -- 平凡才是唯一的答案 --
 **/
//@Controller
@Service("BookServiceImpl")
public class BookServiceImpl implements BookService {
    //业务层调dao层
    @Autowired
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int insert(Books record) {
        return booksMapper.insert(record);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books record) {
        return booksMapper.updateBook(record);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
