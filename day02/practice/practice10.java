package practice;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
//        第十题
//        某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取
//        本息。存款年利率表如下：
//        存期 年利率（%）
//        一年 2.25
//        两年 2.7
//        三年 3.25
//        五年 3.6
//        请存入一定金额，存一定年限（四选一），计算到期后得到的本息总额。
//        提示：
//        存入金额和存入年限均由键盘录入
//        本息计算方式：本金+本金×年利率×年限

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要存的金额和年限（可选：一年，两年，三年，五年）（输入数字即可）：");
        double money = sc.nextDouble();
        int year = sc.nextInt();

        switch (year) {
            case 1:
                System.out.println("本息为：" + (money + money * 0.05 * year));
                break;
            case 2:
                System.out.println("本息为：" + (money + money * 0.1 * year));
                break;
            case 3:
                System.out.println("本息为：" + (money + money * 0.15 * year));
                break;
            case 5:
                System.out.println("本息为：" + (money + money * 0.2 * year));
                break;
            default:
                System.out.println("输入错误！");
        }


    }
}
