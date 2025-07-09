package com.itheima.homework.homework02;

/**
 * @Description _02homework
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);

        StudentOprator so1 = new StudentOprator(s1);
        StudentOprator so2 = new StudentOprator(s2);

        so1.show();
        so2.show();

    }
}
