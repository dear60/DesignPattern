package com.fmf.www.testdesignpattern.prototype;

/**
 * @author fmf
 * @version 1.0
 * @className PrototypeTester
 * @description 原型模式测试类
 * @create 2019-07-23 14:58
 **/
public class PrototypeTester {

    public static void main(String[] args) throws CloneNotSupportedException {

        //简单复制
        Prototype prototype1 = new Prototype();
        Prototype prototype2 = prototype1.clone();
        System.out.println("prototype1==prototype2?"+(prototype1==prototype2));

        //带参数复制
        Citation citation1 = new Citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        citation1.display();
        Citation citation2 = citation1.clone();
        citation2.setName("李四");
        citation2.display();
    }
    /*
        定义：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或者相似的新对象。
        分类：浅克隆->Object类的clone方法，只要实现Cloneable接口
              深克隆->当克隆的对象含有非基本数据类型变量，会失效，除非该变量也实现克隆，级联
     */
}
