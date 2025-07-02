package homework;

import java.util.Scanner;

public class HomeWork09 {
    public static void main(String[] args) {
//        2.8 编程题目八
//        (1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
//
//        (2)涨工资的条件如下：
//        工龄 工资涨幅 [10-15) +5000 // [ 是包括的意思 ) 是不包括的意思
//        [10-15) 代表 10岁到15岁 ,包含10,不包含15
//
//        [5-10) +2500
//        [3~5) +1000
//        [1~3) +500
//        [0~1) +200
//
//        (3)如果用户输入的工龄为10，基本工资为3000，那么程序运行后打印格式如下:
//        "您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
        Scanner sc = new Scanner(System.in);
        int sumSalary;
        System.out.println("请输入工龄和基本工资：");
        int workAge = sc.nextInt();
        int basicSalary = sc.nextInt();

        if (workAge == 0){
            sumSalary = basicSalary + 200;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资200元,涨后工资" + sumSalary);
        } else if (workAge < 3 && workAge >= 1){
            sumSalary = basicSalary + 500;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资500元,涨后工资" + sumSalary);
        } else if (workAge < 5 && workAge >= 3) {
            sumSalary = basicSalary + 1000;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资1000元,涨后工资" + sumSalary);
        } else if (workAge < 10 && workAge >= 5) {
            sumSalary = basicSalary + 2500;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资2500元,涨后工资" + sumSalary);
        }else if (workAge < 15 && workAge >= 10) {
            sumSalary = basicSalary + 5000;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资5000元,涨后工资" + sumSalary);
        }else if (workAge >= 15){
            System.out.println("恭喜你，你已经被辞退，明天不用来了！");
        } else if (workAge < 0) {
            System.out.println("没工龄你加个蛋的钱！");
        }else {
            System.out.println("你der啊，重新输入！");
        }

    }
}
