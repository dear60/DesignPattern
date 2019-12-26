package tk.mingful.www.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className ObjectStructure
 * @description 对象结构角色：是一个包含元素角色的容器，提供让访问者对象
 * 遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。
 * @create 2019-07-30 10:11
 **/
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
