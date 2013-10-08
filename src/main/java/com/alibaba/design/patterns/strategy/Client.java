/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

/**
 * <pre>
 * ��Client.java��ʵ�����������ԵĿͻ��˲����� 
 * 
 * ���ڲ������ģʽ�������ŵ����ڸ��ھۣ�����ϣ�������ʲô���ԺͲ��Ե�
 * ����ʵʩ֮�����϶ȷǳ��ͣ�һ���˸�����Ե��ƶ�������һ���˸�����Ե�
 * ִ�У��������ģʽ��ƽʱ�Ŀ������̷���ֹ���Э��������
 * </pre>
 * 
 * @author yangbolin Oct 2, 2013 6:05:59 PM
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.doWork(StrategyEnum.CONCURRENT);
        context.doWork(StrategyEnum.SERIAL);
    }
}