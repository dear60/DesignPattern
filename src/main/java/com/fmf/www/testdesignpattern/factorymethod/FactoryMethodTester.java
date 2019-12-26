package com.fmf.www.testdesignpattern.factorymethod;

/**
 * @author fmf
 * @version 1.0
 * @className FactoryMethodTester
 * @description 工厂方法模式测试类
 * @create 2019-07-23 16:11
 **/
public class FactoryMethodTester {

    public static void main(String[] args) {

        AbstractFactory af1 = new Factory1();
        af1.newProduct().show();

        AbstractFactory af2 = new Factory2();
        af2.newProduct().show();
    }
    /*
        定义：定义一个创建产品对象额工厂接口，将产品对象的实际创建工作推迟到具体子工厂类中。
        缺点：每增加一个产品就要增加具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
     */
}
