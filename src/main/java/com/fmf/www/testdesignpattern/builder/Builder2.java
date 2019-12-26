package com.fmf.www.testdesignpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className Builder2
 * @description 具体建造者2：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * @create 2019-07-24 10:08
 **/
public class Builder2 extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("建造特殊 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造特殊 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造特殊 PartC");
    }
}
