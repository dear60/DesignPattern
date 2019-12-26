package tk.mingful.www.designpattern.singleton;

/**
 * @author fmf
 * @version 1.0
 * @className HungrySingleton
 * @description 饿汉式单例
 * @create 2019-07-23 14:24
 **/
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
       return INSTANCE;
    }
    /**
     * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题
     */
}
