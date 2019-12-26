package tk.mingful.www.designpattern.flyweight;

/**
 * @author fmf
 * @version 1.0
 * @className UnSharedFlyWeight
 * @description 非享元角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * @create 2019-07-25 15:28
 **/
public class UnSharedFlyWeight {

    private String foodName;

    public UnSharedFlyWeight(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
