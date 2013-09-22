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
 * ��Client.java��ʵ����������������ģʽ�Ŀͻ��˲�����
 * ��������ģʽ���ĸ�Ҫ�㣺
 * 1.���󹤳�������һ��������Ʒ�Ĺ淶
 * 2.�����Ʒ������һ������������Ʒ�Ĺ淶
 * 3.���幤��
 * 4.�����Ʒ
 * 
 * һ�����󹤳���Ӧһ�������Ʒ��һ�����幤����Ӧһ�������Ʒ��ע���������
 * �����ǳ��󹤳�������Ʒ֮�䣬���Ǿ��幤���;����Ʒ֮�䣬���ǵĶ�Ӧ��ϵ
 * ����һ��һ�ġ�
 * 
 * ���ڹ�������ģʽ��ʹ�ó�����
 * 1.ʹ�÷���Ҫ������Ҫ�������־���Ĳ�Ʒ������ʹ�÷��ڴ���������ʱ�����Ҫ
 * ָ��һ�־���Ĺ���������java�������еĵ�����Iterator,��ʹ�õ�ʱ����Ҫ
 * ��ȷָ����Ҫ�������͵ĵ���������ʵ�����һ�ֹ������ģʽ��
 * 2.ʹ�÷�ֻ�����������Ĳ�Ʒ��������Ĳ�Ʒ���壬��������һ�ֲ�Ʒ����������
 * ����Ҳ����������ϵͳ��״̬��ѡ�񴴽����ֲ�Ʒ�����˸о����ֳ�������������ʵ
 * �ġ��������������ģʽ��
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
