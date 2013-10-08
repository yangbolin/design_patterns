/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * ��StrategyEnum.java��ʵ�����������Ե�ö��
 * 
 * @author yangbolin Oct 2, 2013 5:55:18 PM
 */
public enum StrategyEnum {
    /** ���в��� **/
    SERIAL("SERIAL"),
    /** �������� **/
    CONCURRENT("SERIAL");

    String value;

    StrategyEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public static StrategyEnum typeOf(String value) {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        
        for (StrategyEnum strategy : StrategyEnum.values()) {
            if (value.equals(strategy.getValue())) {
                return strategy;
            }
        }
        
        return null;
    }
}
