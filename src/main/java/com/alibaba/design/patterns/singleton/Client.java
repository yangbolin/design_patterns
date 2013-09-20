/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.singleton;

import com.alibaba.design.patterns.common.ClientBase;
import com.alibaba.design.patterns.common.Patterns;

/**
 * <h1>类Client.java的实现描述：单例模式测试的客户端类</h1> 
 * <h2>单例设计模式的概述：</h2>
 * <p>
 * 单例模式是一种常用的设计模式。在它的核心结构中，只包含一个被称为单例类的特殊类，
 * 通过单例模式 可以保证系统中的一个类只有一个实例，而且该实例易于外界访问。从而
 * 方便对实例个数的控制，并且节约系统资源。如果希望在系统中，某个类的对象只能存在
 * 一个，那么单例模式就是最好的解决策略。 现在的企业级应用都把对象的管理委托给
 * Spring容器，在Spring容器中也存在单例bean和多例bean。简单说多例就是一个类的
 * 实例有多个，单例就是一个类的实例只有一个，单例在多线程中使用时一定要考虑 线程安
 * 全性。
 * </p>
 * 
 * @author yangbolin Sep 19, 2013 5:44:46 PM
 */
public class Client extends ClientBase {

    public static void main(String[] args) {
        Client client = new Client();
        client.doExecute();
    }

    @Patterns
    public void getSingleton1Instance() {
        System.out.println("=====Singleton1=====");
        Singleton1 instance = Singleton1.getInstance();
        for (int i = 0; i < 10; ++i) {
            Singleton1 currentInstance = Singleton1.getInstance();
            System.out.println(instance.equals(currentInstance));
        }
    }

    @Patterns
    public void getSingleton2Instance() {
        System.out.println("=====Singleton2=====");
        Singleton2 instance = Singleton2.getInstance();
        for (int i = 0; i < 10; ++i) {
            Singleton2 currentInstance = Singleton2.getInstance();
            System.out.println(instance.equals(currentInstance));
        }
    }

    @Patterns
    public void getSingleton3Instance() {
        System.out.println("=====Singleton3=====");
        Singleton3 instance = Singleton3.getInstance();
        for (int i = 0; i < 10; ++i) {
            Singleton3 currentInstance = Singleton3.getInstance();
            System.out.println(instance.equals(currentInstance));
        }
    }

    @Patterns
    public void getSingleton4Instance() {
        System.out.println("=====Singleton4=====");
        Singleton4 instance = Singleton4.getInstance();
        for (int i = 0; i < 10; ++i) {
            Singleton4 currentInstance = Singleton4.getInstance();
            System.out.println(instance.equals(currentInstance));
        }
    }

    @Patterns
    public void getSingleton5Instance() {
        System.out.println("=====Singleton5=====");
        Singleton5 instance = Singleton5.getInstance();
        for (int i = 0; i < 10; ++i) {
            Singleton5 currentInstance = Singleton5.getInstance();
            System.out.println(instance.equals(currentInstance));
        }
    }
}
