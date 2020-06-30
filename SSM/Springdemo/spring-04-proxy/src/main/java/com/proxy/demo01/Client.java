package com.proxy.demo01;

import org.junit.Test;

/**
 * @author OriKey
 * @create 2020- 06- 26 17:15
 * -- 平凡才是唯一的答案 --
 **/
public class Client {
    Host host = new Host();
    proxy proxy = new proxy(host);
    @Test
    public void test(){
        proxy.rent();
    }
}
