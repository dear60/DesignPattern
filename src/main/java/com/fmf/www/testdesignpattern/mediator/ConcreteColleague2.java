package com.fmf.www.testdesignpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteColleague2
 * @description 具体同事类角色2：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @create 2019-07-29 16:02
 **/
public class ConcreteColleague2 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
