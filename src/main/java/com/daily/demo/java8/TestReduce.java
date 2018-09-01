package com.daily.demo.java8;

import com.daily.demo.java8.bean.Dish;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author fanzhengjie
 * @create 2018/8/24 下午10:56
 * @description 规约操作
 */
public class TestReduce {

    private static List<Dish> menu = Arrays.asList(
        new Dish("pork", false, 800, Dish.Type.MEAT),
        new Dish("beef", false, 700, Dish.Type.MEAT),
        new Dish("chicken", false, 400, Dish.Type.MEAT),
        new Dish("french fries", true, 530, Dish.Type.OTHER),
        new Dish("rice", true, 350, Dish.Type.OTHER),
        new Dish("season fruit", true, 120, Dish.Type.OTHER),
        new Dish("pizza", true, 550, Dish.Type.OTHER),
        new Dish("prawns", false, 300, Dish.Type.FISH),
        new Dish("salmon", false, 450, Dish.Type.FISH) );

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,3,1,2,4);
        System.out.println(sum(numbers));
        System.out.println(multi(numbers));
        optionalSum(Lists.newArrayList());
        MaxMin(numbers);
        testDish();

    }

    public static Integer sum(List<Integer> list){
        //return list.stream().reduce(0,(a, b)-> a+b);
        return list.stream().reduce(0, Integer::sum);
    }

    public static Integer multi(List<Integer> list){
        return list.stream().reduce(1, (a,b)->a*b);
    }

    public static void optionalSum(List<Integer> list){
        Optional<Integer> sum = list.stream().reduce((a,b)->(a+b));
        System.out.println(sum.isPresent()?sum.get():"value is null");
    }

    public static void MaxMin(List<Integer> list){
        Optional<Integer> max = list.stream().reduce(Integer::max);
        System.out.println(max.isPresent()?max.get():"max is null");
        Optional<Integer> min = list.stream().reduce(Integer::min);
    }

    public static void testDish(){
        //方法1
        int count = menu.stream()
            .map(d -> 1)
            .reduce(0, (a, b) -> a + b);
        System.out.format("一共有%d道菜肴\n", count);

        //方法2
        long count2 = menu.stream().count();
        System.out.format("一共有%d道菜肴\n", count2);
    }
}
