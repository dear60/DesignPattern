package com.fmf.www.testdesignpattern.state;

/**
 * @author fmf
 * @version 1.0
 * @className State
 * @description 抽象状态角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * @create 2019-07-29 10:56
 **/
public abstract class State {

    private String name;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void handle(Context context);
}
