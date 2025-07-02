package homework;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
//        2.3 编程题目三
//        训练目标：能够锻炼出无限循环的使用场景, 循环中加入 if 筛选, 在合适的时机结束无限循环
//        需求描述：
//        需求 : 假设一个简单的在ATM的取款过程如下：
//        提示用户输入金额（money）
//        ATM只能输出100元的纸币一次取钱数要求最低100元，最高10000元。
//        如果用户输入的金额符合上述要求，则打印输出用户取的钱数
//        如果输入的取款金额有误, 请给出提示并继续录入, 直到用户输入正确为止

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入取款金额：");
                int money = sc.nextInt();
                if(money >= 100 && money <= 10000){
                    System.out.println("取款成功！你取了" + money + "元");
                    break;
                } else if (money <= 100 && money >= 0) {
                    System.out.println("取款金额过小！");
                } else if (money > 10000) {
                    System.out.println("取款金额过大！");
                }
            }catch (Exception e){
                System.out.println("请输入合法数字！"); // 处理异常, 防止程序中断
            }

        }
    }
}
