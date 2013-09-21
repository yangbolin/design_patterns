/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

/**
 * 类IAnimal.java的实现描述：动物接口
 * @author yangbolin Sep 21, 2013 9:13:10 PM
 */
public interface IAnimal {
    /** 动物在睡觉 **/
    public void sleep();
    /** 动物在吃饭 **/
    public void eat();
    /** 动物在喝水 **/
    public void drink();
}
