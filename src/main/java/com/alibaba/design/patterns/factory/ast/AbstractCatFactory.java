/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.ast;

import com.alibaba.design.patterns.factory.Cat;
import com.alibaba.design.patterns.factory.IAnimal;

/**
 * 类AbstractCatFactory.java的实现描述：创建兔子的抽象工厂
 * 
 * @author yangbolin Oct 2, 2013 9:41:50 AM
 */
public abstract class AbstractCatFactory {
    protected IAnimal createCat() {
        Cat cat = new Cat();
        return cat;
    }
    
    public abstract MaleCat createMaleCat();
    public abstract FemaleCat createFemaleCat();
}
