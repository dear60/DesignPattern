package com.fmf.www.testdesignpattern.command;

/**
 * @author fmf
 * @version 1.0
 * @className Invoker
 * @description 调用者(请求者)角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 * @create 2019-07-26 14:55
 **/
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 例如：遥控器上有很多命令
     */
    public void call() {
        System.out.println("拿起遥控器......");
        command.execute();
    }
}
