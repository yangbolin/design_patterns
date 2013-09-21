/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

/**
 * 类Rabbit.java的实现描述:兔子
 * @author yangbolin Sep 21, 2013 9:17:45 PM
 */
public class Rabbit implements IAnimal {

    @Override
    public void sleep() {
        System.out.println("Rabbit is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Rabbit is drinking...");
    }
}
