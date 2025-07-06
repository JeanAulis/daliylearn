package new_homework;

import java.util.Scanner;
import java.math.*;

public class _04homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }

}
