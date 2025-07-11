package com.itheima._06子类构造器特点;

/**
 * @Description Test01
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo07 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1);
        Teacher t2 = new Teacher("跳舞");
        System.out.println(t2);
    }
}
