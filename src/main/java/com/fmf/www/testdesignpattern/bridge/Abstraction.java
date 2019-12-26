package com.fmf.www.testdesignpattern.bridge;

/**
 * @author fmf
 * @version 1.0
 * @className Abstraction
 * @description 抽象化角色：定义抽象类，并包含一个对实现化对象的引用。
 * @create 2019-07-24 16:13
 **/
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
