package tk.mingful.www.designpattern.bridge;

/**
 * @author fmf
 * @version 1.0
 * @className BridgeTester
 * @description 桥接模式测试类
 * @create 2019-07-24 16:21
 **/
public class BridgeTester {
    public static void main(String[] args) {
        // 手机品质
        Implementor implementor = new ConcreteImplementor();
        // 手机品牌
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
    /*
        定义：将抽象与实现分离，使他们可以独立变化，它时组合关系代替继承关系，从而实现抽象和实现这两个可变维度的耦合度
        扩展：当桥接模式的实现化角色的接口与现有类的接口不一致时，可以在二者之间定义一个适配器将二者连接起来。
     */
    /**
     * 就好比手机有品牌(Abstraction)和高端低端(Implementor)两个维度，用继承体系表示的话会有两个弊端
     * 1.此时如果要增加一种手机品牌，就还要为该品牌增加所有的高低端子类
     * 2.如果还要增加中端类别，就需要为所有品牌的手机增加新的中端类
     *
     * 也就是说，目前这个继承体系的类分为两种类型，一种是手机品牌类，一种是品质类；不管增加哪种类型的类，
     * 都会导致要同时增加多个类，这样下去会导致继承体系过于庞大。
     *
     * 解决办法：
     * 将一个继承体系中的多种类型的类分成单独的继承体系，然后使用聚合/组合将这两个继承体系连接在一起。
     * 这样当需要增加类时，由于新的类属于一个单独的继承体系，因此只需要在某一个继承体系中增加一个子类即可，从而避免了继承体系过于庞大的问题。
     * 而这种将一个继承体系分成两个用组合/聚合方式连接的继承体系的方式就称为“合成/聚合复用原则”。
     */
}
