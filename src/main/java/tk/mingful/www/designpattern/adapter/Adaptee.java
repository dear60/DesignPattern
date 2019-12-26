package tk.mingful.www.designpattern.adapter;

/**
 * @author fmf
 * @version 1.0
 * @className Adaptee
 * @description 适配者类：它是被访问和适配的现存组件库中的组件接口。
 * @create 2019-07-24 14:59
 **/
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
