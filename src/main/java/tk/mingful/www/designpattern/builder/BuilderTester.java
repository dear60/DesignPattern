package tk.mingful.www.designpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className BuilderTester
 * @description 建造者模式测试类
 * @create 2019-07-24 10:12
 **/
public class BuilderTester {

    public static void main(String[] args) {

        //普通产品
        AbstractBuilder builder1 = new Builder1();
        Director director1 = new Director(builder1);
        director1.construct().show();

        //特殊产品
        AbstractBuilder builder2 = new Builder2();
        Director director2 = new Director(builder2);
        director2.construct().show();
    }
    /*
        定义：指将一个复杂对象的构造与它的表示分离，是同样的构建过程可以创建不同的表示。
        它是将一个复杂的对象分解为多个简单的对象，它是将一个复杂分解为多个简单的对象，然后
        一步步构建而成。它将变与不变分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
        例子：房子(Product)的构建步骤：打地基(PartA)->切砖(PartB)->装修(PartC).
              工程师(Director)可以采用上述步骤，也可自行定义，但最终把房子交给客户，而不是工人直接给客户
              工人队(Builder)可以有多个，每个队建出来的房子不一样，由工程师带领。
     */
}
