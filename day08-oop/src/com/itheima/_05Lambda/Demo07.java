package com.itheima._05Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description Demo07
 * @Author jeanAulis
 * @Date 2025-07-15
 */
public class Demo07 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("2", 23, 100),
                new Student("3", 34, 78),
                new Student("3", 21, 44),
        };


        System.out.println("按年龄升序:");
        Arrays.sort(students, (o1, o2) -> {
            return o1.getAge() - o2.getAge(); // 前后顺序更改即可转换排序顺序
        });
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("按年龄升序:");
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("按照年龄降序排序：");
        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
