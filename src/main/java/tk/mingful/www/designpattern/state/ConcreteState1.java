package tk.mingful.www.designpattern.state;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteState1
 * @description 具体状态角色1：实现抽象状态所对应的行为。
 * @create 2019-07-29 11:00
 **/
public class ConcreteState1 extends State {

    public ConcreteState1(String name) {
        super(name);
    }

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是:" + context.getState().getName());
        context.setState(new ConcreteState2("2"));
    }
}
