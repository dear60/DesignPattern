package tk.mingful.www.designpattern.mediator;

/**
 * @author fmf
 * @version 1.0
 * @className MediatorTester
 * @description 中介者模式测试类
 * @create 2019-07-29 16:03
 **/
public class MediatorTester {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1, colleague2, colleague3;
        colleague1 = new ConcreteColleague1();
        colleague2 = new ConcreteColleague2();
        colleague3 = new ConcreteColleague3();
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);
        colleague1.send();
        System.out.println("-------------");
        colleague2.send();
    }
    /*
        定义：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
        例子：qq聊天中的服务器，
        注意：在实际开发中，通常采用简化版中介者模式，方法如下
        （1）不定义中介者接口，把具体中介者对象实现为单例
        （2）同事对象不持有中介者，而是在需要的时候直接获取中介者对象调用
     */
}
