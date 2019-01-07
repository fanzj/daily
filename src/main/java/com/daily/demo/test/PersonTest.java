package com.daily.demo.test;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * @author fanzhengjie
 * @create 2018/12/28 下午5:04
 * @description
 */
public class PersonTest {

    public static void main(String[] args) {

        String[] params = new String[3];
        Person person = new Person();
        person.setName("Jack");
        person.setAge(20);
        person.setParams(params);
        System.out.println(person);

        List<String> paramList = Lists.newArrayList("male", "178cm", "love smile");
        paramList.toArray(params);
        System.out.println(params);
        System.out.println(person);

    }

}
