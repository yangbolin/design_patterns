/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.proxy;

/**
 * <pre>
 * 类CEOAssistant.java的实现描述：CEO的助理 
 * 代理对象一定能知道被代理对象能做那些事情,CEO
 * 的助理也当然知道CEO能做那些事情了。
 * </pre>
 * 
 * @author yangbolin Oct 3, 2013 10:19:31 AM
 */
public class CEOAssistant implements ICEO {

    private CEO ceo;

    public CEOAssistant(CEO ceo){
        this.ceo = ceo;
    }

    @Override
    public void doAudit() {
        ceo.doAudit();
    }

    @Override
    public void doPlan() {
        ceo.doPlan();
    }

    @Override
    public void doPunish() {
        ceo.doPunish();
    }
}
