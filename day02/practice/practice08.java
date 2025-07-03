package practice;

public class practice08 {
    public static void main(String[] args) {
//        第八题
//        某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。
//        鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？请编写程序计算。

        int fish = 24;
        int peanut = 8; // 花生
        int rice = 3;
        int fish_discount = 16;
        double mini_money;
        double sum1 = fish_discount + peanut + rice;
        double sum2 = (fish + peanut + rice) * 0.8;

        mini_money = sum1 < sum2 ? sum1 : sum2;
        System.out.println("最少要花：" + mini_money + "元");
    }
}
