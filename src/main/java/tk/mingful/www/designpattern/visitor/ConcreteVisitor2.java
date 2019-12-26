package tk.mingful.www.designpattern.visitor;

/**
 * @author Acer
 * @version 1.0
 * @className ConcreteVisitor2
 * @description 具体访问者2：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * @create 2019-07-30 10:10
 **/
public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visit(ConcreteElement1 element) {
        System.out.println("具体访问者2访问-->" + element.operation());
    }

    @Override
    public void visit(ConcreteElement2 element) {
        System.out.println("具体访问者2访问-->" + element.operation());
    }
}
