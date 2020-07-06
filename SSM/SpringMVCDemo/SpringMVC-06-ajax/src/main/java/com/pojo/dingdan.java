package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author OriKey
 * @create 2020- 07- 06 9:57
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class dingdan {
    int id;
    int productID;
    int UserID;
    String CurrentTime;
}
