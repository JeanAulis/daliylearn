package homework;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        //    2.4 编程题目四
//    1.请使用三元运算符计算出三个整数中的最大值。三个整数都要求键盘录入. 例如：20 40 30 打印结果：40是最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数(空格或者回车隔开)：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max + "是最大值");
    }
}
