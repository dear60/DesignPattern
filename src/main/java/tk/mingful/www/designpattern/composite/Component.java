package tk.mingful.www.designpattern.composite;

/**
 * @author fmf
 * @version 1.0
 * @className Component
 * @description 抽象构件角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。
 * 在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
 * @create 2019-07-25 16:56
 **/
public interface Component {

    /**
     * 透明式
     */
    void add(Component component);

    void remove(Component component);

    Component getChildren(int i);

    void operation();

}
