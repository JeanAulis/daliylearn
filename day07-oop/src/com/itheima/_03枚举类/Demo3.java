package com.itheima._03枚举类;

import java.util.Arrays;

/**
 * @Description Demo3
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo3 {
    public static void main(String[] args) {
        Person p1 = new Person("jean Aulis", Gender.Male);
        Person p2 = new Person("moon", Gender.FeMale);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("jean Aulis性别：" + (p1.getGender() == Gender.Male ? "男" : "女"));
        System.out.println("moon性别：" + (p2.getGender() == Gender.Male ? "男" : "女"));

        Gender[] genders = Gender.values();
        System.out.println(Arrays.toString(genders));
    }
}
