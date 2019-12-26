package tk.mingful.www.designpattern.prototype;

/**
 * @author fmf
 * @version 1.0
 * @className Prototype
 * @description 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * @create 2019-07-23 14:54
 **/
public class Prototype implements Cloneable{

    Prototype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Prototype) super.clone();
    }
}
