package homework;

import java.util.Scanner;

public class _05homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumSalary;
        System.out.println("请输入工龄和基本工资：");
        int workAge = sc.nextInt();
        int basicSalary = sc.nextInt();

        if (workAge == 0){
            sumSalary = basicSalary;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元，没有涨工资");
        } else if (workAge < 3 && workAge >= 1){
            sumSalary = basicSalary + 3000;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资500元,涨后工资" + sumSalary);
        } else if (workAge < 5 && workAge >= 3) {
            sumSalary = basicSalary + 5000;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资1000元,涨后工资" + sumSalary);
        } else if (workAge < 10 && workAge >= 5) {
            sumSalary = basicSalary + 10000;
            System.out.println("您目前工作了" + workAge + "年，基本工资为" + basicSalary + "元, 应涨工资2500元,涨后工资" + sumSalary);
        }else if (workAge < 15 && workAge >= 10) {
            sumSalary = basicSalary + 20000;
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
