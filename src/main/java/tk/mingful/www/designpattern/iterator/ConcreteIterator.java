package tk.mingful.www.designpattern.iterator;

import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteIterator
 * @description 抽象迭代器角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * @create 2019-07-29 16:55
 **/
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
