package com.daily.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanzhengjie
 * @create 2018/11/15 下午5:12
 * @description
 */
public class TestPerson {

    public static void main(String[] args)
        throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Class clazz = Person.class;
        //获取Person类所有的公共构造
        Constructor[] conarr = clazz.getConstructors();
        for(Constructor con : conarr){
            System.out.println(con);
        }

        //获取指定构造方法
        //无参数
        Constructor cc = clazz.getConstructor();
        Object oo = cc.newInstance();

        //有参数
        Constructor cc2 = clazz.getConstructor(int.class,int.class,String.class);
        Object oo2 = cc2.newInstance(1,2,"haha");

        //获取私有构造方法
        Constructor cc3=clazz.getDeclaredConstructor(int.class);
        //暴力访问
        cc3.setAccessible(true);
        Object oo3=cc3.newInstance(1);

        clazz.newInstance();//直接获取空参数构造，必须是public

        /*******************************************************/
        clazz = Person.class;
        Object obj = clazz.newInstance();
        // 获取Person类所有 公共 成员变量
        Field[] fields = clazz.getFields();
        for(Field s:fields){
            System.out.println(s);
        }

        Field field = clazz.getField("name");
        field.set(obj, "haha");

        System.out.println(obj);

        Field field2=clazz.getDeclaredField("idcard");
        field2.setAccessible(true);
        field2.set(obj, "123456");
        System.out.println(obj);

        /*******************************************************/
        clazz = Person.class;
        obj = clazz.newInstance();
        // 获取Person类所有 公共 成员方法
        Method[] methods=clazz.getMethods();

        for(Method m:methods){
            System.out.println(m);
        }

        Method m=clazz.getMethod("show");
        m.invoke(obj);

        Method m1=clazz.getMethod("show",int.class);
        m1.invoke(obj,1);

        Method m2=clazz.getDeclaredMethod("show",String.class);
        m2.setAccessible(true);
        m2.invoke(obj,"smt");
    }

}
