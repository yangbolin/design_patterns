/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

/**
 * <pre>
 * 类Client.java的实现描述：策略的客户端测试类 
 * 
 * 关于策略设计模式，最大的优点在于高内聚，低耦合，具体是什么策略和策略的
 * 具体实施之间的耦合度非常低，一个人负责策略的制定，另外一个人负责策略的
 * 执行，这种设计模式在平时的开发过程方便分工，协作开发。
 * </pre>
 * 
 * @author yangbolin Oct 2, 2013 6:05:59 PM
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.doWork(StrategyEnum.CONCURRENT);
        context.doWork(StrategyEnum.SERIAL);
    }
}