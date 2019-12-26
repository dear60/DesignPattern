package tk.mingful.www.designpattern.observer;

/**
 * @author fmf
 * @version 1.0
 * @className ObserverTester
 * @description 观察者模式测试类
 * @create 2019-07-29 14:48
 **/
public class ObserverTester {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.add(observer1);
        subject.add(observer2);

        subject.notifyObserver();
    }

    /*
        定义：指多个对象之间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动更新。
        例子：发布--订阅，模型--视图
        注意：Java中的实现->Observable和Observer，一定会有观察者注册进主题的过程
     */
}
