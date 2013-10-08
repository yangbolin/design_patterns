/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.ast;

import com.alibaba.design.patterns.factory.IAnimal;

/**
 * @author yangbolin Oct 2, 2013 9:47:34 AM
 */
public class CatFactory extends AbstractCatFactory implements AnimalFactory {

    @Override
    public IAnimal createAnimal() {
        return super.createCat();
    }

    @Override
    public MaleCat createMaleCat() {
        MaleCat cat = new MaleCat();
        cat.setSex("M");
        return cat;
    }

    @Override
    public FemaleCat createFemaleCat() {
        FemaleCat cat = new FemaleCat();
        cat.setSex("F");
        return cat;
    }
}
