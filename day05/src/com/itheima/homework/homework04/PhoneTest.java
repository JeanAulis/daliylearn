package com.itheima.homework.homework04;

/**
 * @Description PhoneTest
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone(3998, "黑色", "小米");

        PhoneBean pb = new PhoneBean(p1);

        pb.call();
        pb.sendMessage();
    }
}
