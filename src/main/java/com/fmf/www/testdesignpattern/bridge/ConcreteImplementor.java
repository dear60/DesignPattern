package com.fmf.www.testdesignpattern.bridge;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteImplementor
 * @description 具体实现化角色：给出实现化角色接口的具体实现。
 * @create 2019-07-24 16:15
 **/
public class ConcreteImplementor implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
