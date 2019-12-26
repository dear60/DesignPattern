package com.fmf.www.testdesignpattern.templatemethod;

/**
 * @author fmf
 * @version 1.0
 * @className TemplateMethodTester
 * @description 模板方法模式测试类
 * @create 2019-07-26 9:48
 **/
public class TemplateMethodTester {

    public static void main(String[] args) {


        //钩子方法返回false
        AbstractClass abstractClass1 = new ConcreteClass1();
        abstractClass1.templateMethod();

        System.out.println("==================================");

        //钩子方法放回true
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();

        /*
            定义：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类
            可以不该按该算法结构的情况下重新定义该算法的某些特定步骤。
            注意：该模式属于类行为模式，即通过继承关系实现
            正确的使用钩子可以使得子类控制父类的行为
         */
    }
}
