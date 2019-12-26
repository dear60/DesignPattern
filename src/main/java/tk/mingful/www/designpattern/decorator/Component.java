package tk.mingful.www.designpattern.decorator;

/**
 * @author fmf
 * @version 1.0
 * @className Component
 * @description 抽象构件角色：义一个抽象接口以规范准备接收附加责任的对象。
 * @create 2019-07-25 10:28
 **/
public interface Component {

    /**
     * Component可以有多个实现，增强灵活性
     */
    void operation();
}
