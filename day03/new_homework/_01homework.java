package new_homework;

import java.util.Scanner;

public class _01homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
    public static String isEven(int a){
        return a % 2 == 0 ? "偶数" : "奇数";
    }

    public static String isPass(int b){
        return b >= 60 ? "通过" : "未通过";
    }
}
