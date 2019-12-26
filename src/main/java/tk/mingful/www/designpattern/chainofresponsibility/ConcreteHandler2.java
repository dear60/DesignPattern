package tk.mingful.www.designpattern.chainofresponsibility;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteHandler2
 * @description 具体处理者角色2：实现抽象处理者的处理方法，判断能否处理本次请求，
 * 如果可以处理请求则处理，否则将该请求转给它的后继者。
 * @create 2019-07-26 15:56
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(String request) {
        if ("不可回收垃圾".equals(request)) {
            System.out.println("我是不可回收垃圾处理器，我能处理不可回收垃圾");
        } else {
            System.out.println("我是不可回收垃圾处理器，我不能处理" + request + "，将留给下一级处理");
            handlerNextIsNull(request);
        }
    }
}
