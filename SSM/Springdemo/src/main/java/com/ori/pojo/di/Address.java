package com.ori.pojo.di;

/**
 * @author OriKey
 * @create 2020- 06- 17 18:51
 * -- 平凡才是唯一的答案 --
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String
    toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
