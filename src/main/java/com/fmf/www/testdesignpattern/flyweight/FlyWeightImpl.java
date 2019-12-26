package com.fmf.www.testdesignpattern.flyweight;

/**
 * @author Acer
 * @version 1.0
 * @className FlyWeightImpl
 * @description 具体享元角色：实现抽象享元角色中所规定的接口。
 * @create 2019-07-25 15:30
 **/
public class FlyWeightImpl implements FlyWeight{

    private String plateName;

    public FlyWeightImpl(String plateName) {
        this.plateName = plateName;
        System.out.println(plateName + "被创建！");
    }

    @Override
    public void support(UnSharedFlyWeight food) {
        System.out.print(plateName + "被调用，");
        System.out.println("食物信息是:" + food.getFoodName());
    }
}
