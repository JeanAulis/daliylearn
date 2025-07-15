package com.itheima._04匿名内部类;

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
public class Student implements SwimAble{
    private String name;
    private int age;
    private double score;

    /**
     *
     */
    @Override
    public void swimming() {

    }
}
