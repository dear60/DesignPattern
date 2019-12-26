package tk.mingful.www.designpattern.flyweight;

/**
 * @author fmf
 * @version 1.0
 * @className FlyWeightTester
 * @description 享元模式测试类
 * @create 2019-07-25 15:41
 **/
public class FlyWeightTester {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight1 = factory.getFlyWeight("汤盆");
        FlyWeight flyWeight2 = factory.getFlyWeight("汤盆");
        FlyWeight flyWeight3 = factory.getFlyWeight("圆盘");
        FlyWeight flyWeight4 = factory.getFlyWeight("圆盘");
        FlyWeight flyWeight5 = factory.getFlyWeight("方盘");

        flyWeight1.support(new UnSharedFlyWeight("鱼头汤"));
        flyWeight2.support(new UnSharedFlyWeight("牛肉汤"));
        flyWeight3.support(new UnSharedFlyWeight("清炒青菜"));
        flyWeight4.support(new UnSharedFlyWeight("地三鲜"));
        flyWeight5.support(new UnSharedFlyWeight("红烧肉"));
    }

    /*
        定义：运用共享技术来有效地支持大量细粒度对象的复用。
        注意：享元模式分为内部状态和外部状态，即一个整体分为可复用和不可复用
     */
}
