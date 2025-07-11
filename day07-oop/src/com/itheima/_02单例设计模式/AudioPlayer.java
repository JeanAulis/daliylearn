package com.itheima._02单例设计模式;

/**
 * @Description AudioPlayer
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class AudioPlayer {
    // 饿汉式
    private AudioPlayer(){}

    // 创建一个私有静态当前类的成员变量，保存单例的对象
    private static AudioPlayer audioPlayer = new AudioPlayer();

    public static AudioPlayer getInstance(){
        return audioPlayer;
    }
}
