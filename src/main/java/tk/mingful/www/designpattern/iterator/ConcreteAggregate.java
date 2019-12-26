package tk.mingful.www.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteAggregate
 * @description 具体聚合角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * @create 2019-07-29 16:53
 **/
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object object) {
        if (!list.contains(object)) {
            list.add(object);
        }
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
