package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className DecoratorClass
 * @description ${DESCRIPTION}
 * @create 2019-10-10 16:15
 **/
public class DecoratorClass extends ComponentImpl{

    private ComponentImpl impl;

    public DecoratorClass(ComponentImpl impl){
        this.impl = impl;
    }

    @Override
    public void operation() {
        impl.operation();
    }
}
