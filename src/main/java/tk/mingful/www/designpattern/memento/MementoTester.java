package tk.mingful.www.designpattern.memento;

/**
 * @author fmf
 * @version 1.0
 * @className MementoTester
 * @description 备忘录模式测试类
 * @create 2019-07-30 11:16
 **/
public class MementoTester {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("初始状态");
        System.out.println("现在状态:" + originator.getState());
        // 管理者把状态记录下来
        careTaker.setMemento(originator.createMemento());
        originator.setState("更新状态");
        System.out.println("现在状态:" + originator.getState());
        // 恢复
        originator.restoreMemento(careTaker.getMemento());
        System.out.println("现在状态:" + originator.getState());
    }

    /*
        定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态一边以后
        当需要时刻，将该对象恢复到原先保存的状态
        注意：又称快照模式，Cloneable自带备忘录模式
     */
}
