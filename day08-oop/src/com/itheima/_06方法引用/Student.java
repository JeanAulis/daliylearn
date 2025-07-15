package com.itheima._06方法引用;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements SwimAble {
    private String name;
    private int age;
    private double score;

    /**
     *
     */
    @Override
    public void swimming() {

    }

    public static int compareAgeStaticAsc(Student o1, Student o2){
        return o1.getAge() - o2.getAge();
    }

    public static int compareAgeStaticDesc(Student o1, Student o2){
        return o2.getAge() - o1.getAge();
    }
}
