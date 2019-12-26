package com.fmf.www.testdesignpattern.interpreter;

/**
 * @author fmf
 * @version 1.0
 * @className AbstractExpression
 * @description 抽象表达式角色：定义解释器的接口，约定解释器的解释操作，
 * 主要包含解释方法 interpret()
 * @create 2019-07-30 14:50
 **/
public interface AbstractExpression {

    /**
     * 解释词组
     *
     * @param info 词组
     * @return boolean
     */
    boolean interpret(String info);
}
