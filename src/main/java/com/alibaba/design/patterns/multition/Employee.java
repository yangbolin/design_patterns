/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.multition;

/**
 * <pre>
 * ��Empolyee.java��ʵ������������ 
 * ���ڶ��������ģʽ���ܲ����Ǻܳ������������ģʽ�͵������ģʽ�Ƕ�����
 * ����Ҫ��ͬһ���͵�ʵ������ֻ����һ��������Ҫ��ͬһ���͵�ʵ�����Զ������
 * Spring����о������ֵ���bean�Ͷ���bean����Ӧ�ľ�������ĵ������ģʽ
 * �Ͷ������ģʽ����������bean��Spring�ж�Ӧ����ԭ��bean,ԭ��bean��Spring
 * ������ÿ�λ�ȡ��ʱ�������´���һ��
 * </pre>
 * @author yangbolin Oct 4, 2013 9:23:17 AM
 */
public class Employee {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Employer.next());
        }
    }
}
