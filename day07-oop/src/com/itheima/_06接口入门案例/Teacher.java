package com.itheima._06接口入门案例;

/**
 * @Description Teacher
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Teacher implements Eat{

    @Override
    public void eat(){
        System.out.println("老师吃饭");
    }
}
