package com.itheima._01代码块;

/**
 * @Description Demo01
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Student.name);//运行静态代码块
        Student student = new Student();//运行第一次实例代码块
        student = new Student();//运行第二次实例代码块
        System.out.println(student);
    }
}
