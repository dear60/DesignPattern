package tk.mingful.www.designpattern.state;

/**
 * @author fmf
 * @version 1.0
 * @className StateTester
 * @description 状态模式测试类
 * @create 2019-07-29 11:05
 **/
public class StateTester {

    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }

    /*
        定义：对有状态的对象，把复杂的"逻辑判断"提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
        例子：多线程的状态转换程序，不同状态时的操作不同.
        注意：有时会出现多个环境类共享一组状态，可采用 享元模式+状态模式
     */
}
