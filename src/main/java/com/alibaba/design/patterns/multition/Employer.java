/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.multition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类Employer.java的实现描述：雇员
 * 
 * @author yangbolin Oct 4, 2013 9:27:14 AM
 */
public class Employer {

    private static final int     MAX_EMPLOYER_NUM = 10;
    private int                  index;
    public static List<Employer> employerList     = new ArrayList<Employer>();
    public static AtomicInteger  count = new AtomicInteger();

    public Employer(int index){
        this.index = index;
        count.addAndGet(1);
    }

    public static Employer next() {
        Employer employer = null;
        // 随机选择一个，创建的雇员数目不能超过10个
        if (count.get() >= MAX_EMPLOYER_NUM) {
            Random random = new Random(47);
            int index = random.nextInt(employerList.size());
            employer = employerList.get(index);
        } else {
            // 重新创建一个新的的雇员
            employer = new Employer(count.get());
        }

        if (employer != null) {
            employerList.add(employer);
        }
        return employer;
    }

    @Override
    public String toString() {
        return "Employer is " + this.index;
    }
}
