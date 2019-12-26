package com.fmf.www.testdesignpattern.visitor;

/**
 * @author fmf
 * @version 1.0
 * @className VisitorTester
 * @description 访问者模式测试类
 * @create 2019-07-30 10:14
 **/
public class VisitorTester {

    public static void main(String[] args) {

        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElement1());
        os.add(new ConcreteElement2());
        Visitor visitor1 = new ConcreteVisitor1();
        os.accept(visitor1);
        System.out.println("------------------------");
        Visitor visitor2 = new ConcreteVisitor2();
        os.accept(visitor2);
    }
    /*
        定义：将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，使其在不改变
        数据结构的前提下可以添加作用于这些元素的新的操作，为数据结构中的每个元素提供多种访问方式
        优点：扩展性，复用性，灵活性好，满足单一职责原则
        缺点：不满足开闭原则，破坏封装，违法依赖导致原则
     */
}
