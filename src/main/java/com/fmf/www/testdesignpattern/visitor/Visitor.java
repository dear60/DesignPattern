package com.fmf.www.testdesignpattern.visitor;

/**
 * @author fmf
 * @version 1.0
 * @className Visitor
 * @description 抽象访问者角色：定义一个访问具体元素的接口，为每个具体元素类
 * 对应一个访问操作 visit() ，该操作中的参数类型标识了被访问的具体元素。
 * @create 2019-07-30 9:57
 **/
public interface Visitor {

    /**
     * 违反了依赖倒置原则，抽象类依赖了具体类
     */
    void visit(ConcreteElement1 element);

    void visit(ConcreteElement2 element);
}
