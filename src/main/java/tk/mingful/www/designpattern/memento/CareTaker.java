package tk.mingful.www.designpattern.memento;

/**
 * @author fmf
 * @version 1.0
 * @className CareTaker
 * @description 管理者角色，对备忘录进行管理，提供保存与
 * 获取备忘录的功能，但其不能对备忘录的内容进行访问与修改
 * @create 2019-07-30 11:12
 **/
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
