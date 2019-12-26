package com.fmf.www.testdesignpattern.observer;

/**
 * @author fmf
 * @version 1.0
 * @className Observer
 * @description 抽象观察者角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，
 * 当接到具体主题的更改通知时被调用。
 * @create 2019-07-29 14:38
 **/
public interface Observer {

    void response();
}
