package com.itheima.static_修饰成员方法;

/**
 * @Description staticTest
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class staticTest {
    public static void main(String[] args) {
        Student.prinStatic();

        Student student = new Student();
        student.prinStatic();

        student.print();
    }

}
