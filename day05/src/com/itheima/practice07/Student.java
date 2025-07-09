package com.itheima.practice07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Student
 * @Author jeanAulis
 * @Date 2025-07-08
 */
@Data
@NoArgsConstructor //生成无参构造器
@AllArgsConstructor //生成全参构造器，暂时不用，为默认生成的没有调用封装的set方法设置数据，默认this
public class Student {
    static String teacherName;//老师的名字

    private String name;
    private double chinese;
    private double math;
}

