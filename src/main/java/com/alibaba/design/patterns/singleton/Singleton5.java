/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * 类Singleton5.java的实现描述：方法级别同步 
 * @author yangbolin Sep 19, 2013 6:56:39 PM
 */
public class Singleton5 {
    private static Singleton5 instance = null;
    
    private Singleton5() {
        System.out.println("Constructing Singleton5 instance...");
    }
    
    /**
     * 直接在方法级别做同步，不过此时程序的并发性能不好
     * @return
     */
    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }
}
