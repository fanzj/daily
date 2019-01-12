package com.daily.demo.basic.annotation.demo1;

import com.daily.demo.basic.annotation.User;

/**
 * @author fanzhengjie
 * @create 2019/1/12 上午11:03
 * @description
 */
public class InitTest {

    public static void main(String[] args) {
        User user = UserFactory.create();
        System.out.println(user);
    }
}
