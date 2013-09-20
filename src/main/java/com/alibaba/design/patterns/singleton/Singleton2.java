/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * ��Singleton2.java��ʵ��������ֱ�Ӵ�����̬��Ա����
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
     * ���ִ��������ķ�ʽ��Ȼ�����в������⣬���ǲ���instance�᲻�ᱻʹ�ã�ֻҪ Singleton2��JVM���أ�
     * �ͻᴴ��Singleton2��һ��ʵ������
     * </pre>
     * 
     * @return
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}
