/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

/**
 * 类Cow.java的实现描述：奶牛 
 * @author yangbolin Sep 21, 2013 9:19:02 PM
 */
public class Cow implements IAnimal {

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Cow is drinking...");
    }
}
