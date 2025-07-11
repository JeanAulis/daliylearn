package com.itheima._04抽象类;

/**
 * @Description Cat
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Chicken extends Animal{
    /**
     * 跑的行为定义
     */
    @Override
    public void run() {
        System.out.println("2条腿跑");
    }
}
