package new_homework;

import java.util.Scanner;

public class _07homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        try {
            System.out.println("请输入一个大于100的数：");
            a = sc.nextInt();
        }catch (Exception e){
            a = 0;
            System.out.println("请输入一个正确的数字");
        }
        int sum = 0;
        int count = 0;

        for (int i = 100; i < a; i++) {
            if (i % 10 != 7 && i / 10 % 10 != 5 && i / 100 != 3) {
                count++;
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("总个数为：" + count + "\n和为：" + sum);
//        System.out.println(123 % 10); //个位
//        System.out.println(123 / 10 % 10); //十位
//        System.out.println(123 / 100); //百位

    }
}
