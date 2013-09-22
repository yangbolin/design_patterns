/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.method;

import com.alibaba.design.patterns.factory.IAnimal;

/**
 * ��AnimalFactory.java��ʵ����������������Ĺ���
 * @author yangbolin Sep 22, 2013 8:54:23 PM
 */
public interface AnimalFactory {
    /** �����д�������ķ��� **/
    public IAnimal createAnimal();
}