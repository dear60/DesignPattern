package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteDecorator1
 * @description 具体装饰角色1：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * @create 2019-07-25 10:32
 **/
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
