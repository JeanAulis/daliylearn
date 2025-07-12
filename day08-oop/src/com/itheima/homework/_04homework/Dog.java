package com.itheima.homework._04homework;

/**
 * @Description Dog
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Dog extends Animal{

    /**
     *
     */
    @Override
    void eat() {
        System.out.println("狗吃屎");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
