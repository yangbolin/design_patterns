/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.ast;

/**
 * <pre>
 * һ�����󹤳���Ӧһ�����幤����һ�����幤����Ӧͬһ���͵Ķ��ֲ�Ʒ
 * </pre>
 * 
 * @author yangbolin Oct 2, 2013 10:04:45 AM
 */
public class Client {

    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        
        FemaleCat femaleCat = catFactory.createFemaleCat();
        System.out.println(femaleCat.getSex());
        
        MaleCat maleCat = catFactory.createMaleCat();
        System.out.println(maleCat.getSex());
    }
}
