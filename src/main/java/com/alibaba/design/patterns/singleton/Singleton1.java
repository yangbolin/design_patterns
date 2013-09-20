/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

/**
 * ��Singleton1.java��ʵ����������ͨ�ĵ���д��
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
     * ����д���޷���֤������������ֻ����һ��Singleton1��ʵ�� �߳�1ִ�е�if�жϣ�����instance==null������
     * ��ʱ��Ҫ����һ��Singleton1ʵ�����ǻ�û�������߳�2Ҳִ�е�if�жϣ�����instance==null��Ȼ������
     * �����߳�1���߳�2�ͷֱ𴴽���һ��Singleton1 ��ʵ������������ǿ���ģ��ģ���if���������sleepʱ�伴�ɡ�
     * </pre>
     * 
     * @return
     */
    public static Singleton1 getInstance() {
        // ���ж�instance�ǲ���Ϊnull
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
