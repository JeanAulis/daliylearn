package com.itheima._04匿名内部类;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description Demo05
 * @Author jeanAulis
 * @Date 2025-07-15
 */
public class Demo05 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("0", 23, 100),
                new Student("0", 34, 78),
                new Student("0", 21, 44),
        };


        System.out.println("按年龄升序:");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 前后顺序更改即可转换排序顺序
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("按照年龄降序排序：");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge(); // 前后顺序更改即可转换排序顺序
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
