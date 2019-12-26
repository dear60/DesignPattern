package tk.mingful.www.designpattern.observer;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteObserver1
 * @description 具体观察者角色1：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 * @create 2019-07-29 14:46
 **/
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
