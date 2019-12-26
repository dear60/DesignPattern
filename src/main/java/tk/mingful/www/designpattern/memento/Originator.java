package tk.mingful.www.designpattern.memento;

/**
 * @author fmf
 * @version 1.0
 * @className Originator
 * @description 发起人角色,记录当前时刻的内部状态信息，提供创建备忘录和
 * 恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * @create 2019-07-30 11:14
 **/
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
