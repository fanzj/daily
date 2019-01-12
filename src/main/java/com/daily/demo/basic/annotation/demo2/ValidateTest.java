package com.daily.demo.basic.annotation.demo2;

import com.daily.demo.basic.annotation.User;

/**
 * @author fanzhengjie
 * @create 2019/1/12 上午11:28
 * @description
 */
public class ValidateTest {

    public static void main(String[] args) {
        User user = new User();

        user.setName("liang");
        user.setAge("12");

        System.out.println(UserCheck.check(user));
    }
}
