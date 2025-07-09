package com.itheima._05继承方法重写;

/**
 * @Description NewPhone
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class NewPhone extends OldPhone{

    @Override
    public void call() {
        System.out.println("打视频");
    }

    @Override
    protected OldPhone sendMessage() {
        System.out.println("发彩信");
        return null;
    }
}
