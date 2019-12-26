package tk.mingful.www.designpattern.adapter;

/**
 * @author fmf
 * @version 1.0
 * @className ClassAdapter
 * @description 类适配器：它是一个转换器，通过继承适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * @create 2019-07-24 15:01
 **/
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
