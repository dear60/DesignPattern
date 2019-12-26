package tk.mingful.www.designpattern.command;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteCommand
 * @description 具体命令角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 * @create 2019-07-26 14:51
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        System.out.println("按下了打开电视按钮......");
        receiver.action();
    }
}
