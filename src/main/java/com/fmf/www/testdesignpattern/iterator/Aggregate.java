package com.fmf.www.testdesignpattern.iterator;

/**
 * @author fmf
 * @version 1.0
 * @className Aggregate
 * @description 抽象聚合角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * @create 2019-07-29 16:51
 **/
public interface Aggregate {

    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
