package com.itheima._05继承方法重写;

/**
 * @Description OldPhone
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class OldPhone {
    public void call() {
        System.out.println("打电话");
    }

    OldPhone sendMessage() {
        System.out.println("发短信");
        return null;
    }
}
