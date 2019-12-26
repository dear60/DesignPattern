package tk.mingful.www.designpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className AbstractBuilder
 * @description 抽象建造者：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 * @create 2019-07-24 10:03
 **/
public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
