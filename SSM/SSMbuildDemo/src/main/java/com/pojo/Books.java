package com.pojo;

import com.mapper.BooksMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author OriKey
 * @create 2020- 07- 04 21:23
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    /**
     * 书id
     */
    private Integer bookid;

    /**
     * 书名
     */
    private String bookname;

    /**
     * 数量
     */
    private Integer bookcounts;

    /**
     * 描述
     */
    private String detail;

}