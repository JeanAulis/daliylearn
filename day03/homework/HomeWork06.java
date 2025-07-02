package homework;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
//        2.5 编程题目五
//        需求描述：
//        键盘录入一个数字, 请计算1~该数字之间, 所有的奇数和, 并将结果打印到控制台上.
//        例如: 录入:10, 则打印: 1~10之间的奇数和为 25 录入: -10, 则打印: 您录入的数字无效, 请重新录入.
//        注意: 如果用户录入错误数字, 则一直录入. 直到用户录入正确的数字, 打印完结果后, 程序结束.

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入数字：");
                int num = sc.nextInt();
                int sum = 0;

                if (num < 1){
                    System.out.println("您录入的数字无效, 请重新录入!");
                }else{
                    for (int i = 1; i <= num; i++){
                        if(i % 2 != 0 && i != num){
                            sum += i;
                        } else if (i == num){
                            sum += i;
                            System.out.println("1-" + num + "的奇数和为：" + sum);
                        }
                    }
                    break;
                }
            }catch (Exception e){
                System.out.println("请输入合法数字！");
                sc.nextLine();
            }
        }
    }
}
