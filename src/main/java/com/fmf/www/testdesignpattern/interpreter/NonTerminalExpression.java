package com.fmf.www.testdesignpattern.interpreter;

/**
 * @author fmf
 * @version 1.0
 * @className NonTerminalExpression
 * @description 非终结符表达式：是抽象表达式的子类，用来实现文法中与非
 * 终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 * @create 2019-07-30 14:52
 **/
public class NonTerminalExpression implements AbstractExpression {

    private AbstractExpression city;
    private AbstractExpression person;

    public NonTerminalExpression(AbstractExpression city, AbstractExpression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
