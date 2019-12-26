package com.fmf.www.testdesignpattern.chainofresponsibility;

/**
 * @author fmf
 * @version 1.0
 * @className ChainTester
 * @description 责任链模式测试类
 * @create 2019-07-26 15:58
 **/
public class ChainTester {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        //还是要把角色链串起来，构成链表
        handler1.setNext(handler2);

        handler1.handlerRequest("可回收垃圾");

        handler1.handlerRequest("不可回收垃圾");

        handler1.handlerRequest("有毒垃圾");

        /*
            定义：为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象
            记住下一对象的引用而连成一条链，当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
            优点：避免使用众多的if-else，责任分担，单一职责原则，满足开闭
         */
    }
}
