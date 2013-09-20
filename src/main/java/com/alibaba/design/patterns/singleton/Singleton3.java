/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * ��Singleton3.java��ʵ��������ֱ�Ӵ�����̬��Ա����
 * 
 * @author yangbolin Sep 19, 2013 6:49:40 PM
 */
public class Singleton3 {
    /** �Ѿ�̬��Ա�����Ĵ����ŵ���̬������� **/
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
