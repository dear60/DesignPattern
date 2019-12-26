package com.fmf.www.testdesignpattern.interpreter;

/**
 * @author fmf
 * @version 1.0
 * @className Context
 * @description 环境角色：通常包含各个解释器需要的数据或是公共的功能，
 * 一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 * @create 2019-07-30 14:53
 **/
public class Context {

    private String[] citys = {"厦门","泉州"};
    private String[] persons = {"老人","妇女","儿童"};
    private AbstractExpression expression;
    public Context() {
        AbstractExpression city = new TerminalExpression(citys);
        AbstractExpression person = new TerminalExpression(persons);
        expression = new NonTerminalExpression(city, person);
    }

    public void operation(String info) {
        boolean ok = expression.interpret(info);
        if (ok) {
            System.out.println("您是 " + info + ",您本次乘车免费！");
        } else {
            System.out.println(info + "您不是免费人员，本次扣费2元！");
        }
    }
}
