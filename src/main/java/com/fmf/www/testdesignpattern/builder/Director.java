package com.fmf.www.testdesignpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className Director
 * @description 指挥者：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 * @create 2019-07-24 10:09
 **/
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者规定了产品的构造顺序
     *
     * @return Product
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
