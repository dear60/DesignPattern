package com.fmf.www.testdesignpattern.command;

/**
 * @author fmf
 * @version 1.0
 * @className Command
 * @description 抽象命令角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 * @create 2019-07-26 14:49
 **/
public interface Command {

    /**
     * 命令的执行，例如：打开电视机
     */
    void execute();
}
