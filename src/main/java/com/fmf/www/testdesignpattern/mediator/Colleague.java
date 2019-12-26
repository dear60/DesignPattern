package com.fmf.www.testdesignpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className Colleague
 * @description 抽象同事角色：定义同事类的接口，保存中介者对象，提供同事对象
 * 交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * @create 2019-07-29 15:52
 **/
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
