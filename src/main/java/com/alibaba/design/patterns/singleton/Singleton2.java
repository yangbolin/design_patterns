/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * 类Singleton2.java的实现描述：直接创建静态成员变量
 * 
 * @author yangbolin Sep 19, 2013 6:44:01 PM
 */
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2(){
        System.out.println("Constructing Singleton2 instance...");
    }

    /**
     * <pre>
     * 这种创建单例的方式虽然不会有并发问题，但是不管instance会不会被使用，只要 Singleton2被JVM加载，
     * 就会创建Singleton2的一个实例出来
     * </pre>
     * 
     * @return
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}
