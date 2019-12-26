package com.fmf.www.testdesignpattern.visitor;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteElement1
 * @description 具体元素角色1：实现抽象元素角色提供的 accept() 操作，其方法体通常
 * 都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 * @create 2019-07-30 9:58
 **/
public class ConcreteElement1 implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "具体元素1的操作。";
    }
}
