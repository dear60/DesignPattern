package tk.mingful.www.designpattern.command;

/**
 * @author fmf
 * @version 1.0
 * @className Receiver
 * @description 实现(接收)者角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 * @create 2019-07-26 14:52
 **/
public class Receiver {

    /**
     * 例如：电视机
     */
    public void action() {
        System.out.println("已接收到打开电视命令，正在打开电视......");
    }
}
