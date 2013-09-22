/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.method;

import com.alibaba.design.patterns.common.ClientBase;
import com.alibaba.design.patterns.common.Patterns;
import com.alibaba.design.patterns.factory.IAnimal;

/**
 * <pre>
 * 类Client.java的实现描述：工厂方法模式的客户端测试类
 * 工厂方法模式的四个要点：
 * 1.抽象工厂：定义一个创建产品的规范
 * 2.抽象产品：定义一个创建出来产品的规范
 * 3.具体工厂
 * 4.具体产品
 * 
 * 一个抽象工厂对应一个抽象产品，一个具体工厂对应一个具体产品，注意体会这里
 * 不论是抽象工厂与抽象产品之间，还是具体工厂和具体产品之间，他们的对应关系
 * 都是一对一的。
 * 
 * 关于工厂方法模式的使用场景：
 * 1.使用方需要关心需要创建那种具体的产品，这样使用方在创建工厂的时候就需要
 * 指定一种具体的工厂，比如java集合类中的迭代器Iterator,在使用的时候需要
 * 明确指定需要那种类型的迭代器，其实这就是一种工厂设计模式。
 * 2.使用方只关心生产出的产品符合最初的产品定义，到底是那一种产品，是有生产
 * 方，也即工厂根据系统的状态来选择创建那种产品，个人感觉这种场景才是名副其实
 * 的【工厂方法】设计模式。
 * </pre>
 * 
 * @author yangbolin Sep 22, 2013 9:01:48 PM
 */
public class Client extends ClientBase {

    public static void main(String[] args) {
        Client client = new Client();
        client.doExecute();
    }

    @Patterns
    public void cow() {
        AnimalFactory af = new CowFactory();
        IAnimal animal = af.createAnimal();
        animal.sleep();
        animal.drink();
    }

    @Patterns
    public void rabbit() {
        AnimalFactory af = new RabbitFactory();
        IAnimal animal = af.createAnimal();
        animal.sleep();
        animal.drink();
    }

    @Patterns
    public void cat() {
        AnimalFactory af = new CatFactory();
        IAnimal animal = af.createAnimal();
        animal.sleep();
        animal.drink();
    }
}
