/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.simple;

import com.alibaba.design.patterns.factory.AnimalEnum;
import com.alibaba.design.patterns.factory.IAnimal;

/**
 * 类Client.java的实现描述：简单工厂的客户端测试类 
 * @author yangbolin Sep 21, 2013 9:50:11 PM
 */
public class Client {
    public static void main(String[] args) {
        IAnimal animal = SimpleAnimalFactory.createAnimal(AnimalEnum.CAT);
        animal.sleep();
    }
}
