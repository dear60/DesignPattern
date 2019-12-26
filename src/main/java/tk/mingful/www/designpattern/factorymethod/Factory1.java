package tk.mingful.www.designpattern.factorymethod;

/**
 * @author fmf
 * @version 1.0
 * @className Factory1
 * @description 具体工厂1：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * @create 2019-07-23 16:07
 **/
public class Factory1 implements AbstractFactory{

    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new Product1();
    }
}
