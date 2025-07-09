package com.itheima.homework.homework03;

/**
 * @Description TeacherTest
 * @Author jeanAulis
 * @Date 2025-07-08
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("001", "杨");
        Teacher t2 = new Teacher("002", "李");

        TeacherOprator to1 = new TeacherOprator(t1);
        TeacherOprator to2 = new TeacherOprator(t2);

        to1.teach();
        to2.teach();


    }
}
