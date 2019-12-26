package com.fmf.www.testdesignpattern.proxy;

/**
 * @author fmf
 * @version 1.0
 * @className RealSubject
 * @description 真实主题类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * @create 2019-07-24 11:06
 **/
public class RealSubject implements AbstractSubject{
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
