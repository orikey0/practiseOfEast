package com.ori.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author OriKey
 * @create 2020- 06- 29 9:23
 * -- 平凡才是唯一的答案 --
 **/
public class AfterLog implements AfterReturningAdvice {
    @Override
    //returnValue；返回值
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为:"+o);
    }
}
