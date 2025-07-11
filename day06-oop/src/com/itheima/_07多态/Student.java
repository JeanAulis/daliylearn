package com.itheima._07多态;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Student extends People{
    String name = "学生";

    @Override
    public void run(){
        System.out.println(name + "非法法的跑");
    }
}
