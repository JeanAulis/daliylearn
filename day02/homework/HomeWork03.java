package homework;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args){
//        2.2 编程题目二
//        训练目标：能够使用 if 语句, 运算符编写业务逻辑
//        需求描述：模拟购物车结算
//        运行效果:
//        购物车清单:
//        1. 宁夏黑枸杞(价格: 30, 数量: 2)
//        2. 罗汉果茶(价格: 20, 数量: 1)
//        -----------------------------------
//                请输入您的选择:
//        1. 结算所有
//        2. 结算单个
//        2
//        请输入您要结算的商品 1. 宁夏黑枸杞 2. 罗汉果茶
//        1
//        结算成功, 您已支付60.0元
//        实现提示：
//        键盘录入用户选择的结算方式, 使用 if 语句区分出是结算所有, 还是结算单个
//        结算所有 : 直接计算
//        结算单个 : 键盘录入用户要结算的商品, 继续使用 if 语句进行区分, 计算价格

        System.out.println("购物车清单:\n" +
                "1. 宁夏黑枸杞(价格: 30, 数量: 2)\n" +
                "2. 罗汉果茶(价格: 20, 数量: 1)\n" +
                "-----------------------------------");
        System.out.println("\t请输入您的选择:");
        System.out.println("1. 结算所有\n" +
                "2. 结算单个");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("结算成功, 您已支付80.0元");
        } else if (choice == 2){
            System.out.println("请输入您要结算的商品 1. 宁夏黑枸杞 2. 罗汉果茶");
            int choice2 = sc.nextInt();
            if (choice2 == 1){
                System.out.println("结算成功, 您已支付60.0元");
            } else if (choice2 == 2){
                System.out.println("结算成功, 您已支付20.0元");
            } else {
                System.out.println("输入错误");
            }
        } else {
            System.out.println("输入错误");
        }
    }
}