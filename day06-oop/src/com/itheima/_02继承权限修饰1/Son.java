package com.itheima._02继承权限修饰1;

/**
 * @Description Son
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Son extends Fu{
    public static void main(String[] args) {
        Son son = new Son();
        son.testPublic();
        son.testProtected();
        son.testDefault();
        son.test();
    }
}
