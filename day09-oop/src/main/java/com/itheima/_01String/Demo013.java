package com.itheima._01String;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description Demo013
 * @Author jeanAulis
 * @Date 2025-07-16
 */
public class Demo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();

            System.out.println("请输入密码：");
            String passwd = sc.next();

            while (true){
                String code = getCode(6);

                System.out.println(code);
                System.out.println("请输入验证码");
                String userCode = sc.next();

                if (code.equalsIgnoreCase(userCode)){
                    if (username.equals("admin") && passwd.equals("123456")){
                        System.out.println("欢迎！");
                        return;
                    }else {
                        System.out.println("用户密码错误");
                        break;
                    }
                }else {
                    System.out.println("验证码错误");
                }
            }
        }
        System.out.println("输入频繁，请稍后再试！");
        // return;
    }

    /**
     * 生成指定位数的验证码
     * @param count
     */
    public static String getCode(int count){
        Random random = new Random();

        String code = "23456789asdfghjkzxcvbnmqwertyuipASDFGHJKLZXCVBNMQWERTYUIP黑马程序员";

        String generateCode = "";

        for (int i = 0; i < count; i++) {
            int index = random.nextInt(code.length());
            generateCode += code.substring(index, index+1);
        }
        return generateCode;
    }
}
