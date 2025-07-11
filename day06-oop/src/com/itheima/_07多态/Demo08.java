package com.itheima._07多态;

/**
 * @Description Demo07
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo08 {
    public static void main(String[] args) {

        People people1 = new Teacher();
        System.out.println(people1.name);
        people1.run();

        People people2 = new Student();
        System.out.println(people2.name);
        people2.run();
    }
}
