/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

/**
 * 类Cat.java的实现描述：猫 
 * @author yangbolin Sep 21, 2013 9:18:09 PM
 */
public class Cat implements IAnimal {

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking...");
    }
}
