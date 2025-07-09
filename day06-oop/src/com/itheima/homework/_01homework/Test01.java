package com.itheima.homework._01homework;

/**
 * @Description Test01
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Test01 {
    public static void main(String[] args) {
        Coder coder = new Coder("马化腾", 45);

        Teacher teacher = new Teacher("马云", 99);

        coder.eating();
        coder.sleeping();
        coder.skill();

        System.out.println("-----------------");

        teacher.eating();
        teacher.sleeping();
        teacher.skill();

    }
}
