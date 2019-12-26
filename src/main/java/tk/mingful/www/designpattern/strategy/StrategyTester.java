package tk.mingful.www.designpattern.strategy;

/**
 * @author fmf
 * @version 1.0
 * @className StrategyTester
 * @description 策略模式测试类
 * @create 2019-07-26 10:38
 **/
public class StrategyTester {

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy1 = new ConcreteStrategy1();
        context.setStrategy(strategy1);
        context.strategyMethod();
        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.strategyMethod();
    }
    /*
        定义：该模式d定义了一系列算法，并将每个算法封装起来，是他们可以相互替换，且算法的变化不会影响使用算法的客户。
        优点：避免使用多重条件语句
        扩展：当策略很多时，可采用工厂模式+策略模式
     */
}
