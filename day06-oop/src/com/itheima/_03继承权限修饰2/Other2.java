package com.itheima._03继承权限修饰2;

import com.itheima._02继承权限修饰1.Fu;

/**
 * @Description Other2
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Other2{
    public static void main(String[] args) {
        Fu fu = new Fu();
        // fu.testPrivate();
        // fu.testDefault();
        // fu.testProtected();
        fu.testPublic();
    }

}
