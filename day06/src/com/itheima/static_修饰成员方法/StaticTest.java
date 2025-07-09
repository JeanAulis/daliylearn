package com.itheima.static_修饰成员方法;

/**
 * @Description staticTest
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class StaticTest {
    public static void main(String[] args) {

        String code4 = CodeUtil.getCode(4);
        String code6 = CodeUtil.getCode(6);

        System.out.println(code4);
        System.out.println(code6);

        // Student.prinStatic();
        //
        // Student student = new Student();
        // student.prinStatic();
        //
        // student.print();
    }

}
