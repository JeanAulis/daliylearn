package com.itheima._01代码块;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Student {
    static String name;

    static {
        name = "jeanAulis";
        // 可做静态成员复杂逻辑初始化,如if
        System.out.println("静态代码块运行了");
    }


    int age;
    {
        age = 19;
        // 可做实例成员复杂逻辑初始化,如if
        // 用的少，建议用构造器
        System.out.println("实例代码块运行了");
    }
}
