package tk.mingful.www.designpattern.factorymethod;

/**
 * @author fmf
 * @version 1.0
 * @className Product2
 * @description 具体产品2：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 * @create 2019-07-23 16:10
 **/
public class Product2 implements AbstractProduct{
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
