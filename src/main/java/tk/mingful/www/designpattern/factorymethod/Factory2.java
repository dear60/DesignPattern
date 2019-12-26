package tk.mingful.www.designpattern.factorymethod;

/**
 * @author fmf
 * @version 1.0
 * @className Factory2
 * @description 具体工厂2：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * @create 2019-07-23 16:09
 **/
public class Factory2 implements AbstractFactory {

    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new Product2();
    }
}
