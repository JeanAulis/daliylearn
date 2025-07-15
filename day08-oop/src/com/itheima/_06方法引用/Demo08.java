package com.itheima._06方法引用;

import java.util.Arrays;

/**
 * @Description Demo08
 * @Author jeanAulis
 * @Date 2025-07-15
 */
public class Demo08 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("播仔", 19, 100),
                new Student("播妞", 20, 89),
                new Student("黑马", 18, 99),
        };

        System.out.println("按照年龄升序排序：");
        Arrays.sort(students, Student::compareAgeStaticAsc);//代替：(o1, o2)->o1.getAge() - o2.getAge()
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("按年龄升序排序");
        Arrays.sort(students, Student::compareAgeStaticDesc);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
