package tk.mingful.www.designpattern.iterator;

/**
 * @author fmf
 * @version 1.0
 * @className Iterator
 * @description 具体迭代器角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * @create 2019-07-29 16:51
 **/
public interface Iterator {

    Object first();
    Object next();
    boolean hasNext();
}
