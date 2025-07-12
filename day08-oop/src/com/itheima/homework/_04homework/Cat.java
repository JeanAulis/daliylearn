package com.itheima.homework._04homework;

/**
 * @Description Cat
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Cat extends Animal{
    /**
     *
     */
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
