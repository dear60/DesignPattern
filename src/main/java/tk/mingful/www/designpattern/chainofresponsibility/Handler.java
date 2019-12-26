package tk.mingful.www.designpattern.chainofresponsibility;

/**
 * @author fmf
 * @version 1.0
 * @className Handler
 * @description 抽象处理角色：义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 * @create 2019-07-26 15:48
 **/
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handlerNextIsNull(String request) {
        if (getNext() == null) {
            System.out.println("该垃圾无法处理！");
        } else {
            next.handlerRequest(request);
        }
    }

    public abstract void handlerRequest(String request);
}
