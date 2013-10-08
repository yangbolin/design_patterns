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
 * ��CEOAssistant.java��ʵ��������CEO������ 
 * �������һ����֪�����������������Щ����,CEO
 * ������Ҳ��Ȼ֪��CEO������Щ�����ˡ�
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
