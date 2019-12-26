package tk.mingful.www.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className Subject
 * @description 抽象主题角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、
 * 删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * @create 2019-07-29 14:39
 **/
public abstract class Subject {

    protected List<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
