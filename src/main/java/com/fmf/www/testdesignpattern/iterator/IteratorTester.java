package com.fmf.www.testdesignpattern.iterator;

import java.util.Date;

/**
 * @author fmf
 * @version 1.0
 * @className IteratorTester
 * @description 迭代器模式测试类
 * @create 2019-07-29 17:03
 **/
public class IteratorTester {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add(new Date());
        aggregate.add("123");
        aggregate.add(123);
        System.out.print("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.print(object.toString() + "\t");
        }
        Object object = iterator.first();
        System.out.println("\nFirst：" + object.toString());
    }
    /*
        定义：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
        注意：由于聚合和迭代器的关系非常密切， 所以大多数语言在实现聚合类时都提供了迭代器类，
        因此大多数情况下使用语言中已有的聚合类迭代器就以及足够了
     */
}
