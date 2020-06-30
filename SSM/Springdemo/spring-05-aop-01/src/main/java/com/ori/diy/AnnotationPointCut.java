package com.ori.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author OriKey
 * @create 2020- 06- 29 10:33
 * -- 平凡才是唯一的答案 --
 **/
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ori.service.UserServieImpl.*(..))")
    public void before(){
        System.out.println("++++++before++++++");
    }
    @Around("execution(* com.ori.service.UserServieImpl.*(..))")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=======环绕前======");
        Signature signature = joinPoint.getSignature();
        System.out.println("signature"+" "+signature);
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
