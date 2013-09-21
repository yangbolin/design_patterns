/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory;

import org.apache.commons.lang3.StringUtils;

/**
 * ��AnimalEnum.java��ʵ�������������ö����
 * 
 * @author yangbolin Sep 21, 2013 9:25:12 PM
 */
public enum AnimalEnum {
    /** ��ţ **/
    COW("COW"),
    /** ���� **/
    RABBIT("RABBIT"),
    /** è **/
    CAT("CAT");

    String value;

    AnimalEnum(String value){
        this.value = value;
    }

    /**
     * ����һ���ַ�������һ�������ö������
     * 
     * @param value
     * @return
     */
    public static AnimalEnum typeOf(String value) {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        for (AnimalEnum animal : AnimalEnum.values()) {
            if (animal.value.equalsIgnoreCase(value)) {
                return animal;
            }
        }
        return null;
    }
    
    public String getValue() {
        return value;
    }
}
