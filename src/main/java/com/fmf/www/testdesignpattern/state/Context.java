package com.fmf.www.testdesignpattern.state;

/**
 * @author fmf
 * @version 1.0
 * @className Context
 * @description 环境角色：也称为上下文，它定义了客户感兴趣的接口，
 * 维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * @create 2019-07-29 10:56
 **/
public class Context {

    private State state;

    public Context() {
        this.state = new ConcreteState1("1");
    }

    public void handle(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
