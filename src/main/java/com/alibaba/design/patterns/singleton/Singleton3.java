/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * 类Singleton3.java的实现描述：直接创建静态成员变量
 * 
 * @author yangbolin Sep 19, 2013 6:49:40 PM
 */
public class Singleton3 {
    /** 把静态成员变量的创建放到静态代码块中 **/
    private static Singleton3 instance;
    static {
        instance = new Singleton3();
    }

    private Singleton3(){
        System.out.println("Constructing Singleton3 instance...");
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
