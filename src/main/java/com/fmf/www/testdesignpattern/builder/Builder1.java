package com.fmf.www.testdesignpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className Builder1
 * @description 具体建造者1：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * @create 2019-07-24 10:05
 **/
public class Builder1 extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("建造普通 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造普通 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造普通 PartC");
    }
}
