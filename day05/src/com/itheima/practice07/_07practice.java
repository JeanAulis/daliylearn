package com.itheima.practice07;

/**
 * @Description _07practice
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class _07practice {
    public static void main(String[] args) {
        Student s1 = new Student("一鸣", 89, 94);

        Student s2 = new Student("22", 49, 84);

        System.out.printf("s1对象实例成员变量nane：%s %n",s1.getName());
        System.out.printf("s1对象实例成员变量nane：%s %n",s2.getName());


        s1.teacherName = "宇哥";
        Student.teacherName = "宇哥";

        System.out.printf("s1对象的类变量:%s%n",s1.teacherName);//宇哥
        System.out.printf("s2对象的类变量:%s%n",s2.teacherName);//宇哥
    }
}
