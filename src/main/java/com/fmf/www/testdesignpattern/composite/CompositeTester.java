package com.fmf.www.testdesignpattern.composite;

/**
 * @author fmf
 * @version 1.0
 * @className CompositeTester
 * @description 组合模式测试类
 * @create 2019-07-25 17:02
 **/
public class CompositeTester {

    public static void main(String[] args) {
        Component c1 = new Composite();
        Component c2 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c1.add(leaf1);
        c1.add(c2);
        c2.add(leaf2);
        c2.add(leaf3);
        c1.operation();

    }

    //c1{树叶1，c2{树叶2，树叶3}}

    /*
        定义：它是一种将对象组合成树状得层次结构得模式，用来表示"部分-整体"得关系，
        是用户对单个对象和组合对象具有一致的访问性。
        分类：透明式和安全式
     */
}
