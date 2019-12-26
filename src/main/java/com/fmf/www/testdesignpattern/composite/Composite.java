package com.fmf.www.testdesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className Composite
 * @description 树枝构件角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，
 * 它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 * @create 2019-07-25 16:59
 **/
public class Composite implements Component {

    private List<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChildren(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}
