package com.fmf.www.testdesignpattern.visitor;

/**
 * @author fmf
 * @version 1.0
 * @className Element
 * @description 抽象元素角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 * @create 2019-07-30 9:57
 **/
public interface Element {

    void accept(Visitor visitor);
}
