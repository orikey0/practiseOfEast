package com.proxy.demo04;

import org.junit.Test;

/**
 * @author OriKey
 * @create 2020- 06- 28 0:37
 * -- 平凡才是唯一的答案 --
 **/
public class Client {
    @Test
    public void test(){
        UserServiceImpl userService = new UserService() ;
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserServiceImpl proxy = (UserServiceImpl)proxyInvocationHandler.getProxy();
        //不能使用接口的实现类进行强制类型转换
        proxy.add();
    }
}
