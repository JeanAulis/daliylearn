package com.itheima._02成员内部类;

/**
 * @Description Demo02
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Demo02 {
    public static void main(String[] args) {
        Body.Heart heart = new Body().new Heart();
        heart.jump();
    }
}
