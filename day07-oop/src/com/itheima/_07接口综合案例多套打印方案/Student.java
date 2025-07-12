package com.itheima._07接口综合案例多套打印方案;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Gender Gender;
    private int score;
}
