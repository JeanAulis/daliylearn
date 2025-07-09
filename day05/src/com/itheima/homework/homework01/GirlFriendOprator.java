package com.itheima.homework.homework01;

/**
 * @Description GirlFriendOpratoer
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class GirlFriendOprator {
    private Girlfriend girlfriend;

    public GirlFriendOprator(Girlfriend girlfriend){
        this.girlfriend = girlfriend;
    }

    public void printGirlFriend(){
        System.out.printf("我的女朋友叫%s，身高%.1fcm，体重%.1fkg %n",
                girlfriend.getName(),
                girlfriend.getHeight(),
                girlfriend.getWeight());
    }

}
