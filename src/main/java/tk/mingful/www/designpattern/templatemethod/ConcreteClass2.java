package tk.mingful.www.designpattern.templatemethod;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteClass2
 * @description 具体子类：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 * @create 2019-07-26 9:47
 **/
public class ConcreteClass2 extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("抽象方法的实现2被调用...");
    }
}
