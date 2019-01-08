package com.ben.stream;

import com.ben.bean.Dish;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootTest
public class StreamExample {


    private static  List<Dish> list;

    @BeforeAll
    public static void  GetStreamList(){

    list= Lists.newArrayList(
             new Dish("猪蹄", false, 800),
             new Dish("披萨", true, 90),
             new Dish("韭菜", false, 54),
             new Dish("龙虾", true, 424),
             new Dish("酸菜", false, 75),
             new Dish("牛肉", true, 45),
             new Dish("米饭", true, 454),
             new Dish("烤鱼", false, 96)
        );
    }


    @Test
    public void print(){

        List<String> dishs = list.stream()
                    .filter(dish -> dish.getExist() != false)   //在售的
                    .map(Dish::getName)                         //匹配的菜名
                    .limit(2)                                   //前2
                    .collect(Collectors.toList());              //转list

        dishs.stream().forEach(System.out::println);            //遍历输出

    }


    @Test
    public void print2(){

        //集合所有exist属性都满足
        Boolean result = list.stream().allMatch( dish -> dish.getExist() == false);
        //集合有一个exist属性满足
        Boolean res2 = list.stream().anyMatch(dish -> dish.getExist() == false);


    }



    @Test
    public void print3(){

        list.stream().forEach(dish -> {                    //遍历操作所有对象
            System.out.println("aa:" + dish.getExist());
            System.out.println("bb:" + dish.getName());
        });

    }


    @Test
    public void print4(){

        list.stream().map(dish -> {
            dish.setExist(true);
            return dish;
        }).forEach(dish -> {                    //遍历操作所有对象
            System.out.println("aa:" + dish.getExist());
            System.out.println("bb:" + dish.getName());
        });

    }













}
