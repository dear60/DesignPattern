package com.fmf.www.testdesignpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className Mediator
 * @description 抽象中介者角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * @create 2019-07-29 15:51
 **/
public abstract class Mediator {

    /**
     * 注册进中介者里
     * @param colleague 同事对象
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param colleague 同事对象
     */
    public abstract void relay(Colleague colleague);
}
