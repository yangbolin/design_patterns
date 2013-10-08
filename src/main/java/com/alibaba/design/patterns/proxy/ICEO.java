/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.proxy;

/**
 * ��ICEO.java��ʵ��������CEO�Ľӿ�
 * 
 * @author yangbolin Oct 3, 2013 10:13:11 AM
 */
public interface ICEO {

    /**
     * CEO ����˹���
     */
    public void doAudit();

    /**
     * CEO ���ƻ�
     */
    public void doPlan();

    /**
     * CEO ������
     */
    public void doPunish();
}
