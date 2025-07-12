package com.itheima._08综合案例吃饭打麻将开车;

/**
 * @Description Driver
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Driver extends People implements DriveCarAble{
    /**
     *
     */
    @Override
    public void driverCar() {
        System.out.println("司机在开车");
    }

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("司机在吃东西");
    }
}
