package tk.mingful.www.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author fmf
 * @version 1.0
 * @className DynamicProxy
 * @description 动态代理类
 * @create 2019-07-24 11:12
 **/
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("访问真实主题之前的预处理。");
        method.invoke(object, args);
        System.out.println("访问真实主题之后的后续处理。");
        return null;
    }
}
