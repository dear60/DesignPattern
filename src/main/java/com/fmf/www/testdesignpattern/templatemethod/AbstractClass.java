package com.fmf.www.testdesignpattern.templatemethod;

/**
 * @author fmf
 * @version 1.0
 * @className AbstractClass
 * @description 抽象类：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 * （模板方法+基本方法（抽象+具体+钩子））
 * @create 2019-07-26 9:41
 **/
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        if (hookMethod()) {
            specificMethod();
        }
        abstractMethod();
    }

    /**
     * 抽象方法，供子类实现，满足开闭原则
     */
    public abstract void abstractMethod();

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 钩子方法，子类重写可以控制父类的行为
     * @return boolean
     */
    public boolean hookMethod() {
        return true;
    }




}
