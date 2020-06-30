package com.proxy.demo02;

/**
 * @author OriKey
 * @create 2020- 06- 27 20:16
 * -- 平凡才是唯一的答案 --
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvokcationHandler proxyInvokcationHandler = new ProxyInvokcationHandler();
        proxyInvokcationHandler.setRent(host);
        Rent proxy = (Rent)proxyInvokcationHandler.getProxy();
        proxy.rent();
    }
}
