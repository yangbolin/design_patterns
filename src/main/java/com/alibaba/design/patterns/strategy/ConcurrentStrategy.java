/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

/**
 * 类ConcurrentStrategy.java的实现描述：并发策略 
 * @author yangbolin Oct 2, 2013 5:51:48 PM
 */
public class ConcurrentStrategy implements IStrategy {

    @Override
    public void execute() {
        System.out.println("Concurrent Strategy...");
    }
}
