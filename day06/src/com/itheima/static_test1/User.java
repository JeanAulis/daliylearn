package com.itheima.static_test1;

/**
 * @Description Uesr
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class User {
    static int count = 0;

    public User(){
        System.out.println("直播间有新人进入");
        count++;
    }


}
