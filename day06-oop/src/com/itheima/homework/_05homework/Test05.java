package com.itheima.homework._05homework;

/**
 * @Description Test05
 * @Author jeanAulis
 * @Date 2025-07-11
 */
public class Test05 {
    public static void main(String[] args) {
        Compute c = new Compute("Apple", 10999, 24);
        c.codeing();
        c.takePhoto();

        System.out.println("----------");
        Camera ca = new Camera("Nikon", 29999, "Digital");
        ca.video();
        ca.takePhoto();

        System.out.println("----------");
        Phone p = new Phone("华为", 3999, "4g");
        p.call();
        p.takePhoto();
    }
}
