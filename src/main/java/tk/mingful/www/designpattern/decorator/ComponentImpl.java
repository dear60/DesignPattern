package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className ComponentImpl
 * @description 具体构建角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * @create 2019-07-25 10:29
 **/
public class ComponentImpl implements Component {


    public ComponentImpl() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
