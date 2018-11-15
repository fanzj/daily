package com.daily.demo.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author fanzhengjie
 * @create 2018/11/15 下午4:40
 * @description
 */
public class TestUser {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        User user = new User(100L,"Jack",20,"male",78.5);
        Class clazz = user.getClass();
        Object object = clazz.newInstance();
        try {
            Field f = clazz.getField("grade");
           // f.setAccessible(true);
            f.set(object, 45.3);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(object);

    }

}
