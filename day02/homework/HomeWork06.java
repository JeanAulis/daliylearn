package homework;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
//        2.5编程题目五
//        键盘录入一个数，判断其是奇数还是偶数。 如果是奇数输出：你输入的数是奇数 如果是偶数
//        输出：你输入的数是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println(a % 2 == 1 ? "你输入的是奇数" : "你输入的是偶数"); // 当然，也可以用if语句来实现，但是这样逼格更高一些
    }
}
