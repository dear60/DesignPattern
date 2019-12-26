package com.fmf.www.testdesignpattern.observer;

/**
 * @author Acer
 * @version 1.0
 * @className ConcreteObserver2
 * @description 具体观察者角色2：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 * @create 2019-07-29 14:47
 **/
public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
