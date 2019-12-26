package tk.mingful.www.designpattern.interpreter;

/**
 * @author fmf
 * @version 1.0
 * @className InterpreterTester
 * @description 解释器模式测试类
 * @create 2019-07-30 15:58
 **/
public class InterpreterTester {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.operation("厦门的老人");
        bus.operation("厦门的年轻人");
        bus.operation("泉州的妇女");
        bus.operation("泉州的儿童");
        bus.operation("福州的儿童");
    }
    /*
        定义：给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。
        注意：属于类行为型模式，比较少用
     */
}
