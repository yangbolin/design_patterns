/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangbolin Oct 2, 2013 6:00:09 PM
 */
public class Context {
    private static Map<StrategyEnum, IStrategy> strategyMap = new ConcurrentHashMap<StrategyEnum, IStrategy>();
    
    static {
        strategyMap.put(StrategyEnum.CONCURRENT, new ConcurrentStrategy());
        strategyMap.put(StrategyEnum.SERIAL, new SerialStrategy());
    }
    
    public void doWork(StrategyEnum strategy) {
        if (strategy == null) {
            return;
        }
        
        IStrategy strategyInstance = strategyMap.get(strategy);
        if (strategyInstance != null) {
            strategyInstance.execute();
        }
    }
}
