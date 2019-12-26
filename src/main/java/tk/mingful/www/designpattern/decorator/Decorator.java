package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className Decorator
 * @description 抽象装饰角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * @create 2019-07-25 10:31
 **/
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
