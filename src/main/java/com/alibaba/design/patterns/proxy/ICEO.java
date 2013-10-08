/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.proxy;

/**
 * 类ICEO.java的实现描述：CEO的接口
 * 
 * @author yangbolin Oct 3, 2013 10:13:11 AM
 */
public interface ICEO {

    /**
     * CEO 做审核工作
     */
    public void doAudit();

    /**
     * CEO 做计划
     */
    public void doPlan();

    /**
     * CEO 做处罚
     */
    public void doPunish();
}
