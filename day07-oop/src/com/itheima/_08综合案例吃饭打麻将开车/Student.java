package com.itheima._08综合案例吃饭打麻将开车;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Student extends People implements DriveCarAble, DaMaJiangAble{
    /**
     *
     */
    @Override
    public void playMaJiang() {
        System.out.println("学生打麻将");
    }

    /**
     *
     */
    @Override
    public void driverCar() {
        System.out.println("学生在开车");
    }

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("学生在吃东西");
    }
}
