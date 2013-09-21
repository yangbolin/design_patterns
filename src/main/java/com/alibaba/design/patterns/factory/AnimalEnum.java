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
 * 类AnimalEnum.java的实现描述：动物的枚举类
 * 
 * @author yangbolin Sep 21, 2013 9:25:12 PM
 */
public enum AnimalEnum {
    /** 奶牛 **/
    COW("COW"),
    /** 兔子 **/
    RABBIT("RABBIT"),
    /** 猫 **/
    CAT("CAT");

    String value;

    AnimalEnum(String value){
        this.value = value;
    }

    /**
     * 根据一个字符串返回一个动物的枚举类型
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
