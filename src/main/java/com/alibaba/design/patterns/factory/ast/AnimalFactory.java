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
 * ��AnimalFactory.java��ʵ�������� ���﹤���Ľӿ� 
 * @author yangbolin Oct 2, 2013 9:50:32 AM
 */
public interface AnimalFactory {
    public IAnimal createAnimal();
}
