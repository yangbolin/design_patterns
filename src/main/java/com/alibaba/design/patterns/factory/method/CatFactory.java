/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.method;

import com.alibaba.design.patterns.factory.Cat;
import com.alibaba.design.patterns.factory.IAnimal;

/**
 * 类CatFactory.java的实现描述：创建猫的工厂
 * @author yangbolin Sep 22, 2013 8:56:29 PM
 */
public class CatFactory implements AnimalFactory {

    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
