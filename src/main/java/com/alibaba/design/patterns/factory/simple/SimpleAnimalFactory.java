/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.design.patterns.factory.AnimalEnum;
import com.alibaba.design.patterns.factory.Cat;
import com.alibaba.design.patterns.factory.Cow;
import com.alibaba.design.patterns.factory.IAnimal;
import com.alibaba.design.patterns.factory.Rabbit;

/**
 * <pre>
 * 类SimpleAnimalFactory.java的实现描述：创建动物的工厂
 * 
 * 简单工厂模式的思想很简单，之所以是工厂是因为它可以就根据不同的需求生产出不同的东西来。
 * 需求是不断变化的，对应的产出也就是不断变化的，我们的设计要能适应二者的变化，同时也要
 * 保证逻辑上的清晰简单，方便维护。
 * 
 * 关于下面的简单工厂有如下的不足：
 * 1.在创建对象的时候存在复杂的逻辑判断，要是代码中有复杂的逻辑判断，一定要考虑一下如何
 * 设计才能将逻辑简化，比如直接把枚举和类的权限定名称关联起来，使用Class.forName()
 * 2.这里有三条生成线，如果其中一条瘫痪，整个生产系统都会瘫痪，说白了就是各个生产线之间
 * 的关系耦合的过于紧密
 * </pre>
 * 
 * @author yangbolin Sep 21, 2013 9:23:38 PM
 */
public class SimpleAnimalFactory {

    private static Map<AnimalEnum, IAnimal> cachedAnimalMap = new ConcurrentHashMap<AnimalEnum, IAnimal>();

    /**
     * 如果传入的类型不在枚举类的范围之内，返回NULL，所以客户端需要注意NPE的判断
     * 
     * @param animal
     * @return
     */
    public static IAnimal createAnimal(AnimalEnum animal) {
        IAnimal animalInstance = cachedAnimalMap.get(animal);
        if (animalInstance != null) {
            return animalInstance;
        }
        if (animal.compareTo(AnimalEnum.CAT) == 0) {
            animalInstance = new Cat();
        } else if (animal.compareTo(AnimalEnum.COW) == 0) {
            animalInstance = new Cow();
        } else if (animal.compareTo(AnimalEnum.RABBIT) == 0) {
            animalInstance = new Rabbit();
        }

        if (animalInstance != null) {
            cachedAnimalMap.put(animal, animalInstance);
        }
        return animalInstance;
    }
}
