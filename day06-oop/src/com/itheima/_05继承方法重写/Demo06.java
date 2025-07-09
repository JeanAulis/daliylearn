package com.itheima._05继承方法重写;

/**
 * @Description Demo06
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Demo06 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("小王");
        student.setAge(19);
        // System.out.println(student.toString()); //Object的toString()方法, 打印对象的地址值
        // System.out.println(student.toString()); //重写，改为打印每个成员姓名，年龄
        System.out.println(student); //println()方法，底层会调用toString()方法
    }
}
