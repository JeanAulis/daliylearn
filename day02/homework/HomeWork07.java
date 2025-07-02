package homework;

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args){
//        2.6 编程题目六
//        键盘录入两个整数数，判断这两个整数的和是否在 10到200之间（包含10和200），并且还得
//        是个奇数 如果是则输出：符合要求 如果不是则输出：不符合要求
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas enter two number:");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int sum = num1 + num2;
        if(sum >10 && sum < 200){
            if(sum % 2 == 1){
                System.out.println("符合要求");
            }else {
                System.out.println("不符合要求");
            }
        } else {
            System.out.println("不符合要求");
        }
    }
}
