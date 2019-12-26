package tk.mingful.www.designpattern.strategy;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteStrategy1
 * @description 具体策略类1：实现了抽象策略定义的接口，提供具体的算法实现。
 * @create 2019-07-26 10:35
 **/
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("策略一");
    }
}
