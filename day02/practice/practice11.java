package practice;

import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
//        十一题
//        某商场购物可以打折，具体规则如下：
//        普通顾客购不满100元不打折，满100元打9折；
//        会员购物不满200元打8折，满200元打7.5折；
//        不同打折规则不累加计算。
//        请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应
//        付金额（小数类型）。
        System.out.println("请输入顾客类别: 0.普通顾客 1.会员");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        System.out.println("请输入购物金额:");
        double money = sc.nextDouble();
        switch (type) {
            case 0:
                System.out.println("普通顾客应付金额：" + money);
                break;
            case 1:
                System.out.println("会员顾客应付金额：" + money * 0.9);
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
