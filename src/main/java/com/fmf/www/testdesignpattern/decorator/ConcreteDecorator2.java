package com.fmf.www.testdesignpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteDecorator2
 * @description 具体装饰角色2：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * @create 2019-07-25 10:34
 **/
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        openFunction();
    }

    private void openFunction() {
        System.out.println("为具体构件角色增加额外的功能openFunction()");
    }
}
