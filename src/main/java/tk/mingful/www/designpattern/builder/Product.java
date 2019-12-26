package tk.mingful.www.designpattern.builder;

/**
 * @author fmf
 * @version 1.0
 * @className Product
 * @description 产品角色：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件。
 * @create 2019-07-24 9:59
 **/
public class Product {

    private String partA;
    private String partB;
    private String partC;


    public void show() {
        System.out.println("Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}');
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
