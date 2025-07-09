package com.itheima._02继承权限修饰1;

/**
 * @Description Other
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Other {
    public static void main(String[] args) {
        Fu fu = new Fu();
        // fu.testPrivate();
        fu.testDefault();
        fu.testProtected();
        fu.testPublic();
    }
}
