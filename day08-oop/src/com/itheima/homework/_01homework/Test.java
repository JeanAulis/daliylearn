package com.itheima.homework._01homework;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Test {
    public static void main(String[] args) {
        GoldenCard goldenCard = new GoldenCard("金卡",89999);
        goldenCard.pay(8666);
        System.out.println(goldenCard);
        System.out.println();

        SilverCard silverCard = new SilverCard("银卡", 87767);
        silverCard.pay(878);
        System.out.println(silverCard);

    }
}
