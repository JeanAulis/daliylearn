package com.itheima._02单例设计模式;

/**
 * @Description VideoPlayer
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class VideoPlayer {
    private static VideoPlayer videoPlayer;

    public static VideoPlayer getInstance(){
        if (videoPlayer == null){
            videoPlayer = new VideoPlayer();
        }
        return videoPlayer;
    }

}
