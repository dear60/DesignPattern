package com.fmf.www.testdesignpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteColleague1
 * @description 具体同事类角色1：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @create 2019-07-29 16:00
 **/
public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
