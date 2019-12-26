package com.fmf.www.testdesignpattern.prototype;

/**
 * @author fmf
 * @version 1.0
 * @className Citation
 * @description 奖状类：生成相似的对象
 * @create 2019-07-23 15:02
 **/
public class Citation implements Cloneable {

    private String name;
    private String college;
    private String info;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.college = college;
        this.info = info;
        System.out.println("奖状创建成功！");
    }

    public void display() {
        System.out.println(name + info + college);
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (Citation)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
