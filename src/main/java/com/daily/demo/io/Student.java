package com.daily.demo.io;

import java.io.Serializable;

/**
 * @author fanzhengjie
 * @create 2018/9/11 上午12:04
 * @description
 */
public class Student implements Serializable{

    private String stuno;
    private String stuname;
    private int stuage;

    public Student(){}

    public Student(String stuno, String stuname, int stuage) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.stuage = stuage;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
            "stuno='" + stuno + '\'' +
            ", stuname='" + stuname + '\'' +
            ", stuage=" + stuage +
            '}';
    }
}
