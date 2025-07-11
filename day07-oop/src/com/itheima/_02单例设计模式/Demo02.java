package com.itheima._02单例设计模式;

/**
 * @Description Demo02
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Demo02 {
    public static void main(String[] args) {
        AudioPlayer a1 = AudioPlayer.getInstance();
        AudioPlayer a2 = AudioPlayer.getInstance();
        AudioPlayer a3 = AudioPlayer.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        VideoPlayer v1 = VideoPlayer.getInstance();
        VideoPlayer v2 = VideoPlayer.getInstance();
        VideoPlayer v3 = VideoPlayer.getInstance();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
