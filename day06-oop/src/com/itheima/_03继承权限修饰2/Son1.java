package com.itheima._03继承权限修饰2;

import com.itheima._02继承权限修饰1.Fu;

/**
 * @Description Fu2
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Son1 extends Fu {
    public static void main(String[] args) {
        Son1 s = new Son1();
        // s.testPrivate();
        // s.testDefault();
        s.testProtected();
        s.testPublic();
    }
}
