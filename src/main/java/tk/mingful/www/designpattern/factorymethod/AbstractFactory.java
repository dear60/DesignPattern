package tk.mingful.www.designpattern.factorymethod;

/**
 * @author fmf
 * @version 1.0
 * @className AbstractFactory
 * @description 抽象工厂：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * @create 2019-07-23 16:04
 **/
public interface AbstractFactory {

    AbstractProduct newProduct();
}
