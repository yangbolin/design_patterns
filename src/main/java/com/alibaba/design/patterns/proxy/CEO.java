package com.alibaba.design.patterns.proxy;

/**
 * 类CEO.java的实现描述：CEO的实现类 
 * @author yangbolin Oct 3, 2013 10:22:51 AM
 */
public class CEO implements ICEO {

    @Override
    public void doAudit() {
        System.out.println("CEO do audit!!!");
    }

    @Override
    public void doPlan() {
        System.out.println("CEO do plan!!!");
    }

    @Override
    public void doPunish() {
        System.out.println("CEO do punish!!!");
    }
}
