/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类ClientBase.java的实现描述：设计模式的客户端积累，主要负责执行一些测试的CASE 
 * @author yangbolin Sep 20, 2013 10:07:12 AM
 */
public abstract class ClientBase {
    protected void doExecute() {
        Class<?> clazz = this.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            Patterns patterns = method.getAnnotation(Patterns.class);
            if (patterns != null) {
                try {
                    method.invoke(this);
                } catch (IllegalAccessException ex) {
                    System.out.println(ex);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex);
                } catch (InvocationTargetException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
