package com.fmf.www.testdesignpattern.adapter;

/**
 * @author fmf
 * @version 1.0
 * @className AdaptorTester
 * @description 适配器模式测试类
 * @create 2019-07-24 15:02
 **/
public class AdapterTester {

    public static void main(String[] args) {

        //类适配器模式
        Target target = new ClassAdapter();
        target.request();

        //对象适配器模式
        Adaptee adaptee = new Adaptee();
        Target target1 = new ObjectAdapter(adaptee);
        target1.request();
    }
    /*
        定义：将一个类的接口转换成客户希望的另外一个接口，使得原本由子接口不兼容而不能一起工作的那些类能一起工作。
        注意：适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，且要求程序员了解现有组件
        库中的相关组件的内部结构，所以应用相对较少些。

     */
}
