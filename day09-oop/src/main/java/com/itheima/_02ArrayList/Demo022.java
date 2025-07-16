package com.itheima._02ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description Demo022
 * @Author jeanAulis
 * @Date 2025-07-16
 */
public class Demo022 {
    public static void main(String[] args) {
        //目标：ArrayList集合遍历方式

        //准备集合数据
        List<Student> list = new ArrayList<>();
        list.add(new Student("播仔",19,100));
        list.add(new Student("播妞",20,99));
        list.add(new Student("黑马",19,88));
        list.add(new Student("234",1,100));

        //遍历方式1：fori循环
        System.out.println("遍历方式1：fori循环");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //遍历方式2：增强for循环
        System.out.println("遍历方式2：增强for循环");
        for (Student student : list) {
            System.out.println(student);
        }

        //遍历方式3：forEach方法-匿名内部类
        System.out.println("遍历方式3：forEach方法-匿名内部类");
        list.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
        //遍历方式4：forEach方法-lambda表达式
        System.out.println("遍历方式4：forEach方法-lambda表达式");
        list.forEach(student -> System.out.println(student));

        //遍历方式5：forEach方法-实例方法引用（实例方法参数、返回值与lambda表达式参数、返回值一样）, 语法：对象名::实例方法名
        System.out.println("forEach方法-实例方法引用");
        list.forEach( System.out::println);//System.out是对象名，println实例方法名
    }
}
