package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OriKey
 * @create 2020- 07- 06 9:58
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    int productId;
    double price;
    String name;
}
