package tk.mingful.www.designpattern.bridge;

/**
 * @author fmf
 * @version 1.0
 * @className RefinedAbstraction
 * @description 扩展抽象化角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * @create 2019-07-24 16:18
 **/
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.operationImpl();
    }
}
