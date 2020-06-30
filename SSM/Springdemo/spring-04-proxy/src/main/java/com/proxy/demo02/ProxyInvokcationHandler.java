package com.proxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author OriKey
 * @create 2020- 06- 26 22:22
 * -- 平凡才是唯一的答案 --
 **/
public class ProxyInvokcationHandler implements InvocationHandler {
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces()
                , this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }
    public void fare(){
        System.out.println("中介收费");
    }
    public void seeHouse(){
        System.out.println("中介看房子");
    }
}
