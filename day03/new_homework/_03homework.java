package new_homework;

import java.util.Scanner;

public class _03homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();
        System.out.println(isPass(name, age, height));
    }

    /**
     * 输出姓名和成绩以及身高
     *
     * @param name
     * @param age
     * @param height
     * @return Srring
     */
    public static String isPass(String name, int age ,double height){
        return  "我的姓名是" + name + "，年龄是" + age + "，身高是" + (int)height + "CM";
    }
}
