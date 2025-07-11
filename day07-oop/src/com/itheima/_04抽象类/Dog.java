package com.itheima._04抽象类;

/**
 * @Description Dog
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Dog extends Animal{
    /**
     * 跑的行为定义
     */
    @Override
    public void run() {
        System.out.println("4条腿跑");
    }
}
