package com.itheima._01String;

import java.util.Scanner;

public class Demo012 {

    public static void main(String[] args) {

        //目标：登录功能，进行字符串比较用户名与密码是否相等
        /*
        * 需求：系统正确的登录名和密码是：itheima/123456，请在控制台开发一个登录界面，接收用户输入
            的登录名和密码，判断用户是否登录成功，登录成功后展示：“欢迎进入系统！”，即可停止程
            序 (注意：要求最多给用户三次登录机会)
        * */

        //1.创建控制器输入对象Scanner
        Scanner sc = new Scanner(System.in);

        //2.循环3次输入用户名与密码登录校验
        for (int i = 0; i < 3; i++) {
            //2.1 提示：输入用户名
            System.out.println("请输入登录用户名：");
            //2.2 获取输入用户名
            String username = sc.next();
            //2.3 提示：输入密码
            System.out.println("请输入登录密码：");
            //2.4 获取输入密码
            String password = sc.next();
            //2.5 校验用户名与密码
            if(username.equals("admin") && password.equals("123456")){
                System.out.println("Welcome!");
                return;
            }
            //2.5.2 失败，提示“用户名或密码错误，请重新输入！”
            System.err.println("用户名或密码错误，请重新输入！");
        }


        //3.输出：“密码输入错误频繁，30分钟之后再来”
        System.err.println("密码输入错误频繁，30分钟之后再来");
    }
}