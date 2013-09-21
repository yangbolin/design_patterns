/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

/**
 * ��IAnimal.java��ʵ������������ӿ�
 * @author yangbolin Sep 21, 2013 9:13:10 PM
 */
public interface IAnimal {
    /** ������˯�� **/
    public void sleep();
    /** �����ڳԷ� **/
    public void eat();
    /** �����ں�ˮ **/
    public void drink();
}
