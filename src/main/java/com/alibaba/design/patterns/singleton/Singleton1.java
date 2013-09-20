/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * 类Singleton1.java的实现描述：普通的单例写法
 * 
 * @author yangbolin Sep 19, 2013 6:34:11 PM
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1(){
        System.out.println("Constructing Singleton1 instance...");
    }

    /**
     * <pre>
     * 这种写法无法保证并发环境下面只创建一个Singleton1的实例 线程1执行到if判断，发现instance==null成立，
     * 此时正要创建一个Singleton1实例但是还没创建，线程2也执行到if判断，发现instance==null依然成立，
     * 这样线程1和线程2就分别创建了一个Singleton1 的实例，这种情况是可以模拟的，在if语句内增加sleep时间即可。
     * </pre>
     * 
     * @return
     */
    public static Singleton1 getInstance() {
        // 先判断instance是不是为null
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
