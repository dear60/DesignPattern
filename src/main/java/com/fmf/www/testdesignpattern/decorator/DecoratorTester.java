package com.fmf.www.testdesignpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className DecoratorTester
 * @description 装饰模式测试类
 * @create 2019-07-25 10:35
 **/
public class DecoratorTester {

    public static void main(String[] args) {

        Component component = new ComponentImpl();

        Decorator decorator = new ConcreteDecorator1(component);
        decorator.operation();

        //装饰一 + 装饰二，这就是与继承不同的地方，同时还要考虑和动态代理不同的地方，虽然结构一样
        Decorator decorator1 = new ConcreteDecorator2(decorator);
        decorator1.operation();

        System.out.println("================================================");

        DecoratorClass class1 = new ConcreteDecoratorClass1(new ComponentImpl());
        class1.operation();

        DecoratorClass class2 = new ConcreteDecoratorClass2(class1);
        class2.operation();

        /*
            定义：指在不该按现有对象结构的情况下，动态地给该对象增加些职责。
            注意：可以创建不同行为的组合
            扩展：1.没有抽象构件时，抽象装饰继承具体构建
                  2.只有一个具体装饰时，抽象装饰与具体装饰合并
                  3.与动态代理的区别：代理强调控制，透明访问，而装饰强调增强，自由构建。
         */
    }
}
