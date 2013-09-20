/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * ��Patterns.java��ʵ���������ڿͻ���ִ�����ģʽʱ������Ӧ�ķ���дPatternsע��
 * ��ʾ��������ڿͻ���ִ��ʱ�ᱻ����
 * </pre>
 * @author yangbolin Sep 20, 2013 10:12:10 AM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Patterns {
}
