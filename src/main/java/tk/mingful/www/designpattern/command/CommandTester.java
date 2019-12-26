package tk.mingful.www.designpattern.command;

/**
 * @author fmf
 * @version 1.0
 * @className CommandTester
 * @description 命令模式测试类
 * @create 2019-07-26 14:58
 **/
public class CommandTester {

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
    /*
        定义：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开，
        这样两者之间通过命令对象进行沟通，这样方便将命令对象进行存储，传递，调用，增加和管理。
        例子：有遥控和无摇控的风扇，真的不一样，一个要走过去按和一个在床上按，相形见绌。
        缺点：可能产生大量具体命令类。因为计对每一个具体操作都需要设计一个具体命令类，这将增加系统的复杂性。
        拓展：组合模式+命令模式=宏命令，备忘录模式+命令模式
     */
}
