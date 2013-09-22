/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.method;

import com.alibaba.design.patterns.factory.Cow;
import com.alibaba.design.patterns.factory.IAnimal;

/**
 * 类CowFactory.java的实现描述：创建奶牛的工厂
 * @author yangbolin Sep 22, 2013 8:56:43 PM
 */
public class CowFactory implements AnimalFactory {

    @Override
    public IAnimal createAnimal() {
        return new Cow();
    }
}
