/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.multition;

/**
 * <pre>
 * 类Empolyee.java的实现描述：雇主 
 * 关于多例的设计模式可能并不是很常见，多例设计模式和单例设计模式是对立的
 * 单例要求同一类型的实例有且只能有一个，多例要求同一类型的实例可以多个，在
 * Spring框架中经常出现单例bean和多例bean，对应的就是这里的单例设计模式
 * 和多例设计模式，不过多例bean在Spring中对应的是原型bean,原型bean在Spring
 * 容器中每次获取的时候都是重新创建一个
 * </pre>
 * @author yangbolin Oct 4, 2013 9:23:17 AM
 */
public class Employee {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Employer.next());
        }
    }
}
