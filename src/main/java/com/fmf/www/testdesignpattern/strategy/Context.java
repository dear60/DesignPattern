package com.fmf.www.testdesignpattern.strategy;

/**
 * @author fmf
 * @version 1.0
 * @className Context
 * @description 环境类：持有一个策略类的引用，最终给客户端调用。
 * @create 2019-07-26 10:36
 **/
public class Context {

    private Strategy strategy;

    public void strategyMethod() {
        strategy.strategyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
