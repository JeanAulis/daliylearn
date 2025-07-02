package homework;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args){
//        2	编程题
//        2.1 编程题目一
//        训练目标：掌握字符串拼接操作
//        需求描述：请从控制台录入用户信息 (用户名, 邮箱) , 模拟初始密码发送至邮箱的过程
//        运行效果:
//        请输入用户名:
//        zhangsan
//        请输入邮箱:
//        zhangsan@itcast.cn
//        尊敬的zhangsan用户您好, 我们已向您的初始密码发送至zhangsan@itcast.cn邮箱, 请注意查收!
//        实现提示：对采集到的信息加入字符串拼接

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入邮箱:");
        String email = sc.next();
        System.out.println("尊敬的" + name + "\n用户您好, 我们已向您的初始密码发送至" + email + "邮箱, 请注意查收!");
    }
}