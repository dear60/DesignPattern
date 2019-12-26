package com.fmf.www.testdesignpattern.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author fmf
 * @version 1.0
 * @className TerminalExpression
 * @description 终结符表达式：抽象表达式的子类，用来实现文法中与终结符相关的
 * 操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * @create 2019-07-30 14:51
 **/
public class TerminalExpression implements AbstractExpression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
