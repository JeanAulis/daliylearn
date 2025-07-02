package homework;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args){
//        2.3 编程题目三
//        1.请使用三元运算符计算出两个整数中的最大值。两个整数都要求键盘录入. 例如：20 40 打印
//        结果：40是最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数(空格或者回车隔开)：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? a : b + "是最大值");
    }
}
