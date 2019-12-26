package com.fmf.www.testdesignpattern.flyweight;

/**
 * @author fmf
 * @version 1.0
 * @className FlyWeight
 * @description 抽象享元角色：所有的具体享元类的基类，为具体享元规范需要实现的公共接口，
 * 非享元的外部状态以参数的形式通过方法传入。
 * @create 2019-07-25 15:26
 **/
public interface FlyWeight {

    void support(UnSharedFlyWeight food);
}
