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
 * <h1>��Client.java��ʵ������������ģʽ���ԵĿͻ�����</h1> 
 * <h2>�������ģʽ�ĸ�����</h2>
 * <p>
 * ����ģʽ��һ�ֳ��õ����ģʽ�������ĺ��Ľṹ�У�ֻ����һ������Ϊ������������࣬
 * ͨ������ģʽ ���Ա�֤ϵͳ�е�һ����ֻ��һ��ʵ�������Ҹ�ʵ�����������ʡ��Ӷ�
 * �����ʵ�������Ŀ��ƣ����ҽ�Լϵͳ��Դ�����ϣ����ϵͳ�У�ĳ����Ķ���ֻ�ܴ���
 * һ������ô����ģʽ������õĽ�����ԡ� ���ڵ���ҵ��Ӧ�ö��Ѷ���Ĺ���ί�и�
 * Spring��������Spring������Ҳ���ڵ���bean�Ͷ���bean����˵��������һ�����
 * ʵ���ж������������һ�����ʵ��ֻ��һ���������ڶ��߳���ʹ��ʱһ��Ҫ���� �̰߳�
 * ȫ�ԡ�
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
