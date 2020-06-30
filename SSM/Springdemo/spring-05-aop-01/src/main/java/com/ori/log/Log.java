package com.ori.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author OriKey
 * @create 2020- 06- 29 9:21
 * -- 平凡才是唯一的答案 --
 **/
public class Log implements MethodBeforeAdvice {
    @Override
    //method：要执行的目标对象的方法
    //Object:参数
    //target:目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
