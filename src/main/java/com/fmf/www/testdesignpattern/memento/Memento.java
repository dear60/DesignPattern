package com.fmf.www.testdesignpattern.memento;

/**
 * @author fmf
 * @version 1.0
 * @className Memento
 * @description 备忘录角色，负责存储发起人的内部状态，
 * 在需要的时候提供这些内部状态给发起人(记录快照)
 * @create 2019-07-30 11:13
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
