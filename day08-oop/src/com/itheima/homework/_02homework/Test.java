package com.itheima.homework._02homework;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("v001", "张三", 13000);
        manager.eat();
        manager.work();

        System.out.println();

        Cook cook = new Cook("p001", "小李", 7000);
        cook.eat();
        cook.work();

    }
}
