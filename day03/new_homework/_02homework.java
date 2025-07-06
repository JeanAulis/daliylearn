package new_homework;

import java.util.Scanner;

public class _02homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int b = sc.nextInt();
        System.out.println(isPass(b));
    }
    public static String isPass(int b){
        return b >= 60 ? "及格" : "不及格";
    }
}
