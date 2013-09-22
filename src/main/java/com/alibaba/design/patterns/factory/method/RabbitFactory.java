/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.method;

import com.alibaba.design.patterns.factory.IAnimal;
import com.alibaba.design.patterns.factory.Rabbit;

/**
 * ��RabbitFactory.java��ʵ���������������ӵĹ���
 * @author yangbolin Sep 22, 2013 8:56:16 PM
 */
public class RabbitFactory implements AnimalFactory {

    @Override
    public IAnimal createAnimal() {
        return new Rabbit();
    }
}
