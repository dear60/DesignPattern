package tk.mingful.www.designpattern.adapter;

/**
 * @author fmf
 * @version 1.0
 * @className ObjectAdapter
 * @description 对象适配器：它是一个转换器，通过引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * @create 2019-07-24 15:04
 **/
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
