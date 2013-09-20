/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * ��Singleton5.java��ʵ����������������ͬ�� 
 * @author yangbolin Sep 19, 2013 6:56:39 PM
 */
public class Singleton5 {
    private static Singleton5 instance = null;
    
    private Singleton5() {
        System.out.println("Constructing Singleton5 instance...");
    }
    
    /**
     * ֱ���ڷ���������ͬ����������ʱ����Ĳ������ܲ���
     * @return
     */
    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }
}
