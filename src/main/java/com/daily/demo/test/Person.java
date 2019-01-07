package com.daily.demo.test;

import java.util.Arrays;

/**
 * @author fanzhengjie
 * @create 2018/12/28 下午5:03
 * @description
 */
public class Person {

    private String name;
    private Integer age;
    private String[] params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", params=" + Arrays.toString(params) +
            '}';
    }
}
