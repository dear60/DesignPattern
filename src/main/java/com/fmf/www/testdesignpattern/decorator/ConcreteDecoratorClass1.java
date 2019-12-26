package com.fmf.www.testdesignpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteDecoratorClass1
 * @description ${DESCRIPTION}
 * @create 2019-10-10 16:17
 **/
public class ConcreteDecoratorClass1 extends DecoratorClass {


    public ConcreteDecoratorClass1(ComponentImpl impl) {
        super(impl);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}