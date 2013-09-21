/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.design.patterns.factory.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.design.patterns.factory.AnimalEnum;
import com.alibaba.design.patterns.factory.Cat;
import com.alibaba.design.patterns.factory.Cow;
import com.alibaba.design.patterns.factory.IAnimal;
import com.alibaba.design.patterns.factory.Rabbit;

/**
 * <pre>
 * ��SimpleAnimalFactory.java��ʵ����������������Ĺ���
 * 
 * �򵥹���ģʽ��˼��ܼ򵥣�֮�����ǹ�������Ϊ�����Ծ͸��ݲ�ͬ��������������ͬ�Ķ�������
 * �����ǲ��ϱ仯�ģ���Ӧ�Ĳ���Ҳ���ǲ��ϱ仯�ģ����ǵ����Ҫ����Ӧ���ߵı仯��ͬʱҲҪ
 * ��֤�߼��ϵ������򵥣�����ά����
 * 
 * ��������ļ򵥹��������µĲ��㣺
 * 1.�ڴ��������ʱ����ڸ��ӵ��߼��жϣ�Ҫ�Ǵ������и��ӵ��߼��жϣ�һ��Ҫ����һ�����
 * ��Ʋ��ܽ��߼��򻯣�����ֱ�Ӱ�ö�ٺ����Ȩ�޶����ƹ���������ʹ��Class.forName()
 * 2.���������������ߣ��������һ��̱������������ϵͳ����̱����˵���˾��Ǹ���������֮��
 * �Ĺ�ϵ��ϵĹ��ڽ���
 * </pre>
 * 
 * @author yangbolin Sep 21, 2013 9:23:38 PM
 */
public class SimpleAnimalFactory {

    private static Map<AnimalEnum, IAnimal> cachedAnimalMap = new ConcurrentHashMap<AnimalEnum, IAnimal>();

    /**
     * �����������Ͳ���ö����ķ�Χ֮�ڣ�����NULL�����Կͻ�����Ҫע��NPE���ж�
     * 
     * @param animal
     * @return
     */
    public static IAnimal createAnimal(AnimalEnum animal) {
        IAnimal animalInstance = cachedAnimalMap.get(animal);
        if (animalInstance != null) {
            return animalInstance;
        }
        if (animal.compareTo(AnimalEnum.CAT) == 0) {
            animalInstance = new Cat();
        } else if (animal.compareTo(AnimalEnum.COW) == 0) {
            animalInstance = new Cow();
        } else if (animal.compareTo(AnimalEnum.RABBIT) == 0) {
            animalInstance = new Rabbit();
        }

        if (animalInstance != null) {
            cachedAnimalMap.put(animal, animalInstance);
        }
        return animalInstance;
    }
}
