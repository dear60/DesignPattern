package tk.mingful.www.designpattern.observer;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteSubject
 * @description 具体主题角色：也叫具体目标类，它实现抽象目标中的通知方法，
 * 当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 * @create 2019-07-29 14:44
 **/
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Observer observer : observers) {
            observer.response();
        }
    }
}
