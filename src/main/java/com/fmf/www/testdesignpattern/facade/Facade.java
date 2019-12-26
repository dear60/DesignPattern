package com.fmf.www.testdesignpattern.facade;

/**
 * @author fmf
 * @version 1.0
 * @className Facade
 * @description 外观角色：为多个子系统对外提供一个共同的接口。
 * @create 2019-07-25 11:16
 **/
public class Facade {

    private SubSystem1 subSystem1 = new SubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();

    public void method() {
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }

    public SubSystem1 getSubSystem1() {
        return subSystem1;
    }

    public SubSystem2 getSubSystem2() {
        return subSystem2;
    }

    public SubSystem3 getSubSystem3() {
        return subSystem3;
    }
}
