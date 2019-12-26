package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteDecoratorClass2
 * @description ${DESCRIPTION}
 * @create 2019-10-10 16:19
 **/
public class ConcreteDecoratorClass2 extends DecoratorClass {

    public ConcreteDecoratorClass2(ComponentImpl impl) {
        super(impl);
    }

    @Override
    public void operation() {
        super.operation();
        openFunction();
    }

    private void openFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
