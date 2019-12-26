package tk.mingful.www.designpattern.strategy;

/**
 * @author fmf
 * @version 1.0
 * @className Strategy
 * @description 抽象策略类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，
 * 环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * @create 2019-07-26 10:33
 **/
public interface Strategy {

    void strategyMethod();
}
