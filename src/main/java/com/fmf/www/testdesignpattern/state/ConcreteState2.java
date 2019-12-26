package com.fmf.www.testdesignpattern.state;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteState2
 * @description 具体状态角色2：实现抽象状态所对应的行为。
 * @create 2019-07-29 11:03
 **/
public class ConcreteState2 extends State {

    public ConcreteState2(String name) {
        super(name);
    }

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是:" + context.getState().getName());
        context.setState(new ConcreteState1("1"));
    }
}
