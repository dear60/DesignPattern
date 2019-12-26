package com.fmf.www.testdesignpattern.strategy;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteStrategy2
 * @description 具体策略类2：实现了抽象策略定义的接口，提供具体的算法实现。
 * @create 2019-07-26 10:36
 **/
public class ConcreteStrategy2 implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("策略二");
    }
}
