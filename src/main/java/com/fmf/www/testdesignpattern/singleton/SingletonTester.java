package com.fmf.www.testdesignpattern.singleton;

/**
 * @author fmf
 * @version 1.0
 * @className SingletonTester
 * @description 单例模式测试类
 * @create 2019-07-23 14:19
 **/
public class SingletonTester {

    public static void main(String[] args) {

        //懒汉式单例
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("只产生了一个懒汉式单例对象");
        }

        ///饿汉式单例
        HungrySingleton instance3 = HungrySingleton.getInstance();
        HungrySingleton instance4 = HungrySingleton.getInstance();

        if (instance3 == instance4) {
            System.out.println("只产生了一个饿汉式单例对象");
        }
    }
    /*
        定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
     */
}
