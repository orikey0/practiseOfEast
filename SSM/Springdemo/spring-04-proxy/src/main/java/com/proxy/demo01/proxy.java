package com.proxy.demo01;

/**
 * @author OriKey
 * @create 2020- 06- 26 17:12
 * -- 平凡才是唯一的答案 --
 **/
public class proxy implements rent{
    public proxy() {
    }

    public proxy(Host host) {
        this.host = host;
    }

    private Host host;
    @Override
    public void rent() {
        host.rent();
        contract();
        Intermediary_fee();
    }
    private void contract(){
        System.out.println("signing the contract");
    }
    private void Intermediary_fee(){
        System.out.println("get the fee");
    }
}
