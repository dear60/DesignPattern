package tk.mingful.www.designpattern.templatemethod;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteClass1
 * @description 具体子类1：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 * @create 2019-07-26 9:46
 **/
public class ConcreteClass1 extends AbstractClass{
    @Override
    public void abstractMethod() {
        System.out.println("抽象方法的实现1被调用...");
    }

    @Override
    public boolean hookMethod() {
        return false;
    }
}
