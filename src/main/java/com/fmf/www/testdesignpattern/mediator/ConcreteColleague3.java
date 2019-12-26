package com.fmf.www.testdesignpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteColleague3
 * @description ${DESCRIPTION}
 * @create 2019-10-11 9:45
 **/
public class ConcreteColleague3 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类3发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
