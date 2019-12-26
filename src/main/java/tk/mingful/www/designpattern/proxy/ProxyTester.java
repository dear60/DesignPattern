package tk.mingful.www.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author fmf
 * @version 1.0
 * @className ProxyTester
 * @description 代理模式测试类
 * @create 2019-07-24 11:09
 **/
public class ProxyTester {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //一般代理
        AbstractSubject subject1 = new ProxySubject();
        subject1.request();

        //动态代理
        AbstractSubject subject2;
        InvocationHandler handler;
        handler = new DynamicProxy(new RealSubject());
        // 生成一个$Proxy0.class字节码文件，通过此去代理真实主题
        subject2 = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, handler);
        subject2.request();
    }
    /*
        定义：由于某些原因需要给某对象提供一个代理以控制该对象的访问。
        这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象的中介。
        缺点：真实主题与代理一一对应，增加真实主题，代理类也得增加；设计代理以前真实主题必须事先存在，不太灵活，
        扩展：动态代理解决上述缺点。
     */

    /*
        1.JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。
        2.JDK 和 CGLib 都是在运行期生成字节码，JDK 是直接写 Class 字节码，CGLib 使用 ASM框架写 Class 字节码，Cglib 代理实现更复杂，生成代理类比 JDK 效率低。
        3.JDK 调用代理方法，是通过反射机制调用，CGLib 是通过 FastClass 机制直接调用方法，CGLib 执行效率更高。
     */
}
