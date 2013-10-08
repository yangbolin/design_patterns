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
 * ��Employer.java��ʵ����������Ա
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
        // ���ѡ��һ���������Ĺ�Ա��Ŀ���ܳ���10��
        if (count.get() >= MAX_EMPLOYER_NUM) {
            Random random = new Random(47);
            int index = random.nextInt(employerList.size());
            employer = employerList.get(index);
        } else {
            // ���´���һ���µĵĹ�Ա
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
