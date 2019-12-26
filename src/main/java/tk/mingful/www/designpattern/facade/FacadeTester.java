package tk.mingful.www.designpattern.facade;

/**
 * @author Acer
 * @version 1.0
 * @className FacadeTester
 * @description 外观模式测试类
 * @create 2019-07-25 11:19
 **/
public class FacadeTester {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.method();
    }

    //可以将Facade抽象化，以一定程度上满足开闭原则

    /*
        定义：是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个
        统一的接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
        注意：当增加或移除子系统时需要修改外观类，违背了"开闭原则"，这时候可以引入抽象外观类
     */
}
