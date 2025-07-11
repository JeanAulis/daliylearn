package com.itheima._04抽象类;

/**
 * @Description Demo4
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo4 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.run();

        Animal a2 = new Chicken();
        a2.run();
    }



}
