/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

/**
 * 类SerialStrategy.java的实现描述：串行策略 
 * @author yangbolin Oct 2, 2013 5:54:03 PM
 */
public class SerialStrategy implements IStrategy {

    @Override
    public void execute() {
        System.out.println("Serial Strategy...");
    }
}
