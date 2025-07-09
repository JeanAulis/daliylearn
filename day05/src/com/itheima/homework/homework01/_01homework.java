package com.itheima.homework.homework01;

/**
 * @Description _01homework
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class _01homework {
    public static void main(String[] args) {
        Girlfriend zelegant = new Girlfriend("赵双月", 150, 55);

        GirlFriendOprator boyFriend = new GirlFriendOprator(zelegant);

        boyFriend.printGirlFriend();
        boyFriend.printGirlFriend();
    }
}
