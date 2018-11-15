package com.daily.demo.reflect;

/**
 * @author fanzhengjie
 * @create 2018/11/15 下午5:11
 * @description
 */
public class Person {

    public String name="smt";
    private String idcard="1001u09t";

    public Person(){
        System.out.println("Person类无参数构造");
    }
    public Person(int a,int b,String s){
        System.out.println("Person类有参数构造：a:"+a+" b:"+b+" s:"+s);
    }

    private Person(int a){
        System.out.println("Person类有参数 私有构造：a:"+a);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name:"+name+"  idcard:"+idcard;
    }

    public void show(){
        System.out.println("show 空参数");
    }
    public void show(int a){
        System.out.println("show   a:"+a);
    }
    private void show(String s){
        System.out.println("show   s:"+s);
    }
}
