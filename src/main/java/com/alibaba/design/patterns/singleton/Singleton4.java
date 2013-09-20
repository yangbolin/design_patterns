/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * ��Singleton4.java��ʵ��������˫�ؼ���
 * 
 * @author yangbolin Sep 19, 2013 6:52:19 PM
 */
public class Singleton4 {

    private static Singleton4 instance = null;

    private Singleton4(){
        System.out.println("Constructing Singleton4 instance...");
    }

    /**
     * ʹ��ͬ������飬��С������Χ����ߴ���ִ��Ч��
     * 
     * @return
     */
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
