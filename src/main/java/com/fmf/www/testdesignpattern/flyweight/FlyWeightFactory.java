package com.fmf.www.testdesignpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fmf
 * @version 1.0
 * @className FlyWeightFactory
 * @description 享元工厂角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，
 * 享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 * @create 2019-07-25 15:36
 **/
public class FlyWeightFactory {

    private Map<String, FlyWeight> flyWeightMap = new HashMap<String, FlyWeight>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeightMap.get(key);
        if (flyWeight == null) {
            flyWeight = new FlyWeightImpl(key);
            flyWeightMap.put(key, flyWeight);
        } else {
            System.out.println("盘子" + key + "已经存在，被成功获取！");
        }
        return flyWeight;
    }
}
