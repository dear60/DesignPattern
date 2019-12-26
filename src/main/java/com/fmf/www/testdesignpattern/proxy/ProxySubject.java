package com.fmf.www.testdesignpattern.proxy;

/**
 * @author fmf
 * @version 1.0
 * @className ProxySubject
 * @description 代理类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 * @create 2019-07-24 11:07
 **/
public class ProxySubject implements AbstractSubject {

    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        postRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
