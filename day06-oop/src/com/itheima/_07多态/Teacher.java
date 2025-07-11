package com.itheima._07多态;

/**
 * @Description Teacher
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Teacher extends People{
    String name = "老师";

    @Override
    public void run(){
        System.out.println(name + "慢慢悠悠的跑");
    }
}
