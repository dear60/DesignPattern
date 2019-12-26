package com.fmf.www.testdesignpattern.visitor;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteVisitor1
 * @description 具体访问者1：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * @create 2019-07-30 10:09
 **/
public class ConcreteVisitor1 implements Visitor{
    @Override
    public void visit(ConcreteElement1 element) {
        System.out.println("具体访问者1访问-->" + element.operation());
    }

    @Override
    public void visit(ConcreteElement2 element) {
        System.out.println("具体访问者1访问-->" + element.operation());
    }
}
